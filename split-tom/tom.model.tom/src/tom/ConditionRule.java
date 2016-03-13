/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.ConditionRule#getRule <em>Rule</em>}</li>
 *   <li>{@link tom.ConditionRule#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getConditionRule()
 * @model
 * @generated
 */
public interface ConditionRule extends Condition {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(Condition)
	 * @see tom.TomPackage#getConditionRule_Rule()
	 * @model containment="true"
	 * @generated
	 */
	Condition getRule();

	/**
	 * Sets the value of the '{@link tom.ConditionRule#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Condition value);

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
	 * @see tom.TomPackage#getConditionRule_Term()
	 * @model containment="true"
	 * @generated
	 */
	Term getTerm();

	/**
	 * Sets the value of the '{@link tom.ConditionRule#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(Term value);

} // ConditionRule
