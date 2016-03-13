/**
 */
package tom.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tom.ElementaryTransformation;
import tom.ElementaryTransformationRule;
import tom.TermOperation;
import tom.TomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elementary Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.ElementaryTransformationImpl#getImplement <em>Implement</em>}</li>
 *   <li>{@link tom.impl.ElementaryTransformationImpl#getElementaryTransformationRules <em>Elementary Transformation Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementaryTransformationImpl extends OperationImpl implements ElementaryTransformation {
	/**
	 * The cached value of the '{@link #getImplement() <em>Implement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplement()
	 * @generated
	 * @ordered
	 */
	protected TermOperation implement;

	/**
	 * The cached value of the '{@link #getElementaryTransformationRules() <em>Elementary Transformation Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementaryTransformationRules()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementaryTransformationRule> elementaryTransformationRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementaryTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.ELEMENTARY_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermOperation getImplement() {
		return implement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplement(TermOperation newImplement, NotificationChain msgs) {
		TermOperation oldImplement = implement;
		implement = newImplement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.ELEMENTARY_TRANSFORMATION__IMPLEMENT, oldImplement, newImplement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplement(TermOperation newImplement) {
		if (newImplement != implement) {
			NotificationChain msgs = null;
			if (implement != null)
				msgs = ((InternalEObject)implement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.ELEMENTARY_TRANSFORMATION__IMPLEMENT, null, msgs);
			if (newImplement != null)
				msgs = ((InternalEObject)newImplement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.ELEMENTARY_TRANSFORMATION__IMPLEMENT, null, msgs);
			msgs = basicSetImplement(newImplement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.ELEMENTARY_TRANSFORMATION__IMPLEMENT, newImplement, newImplement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementaryTransformationRule> getElementaryTransformationRules() {
		if (elementaryTransformationRules == null) {
			elementaryTransformationRules = new EObjectContainmentEList<ElementaryTransformationRule>(ElementaryTransformationRule.class, this, TomPackage.ELEMENTARY_TRANSFORMATION__ELEMENTARY_TRANSFORMATION_RULES);
		}
		return elementaryTransformationRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.ELEMENTARY_TRANSFORMATION__IMPLEMENT:
				return basicSetImplement(null, msgs);
			case TomPackage.ELEMENTARY_TRANSFORMATION__ELEMENTARY_TRANSFORMATION_RULES:
				return ((InternalEList<?>)getElementaryTransformationRules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TomPackage.ELEMENTARY_TRANSFORMATION__IMPLEMENT:
				return getImplement();
			case TomPackage.ELEMENTARY_TRANSFORMATION__ELEMENTARY_TRANSFORMATION_RULES:
				return getElementaryTransformationRules();
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
			case TomPackage.ELEMENTARY_TRANSFORMATION__IMPLEMENT:
				setImplement((TermOperation)newValue);
				return;
			case TomPackage.ELEMENTARY_TRANSFORMATION__ELEMENTARY_TRANSFORMATION_RULES:
				getElementaryTransformationRules().clear();
				getElementaryTransformationRules().addAll((Collection<? extends ElementaryTransformationRule>)newValue);
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
			case TomPackage.ELEMENTARY_TRANSFORMATION__IMPLEMENT:
				setImplement((TermOperation)null);
				return;
			case TomPackage.ELEMENTARY_TRANSFORMATION__ELEMENTARY_TRANSFORMATION_RULES:
				getElementaryTransformationRules().clear();
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
			case TomPackage.ELEMENTARY_TRANSFORMATION__IMPLEMENT:
				return implement != null;
			case TomPackage.ELEMENTARY_TRANSFORMATION__ELEMENTARY_TRANSFORMATION_RULES:
				return elementaryTransformationRules != null && !elementaryTransformationRules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementaryTransformationImpl
