/**
 */
package javaMM.impl;

import javaMM.AbstractVariablesContainer;
import javaMM.JavaMMPackage;
import javaMM.VariableDeclarationFragment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaMM.impl.VariableDeclarationFragmentImpl#getVariablesContainer <em>Variables Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationFragmentImpl extends VariableDeclarationImpl implements VariableDeclarationFragment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaMMPackage.Literals.VARIABLE_DECLARATION_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractVariablesContainer getVariablesContainer() {
		if (eContainerFeatureID() != JavaMMPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER) return null;
		return (AbstractVariablesContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariablesContainer(AbstractVariablesContainer newVariablesContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVariablesContainer, JavaMMPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariablesContainer(AbstractVariablesContainer newVariablesContainer) {
		if (newVariablesContainer != eInternalContainer() || (eContainerFeatureID() != JavaMMPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER && newVariablesContainer != null)) {
			if (EcoreUtil.isAncestor(this, newVariablesContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVariablesContainer != null)
				msgs = ((InternalEObject)newVariablesContainer).eInverseAdd(this, JavaMMPackage.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS, AbstractVariablesContainer.class, msgs);
			msgs = basicSetVariablesContainer(newVariablesContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER, newVariablesContainer, newVariablesContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaMMPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVariablesContainer((AbstractVariablesContainer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaMMPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				return basicSetVariablesContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JavaMMPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				return eInternalContainer().eInverseRemove(this, JavaMMPackage.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS, AbstractVariablesContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaMMPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				return getVariablesContainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaMMPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				setVariablesContainer((AbstractVariablesContainer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JavaMMPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				setVariablesContainer((AbstractVariablesContainer)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavaMMPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				return getVariablesContainer() != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableDeclarationFragmentImpl
