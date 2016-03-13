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
import tom.ElementaryTransformation;
import tom.Linkable;
import tom.Operation;
import tom.TomPackage;
import tom.Transformation;
import tom.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.TransformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link tom.impl.TransformationImpl#getType <em>Type</em>}</li>
 *   <li>{@link tom.impl.TransformationImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link tom.impl.TransformationImpl#getFileFrom <em>File From</em>}</li>
 *   <li>{@link tom.impl.TransformationImpl#getFileTo <em>File To</em>}</li>
 *   <li>{@link tom.impl.TransformationImpl#getElementaryTranformations <em>Elementary Tranformations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationImpl extends BlockImpl implements Transformation {
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
	 * The default value of the '{@link #getFileFrom() <em>File From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileFrom() <em>File From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileFrom()
	 * @generated
	 * @ordered
	 */
	protected String fileFrom = FILE_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileTo() <em>File To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileTo()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileTo() <em>File To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileTo()
	 * @generated
	 * @ordered
	 */
	protected String fileTo = FILE_TO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementaryTranformations() <em>Elementary Tranformations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementaryTranformations()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementaryTransformation> elementaryTranformations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.TRANSFORMATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.TRANSFORMATION__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TomPackage.TRANSFORMATION__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.TRANSFORMATION__TYPE, oldType, type));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.TRANSFORMATION__ARGS, oldArgs, newArgs);
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
				msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.TRANSFORMATION__ARGS, null, msgs);
			if (newArgs != null)
				msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.TRANSFORMATION__ARGS, null, msgs);
			msgs = basicSetArgs(newArgs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.TRANSFORMATION__ARGS, newArgs, newArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileFrom() {
		return fileFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileFrom(String newFileFrom) {
		String oldFileFrom = fileFrom;
		fileFrom = newFileFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.TRANSFORMATION__FILE_FROM, oldFileFrom, fileFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileTo() {
		return fileTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileTo(String newFileTo) {
		String oldFileTo = fileTo;
		fileTo = newFileTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.TRANSFORMATION__FILE_TO, oldFileTo, fileTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementaryTransformation> getElementaryTranformations() {
		if (elementaryTranformations == null) {
			elementaryTranformations = new EObjectContainmentEList<ElementaryTransformation>(ElementaryTransformation.class, this, TomPackage.TRANSFORMATION__ELEMENTARY_TRANFORMATIONS);
		}
		return elementaryTranformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.TRANSFORMATION__ARGS:
				return basicSetArgs(null, msgs);
			case TomPackage.TRANSFORMATION__ELEMENTARY_TRANFORMATIONS:
				return ((InternalEList<?>)getElementaryTranformations()).basicRemove(otherEnd, msgs);
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
			case TomPackage.TRANSFORMATION__NAME:
				return getName();
			case TomPackage.TRANSFORMATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case TomPackage.TRANSFORMATION__ARGS:
				return getArgs();
			case TomPackage.TRANSFORMATION__FILE_FROM:
				return getFileFrom();
			case TomPackage.TRANSFORMATION__FILE_TO:
				return getFileTo();
			case TomPackage.TRANSFORMATION__ELEMENTARY_TRANFORMATIONS:
				return getElementaryTranformations();
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
			case TomPackage.TRANSFORMATION__NAME:
				setName((String)newValue);
				return;
			case TomPackage.TRANSFORMATION__TYPE:
				setType((Type)newValue);
				return;
			case TomPackage.TRANSFORMATION__ARGS:
				setArgs((Arguments)newValue);
				return;
			case TomPackage.TRANSFORMATION__FILE_FROM:
				setFileFrom((String)newValue);
				return;
			case TomPackage.TRANSFORMATION__FILE_TO:
				setFileTo((String)newValue);
				return;
			case TomPackage.TRANSFORMATION__ELEMENTARY_TRANFORMATIONS:
				getElementaryTranformations().clear();
				getElementaryTranformations().addAll((Collection<? extends ElementaryTransformation>)newValue);
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
			case TomPackage.TRANSFORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TomPackage.TRANSFORMATION__TYPE:
				setType((Type)null);
				return;
			case TomPackage.TRANSFORMATION__ARGS:
				setArgs((Arguments)null);
				return;
			case TomPackage.TRANSFORMATION__FILE_FROM:
				setFileFrom(FILE_FROM_EDEFAULT);
				return;
			case TomPackage.TRANSFORMATION__FILE_TO:
				setFileTo(FILE_TO_EDEFAULT);
				return;
			case TomPackage.TRANSFORMATION__ELEMENTARY_TRANFORMATIONS:
				getElementaryTranformations().clear();
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
			case TomPackage.TRANSFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TomPackage.TRANSFORMATION__TYPE:
				return type != null;
			case TomPackage.TRANSFORMATION__ARGS:
				return args != null;
			case TomPackage.TRANSFORMATION__FILE_FROM:
				return FILE_FROM_EDEFAULT == null ? fileFrom != null : !FILE_FROM_EDEFAULT.equals(fileFrom);
			case TomPackage.TRANSFORMATION__FILE_TO:
				return FILE_TO_EDEFAULT == null ? fileTo != null : !FILE_TO_EDEFAULT.equals(fileTo);
			case TomPackage.TRANSFORMATION__ELEMENTARY_TRANFORMATIONS:
				return elementaryTranformations != null && !elementaryTranformations.isEmpty();
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
				case TomPackage.TRANSFORMATION__NAME: return TomPackage.LINKABLE__NAME;
				default: return -1;
			}
		}
		if (baseClass == Operation.class) {
			switch (derivedFeatureID) {
				case TomPackage.TRANSFORMATION__TYPE: return TomPackage.OPERATION__TYPE;
				case TomPackage.TRANSFORMATION__ARGS: return TomPackage.OPERATION__ARGS;
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
				case TomPackage.LINKABLE__NAME: return TomPackage.TRANSFORMATION__NAME;
				default: return -1;
			}
		}
		if (baseClass == Operation.class) {
			switch (baseFeatureID) {
				case TomPackage.OPERATION__TYPE: return TomPackage.TRANSFORMATION__TYPE;
				case TomPackage.OPERATION__ARGS: return TomPackage.TRANSFORMATION__ARGS;
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
		result.append(", fileFrom: ");
		result.append(fileFrom);
		result.append(", fileTo: ");
		result.append(fileTo);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
