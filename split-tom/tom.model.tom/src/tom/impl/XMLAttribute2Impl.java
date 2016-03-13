/**
 */
package tom.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tom.TomPackage;
import tom.XMLAttribute2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Attribute2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.XMLAttribute2Impl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link tom.impl.XMLAttribute2Impl#getAnnotedName <em>Annoted Name</em>}</li>
 *   <li>{@link tom.impl.XMLAttribute2Impl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMLAttribute2Impl extends XMLAttributeImpl implements XMLAttribute2 {
	/**
	 * The default value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnnotedName() <em>Annoted Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotedName()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotedName() <em>Annoted Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotedName()
	 * @generated
	 * @ordered
	 */
	protected String annotedName = ANNOTED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLAttribute2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.XML_ATTRIBUTE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeName(String newAttributeName) {
		String oldAttributeName = attributeName;
		attributeName = newAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.XML_ATTRIBUTE2__ATTRIBUTE_NAME, oldAttributeName, attributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnotedName() {
		return annotedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotedName(String newAnnotedName) {
		String oldAnnotedName = annotedName;
		annotedName = newAnnotedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.XML_ATTRIBUTE2__ANNOTED_NAME, oldAnnotedName, annotedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.XML_ATTRIBUTE2__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TomPackage.XML_ATTRIBUTE2__ATTRIBUTE_NAME:
				return getAttributeName();
			case TomPackage.XML_ATTRIBUTE2__ANNOTED_NAME:
				return getAnnotedName();
			case TomPackage.XML_ATTRIBUTE2__NAME:
				return getName();
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
			case TomPackage.XML_ATTRIBUTE2__ATTRIBUTE_NAME:
				setAttributeName((String)newValue);
				return;
			case TomPackage.XML_ATTRIBUTE2__ANNOTED_NAME:
				setAnnotedName((String)newValue);
				return;
			case TomPackage.XML_ATTRIBUTE2__NAME:
				setName((String)newValue);
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
			case TomPackage.XML_ATTRIBUTE2__ATTRIBUTE_NAME:
				setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
				return;
			case TomPackage.XML_ATTRIBUTE2__ANNOTED_NAME:
				setAnnotedName(ANNOTED_NAME_EDEFAULT);
				return;
			case TomPackage.XML_ATTRIBUTE2__NAME:
				setName(NAME_EDEFAULT);
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
			case TomPackage.XML_ATTRIBUTE2__ATTRIBUTE_NAME:
				return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
			case TomPackage.XML_ATTRIBUTE2__ANNOTED_NAME:
				return ANNOTED_NAME_EDEFAULT == null ? annotedName != null : !ANNOTED_NAME_EDEFAULT.equals(annotedName);
			case TomPackage.XML_ATTRIBUTE2__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (attributeName: ");
		result.append(attributeName);
		result.append(", annotedName: ");
		result.append(annotedName);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //XMLAttribute2Impl
