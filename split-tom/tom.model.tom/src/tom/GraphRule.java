/**
 */
package tom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.GraphRule#getTermcond <em>Termcond</em>}</li>
 *   <li>{@link tom.GraphRule#getTermGraph <em>Term Graph</em>}</li>
 *   <li>{@link tom.GraphRule#getCond <em>Cond</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getGraphRule()
 * @model
 * @generated
 */
public interface GraphRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Termcond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Termcond</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termcond</em>' containment reference.
	 * @see #setTermcond(TermGraph)
	 * @see tom.TomPackage#getGraphRule_Termcond()
	 * @model containment="true"
	 * @generated
	 */
	TermGraph getTermcond();

	/**
	 * Sets the value of the '{@link tom.GraphRule#getTermcond <em>Termcond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termcond</em>' containment reference.
	 * @see #getTermcond()
	 * @generated
	 */
	void setTermcond(TermGraph value);

	/**
	 * Returns the value of the '<em><b>Term Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Graph</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Graph</em>' containment reference.
	 * @see #setTermGraph(TermGraph)
	 * @see tom.TomPackage#getGraphRule_TermGraph()
	 * @model containment="true"
	 * @generated
	 */
	TermGraph getTermGraph();

	/**
	 * Sets the value of the '{@link tom.GraphRule#getTermGraph <em>Term Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Graph</em>' containment reference.
	 * @see #getTermGraph()
	 * @generated
	 */
	void setTermGraph(TermGraph value);

	/**
	 * Returns the value of the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' containment reference.
	 * @see #setCond(Condition)
	 * @see tom.TomPackage#getGraphRule_Cond()
	 * @model containment="true"
	 * @generated
	 */
	Condition getCond();

	/**
	 * Sets the value of the '{@link tom.GraphRule#getCond <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' containment reference.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(Condition value);

} // GraphRule
