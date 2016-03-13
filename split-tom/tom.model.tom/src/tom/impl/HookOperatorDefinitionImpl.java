/**
 */
package tom.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tom.HookOperatorDefinition;
import tom.OperatorDefinition;
import tom.TomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hook Operator Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.HookOperatorDefinitionImpl#getHookType <em>Hook Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HookOperatorDefinitionImpl extends HookDefinitionImpl implements HookOperatorDefinition {
	/**
	 * The cached value of the '{@link #getHookType() <em>Hook Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHookType()
	 * @generated
	 * @ordered
	 */
	protected OperatorDefinition hookType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HookOperatorDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.HOOK_OPERATOR_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorDefinition getHookType() {
		if (hookType != null && hookType.eIsProxy()) {
			InternalEObject oldHookType = (InternalEObject)hookType;
			hookType = (OperatorDefinition)eResolveProxy(oldHookType);
			if (hookType != oldHookType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TomPackage.HOOK_OPERATOR_DEFINITION__HOOK_TYPE, oldHookType, hookType));
			}
		}
		return hookType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorDefinition basicGetHookType() {
		return hookType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHookType(OperatorDefinition newHookType) {
		OperatorDefinition oldHookType = hookType;
		hookType = newHookType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.HOOK_OPERATOR_DEFINITION__HOOK_TYPE, oldHookType, hookType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TomPackage.HOOK_OPERATOR_DEFINITION__HOOK_TYPE:
				if (resolve) return getHookType();
				return basicGetHookType();
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
			case TomPackage.HOOK_OPERATOR_DEFINITION__HOOK_TYPE:
				setHookType((OperatorDefinition)newValue);
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
			case TomPackage.HOOK_OPERATOR_DEFINITION__HOOK_TYPE:
				setHookType((OperatorDefinition)null);
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
			case TomPackage.HOOK_OPERATOR_DEFINITION__HOOK_TYPE:
				return hookType != null;
		}
		return super.eIsSet(featureID);
	}

} //HookOperatorDefinitionImpl
