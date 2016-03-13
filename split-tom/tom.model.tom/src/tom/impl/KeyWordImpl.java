/**
 */
package tom.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tom.Arguments;
import tom.KeyWord;
import tom.TomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Word</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.KeyWordImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link tom.impl.KeyWordImpl#getHote <em>Hote</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyWordImpl extends LinkableImpl implements KeyWord {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyWordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.KEY_WORD;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.KEY_WORD__ARGS, oldArgs, newArgs);
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
				msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.KEY_WORD__ARGS, null, msgs);
			if (newArgs != null)
				msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.KEY_WORD__ARGS, null, msgs);
			msgs = basicSetArgs(newArgs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.KEY_WORD__ARGS, newArgs, newArgs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.KEY_WORD__HOTE, oldHote, hote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.KEY_WORD__ARGS:
				return basicSetArgs(null, msgs);
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
			case TomPackage.KEY_WORD__ARGS:
				return getArgs();
			case TomPackage.KEY_WORD__HOTE:
				return getHote();
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
			case TomPackage.KEY_WORD__ARGS:
				setArgs((Arguments)newValue);
				return;
			case TomPackage.KEY_WORD__HOTE:
				setHote((String)newValue);
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
			case TomPackage.KEY_WORD__ARGS:
				setArgs((Arguments)null);
				return;
			case TomPackage.KEY_WORD__HOTE:
				setHote(HOTE_EDEFAULT);
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
			case TomPackage.KEY_WORD__ARGS:
				return args != null;
			case TomPackage.KEY_WORD__HOTE:
				return HOTE_EDEFAULT == null ? hote != null : !HOTE_EDEFAULT.equals(hote);
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
		result.append(" (hote: ");
		result.append(hote);
		result.append(')');
		return result.toString();
	}

} //KeyWordImpl
