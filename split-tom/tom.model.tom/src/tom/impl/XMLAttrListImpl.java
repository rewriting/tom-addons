/**
 */
package tom.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tom.TomPackage;
import tom.XMLAttrList;
import tom.XMLAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Attr List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.XMLAttrListImpl#getAttrs <em>Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMLAttrListImpl extends MinimalEObjectImpl.Container implements XMLAttrList {
	/**
	 * The cached value of the '{@link #getAttrs() <em>Attrs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<XMLAttribute> attrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLAttrListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.XML_ATTR_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XMLAttribute> getAttrs() {
		if (attrs == null) {
			attrs = new EObjectContainmentEList<XMLAttribute>(XMLAttribute.class, this, TomPackage.XML_ATTR_LIST__ATTRS);
		}
		return attrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.XML_ATTR_LIST__ATTRS:
				return ((InternalEList<?>)getAttrs()).basicRemove(otherEnd, msgs);
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
			case TomPackage.XML_ATTR_LIST__ATTRS:
				return getAttrs();
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
			case TomPackage.XML_ATTR_LIST__ATTRS:
				getAttrs().clear();
				getAttrs().addAll((Collection<? extends XMLAttribute>)newValue);
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
			case TomPackage.XML_ATTR_LIST__ATTRS:
				getAttrs().clear();
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
			case TomPackage.XML_ATTR_LIST__ATTRS:
				return attrs != null && !attrs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //XMLAttrListImpl
