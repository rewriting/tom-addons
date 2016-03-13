/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.ConstraintAnd#getLeft <em>Left</em>}</li>
 *   <li>{@link tom.ConstraintAnd#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getConstraintAnd()
 * @model
 * @generated
 */
public interface ConstraintAnd extends Constraint {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Constraint)
	 * @see tom.TomPackage#getConstraintAnd_Left()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getLeft();

	/**
	 * Sets the value of the '{@link tom.ConstraintAnd#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Constraint value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Constraint)
	 * @see tom.TomPackage#getConstraintAnd_Right()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getRight();

	/**
	 * Sets the value of the '{@link tom.ConstraintAnd#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Constraint value);

} // ConstraintAnd
