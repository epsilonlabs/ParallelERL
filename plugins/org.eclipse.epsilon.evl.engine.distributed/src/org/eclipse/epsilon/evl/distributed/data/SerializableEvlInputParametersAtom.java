/*********************************************************************
 * Copyright (c) 2019 The University of York.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
**********************************************************************/
package org.eclipse.epsilon.evl.distributed.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import org.eclipse.epsilon.eol.dom.ExpressionStatement;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.FrameStack;
import org.eclipse.epsilon.eol.execute.context.FrameType;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.evl.IEvlModule;
import org.eclipse.epsilon.evl.dom.Constraint;
import org.eclipse.epsilon.evl.dom.ConstraintContext;
import org.eclipse.epsilon.evl.execute.context.IEvlContext;
import org.eclipse.epsilon.evl.execute.exceptions.EvlConstraintNotFoundException;


/**
 * A job which doesn't require model elements for evaluation, only variables as specified
 * in {@link #variables}.
 *
 * @author Sina Madani
 * @since 1.6
 */
public class SerializableEvlInputParametersAtom extends SerializableEvlInputAtom {

	private static final long serialVersionUID = 4966814112518266311L;
	
	public HashMap<String, Serializable> variables;
	public String constraintName;

	/**
	 * Gets all constraints for the ConstraintContext matching the context name in this
	 * atom only if {@linkplain #constraintName} is undefined, otherwise it finds the
	 * Constraint based on the constraint name from the ConstraintContext and wraps it
	 * in a singleton collection.
	 * 
	 * @param module
	 * @return The constraints for the constraint context, or a singleton collection
	 * if {@link #constraintName} is not empty.
	 * @throws EvlConstraintNotFoundException If the constraint could not be found.
	 */
	protected Collection<Constraint> getConstraintsToCheck(IEvlModule module) throws EvlConstraintNotFoundException {
		ConstraintContext constraintContext = module.getConstraintContext(contextName);
		Collection<Constraint> constraintsToCheck =  constraintContext.getConstraints();
		if (constraintName != null && !constraintName.isEmpty()) {
			constraintsToCheck = Collections.singleton(constraintsToCheck
				.stream()
				.filter(c -> c.getName().equals(constraintName))
				.findAny()
				.orElseThrow(() -> new EvlConstraintNotFoundException(constraintName, constraintContext))
			);
		}
		return constraintsToCheck;
	}
	
	/**
	 * Executes the check block of all constraints if {@link #constraintName} is <code>null</code> or empty,
	 * otherwise only the specified constraint. Uses the variables in {@link #variables} instead of trying
	 * to find the model element.
	 */
	@Override
	public Collection<SerializableEvlResultAtom> evaluate(IEvlModule module) throws EolRuntimeException {
		IEvlContext context = module.getContext();
		FrameStack frameStack = context.getFrameStack();
		ExpressionStatement entryPoint = new ExpressionStatement();
		Collection<Constraint> constraintsToCheck =  getConstraintsToCheck(module);
		Collection<SerializableEvlResultAtom> unsatisfied = new ArrayList<>(constraintsToCheck.size());
		
		Variable[] variablesArr = variables.entrySet().stream()
			.map(Variable::createReadOnlyVariable)
			.toArray(Variable[]::new);
		
		for (Constraint constraint : constraintsToCheck) {
			frameStack.enterLocal(FrameType.UNPROTECTED, entryPoint, variablesArr);
			
			serializeUnsatisfiedConstraintIfPresent(
				constraint.execute(variables, context)
			)
			.ifPresent(unsatisfied::add);
			
			frameStack.leaveLocal(entryPoint);
		}
		
		return unsatisfied;
	}
	
	@Override
	protected SerializableEvlInputParametersAtom clone() {
		SerializableEvlInputParametersAtom clone = (SerializableEvlInputParametersAtom) super.clone();
		clone.variables = new HashMap<>(variables);
		clone.constraintName = ""+constraintName;
		return clone;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), constraintName, variables);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) return false;
		SerializableEvlInputParametersAtom other = (SerializableEvlInputParametersAtom) obj;
		return
			Objects.equals(this.constraintName, other.constraintName) &&
			Objects.equals(this.variables, other.variables);
	}
}