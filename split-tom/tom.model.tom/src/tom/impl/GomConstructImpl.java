/**
 */
package tom.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tom.Definition;
import tom.GomConstruct;
import tom.Linkable;
import tom.TomPackage;
import tom.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gom Construct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.GomConstructImpl#getName <em>Name</em>}</li>
 *   <li>{@link tom.impl.GomConstructImpl#getOption <em>Option</em>}</li>
 *   <li>{@link tom.impl.GomConstructImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link tom.impl.GomConstructImpl#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GomConstructImpl extends BlockImpl implements GomConstruct {
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
	 * The default value of the '{@link #getOption() <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected String option = OPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> imports;

	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Definition> definitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GomConstructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.GOM_CONSTRUCT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.GOM_CONSTRUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOption(String newOption) {
		String oldOption = option;
		option = newOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.GOM_CONSTRUCT__OPTION, oldOption, option));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getImports() {
		if (imports == null) {
			imports = new EObjectResolvingEList<Type>(Type.class, this, TomPackage.GOM_CONSTRUCT__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Definition> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectContainmentEList<Definition>(Definition.class, this, TomPackage.GOM_CONSTRUCT__DEFINITIONS);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.GOM_CONSTRUCT__DEFINITIONS:
				return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
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
			case TomPackage.GOM_CONSTRUCT__NAME:
				return getName();
			case TomPackage.GOM_CONSTRUCT__OPTION:
				return getOption();
			case TomPackage.GOM_CONSTRUCT__IMPORTS:
				return getImports();
			case TomPackage.GOM_CONSTRUCT__DEFINITIONS:
				return getDefinitions();
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
			case TomPackage.GOM_CONSTRUCT__NAME:
				setName((String)newValue);
				return;
			case TomPackage.GOM_CONSTRUCT__OPTION:
				setOption((String)newValue);
				return;
			case TomPackage.GOM_CONSTRUCT__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Type>)newValue);
				return;
			case TomPackage.GOM_CONSTRUCT__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends Definition>)newValue);
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
			case TomPackage.GOM_CONSTRUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TomPackage.GOM_CONSTRUCT__OPTION:
				setOption(OPTION_EDEFAULT);
				return;
			case TomPackage.GOM_CONSTRUCT__IMPORTS:
				getImports().clear();
				return;
			case TomPackage.GOM_CONSTRUCT__DEFINITIONS:
				getDefinitions().clear();
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
			case TomPackage.GOM_CONSTRUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TomPackage.GOM_CONSTRUCT__OPTION:
				return OPTION_EDEFAULT == null ? option != null : !OPTION_EDEFAULT.equals(option);
			case TomPackage.GOM_CONSTRUCT__IMPORTS:
				return imports != null && !imports.isEmpty();
			case TomPackage.GOM_CONSTRUCT__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Linkable.class) {
			switch (derivedFeatureID) {
				case TomPackage.GOM_CONSTRUCT__NAME: return TomPackage.LINKABLE__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Linkable.class) {
			switch (baseFeatureID) {
				case TomPackage.LINKABLE__NAME: return TomPackage.GOM_CONSTRUCT__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", option: ");
		result.append(option);
		result.append(')');
		return result.toString();
	}

} //GomConstructImpl
