/**
 */
package tom.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tom.List;
import tom.OperationList;
import tom.PlainPatternOperation;
import tom.TomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plain Pattern Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.PlainPatternOperationImpl#getHeads <em>Heads</em>}</li>
 *   <li>{@link tom.impl.PlainPatternOperationImpl#getList <em>List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlainPatternOperationImpl extends PatternImpl implements PlainPatternOperation {
	/**
	 * The cached value of the '{@link #getHeads() <em>Heads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeads()
	 * @generated
	 * @ordered
	 */
	protected OperationList heads;

	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected List list;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlainPatternOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.PLAIN_PATTERN_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationList getHeads() {
		return heads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeads(OperationList newHeads, NotificationChain msgs) {
		OperationList oldHeads = heads;
		heads = newHeads;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.PLAIN_PATTERN_OPERATION__HEADS, oldHeads, newHeads);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeads(OperationList newHeads) {
		if (newHeads != heads) {
			NotificationChain msgs = null;
			if (heads != null)
				msgs = ((InternalEObject)heads).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.PLAIN_PATTERN_OPERATION__HEADS, null, msgs);
			if (newHeads != null)
				msgs = ((InternalEObject)newHeads).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.PLAIN_PATTERN_OPERATION__HEADS, null, msgs);
			msgs = basicSetHeads(newHeads, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.PLAIN_PATTERN_OPERATION__HEADS, newHeads, newHeads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getList() {
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(List newList, NotificationChain msgs) {
		List oldList = list;
		list = newList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.PLAIN_PATTERN_OPERATION__LIST, oldList, newList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(List newList) {
		if (newList != list) {
			NotificationChain msgs = null;
			if (list != null)
				msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.PLAIN_PATTERN_OPERATION__LIST, null, msgs);
			if (newList != null)
				msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.PLAIN_PATTERN_OPERATION__LIST, null, msgs);
			msgs = basicSetList(newList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.PLAIN_PATTERN_OPERATION__LIST, newList, newList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.PLAIN_PATTERN_OPERATION__HEADS:
				return basicSetHeads(null, msgs);
			case TomPackage.PLAIN_PATTERN_OPERATION__LIST:
				return basicSetList(null, msgs);
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
			case TomPackage.PLAIN_PATTERN_OPERATION__HEADS:
				return getHeads();
			case TomPackage.PLAIN_PATTERN_OPERATION__LIST:
				return getList();
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
			case TomPackage.PLAIN_PATTERN_OPERATION__HEADS:
				setHeads((OperationList)newValue);
				return;
			case TomPackage.PLAIN_PATTERN_OPERATION__LIST:
				setList((List)newValue);
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
			case TomPackage.PLAIN_PATTERN_OPERATION__HEADS:
				setHeads((OperationList)null);
				return;
			case TomPackage.PLAIN_PATTERN_OPERATION__LIST:
				setList((List)null);
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
			case TomPackage.PLAIN_PATTERN_OPERATION__HEADS:
				return heads != null;
			case TomPackage.PLAIN_PATTERN_OPERATION__LIST:
				return list != null;
		}
		return super.eIsSet(featureID);
	}

} //PlainPatternOperationImpl
