/**
 */
package tom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.Rule#getRulePattern <em>Rule Pattern</em>}</li>
 *   <li>{@link tom.Rule#getTerm <em>Term</em>}</li>
 *   <li>{@link tom.Rule#getCond <em>Cond</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Pattern</em>' containment reference.
	 * @see #setRulePattern(RulePattern)
	 * @see tom.TomPackage#getRule_RulePattern()
	 * @model containment="true"
	 * @generated
	 */
	RulePattern getRulePattern();

	/**
	 * Sets the value of the '{@link tom.Rule#getRulePattern <em>Rule Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Pattern</em>' containment reference.
	 * @see #getRulePattern()
	 * @generated
	 */
	void setRulePattern(RulePattern value);

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
	 * @see tom.TomPackage#getRule_Term()
	 * @model containment="true"
	 * @generated
	 */
	Term getTerm();

	/**
	 * Sets the value of the '{@link tom.Rule#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(Term value);

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
	 * @see tom.TomPackage#getRule_Cond()
	 * @model containment="true"
	 * @generated
	 */
	Condition getCond();

	/**
	 * Sets the value of the '{@link tom.Rule#getCond <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' containment reference.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(Condition value);

} // Rule
