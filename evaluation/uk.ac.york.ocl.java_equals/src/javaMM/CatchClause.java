/**
 */
package javaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catch Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaMM.CatchClause#getException <em>Exception</em>}</li>
 *   <li>{@link javaMM.CatchClause#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see javaMM.JavaMMPackage#getCatchClause()
 * @model
 * @generated
 */
public interface CatchClause extends Statement {
	/**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link javaMM.SingleVariableDeclaration#getCatchClause <em>Catch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference.
	 * @see #setException(SingleVariableDeclaration)
	 * @see javaMM.JavaMMPackage#getCatchClause_Exception()
	 * @see javaMM.SingleVariableDeclaration#getCatchClause
	 * @model opposite="catchClause" containment="true" required="true"
	 * @generated
	 */
	SingleVariableDeclaration getException();

	/**
	 * Sets the value of the '{@link javaMM.CatchClause#getException <em>Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' containment reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(SingleVariableDeclaration value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Block)
	 * @see javaMM.JavaMMPackage#getCatchClause_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getBody();

	/**
	 * Sets the value of the '{@link javaMM.CatchClause#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Block value);

} // CatchClause
