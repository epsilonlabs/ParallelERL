/**
 *
 * $Id$
 */
package javaMM.validation;

import javaMM.Expression;

/**
 * A sample validator interface for {@link javaMM.SwitchCase}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SwitchCaseValidator {
	boolean validate();

	boolean validateDefault(boolean value);
	boolean validateExpression(Expression value);
}
