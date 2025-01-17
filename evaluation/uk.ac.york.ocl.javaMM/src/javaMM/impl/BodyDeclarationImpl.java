/**
 */
package javaMM.impl;

import java.util.Collection;

import javaMM.AbstractTypeDeclaration;
import javaMM.Annotation;
import javaMM.AnonymousClassDeclaration;
import javaMM.BodyDeclaration;
import javaMM.JavaMMPackage;
import javaMM.Modifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaMM.impl.BodyDeclarationImpl#getAbstractTypeDeclaration <em>Abstract Type Declaration</em>}</li>
 *   <li>{@link javaMM.impl.BodyDeclarationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link javaMM.impl.BodyDeclarationImpl#getAnonymousClassDeclarationOwner <em>Anonymous Class Declaration Owner</em>}</li>
 *   <li>{@link javaMM.impl.BodyDeclarationImpl#getModifier <em>Modifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BodyDeclarationImpl extends NamedElementImpl implements BodyDeclaration {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected Modifier modifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaMMPackage.Literals.BODY_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeDeclaration getAbstractTypeDeclaration() {
		if (eContainerFeatureID() != JavaMMPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION) return null;
		return (AbstractTypeDeclaration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTypeDeclaration(AbstractTypeDeclaration newAbstractTypeDeclaration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAbstractTypeDeclaration, JavaMMPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractTypeDeclaration(AbstractTypeDeclaration newAbstractTypeDeclaration) {
		if (newAbstractTypeDeclaration != eInternalContainer() || (eContainerFeatureID() != JavaMMPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION && newAbstractTypeDeclaration != null)) {
			if (EcoreUtil.isAncestor(this, newAbstractTypeDeclaration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAbstractTypeDeclaration != null)
				msgs = ((InternalEObject)newAbstractTypeDeclaration).eInverseAdd(this, JavaMMPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS, AbstractTypeDeclaration.class, msgs);
			msgs = basicSetAbstractTypeDeclaration(newAbstractTypeDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION, newAbstractTypeDeclaration, newAbstractTypeDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, JavaMMPackage.BODY_DECLARATION__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClassDeclaration getAnonymousClassDeclarationOwner() {
		if (eContainerFeatureID() != JavaMMPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER) return null;
		return (AnonymousClassDeclaration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnonymousClassDeclarationOwner(AnonymousClassDeclaration newAnonymousClassDeclarationOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnonymousClassDeclarationOwner, JavaMMPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymousClassDeclarationOwner(AnonymousClassDeclaration newAnonymousClassDeclarationOwner) {
		if (newAnonymousClassDeclarationOwner != eInternalContainer() || (eContainerFeatureID() != JavaMMPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER && newAnonymousClassDeclarationOwner != null)) {
			if (EcoreUtil.isAncestor(this, newAnonymousClassDeclarationOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnonymousClassDeclarationOwner != null)
				msgs = ((InternalEObject)newAnonymousClassDeclarationOwner).eInverseAdd(this, JavaMMPackage.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS, AnonymousClassDeclaration.class, msgs);
			msgs = basicSetAnonymousClassDeclarationOwner(newAnonymousClassDeclarationOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER, newAnonymousClassDeclarationOwner, newAnonymousClassDeclarationOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modifier getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifier(Modifier newModifier, NotificationChain msgs) {
		Modifier oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaMMPackage.BODY_DECLARATION__MODIFIER, oldModifier, newModifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(Modifier newModifier) {
		if (newModifier != modifier) {
			NotificationChain msgs = null;
			if (modifier != null)
				msgs = ((InternalEObject)modifier).eInverseRemove(this, JavaMMPackage.MODIFIER__BODY_DECLARATION, Modifier.class, msgs);
			if (newModifier != null)
				msgs = ((InternalEObject)newModifier).eInverseAdd(this, JavaMMPackage.MODIFIER__BODY_DECLARATION, Modifier.class, msgs);
			msgs = basicSetModifier(newModifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMMPackage.BODY_DECLARATION__MODIFIER, newModifier, newModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaMMPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAbstractTypeDeclaration((AbstractTypeDeclaration)otherEnd, msgs);
			case JavaMMPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAnonymousClassDeclarationOwner((AnonymousClassDeclaration)otherEnd, msgs);
			case JavaMMPackage.BODY_DECLARATION__MODIFIER:
				if (modifier != null)
					msgs = ((InternalEObject)modifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaMMPackage.BODY_DECLARATION__MODIFIER, null, msgs);
				return basicSetModifier((Modifier)otherEnd, msgs);
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
			case JavaMMPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				return basicSetAbstractTypeDeclaration(null, msgs);
			case JavaMMPackage.BODY_DECLARATION__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case JavaMMPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return basicSetAnonymousClassDeclarationOwner(null, msgs);
			case JavaMMPackage.BODY_DECLARATION__MODIFIER:
				return basicSetModifier(null, msgs);
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
			case JavaMMPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				return eInternalContainer().eInverseRemove(this, JavaMMPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS, AbstractTypeDeclaration.class, msgs);
			case JavaMMPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return eInternalContainer().eInverseRemove(this, JavaMMPackage.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS, AnonymousClassDeclaration.class, msgs);
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
			case JavaMMPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				return getAbstractTypeDeclaration();
			case JavaMMPackage.BODY_DECLARATION__ANNOTATIONS:
				return getAnnotations();
			case JavaMMPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return getAnonymousClassDeclarationOwner();
			case JavaMMPackage.BODY_DECLARATION__MODIFIER:
				return getModifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaMMPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				setAbstractTypeDeclaration((AbstractTypeDeclaration)newValue);
				return;
			case JavaMMPackage.BODY_DECLARATION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case JavaMMPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				setAnonymousClassDeclarationOwner((AnonymousClassDeclaration)newValue);
				return;
			case JavaMMPackage.BODY_DECLARATION__MODIFIER:
				setModifier((Modifier)newValue);
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
			case JavaMMPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				setAbstractTypeDeclaration((AbstractTypeDeclaration)null);
				return;
			case JavaMMPackage.BODY_DECLARATION__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case JavaMMPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				setAnonymousClassDeclarationOwner((AnonymousClassDeclaration)null);
				return;
			case JavaMMPackage.BODY_DECLARATION__MODIFIER:
				setModifier((Modifier)null);
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
			case JavaMMPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				return getAbstractTypeDeclaration() != null;
			case JavaMMPackage.BODY_DECLARATION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case JavaMMPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return getAnonymousClassDeclarationOwner() != null;
			case JavaMMPackage.BODY_DECLARATION__MODIFIER:
				return modifier != null;
		}
		return super.eIsSet(featureID);
	}

} //BodyDeclarationImpl
