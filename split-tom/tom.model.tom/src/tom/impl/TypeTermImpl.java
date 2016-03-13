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

import tom.KeyWord;
import tom.Linkable;
import tom.TomPackage;
import tom.Type;
import tom.TypeTerm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.TypeTermImpl#getName <em>Name</em>}</li>
 *   <li>{@link tom.impl.TypeTermImpl#getExtend <em>Extend</em>}</li>
 *   <li>{@link tom.impl.TypeTermImpl#getHote <em>Hote</em>}</li>
 *   <li>{@link tom.impl.TypeTermImpl#getType <em>Type</em>}</li>
 *   <li>{@link tom.impl.TypeTermImpl#getKeys <em>Keys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeTermImpl extends BlockImpl implements TypeTerm {
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
	 * The cached value of the '{@link #getExtend() <em>Extend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtend()
	 * @generated
	 * @ordered
	 */
	protected Type extend;

	/**
	 * The default value of the '{@link #getHote() <em>Hote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHote()
	 * @generated
	 * @ordered
	 */
	protected static final String HOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHote() <em>Hote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHote()
	 * @generated
	 * @ordered
	 */
	protected String hote = HOTE_EDEFAULT;

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
	protected TypeTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.TYPE_TERM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.TYPE_TERM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getExtend() {
		if (extend != null && extend.eIsProxy()) {
			InternalEObject oldExtend = (InternalEObject)extend;
			extend = (Type)eResolveProxy(oldExtend);
			if (extend != oldExtend) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TomPackage.TYPE_TERM__EXTEND, oldExtend, extend));
			}
		}
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetExtend() {
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtend(Type newExtend) {
		Type oldExtend = extend;
		extend = newExtend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.TYPE_TERM__EXTEND, oldExtend, extend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHote() {
		return hote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHote(String newHote) {
		String oldHote = hote;
		hote = newHote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.TYPE_TERM__HOTE, oldHote, hote));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TomPackage.TYPE_TERM__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.TYPE_TERM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyWord> getKeys() {
		if (keys == null) {
			keys = new EObjectContainmentEList<KeyWord>(KeyWord.class, this, TomPackage.TYPE_TERM__KEYS);
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
			case TomPackage.TYPE_TERM__KEYS:
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
			case TomPackage.TYPE_TERM__NAME:
				return getName();
			case TomPackage.TYPE_TERM__EXTEND:
				if (resolve) return getExtend();
				return basicGetExtend();
			case TomPackage.TYPE_TERM__HOTE:
				return getHote();
			case TomPackage.TYPE_TERM__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case TomPackage.TYPE_TERM__KEYS:
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
			case TomPackage.TYPE_TERM__NAME:
				setName((String)newValue);
				return;
			case TomPackage.TYPE_TERM__EXTEND:
				setExtend((Type)newValue);
				return;
			case TomPackage.TYPE_TERM__HOTE:
				setHote((String)newValue);
				return;
			case TomPackage.TYPE_TERM__TYPE:
				setType((Type)newValue);
				return;
			case TomPackage.TYPE_TERM__KEYS:
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
			case TomPackage.TYPE_TERM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TomPackage.TYPE_TERM__EXTEND:
				setExtend((Type)null);
				return;
			case TomPackage.TYPE_TERM__HOTE:
				setHote(HOTE_EDEFAULT);
				return;
			case TomPackage.TYPE_TERM__TYPE:
				setType((Type)null);
				return;
			case TomPackage.TYPE_TERM__KEYS:
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
			case TomPackage.TYPE_TERM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TomPackage.TYPE_TERM__EXTEND:
				return extend != null;
			case TomPackage.TYPE_TERM__HOTE:
				return HOTE_EDEFAULT == null ? hote != null : !HOTE_EDEFAULT.equals(hote);
			case TomPackage.TYPE_TERM__TYPE:
				return type != null;
			case TomPackage.TYPE_TERM__KEYS:
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
				case TomPackage.TYPE_TERM__NAME: return TomPackage.LINKABLE__NAME;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case TomPackage.TYPE_TERM__EXTEND: return TomPackage.TYPE__EXTEND;
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
				case TomPackage.LINKABLE__NAME: return TomPackage.TYPE_TERM__NAME;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case TomPackage.TYPE__EXTEND: return TomPackage.TYPE_TERM__EXTEND;
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
		result.append(", hote: ");
		result.append(hote);
		result.append(')');
		return result.toString();
	}

} //TypeTermImpl
