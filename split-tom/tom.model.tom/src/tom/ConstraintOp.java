/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.ConstraintOp#getLeft <em>Left</em>}</li>
 *   <li>{@link tom.ConstraintOp#getOperator <em>Operator</em>}</li>
 *   <li>{@link tom.ConstraintOp#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getConstraintOp()
 * @model
 * @generated
 */
public interface ConstraintOp extends Constraint {
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
	 * @see tom.TomPackage#getConstraintOp_Left()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getLeft();

	/**
	 * Sets the value of the '{@link tom.ConstraintOp#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Constraint value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link tom.RelOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see tom.RelOperator
	 * @see #setOperator(RelOperator)
	 * @see tom.TomPackage#getConstraintOp_Operator()
	 * @model
	 * @generated
	 */
	RelOperator getOperator();

	/**
	 * Sets the value of the '{@link tom.ConstraintOp#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see tom.RelOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(RelOperator value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Term)
	 * @see tom.TomPackage#getConstraintOp_Right()
	 * @model containment="true"
	 * @generated
	 */
	Term getRight();

	/**
	 * Sets the value of the '{@link tom.ConstraintOp#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Term value);

} // ConstraintOp
