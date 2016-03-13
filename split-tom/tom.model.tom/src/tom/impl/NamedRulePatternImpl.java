/**
 */
package tom.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tom.Linkable;
import tom.LocalVariable;
import tom.NamedRulePattern;
import tom.TomPackage;
import tom.Type;
import tom.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Rule Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.NamedRulePatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link tom.impl.NamedRulePatternImpl#getType <em>Type</em>}</li>
 *   <li>{@link tom.impl.NamedRulePatternImpl#getPlainRulePattern <em>Plain Rule Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedRulePatternImpl extends RulePatternImpl implements NamedRulePattern {
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
	 * The cached value of the '{@link #getPlainRulePattern() <em>Plain Rule Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlainRulePattern()
	 * @generated
	 * @ordered
	 */
	protected EObject plainRulePattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedRulePatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.NAMED_RULE_PATTERN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.NAMED_RULE_PATTERN__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TomPackage.NAMED_RULE_PATTERN__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.NAMED_RULE_PATTERN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getPlainRulePattern() {
		return plainRulePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlainRulePattern(EObject newPlainRulePattern, NotificationChain msgs) {
		EObject oldPlainRulePattern = plainRulePattern;
		plainRulePattern = newPlainRulePattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN, oldPlainRulePattern, newPlainRulePattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlainRulePattern(EObject newPlainRulePattern) {
		if (newPlainRulePattern != plainRulePattern) {
			NotificationChain msgs = null;
			if (plainRulePattern != null)
				msgs = ((InternalEObject)plainRulePattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN, null, msgs);
			if (newPlainRulePattern != null)
				msgs = ((InternalEObject)newPlainRulePattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN, null, msgs);
			msgs = basicSetPlainRulePattern(newPlainRulePattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN, newPlainRulePattern, newPlainRulePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN:
				return basicSetPlainRulePattern(null, msgs);
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
			case TomPackage.NAMED_RULE_PATTERN__NAME:
				return getName();
			case TomPackage.NAMED_RULE_PATTERN__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case TomPackage.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN:
				return getPlainRulePattern();
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
			case TomPackage.NAMED_RULE_PATTERN__NAME:
				setName((String)newValue);
				return;
			case TomPackage.NAMED_RULE_PATTERN__TYPE:
				setType((Type)newValue);
				return;
			case TomPackage.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN:
				setPlainRulePattern((EObject)newValue);
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
			case TomPackage.NAMED_RULE_PATTERN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TomPackage.NAMED_RULE_PATTERN__TYPE:
				setType((Type)null);
				return;
			case TomPackage.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN:
				setPlainRulePattern((EObject)null);
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
			case TomPackage.NAMED_RULE_PATTERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TomPackage.NAMED_RULE_PATTERN__TYPE:
				return type != null;
			case TomPackage.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN:
				return plainRulePattern != null;
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
				case TomPackage.NAMED_RULE_PATTERN__NAME: return TomPackage.LINKABLE__NAME;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (derivedFeatureID) {
				case TomPackage.NAMED_RULE_PATTERN__TYPE: return TomPackage.VARIABLE__TYPE;
				default: return -1;
			}
		}
		if (baseClass == LocalVariable.class) {
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
		if (baseClass == Linkable.class) {
			switch (baseFeatureID) {
				case TomPackage.LINKABLE__NAME: return TomPackage.NAMED_RULE_PATTERN__NAME;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (baseFeatureID) {
				case TomPackage.VARIABLE__TYPE: return TomPackage.NAMED_RULE_PATTERN__TYPE;
				default: return -1;
			}
		}
		if (baseClass == LocalVariable.class) {
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

} //NamedRulePatternImpl
