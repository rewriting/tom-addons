/**
 */
package tom.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tom.IncludeConstruct;
import tom.TomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include Construct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.IncludeConstructImpl#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link tom.impl.IncludeConstructImpl#getExt <em>Ext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludeConstructImpl extends BlockImpl implements IncludeConstruct {
	/**
	 * The default value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportURI()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportURI()
	 * @generated
	 * @ordered
	 */
	protected String importURI = IMPORT_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getExt() <em>Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExt()
	 * @generated
	 * @ordered
	 */
	protected static final String EXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExt() <em>Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExt()
	 * @generated
	 * @ordered
	 */
	protected String ext = EXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeConstructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.INCLUDE_CONSTRUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportURI() {
		return importURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportURI(String newImportURI) {
		String oldImportURI = importURI;
		importURI = newImportURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.INCLUDE_CONSTRUCT__IMPORT_URI, oldImportURI, importURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExt() {
		return ext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExt(String newExt) {
		String oldExt = ext;
		ext = newExt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.INCLUDE_CONSTRUCT__EXT, oldExt, ext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TomPackage.INCLUDE_CONSTRUCT__IMPORT_URI:
				return getImportURI();
			case TomPackage.INCLUDE_CONSTRUCT__EXT:
				return getExt();
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
			case TomPackage.INCLUDE_CONSTRUCT__IMPORT_URI:
				setImportURI((String)newValue);
				return;
			case TomPackage.INCLUDE_CONSTRUCT__EXT:
				setExt((String)newValue);
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
			case TomPackage.INCLUDE_CONSTRUCT__IMPORT_URI:
				setImportURI(IMPORT_URI_EDEFAULT);
				return;
			case TomPackage.INCLUDE_CONSTRUCT__EXT:
				setExt(EXT_EDEFAULT);
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
			case TomPackage.INCLUDE_CONSTRUCT__IMPORT_URI:
				return IMPORT_URI_EDEFAULT == null ? importURI != null : !IMPORT_URI_EDEFAULT.equals(importURI);
			case TomPackage.INCLUDE_CONSTRUCT__EXT:
				return EXT_EDEFAULT == null ? ext != null : !EXT_EDEFAULT.equals(ext);
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
		result.append(" (importURI: ");
		result.append(importURI);
		result.append(", ext: ");
		result.append(ext);
		result.append(')');
		return result.toString();
	}

} //IncludeConstructImpl
