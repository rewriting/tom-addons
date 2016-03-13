/**
 */
package tom.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tom.TomPackage;
import tom.XMLAttrList;
import tom.XMLNameList;
import tom.XMLTermSimple;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Term Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.XMLTermSimpleImpl#getNameList <em>Name List</em>}</li>
 *   <li>{@link tom.impl.XMLTermSimpleImpl#getAttrList <em>Attr List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMLTermSimpleImpl extends XMLTermImpl implements XMLTermSimple {
	/**
	 * The cached value of the '{@link #getNameList() <em>Name List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameList()
	 * @generated
	 * @ordered
	 */
	protected XMLNameList nameList;

	/**
	 * The cached value of the '{@link #getAttrList() <em>Attr List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrList()
	 * @generated
	 * @ordered
	 */
	protected XMLAttrList attrList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTermSimpleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.XML_TERM_SIMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLNameList getNameList() {
		return nameList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameList(XMLNameList newNameList, NotificationChain msgs) {
		XMLNameList oldNameList = nameList;
		nameList = newNameList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.XML_TERM_SIMPLE__NAME_LIST, oldNameList, newNameList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameList(XMLNameList newNameList) {
		if (newNameList != nameList) {
			NotificationChain msgs = null;
			if (nameList != null)
				msgs = ((InternalEObject)nameList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.XML_TERM_SIMPLE__NAME_LIST, null, msgs);
			if (newNameList != null)
				msgs = ((InternalEObject)newNameList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.XML_TERM_SIMPLE__NAME_LIST, null, msgs);
			msgs = basicSetNameList(newNameList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.XML_TERM_SIMPLE__NAME_LIST, newNameList, newNameList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLAttrList getAttrList() {
		return attrList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttrList(XMLAttrList newAttrList, NotificationChain msgs) {
		XMLAttrList oldAttrList = attrList;
		attrList = newAttrList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.XML_TERM_SIMPLE__ATTR_LIST, oldAttrList, newAttrList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttrList(XMLAttrList newAttrList) {
		if (newAttrList != attrList) {
			NotificationChain msgs = null;
			if (attrList != null)
				msgs = ((InternalEObject)attrList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.XML_TERM_SIMPLE__ATTR_LIST, null, msgs);
			if (newAttrList != null)
				msgs = ((InternalEObject)newAttrList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.XML_TERM_SIMPLE__ATTR_LIST, null, msgs);
			msgs = basicSetAttrList(newAttrList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.XML_TERM_SIMPLE__ATTR_LIST, newAttrList, newAttrList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.XML_TERM_SIMPLE__NAME_LIST:
				return basicSetNameList(null, msgs);
			case TomPackage.XML_TERM_SIMPLE__ATTR_LIST:
				return basicSetAttrList(null, msgs);
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
			case TomPackage.XML_TERM_SIMPLE__NAME_LIST:
				return getNameList();
			case TomPackage.XML_TERM_SIMPLE__ATTR_LIST:
				return getAttrList();
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
			case TomPackage.XML_TERM_SIMPLE__NAME_LIST:
				setNameList((XMLNameList)newValue);
				return;
			case TomPackage.XML_TERM_SIMPLE__ATTR_LIST:
				setAttrList((XMLAttrList)newValue);
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
			case TomPackage.XML_TERM_SIMPLE__NAME_LIST:
				setNameList((XMLNameList)null);
				return;
			case TomPackage.XML_TERM_SIMPLE__ATTR_LIST:
				setAttrList((XMLAttrList)null);
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
			case TomPackage.XML_TERM_SIMPLE__NAME_LIST:
				return nameList != null;
			case TomPackage.XML_TERM_SIMPLE__ATTR_LIST:
				return attrList != null;
		}
		return super.eIsSet(featureID);
	}

} //XMLTermSimpleImpl
