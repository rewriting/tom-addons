/**
 */
package tom.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tom.Linkable;
import tom.LocalVariable;
import tom.NamedPattern;
import tom.Pattern;
import tom.TomPackage;
import tom.Type;
import tom.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.NamedPatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link tom.impl.NamedPatternImpl#getType <em>Type</em>}</li>
 *   <li>{@link tom.impl.NamedPatternImpl#getPlainPattern <em>Plain Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedPatternImpl extends PatternImpl implements NamedPattern {
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
	 * The cached value of the '{@link #getPlainPattern() <em>Plain Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlainPattern()
	 * @generated
	 * @ordered
	 */
	protected Pattern plainPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.NAMED_PATTERN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.NAMED_PATTERN__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TomPackage.NAMED_PATTERN__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.NAMED_PATTERN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern getPlainPattern() {
		return plainPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlainPattern(Pattern newPlainPattern, NotificationChain msgs) {
		Pattern oldPlainPattern = plainPattern;
		plainPattern = newPlainPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.NAMED_PATTERN__PLAIN_PATTERN, oldPlainPattern, newPlainPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlainPattern(Pattern newPlainPattern) {
		if (newPlainPattern != plainPattern) {
			NotificationChain msgs = null;
			if (plainPattern != null)
				msgs = ((InternalEObject)plainPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.NAMED_PATTERN__PLAIN_PATTERN, null, msgs);
			if (newPlainPattern != null)
				msgs = ((InternalEObject)newPlainPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.NAMED_PATTERN__PLAIN_PATTERN, null, msgs);
			msgs = basicSetPlainPattern(newPlainPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.NAMED_PATTERN__PLAIN_PATTERN, newPlainPattern, newPlainPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.NAMED_PATTERN__PLAIN_PATTERN:
				return basicSetPlainPattern(null, msgs);
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
			case TomPackage.NAMED_PATTERN__NAME:
				return getName();
			case TomPackage.NAMED_PATTERN__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case TomPackage.NAMED_PATTERN__PLAIN_PATTERN:
				return getPlainPattern();
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
			case TomPackage.NAMED_PATTERN__NAME:
				setName((String)newValue);
				return;
			case TomPackage.NAMED_PATTERN__TYPE:
				setType((Type)newValue);
				return;
			case TomPackage.NAMED_PATTERN__PLAIN_PATTERN:
				setPlainPattern((Pattern)newValue);
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
			case TomPackage.NAMED_PATTERN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TomPackage.NAMED_PATTERN__TYPE:
				setType((Type)null);
				return;
			case TomPackage.NAMED_PATTERN__PLAIN_PATTERN:
				setPlainPattern((Pattern)null);
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
			case TomPackage.NAMED_PATTERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TomPackage.NAMED_PATTERN__TYPE:
				return type != null;
			case TomPackage.NAMED_PATTERN__PLAIN_PATTERN:
				return plainPattern != null;
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
				case TomPackage.NAMED_PATTERN__NAME: return TomPackage.LINKABLE__NAME;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (derivedFeatureID) {
				case TomPackage.NAMED_PATTERN__TYPE: return TomPackage.VARIABLE__TYPE;
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
				case TomPackage.LINKABLE__NAME: return TomPackage.NAMED_PATTERN__NAME;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (baseFeatureID) {
				case TomPackage.VARIABLE__TYPE: return TomPackage.NAMED_PATTERN__TYPE;
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

} //NamedPatternImpl
