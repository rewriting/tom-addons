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
import tom.GraphRule;
import tom.TermGraph;
import tom.TomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.GraphRuleImpl#getTermcond <em>Termcond</em>}</li>
 *   <li>{@link tom.impl.GraphRuleImpl#getTermGraph <em>Term Graph</em>}</li>
 *   <li>{@link tom.impl.GraphRuleImpl#getCond <em>Cond</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphRuleImpl extends MinimalEObjectImpl.Container implements GraphRule {
	/**
	 * The cached value of the '{@link #getTermcond() <em>Termcond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermcond()
	 * @generated
	 * @ordered
	 */
	protected TermGraph termcond;

	/**
	 * The cached value of the '{@link #getTermGraph() <em>Term Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermGraph()
	 * @generated
	 * @ordered
	 */
	protected TermGraph termGraph;

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
	protected GraphRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.GRAPH_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermGraph getTermcond() {
		return termcond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTermcond(TermGraph newTermcond, NotificationChain msgs) {
		TermGraph oldTermcond = termcond;
		termcond = newTermcond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.GRAPH_RULE__TERMCOND, oldTermcond, newTermcond);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermcond(TermGraph newTermcond) {
		if (newTermcond != termcond) {
			NotificationChain msgs = null;
			if (termcond != null)
				msgs = ((InternalEObject)termcond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.GRAPH_RULE__TERMCOND, null, msgs);
			if (newTermcond != null)
				msgs = ((InternalEObject)newTermcond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.GRAPH_RULE__TERMCOND, null, msgs);
			msgs = basicSetTermcond(newTermcond, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.GRAPH_RULE__TERMCOND, newTermcond, newTermcond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermGraph getTermGraph() {
		return termGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTermGraph(TermGraph newTermGraph, NotificationChain msgs) {
		TermGraph oldTermGraph = termGraph;
		termGraph = newTermGraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.GRAPH_RULE__TERM_GRAPH, oldTermGraph, newTermGraph);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermGraph(TermGraph newTermGraph) {
		if (newTermGraph != termGraph) {
			NotificationChain msgs = null;
			if (termGraph != null)
				msgs = ((InternalEObject)termGraph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.GRAPH_RULE__TERM_GRAPH, null, msgs);
			if (newTermGraph != null)
				msgs = ((InternalEObject)newTermGraph).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.GRAPH_RULE__TERM_GRAPH, null, msgs);
			msgs = basicSetTermGraph(newTermGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.GRAPH_RULE__TERM_GRAPH, newTermGraph, newTermGraph));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.GRAPH_RULE__COND, oldCond, newCond);
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
				msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.GRAPH_RULE__COND, null, msgs);
			if (newCond != null)
				msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.GRAPH_RULE__COND, null, msgs);
			msgs = basicSetCond(newCond, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.GRAPH_RULE__COND, newCond, newCond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.GRAPH_RULE__TERMCOND:
				return basicSetTermcond(null, msgs);
			case TomPackage.GRAPH_RULE__TERM_GRAPH:
				return basicSetTermGraph(null, msgs);
			case TomPackage.GRAPH_RULE__COND:
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
			case TomPackage.GRAPH_RULE__TERMCOND:
				return getTermcond();
			case TomPackage.GRAPH_RULE__TERM_GRAPH:
				return getTermGraph();
			case TomPackage.GRAPH_RULE__COND:
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
			case TomPackage.GRAPH_RULE__TERMCOND:
				setTermcond((TermGraph)newValue);
				return;
			case TomPackage.GRAPH_RULE__TERM_GRAPH:
				setTermGraph((TermGraph)newValue);
				return;
			case TomPackage.GRAPH_RULE__COND:
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
			case TomPackage.GRAPH_RULE__TERMCOND:
				setTermcond((TermGraph)null);
				return;
			case TomPackage.GRAPH_RULE__TERM_GRAPH:
				setTermGraph((TermGraph)null);
				return;
			case TomPackage.GRAPH_RULE__COND:
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
			case TomPackage.GRAPH_RULE__TERMCOND:
				return termcond != null;
			case TomPackage.GRAPH_RULE__TERM_GRAPH:
				return termGraph != null;
			case TomPackage.GRAPH_RULE__COND:
				return cond != null;
		}
		return super.eIsSet(featureID);
	}

} //GraphRuleImpl
