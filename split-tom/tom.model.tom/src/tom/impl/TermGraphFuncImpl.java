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
import tom.TermGraph;
import tom.TermGraphFunc;
import tom.TomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Graph Func</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.TermGraphFuncImpl#getHead <em>Head</em>}</li>
 *   <li>{@link tom.impl.TermGraphFuncImpl#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermGraphFuncImpl extends PlainTermGraphImpl implements TermGraphFunc {
	/**
	 * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHead()
	 * @generated
	 * @ordered
	 */
	protected OperationList head;

	/**
	 * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<TermGraph> terms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermGraphFuncImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.TERM_GRAPH_FUNC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationList getHead() {
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHead(OperationList newHead, NotificationChain msgs) {
		OperationList oldHead = head;
		head = newHead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TomPackage.TERM_GRAPH_FUNC__HEAD, oldHead, newHead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHead(OperationList newHead) {
		if (newHead != head) {
			NotificationChain msgs = null;
			if (head != null)
				msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TomPackage.TERM_GRAPH_FUNC__HEAD, null, msgs);
			if (newHead != null)
				msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TomPackage.TERM_GRAPH_FUNC__HEAD, null, msgs);
			msgs = basicSetHead(newHead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TomPackage.TERM_GRAPH_FUNC__HEAD, newHead, newHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TermGraph> getTerms() {
		if (terms == null) {
			terms = new EObjectContainmentEList<TermGraph>(TermGraph.class, this, TomPackage.TERM_GRAPH_FUNC__TERMS);
		}
		return terms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.TERM_GRAPH_FUNC__HEAD:
				return basicSetHead(null, msgs);
			case TomPackage.TERM_GRAPH_FUNC__TERMS:
				return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
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
			case TomPackage.TERM_GRAPH_FUNC__HEAD:
				return getHead();
			case TomPackage.TERM_GRAPH_FUNC__TERMS:
				return getTerms();
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
			case TomPackage.TERM_GRAPH_FUNC__HEAD:
				setHead((OperationList)newValue);
				return;
			case TomPackage.TERM_GRAPH_FUNC__TERMS:
				getTerms().clear();
				getTerms().addAll((Collection<? extends TermGraph>)newValue);
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
			case TomPackage.TERM_GRAPH_FUNC__HEAD:
				setHead((OperationList)null);
				return;
			case TomPackage.TERM_GRAPH_FUNC__TERMS:
				getTerms().clear();
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
			case TomPackage.TERM_GRAPH_FUNC__HEAD:
				return head != null;
			case TomPackage.TERM_GRAPH_FUNC__TERMS:
				return terms != null && !terms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TermGraphFuncImpl
