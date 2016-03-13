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
import tom.StrategyConstruct;
import tom.StrategyVisit;
import tom.TermOperation;
import tom.TomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategy Construct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.StrategyConstructImpl#getImplement <em>Implement</em>}</li>
 *   <li>{@link tom.impl.StrategyConstructImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link tom.impl.StrategyConstructImpl#getVisitlist <em>Visitlist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrategyConstructImpl extends TypeImpl implements StrategyConstruct {
	/**
	 * The cached value of the '{@link #getImplement() <em>Implement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplement()
	 * @generated
	 * @ordered
	 */
	protected TermOperation implement;

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
	 * The cached value of the '{@link #getVisitlist() <em>Visitlist</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitlist()
	 * @generated
	 * @ordered
	 */
	protected EList<StrategyVisit> visitlist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrategyConstructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.STRATEGY_CONSTRUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermOperation getImplement() {
		return implement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplement(TermOperation newImplement, NotificationChain msgs) {
		TermOperation oldImplement = implement;
		implement = newImplement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.STRATEGY_CONSTRUCT__IMPLEMENT, oldImplement, newImplement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplement(TermOperation newImplement) {
		if (newImplement != implement) {
			NotificationChain msgs = null;
			if (implement != null)
				msgs = ((InternalEObject)implement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.STRATEGY_CONSTRUCT__IMPLEMENT, null, msgs);
			if (newImplement != null)
				msgs = ((InternalEObject)newImplement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.STRATEGY_CONSTRUCT__IMPLEMENT, null, msgs);
			msgs = basicSetImplement(newImplement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.STRATEGY_CONSTRUCT__IMPLEMENT, newImplement, newImplement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.STRATEGY_CONSTRUCT__ARGS, oldArgs, newArgs);
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
				msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.STRATEGY_CONSTRUCT__ARGS, null, msgs);
			if (newArgs != null)
				msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.STRATEGY_CONSTRUCT__ARGS, null, msgs);
			msgs = basicSetArgs(newArgs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.STRATEGY_CONSTRUCT__ARGS, newArgs, newArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StrategyVisit> getVisitlist() {
		if (visitlist == null) {
			visitlist = new EObjectContainmentEList<StrategyVisit>(StrategyVisit.class, this, TomPackage.STRATEGY_CONSTRUCT__VISITLIST);
		}
		return visitlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.STRATEGY_CONSTRUCT__IMPLEMENT:
				return basicSetImplement(null, msgs);
			case TomPackage.STRATEGY_CONSTRUCT__ARGS:
				return basicSetArgs(null, msgs);
			case TomPackage.STRATEGY_CONSTRUCT__VISITLIST:
				return ((InternalEList<?>)getVisitlist()).basicRemove(otherEnd, msgs);
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
			case TomPackage.STRATEGY_CONSTRUCT__IMPLEMENT:
				return getImplement();
			case TomPackage.STRATEGY_CONSTRUCT__ARGS:
				return getArgs();
			case TomPackage.STRATEGY_CONSTRUCT__VISITLIST:
				return getVisitlist();
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
			case TomPackage.STRATEGY_CONSTRUCT__IMPLEMENT:
				setImplement((TermOperation)newValue);
				return;
			case TomPackage.STRATEGY_CONSTRUCT__ARGS:
				setArgs((Arguments)newValue);
				return;
			case TomPackage.STRATEGY_CONSTRUCT__VISITLIST:
				getVisitlist().clear();
				getVisitlist().addAll((Collection<? extends StrategyVisit>)newValue);
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
			case TomPackage.STRATEGY_CONSTRUCT__IMPLEMENT:
				setImplement((TermOperation)null);
				return;
			case TomPackage.STRATEGY_CONSTRUCT__ARGS:
				setArgs((Arguments)null);
				return;
			case TomPackage.STRATEGY_CONSTRUCT__VISITLIST:
				getVisitlist().clear();
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
			case TomPackage.STRATEGY_CONSTRUCT__IMPLEMENT:
				return implement != null;
			case TomPackage.STRATEGY_CONSTRUCT__ARGS:
				return args != null;
			case TomPackage.STRATEGY_CONSTRUCT__VISITLIST:
				return visitlist != null && !visitlist.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StrategyConstructImpl
