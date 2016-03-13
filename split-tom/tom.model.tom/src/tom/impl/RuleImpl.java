/**
 */
package tom.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tom.Condition;
import tom.Rule;
import tom.RulePattern;
import tom.Term;
import tom.TomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.RuleImpl#getRulePattern <em>Rule Pattern</em>}</li>
 *   <li>{@link tom.impl.RuleImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link tom.impl.RuleImpl#getCond <em>Cond</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
	/**
	 * The cached value of the '{@link #getRulePattern() <em>Rule Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulePattern()
	 * @generated
	 * @ordered
	 */
	protected RulePattern rulePattern;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected Term term;

	/**
	 * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected Condition cond;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulePattern getRulePattern() {
		return rulePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRulePattern(RulePattern newRulePattern, NotificationChain msgs) {
		RulePattern oldRulePattern = rulePattern;
		rulePattern = newRulePattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.RULE__RULE_PATTERN, oldRulePattern, newRulePattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRulePattern(RulePattern newRulePattern) {
		if (newRulePattern != rulePattern) {
			NotificationChain msgs = null;
			if (rulePattern != null)
				msgs = ((InternalEObject)rulePattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.RULE__RULE_PATTERN, null, msgs);
			if (newRulePattern != null)
				msgs = ((InternalEObject)newRulePattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.RULE__RULE_PATTERN, null, msgs);
			msgs = basicSetRulePattern(newRulePattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.RULE__RULE_PATTERN, newRulePattern, newRulePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerm(Term newTerm, NotificationChain msgs) {
		Term oldTerm = term;
		term = newTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.RULE__TERM, oldTerm, newTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(Term newTerm) {
		if (newTerm != term) {
			NotificationChain msgs = null;
			if (term != null)
				msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.RULE__TERM, null, msgs);
			if (newTerm != null)
				msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.RULE__TERM, null, msgs);
			msgs = basicSetTerm(newTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.RULE__TERM, newTerm, newTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCond() {
		return cond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCond(Condition newCond, NotificationChain msgs) {
		Condition oldCond = cond;
		cond = newCond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.RULE__COND, oldCond, newCond);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCond(Condition newCond) {
		if (newCond != cond) {
			NotificationChain msgs = null;
			if (cond != null)
				msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.RULE__COND, null, msgs);
			if (newCond != null)
				msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.RULE__COND, null, msgs);
			msgs = basicSetCond(newCond, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.RULE__COND, newCond, newCond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.RULE__RULE_PATTERN:
				return basicSetRulePattern(null, msgs);
			case TomPackage.RULE__TERM:
				return basicSetTerm(null, msgs);
			case TomPackage.RULE__COND:
				return basicSetCond(null, msgs);
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
			case TomPackage.RULE__RULE_PATTERN:
				return getRulePattern();
			case TomPackage.RULE__TERM:
				return getTerm();
			case TomPackage.RULE__COND:
				return getCond();
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
			case TomPackage.RULE__RULE_PATTERN:
				setRulePattern((RulePattern)newValue);
				return;
			case TomPackage.RULE__TERM:
				setTerm((Term)newValue);
				return;
			case TomPackage.RULE__COND:
				setCond((Condition)newValue);
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
			case TomPackage.RULE__RULE_PATTERN:
				setRulePattern((RulePattern)null);
				return;
			case TomPackage.RULE__TERM:
				setTerm((Term)null);
				return;
			case TomPackage.RULE__COND:
				setCond((Condition)null);
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
			case TomPackage.RULE__RULE_PATTERN:
				return rulePattern != null;
			case TomPackage.RULE__TERM:
				return term != null;
			case TomPackage.RULE__COND:
				return cond != null;
		}
		return super.eIsSet(featureID);
	}

} //RuleImpl
