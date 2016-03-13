/**
 */
package tom.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tom.HookTypeDefinition;
import tom.TomPackage;
import tom.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hook Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.HookTypeDefinitionImpl#getHookType <em>Hook Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HookTypeDefinitionImpl extends HookDefinitionImpl implements HookTypeDefinition {
	/**
	 * The cached value of the '{@link #getHookType() <em>Hook Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHookType()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition hookType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HookTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.HOOK_TYPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition getHookType() {
		if (hookType != null && hookType.eIsProxy()) {
			InternalEObject oldHookType = (InternalEObject)hookType;
			hookType = (TypeDefinition)eResolveProxy(oldHookType);
			if (hookType != oldHookType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TomPackage.HOOK_TYPE_DEFINITION__HOOK_TYPE, oldHookType, hookType));
			}
		}
		return hookType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition basicGetHookType() {
		return hookType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHookType(TypeDefinition newHookType) {
		TypeDefinition oldHookType = hookType;
		hookType = newHookType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.HOOK_TYPE_DEFINITION__HOOK_TYPE, oldHookType, hookType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TomPackage.HOOK_TYPE_DEFINITION__HOOK_TYPE:
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
			case TomPackage.HOOK_TYPE_DEFINITION__HOOK_TYPE:
				setHookType((TypeDefinition)newValue);
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
			case TomPackage.HOOK_TYPE_DEFINITION__HOOK_TYPE:
				setHookType((TypeDefinition)null);
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
			case TomPackage.HOOK_TYPE_DEFINITION__HOOK_TYPE:
				return hookType != null;
		}
		return super.eIsSet(featureID);
	}

} //HookTypeDefinitionImpl
