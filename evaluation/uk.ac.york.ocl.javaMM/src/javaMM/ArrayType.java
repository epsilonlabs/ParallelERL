/**
 */
package javaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaMM.ArrayType#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link javaMM.ArrayType#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see javaMM.JavaMMPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends Type {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' attribute.
	 * @see #setDimensions(int)
	 * @see javaMM.JavaMMPackage#getArrayType_Dimensions()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/MoDisco/Java/0.2.incubation/java!ArrayType!dimensions'"
	 * @generated
	 */
	int getDimensions();

	/**
	 * Sets the value of the '{@link javaMM.ArrayType#getDimensions <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' attribute.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(int value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' containment reference.
	 * @see #setElementType(TypeAccess)
	 * @see javaMM.JavaMMPackage#getArrayType_ElementType()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/MoDisco/Java/0.2.incubation/java!ArrayType!elementType'"
	 * @generated
	 */
	TypeAccess getElementType();

	/**
	 * Sets the value of the '{@link javaMM.ArrayType#getElementType <em>Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' containment reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(TypeAccess value);

} // ArrayType
