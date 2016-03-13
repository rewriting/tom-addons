/**
 */
package tom.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tom.Operation;
import tom.OperationList;
import tom.TomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.OperationListImpl#getHeads <em>Heads</em>}</li>
 *   <li>{@link tom.impl.OperationListImpl#isLog <em>Log</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationListImpl extends MinimalEObjectImpl.Container implements OperationList {
	/**
	 * The cached value of the '{@link #getHeads() <em>Heads</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeads()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> heads;

	/**
	 * The default value of the '{@link #isLog() <em>Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLog()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLog() <em>Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLog()
	 * @generated
	 * @ordered
	 */
	protected boolean log = LOG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.OPERATION_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getHeads() {
		if (heads == null) {
			heads = new EObjectResolvingEList<Operation>(Operation.class, this, TomPackage.OPERATION_LIST__HEADS);
		}
		return heads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLog() {
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLog(boolean newLog) {
		boolean oldLog = log;
		log = newLog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.OPERATION_LIST__LOG, oldLog, log));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TomPackage.OPERATION_LIST__HEADS:
				return getHeads();
			case TomPackage.OPERATION_LIST__LOG:
				return isLog();
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
			case TomPackage.OPERATION_LIST__HEADS:
				getHeads().clear();
				getHeads().addAll((Collection<? extends Operation>)newValue);
				return;
			case TomPackage.OPERATION_LIST__LOG:
				setLog((Boolean)newValue);
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
			case TomPackage.OPERATION_LIST__HEADS:
				getHeads().clear();
				return;
			case TomPackage.OPERATION_LIST__LOG:
				setLog(LOG_EDEFAULT);
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
			case TomPackage.OPERATION_LIST__HEADS:
				return heads != null && !heads.isEmpty();
			case TomPackage.OPERATION_LIST__LOG:
				return log != LOG_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (log: ");
		result.append(log);
		result.append(')');
		return result.toString();
	}

} //OperationListImpl
