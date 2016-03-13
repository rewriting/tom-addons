/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.ConstraintMatch#getPattern <em>Pattern</em>}</li>
 *   <li>{@link tom.ConstraintMatch#getType <em>Type</em>}</li>
 *   <li>{@link tom.ConstraintMatch#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getConstraintMatch()
 * @model
 * @generated
 */
public interface ConstraintMatch extends Constraint {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(Constraint)
	 * @see tom.TomPackage#getConstraintMatch_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getPattern();

	/**
	 * Sets the value of the '{@link tom.ConstraintMatch#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Constraint value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see tom.TomPackage#getConstraintMatch_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link tom.ConstraintMatch#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

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
	 * @see tom.TomPackage#getConstraintMatch_Term()
	 * @model containment="true"
	 * @generated
	 */
	Term getTerm();

	/**
	 * Sets the value of the '{@link tom.ConstraintMatch#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(Term value);

} // ConstraintMatch
