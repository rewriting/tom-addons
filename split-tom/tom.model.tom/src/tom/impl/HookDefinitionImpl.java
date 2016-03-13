/**
 */
package tom.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tom.HookDefinition;
import tom.HookOperation;
import tom.TomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hook Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.HookDefinitionImpl#getHookOperation <em>Hook Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HookDefinitionImpl extends DefinitionImpl implements HookDefinition {
	/**
	 * The cached value of the '{@link #getHookOperation() <em>Hook Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHookOperation()
	 * @generated
	 * @ordered
	 */
	protected HookOperation hookOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HookDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.HOOK_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HookOperation getHookOperation() {
		return hookOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHookOperation(HookOperation newHookOperation, NotificationChain msgs) {
		HookOperation oldHookOperation = hookOperation;
		hookOperation = newHookOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.HOOK_DEFINITION__HOOK_OPERATION, oldHookOperation, newHookOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHookOperation(HookOperation newHookOperation) {
		if (newHookOperation != hookOperation) {
			NotificationChain msgs = null;
			if (hookOperation != null)
				msgs = ((InternalEObject)hookOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.HOOK_DEFINITION__HOOK_OPERATION, null, msgs);
			if (newHookOperation != null)
				msgs = ((InternalEObject)newHookOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.HOOK_DEFINITION__HOOK_OPERATION, null, msgs);
			msgs = basicSetHookOperation(newHookOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.HOOK_DEFINITION__HOOK_OPERATION, newHookOperation, newHookOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.HOOK_DEFINITION__HOOK_OPERATION:
				return basicSetHookOperation(null, msgs);
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
			case TomPackage.HOOK_DEFINITION__HOOK_OPERATION:
				return getHookOperation();
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
			case TomPackage.HOOK_DEFINITION__HOOK_OPERATION:
				setHookOperation((HookOperation)newValue);
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
			case TomPackage.HOOK_DEFINITION__HOOK_OPERATION:
				setHookOperation((HookOperation)null);
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
			case TomPackage.HOOK_DEFINITION__HOOK_OPERATION:
				return hookOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //HookDefinitionImpl
