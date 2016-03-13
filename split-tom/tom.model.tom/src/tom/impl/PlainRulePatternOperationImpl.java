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

import tom.OperationList;
import tom.PlainRulePatternOperation;
import tom.RulePattern;
import tom.TomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plain Rule Pattern Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.PlainRulePatternOperationImpl#getHeads <em>Heads</em>}</li>
 *   <li>{@link tom.impl.PlainRulePatternOperationImpl#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlainRulePatternOperationImpl extends RulePatternImpl implements PlainRulePatternOperation {
	/**
	 * The cached value of the '{@link #getHeads() <em>Heads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeads()
	 * @generated
	 * @ordered
	 */
	protected OperationList heads;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<RulePattern> rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlainRulePatternOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.PLAIN_RULE_PATTERN_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationList getHeads() {
		return heads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeads(OperationList newHeads, NotificationChain msgs) {
		OperationList oldHeads = heads;
		heads = newHeads;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.PLAIN_RULE_PATTERN_OPERATION__HEADS, oldHeads, newHeads);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeads(OperationList newHeads) {
		if (newHeads != heads) {
			NotificationChain msgs = null;
			if (heads != null)
				msgs = ((InternalEObject)heads).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.PLAIN_RULE_PATTERN_OPERATION__HEADS, null, msgs);
			if (newHeads != null)
				msgs = ((InternalEObject)newHeads).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.PLAIN_RULE_PATTERN_OPERATION__HEADS, null, msgs);
			msgs = basicSetHeads(newHeads, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.PLAIN_RULE_PATTERN_OPERATION__HEADS, newHeads, newHeads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RulePattern> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<RulePattern>(RulePattern.class, this, TomPackage.PLAIN_RULE_PATTERN_OPERATION__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.PLAIN_RULE_PATTERN_OPERATION__HEADS:
				return basicSetHeads(null, msgs);
			case TomPackage.PLAIN_RULE_PATTERN_OPERATION__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
			case TomPackage.PLAIN_RULE_PATTERN_OPERATION__HEADS:
				return getHeads();
			case TomPackage.PLAIN_RULE_PATTERN_OPERATION__RULES:
				return getRules();
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
			case TomPackage.PLAIN_RULE_PATTERN_OPERATION__HEADS:
				setHeads((OperationList)newValue);
				return;
			case TomPackage.PLAIN_RULE_PATTERN_OPERATION__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends RulePattern>)newValue);
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
			case TomPackage.PLAIN_RULE_PATTERN_OPERATION__HEADS:
				setHeads((OperationList)null);
				return;
			case TomPackage.PLAIN_RULE_PATTERN_OPERATION__RULES:
				getRules().clear();
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
			case TomPackage.PLAIN_RULE_PATTERN_OPERATION__HEADS:
				return heads != null;
			case TomPackage.PLAIN_RULE_PATTERN_OPERATION__RULES:
				return rules != null && !rules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlainRulePatternOperationImpl
