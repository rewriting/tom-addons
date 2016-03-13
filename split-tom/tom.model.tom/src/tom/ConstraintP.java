/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.ConstraintP#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getConstraintP()
 * @model
 * @generated
 */
public interface ConstraintP extends Constraint {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(Constraint)
	 * @see tom.TomPackage#getConstraintP_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getConstraint();

	/**
	 * Sets the value of the '{@link tom.ConstraintP#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Constraint value);

} // ConstraintP
