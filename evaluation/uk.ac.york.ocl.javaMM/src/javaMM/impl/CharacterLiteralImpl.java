/**
 */
package javaMM.impl;

import javaMM.CharacterLiteral;
import javaMM.JavaMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaMM.impl.CharacterLiteralImpl#getEscapedValue <em>Escaped Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterLiteralImpl extends ExpressionImpl implements CharacterLiteral {
	/**
	 * The default value of the '{@link #getEscapedValue() <em>Escaped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ESCAPED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEscapedValue() <em>Escaped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapedValue()
	 * @generated
	 * @ordered
	 */
	protected String escapedValue = ESCAPED_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaMMPackage.Literals.CHARACTER_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEscapedValue() {
		return escapedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscapedValue(String newEscapedValue) {
		String oldEscapedValue = escapedValue;
		escapedValue = newEscapedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.CHARACTER_LITERAL__ESCAPED_VALUE, oldEscapedValue, escapedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaMMPackage.CHARACTER_LITERAL__ESCAPED_VALUE:
				return getEscapedValue();
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
			case JavaMMPackage.CHARACTER_LITERAL__ESCAPED_VALUE:
				setEscapedValue((String)newValue);
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
			case JavaMMPackage.CHARACTER_LITERAL__ESCAPED_VALUE:
				setEscapedValue(ESCAPED_VALUE_EDEFAULT);
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
			case JavaMMPackage.CHARACTER_LITERAL__ESCAPED_VALUE:
				return ESCAPED_VALUE_EDEFAULT == null ? escapedValue != null : !ESCAPED_VALUE_EDEFAULT.equals(escapedValue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (escapedValue: ");
		result.append(escapedValue);
		result.append(')');
		return result.toString();
	}

} //CharacterLiteralImpl
