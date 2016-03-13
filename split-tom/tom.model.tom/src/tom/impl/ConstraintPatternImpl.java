/**
 */
package tom.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tom.ConstraintAction;
import tom.ConstraintPattern;
import tom.TomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.ConstraintPatternImpl#getConstraintActions <em>Constraint Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintPatternImpl extends MatchConsctructImpl implements ConstraintPattern {
	/**
	 * The cached value of the '{@link #getConstraintActions() <em>Constraint Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintAction> constraintActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.CONSTRAINT_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintAction> getConstraintActions() {
		if (constraintActions == null) {
			constraintActions = new EObjectContainmentEList<ConstraintAction>(ConstraintAction.class, this, TomPackage.CONSTRAINT_PATTERN__CONSTRAINT_ACTIONS);
		}
		return constraintActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.CONSTRAINT_PATTERN__CONSTRAINT_ACTIONS:
				return ((InternalEList<?>)getConstraintActions()).basicRemove(otherEnd, msgs);
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
			case TomPackage.CONSTRAINT_PATTERN__CONSTRAINT_ACTIONS:
				return getConstraintActions();
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
			case TomPackage.CONSTRAINT_PATTERN__CONSTRAINT_ACTIONS:
				getConstraintActions().clear();
				getConstraintActions().addAll((Collection<? extends ConstraintAction>)newValue);
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
			case TomPackage.CONSTRAINT_PATTERN__CONSTRAINT_ACTIONS:
				getConstraintActions().clear();
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
			case TomPackage.CONSTRAINT_PATTERN__CONSTRAINT_ACTIONS:
				return constraintActions != null && !constraintActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstraintPatternImpl
