/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.Call#getCall <em>Call</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Expression {
	/**
	 * Returns the value of the '<em><b>Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call</em>' containment reference.
	 * @see #setCall(TermOperation)
	 * @see tom.TomPackage#getCall_Call()
	 * @model containment="true"
	 * @generated
	 */
	TermOperation getCall();

	/**
	 * Sets the value of the '{@link tom.Call#getCall <em>Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call</em>' containment reference.
	 * @see #getCall()
	 * @generated
	 */
	void setCall(TermOperation value);

} // Call
