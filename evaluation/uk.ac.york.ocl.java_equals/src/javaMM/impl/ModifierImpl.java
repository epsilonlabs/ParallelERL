/**
 */
package javaMM.impl;

import javaMM.BodyDeclaration;
import javaMM.InheritanceKind;
import javaMM.JavaMMPackage;
import javaMM.Modifier;
import javaMM.SingleVariableDeclaration;
import javaMM.VariableDeclarationExpression;
import javaMM.VariableDeclarationStatement;
import javaMM.VisibilityKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaMM.impl.ModifierImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link javaMM.impl.ModifierImpl#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link javaMM.impl.ModifierImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link javaMM.impl.ModifierImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link javaMM.impl.ModifierImpl#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link javaMM.impl.ModifierImpl#isNative <em>Native</em>}</li>
 *   <li>{@link javaMM.impl.ModifierImpl#isStrictfp <em>Strictfp</em>}</li>
 *   <li>{@link javaMM.impl.ModifierImpl#isSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link javaMM.impl.ModifierImpl#getBodyDeclaration <em>Body Declaration</em>}</li>
 *   <li>{@link javaMM.impl.ModifierImpl#getSingleVariableDeclaration <em>Single Variable Declaration</em>}</li>
 *   <li>{@link javaMM.impl.ModifierImpl#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}</li>
 *   <li>{@link javaMM.impl.ModifierImpl#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifierImpl extends ASTNodeImpl implements Modifier {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.NONE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInheritance() <em>Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
	protected static final InheritanceKind INHERITANCE_EDEFAULT = InheritanceKind.NONE;

	/**
	 * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
	protected InheritanceKind inheritance = INHERITANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean volatile_ = VOLATILE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNative() <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNative() <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNative()
	 * @generated
	 * @ordered
	 */
	protected boolean native_ = NATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStrictfp() <em>Strictfp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrictfp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRICTFP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStrictfp() <em>Strictfp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrictfp()
	 * @generated
	 * @ordered
	 */
	protected boolean strictfp_ = STRICTFP_EDEFAULT;

	/**
	 * The default value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronized()
	 * @generated
	 * @ordered
	 */
	protected boolean synchronized_ = SYNCHRONIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaMMPackage.Literals.MODIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.MODIFIER__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InheritanceKind getInheritance() {
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInheritance(InheritanceKind newInheritance) {
		InheritanceKind oldInheritance = inheritance;
		inheritance = newInheritance == null ? INHERITANCE_EDEFAULT : newInheritance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.MODIFIER__INHERITANCE, oldInheritance, inheritance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatic(boolean newStatic) {
		boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.MODIFIER__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.MODIFIER__TRANSIENT, oldTransient, transient_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVolatile() {
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolatile(boolean newVolatile) {
		boolean oldVolatile = volatile_;
		volatile_ = newVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.MODIFIER__VOLATILE, oldVolatile, volatile_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNative() {
		return native_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNative(boolean newNative) {
		boolean oldNative = native_;
		native_ = newNative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.MODIFIER__NATIVE, oldNative, native_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStrictfp() {
		return strictfp_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrictfp(boolean newStrictfp) {
		boolean oldStrictfp = strictfp_;
		strictfp_ = newStrictfp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.MODIFIER__STRICTFP, oldStrictfp, strictfp_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSynchronized() {
		return synchronized_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSynchronized(boolean newSynchronized) {
		boolean oldSynchronized = synchronized_;
		synchronized_ = newSynchronized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.MODIFIER__SYNCHRONIZED, oldSynchronized, synchronized_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyDeclaration getBodyDeclaration() {
		if (eContainerFeatureID() != JavaMMPackage.MODIFIER__BODY_DECLARATION) return null;
		return (BodyDeclaration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyDeclaration(BodyDeclaration newBodyDeclaration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBodyDeclaration, JavaMMPackage.MODIFIER__BODY_DECLARATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBodyDeclaration(BodyDeclaration newBodyDeclaration) {
		if (newBodyDeclaration != eInternalContainer() || (eContainerFeatureID() != JavaMMPackage.MODIFIER__BODY_DECLARATION && newBodyDeclaration != null)) {
			if (EcoreUtil.isAncestor(this, newBodyDeclaration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBodyDeclaration != null)
				msgs = ((InternalEObject)newBodyDeclaration).eInverseAdd(this, JavaMMPackage.BODY_DECLARATION__MODIFIER, BodyDeclaration.class, msgs);
			msgs = basicSetBodyDeclaration(newBodyDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.MODIFIER__BODY_DECLARATION, newBodyDeclaration, newBodyDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableDeclaration getSingleVariableDeclaration() {
		if (eContainerFeatureID() != JavaMMPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION) return null;
		return (SingleVariableDeclaration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleVariableDeclaration(SingleVariableDeclaration newSingleVariableDeclaration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSingleVariableDeclaration, JavaMMPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSingleVariableDeclaration(SingleVariableDeclaration newSingleVariableDeclaration) {
		if (newSingleVariableDeclaration != eInternalContainer() || (eContainerFeatureID() != JavaMMPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION && newSingleVariableDeclaration != null)) {
			if (EcoreUtil.isAncestor(this, newSingleVariableDeclaration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSingleVariableDeclaration != null)
				msgs = ((InternalEObject)newSingleVariableDeclaration).eInverseAdd(this, JavaMMPackage.SINGLE_VARIABLE_DECLARATION__MODIFIER, SingleVariableDeclaration.class, msgs);
			msgs = basicSetSingleVariableDeclaration(newSingleVariableDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION, newSingleVariableDeclaration, newSingleVariableDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationStatement getVariableDeclarationStatement() {
		if (eContainerFeatureID() != JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT) return null;
		return (VariableDeclarationStatement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDeclarationStatement(VariableDeclarationStatement newVariableDeclarationStatement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVariableDeclarationStatement, JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableDeclarationStatement(VariableDeclarationStatement newVariableDeclarationStatement) {
		if (newVariableDeclarationStatement != eInternalContainer() || (eContainerFeatureID() != JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT && newVariableDeclarationStatement != null)) {
			if (EcoreUtil.isAncestor(this, newVariableDeclarationStatement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVariableDeclarationStatement != null)
				msgs = ((InternalEObject)newVariableDeclarationStatement).eInverseAdd(this, JavaMMPackage.VARIABLE_DECLARATION_STATEMENT__MODIFIER, VariableDeclarationStatement.class, msgs);
			msgs = basicSetVariableDeclarationStatement(newVariableDeclarationStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT, newVariableDeclarationStatement, newVariableDeclarationStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationExpression getVariableDeclarationExpression() {
		if (eContainerFeatureID() != JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION) return null;
		return (VariableDeclarationExpression)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDeclarationExpression(VariableDeclarationExpression newVariableDeclarationExpression, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVariableDeclarationExpression, JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableDeclarationExpression(VariableDeclarationExpression newVariableDeclarationExpression) {
		if (newVariableDeclarationExpression != eInternalContainer() || (eContainerFeatureID() != JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION && newVariableDeclarationExpression != null)) {
			if (EcoreUtil.isAncestor(this, newVariableDeclarationExpression))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVariableDeclarationExpression != null)
				msgs = ((InternalEObject)newVariableDeclarationExpression).eInverseAdd(this, JavaMMPackage.VARIABLE_DECLARATION_EXPRESSION__MODIFIER, VariableDeclarationExpression.class, msgs);
			msgs = basicSetVariableDeclarationExpression(newVariableDeclarationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION, newVariableDeclarationExpression, newVariableDeclarationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaMMPackage.MODIFIER__BODY_DECLARATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBodyDeclaration((BodyDeclaration)otherEnd, msgs);
			case JavaMMPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSingleVariableDeclaration((SingleVariableDeclaration)otherEnd, msgs);
			case JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVariableDeclarationStatement((VariableDeclarationStatement)otherEnd, msgs);
			case JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVariableDeclarationExpression((VariableDeclarationExpression)otherEnd, msgs);
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
			case JavaMMPackage.MODIFIER__BODY_DECLARATION:
				return basicSetBodyDeclaration(null, msgs);
			case JavaMMPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				return basicSetSingleVariableDeclaration(null, msgs);
			case JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				return basicSetVariableDeclarationStatement(null, msgs);
			case JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				return basicSetVariableDeclarationExpression(null, msgs);
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
			case JavaMMPackage.MODIFIER__BODY_DECLARATION:
				return eInternalContainer().eInverseRemove(this, JavaMMPackage.BODY_DECLARATION__MODIFIER, BodyDeclaration.class, msgs);
			case JavaMMPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				return eInternalContainer().eInverseRemove(this, JavaMMPackage.SINGLE_VARIABLE_DECLARATION__MODIFIER, SingleVariableDeclaration.class, msgs);
			case JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				return eInternalContainer().eInverseRemove(this, JavaMMPackage.VARIABLE_DECLARATION_STATEMENT__MODIFIER, VariableDeclarationStatement.class, msgs);
			case JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				return eInternalContainer().eInverseRemove(this, JavaMMPackage.VARIABLE_DECLARATION_EXPRESSION__MODIFIER, VariableDeclarationExpression.class, msgs);
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
			case JavaMMPackage.MODIFIER__VISIBILITY:
				return getVisibility();
			case JavaMMPackage.MODIFIER__INHERITANCE:
				return getInheritance();
			case JavaMMPackage.MODIFIER__STATIC:
				return isStatic();
			case JavaMMPackage.MODIFIER__TRANSIENT:
				return isTransient();
			case JavaMMPackage.MODIFIER__VOLATILE:
				return isVolatile();
			case JavaMMPackage.MODIFIER__NATIVE:
				return isNative();
			case JavaMMPackage.MODIFIER__STRICTFP:
				return isStrictfp();
			case JavaMMPackage.MODIFIER__SYNCHRONIZED:
				return isSynchronized();
			case JavaMMPackage.MODIFIER__BODY_DECLARATION:
				return getBodyDeclaration();
			case JavaMMPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				return getSingleVariableDeclaration();
			case JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				return getVariableDeclarationStatement();
			case JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				return getVariableDeclarationExpression();
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
			case JavaMMPackage.MODIFIER__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case JavaMMPackage.MODIFIER__INHERITANCE:
				setInheritance((InheritanceKind)newValue);
				return;
			case JavaMMPackage.MODIFIER__STATIC:
				setStatic((Boolean)newValue);
				return;
			case JavaMMPackage.MODIFIER__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case JavaMMPackage.MODIFIER__VOLATILE:
				setVolatile((Boolean)newValue);
				return;
			case JavaMMPackage.MODIFIER__NATIVE:
				setNative((Boolean)newValue);
				return;
			case JavaMMPackage.MODIFIER__STRICTFP:
				setStrictfp((Boolean)newValue);
				return;
			case JavaMMPackage.MODIFIER__SYNCHRONIZED:
				setSynchronized((Boolean)newValue);
				return;
			case JavaMMPackage.MODIFIER__BODY_DECLARATION:
				setBodyDeclaration((BodyDeclaration)newValue);
				return;
			case JavaMMPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				setSingleVariableDeclaration((SingleVariableDeclaration)newValue);
				return;
			case JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				setVariableDeclarationStatement((VariableDeclarationStatement)newValue);
				return;
			case JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				setVariableDeclarationExpression((VariableDeclarationExpression)newValue);
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
			case JavaMMPackage.MODIFIER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case JavaMMPackage.MODIFIER__INHERITANCE:
				setInheritance(INHERITANCE_EDEFAULT);
				return;
			case JavaMMPackage.MODIFIER__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case JavaMMPackage.MODIFIER__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
				return;
			case JavaMMPackage.MODIFIER__VOLATILE:
				setVolatile(VOLATILE_EDEFAULT);
				return;
			case JavaMMPackage.MODIFIER__NATIVE:
				setNative(NATIVE_EDEFAULT);
				return;
			case JavaMMPackage.MODIFIER__STRICTFP:
				setStrictfp(STRICTFP_EDEFAULT);
				return;
			case JavaMMPackage.MODIFIER__SYNCHRONIZED:
				setSynchronized(SYNCHRONIZED_EDEFAULT);
				return;
			case JavaMMPackage.MODIFIER__BODY_DECLARATION:
				setBodyDeclaration((BodyDeclaration)null);
				return;
			case JavaMMPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				setSingleVariableDeclaration((SingleVariableDeclaration)null);
				return;
			case JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				setVariableDeclarationStatement((VariableDeclarationStatement)null);
				return;
			case JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				setVariableDeclarationExpression((VariableDeclarationExpression)null);
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
			case JavaMMPackage.MODIFIER__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case JavaMMPackage.MODIFIER__INHERITANCE:
				return inheritance != INHERITANCE_EDEFAULT;
			case JavaMMPackage.MODIFIER__STATIC:
				return static_ != STATIC_EDEFAULT;
			case JavaMMPackage.MODIFIER__TRANSIENT:
				return transient_ != TRANSIENT_EDEFAULT;
			case JavaMMPackage.MODIFIER__VOLATILE:
				return volatile_ != VOLATILE_EDEFAULT;
			case JavaMMPackage.MODIFIER__NATIVE:
				return native_ != NATIVE_EDEFAULT;
			case JavaMMPackage.MODIFIER__STRICTFP:
				return strictfp_ != STRICTFP_EDEFAULT;
			case JavaMMPackage.MODIFIER__SYNCHRONIZED:
				return synchronized_ != SYNCHRONIZED_EDEFAULT;
			case JavaMMPackage.MODIFIER__BODY_DECLARATION:
				return getBodyDeclaration() != null;
			case JavaMMPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				return getSingleVariableDeclaration() != null;
			case JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				return getVariableDeclarationStatement() != null;
			case JavaMMPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				return getVariableDeclarationExpression() != null;
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", inheritance: ");
		result.append(inheritance);
		result.append(", static: ");
		result.append(static_);
		result.append(", transient: ");
		result.append(transient_);
		result.append(", volatile: ");
		result.append(volatile_);
		result.append(", native: ");
		result.append(native_);
		result.append(", strictfp: ");
		result.append(strictfp_);
		result.append(", synchronized: ");
		result.append(synchronized_);
		result.append(')');
		return result.toString();
	}

} //ModifierImpl
