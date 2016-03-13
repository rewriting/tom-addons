/**
 */
package tom.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tom.Condition;
import tom.Linkable;
import tom.LocalVariable;
import tom.PlainPatternVariableList;
import tom.RulePattern;
import tom.TomPackage;
import tom.Type;
import tom.Variable;
import tom.VariableList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plain Pattern Variable List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.PlainPatternVariableListImpl#getName <em>Name</em>}</li>
 *   <li>{@link tom.impl.PlainPatternVariableListImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlainPatternVariableListImpl extends PatternImpl implements PlainPatternVariableList {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlainPatternVariableListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.PLAIN_PATTERN_VARIABLE_LIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.PLAIN_PATTERN_VARIABLE_LIST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TomPackage.PLAIN_PATTERN_VARIABLE_LIST__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.PLAIN_PATTERN_VARIABLE_LIST__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TomPackage.PLAIN_PATTERN_VARIABLE_LIST__NAME:
				return getName();
			case TomPackage.PLAIN_PATTERN_VARIABLE_LIST__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case TomPackage.PLAIN_PATTERN_VARIABLE_LIST__NAME:
				setName((String)newValue);
				return;
			case TomPackage.PLAIN_PATTERN_VARIABLE_LIST__TYPE:
				setType((Type)newValue);
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
			case TomPackage.PLAIN_PATTERN_VARIABLE_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TomPackage.PLAIN_PATTERN_VARIABLE_LIST__TYPE:
				setType((Type)null);
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
			case TomPackage.PLAIN_PATTERN_VARIABLE_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TomPackage.PLAIN_PATTERN_VARIABLE_LIST__TYPE:
				return type != null;
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
		if (baseClass == Condition.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RulePattern.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Linkable.class) {
			switch (derivedFeatureID) {
				case TomPackage.PLAIN_PATTERN_VARIABLE_LIST__NAME: return TomPackage.LINKABLE__NAME;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (derivedFeatureID) {
				case TomPackage.PLAIN_PATTERN_VARIABLE_LIST__TYPE: return TomPackage.VARIABLE__TYPE;
				default: return -1;
			}
		}
		if (baseClass == LocalVariable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == VariableList.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == Condition.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RulePattern.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Linkable.class) {
			switch (baseFeatureID) {
				case TomPackage.LINKABLE__NAME: return TomPackage.PLAIN_PATTERN_VARIABLE_LIST__NAME;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (baseFeatureID) {
				case TomPackage.VARIABLE__TYPE: return TomPackage.PLAIN_PATTERN_VARIABLE_LIST__TYPE;
				default: return -1;
			}
		}
		if (baseClass == LocalVariable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == VariableList.class) {
			switch (baseFeatureID) {
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
		result.append(')');
		return result.toString();
	}

} //PlainPatternVariableListImpl
