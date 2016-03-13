/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visit Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.VisitAction#getPattern <em>Pattern</em>}</li>
 *   <li>{@link tom.VisitAction#getStatements <em>Statements</em>}</li>
 *   <li>{@link tom.VisitAction#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getVisitAction()
 * @model
 * @generated
 */
public interface VisitAction extends Context {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(PatternList)
	 * @see tom.TomPackage#getVisitAction_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	PatternList getPattern();

	/**
	 * Sets the value of the '{@link tom.VisitAction#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(PatternList value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link tom.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see tom.TomPackage#getVisitAction_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(Term)
	 * @see tom.TomPackage#getVisitAction_Term()
	 * @model containment="true"
	 * @generated
	 */
	Term getTerm();

	/**
	 * Sets the value of the '{@link tom.VisitAction#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(Term value);

} // VisitAction
