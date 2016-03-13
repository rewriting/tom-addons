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
import org.eclipse.emf.ecore.util.InternalEList;

import tom.Arguments;
import tom.KeyWord;
import tom.Linkable;
import tom.Operation;
import tom.OperatorArray;
import tom.TomPackage;
import tom.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.OperatorArrayImpl#getName <em>Name</em>}</li>
 *   <li>{@link tom.impl.OperatorArrayImpl#getType <em>Type</em>}</li>
 *   <li>{@link tom.impl.OperatorArrayImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link tom.impl.OperatorArrayImpl#getKeys <em>Keys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatorArrayImpl extends BlockImpl implements OperatorArray {
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
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected Arguments args;

	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyWord> keys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.OPERATOR_ARRAY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.OPERATOR_ARRAY__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TomPackage.OPERATOR_ARRAY__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.OPERATOR_ARRAY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arguments getArgs() {
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgs(Arguments newArgs, NotificationChain msgs) {
		Arguments oldArgs = args;
		args = newArgs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.OPERATOR_ARRAY__ARGS, oldArgs, newArgs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgs(Arguments newArgs) {
		if (newArgs != args) {
			NotificationChain msgs = null;
			if (args != null)
				msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.OPERATOR_ARRAY__ARGS, null, msgs);
			if (newArgs != null)
				msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.OPERATOR_ARRAY__ARGS, null, msgs);
			msgs = basicSetArgs(newArgs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.OPERATOR_ARRAY__ARGS, newArgs, newArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyWord> getKeys() {
		if (keys == null) {
			keys = new EObjectContainmentEList<KeyWord>(KeyWord.class, this, TomPackage.OPERATOR_ARRAY__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.OPERATOR_ARRAY__ARGS:
				return basicSetArgs(null, msgs);
			case TomPackage.OPERATOR_ARRAY__KEYS:
				return ((InternalEList<?>)getKeys()).basicRemove(otherEnd, msgs);
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
			case TomPackage.OPERATOR_ARRAY__NAME:
				return getName();
			case TomPackage.OPERATOR_ARRAY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case TomPackage.OPERATOR_ARRAY__ARGS:
				return getArgs();
			case TomPackage.OPERATOR_ARRAY__KEYS:
				return getKeys();
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
			case TomPackage.OPERATOR_ARRAY__NAME:
				setName((String)newValue);
				return;
			case TomPackage.OPERATOR_ARRAY__TYPE:
				setType((Type)newValue);
				return;
			case TomPackage.OPERATOR_ARRAY__ARGS:
				setArgs((Arguments)newValue);
				return;
			case TomPackage.OPERATOR_ARRAY__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends KeyWord>)newValue);
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
			case TomPackage.OPERATOR_ARRAY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TomPackage.OPERATOR_ARRAY__TYPE:
				setType((Type)null);
				return;
			case TomPackage.OPERATOR_ARRAY__ARGS:
				setArgs((Arguments)null);
				return;
			case TomPackage.OPERATOR_ARRAY__KEYS:
				getKeys().clear();
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
			case TomPackage.OPERATOR_ARRAY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TomPackage.OPERATOR_ARRAY__TYPE:
				return type != null;
			case TomPackage.OPERATOR_ARRAY__ARGS:
				return args != null;
			case TomPackage.OPERATOR_ARRAY__KEYS:
				return keys != null && !keys.isEmpty();
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
				case TomPackage.OPERATOR_ARRAY__NAME: return TomPackage.LINKABLE__NAME;
				default: return -1;
			}
		}
		if (baseClass == Operation.class) {
			switch (derivedFeatureID) {
				case TomPackage.OPERATOR_ARRAY__TYPE: return TomPackage.OPERATION__TYPE;
				case TomPackage.OPERATOR_ARRAY__ARGS: return TomPackage.OPERATION__ARGS;
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
				case TomPackage.LINKABLE__NAME: return TomPackage.OPERATOR_ARRAY__NAME;
				default: return -1;
			}
		}
		if (baseClass == Operation.class) {
			switch (baseFeatureID) {
				case TomPackage.OPERATION__TYPE: return TomPackage.OPERATOR_ARRAY__TYPE;
				case TomPackage.OPERATION__ARGS: return TomPackage.OPERATOR_ARRAY__ARGS;
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

} //OperatorArrayImpl
