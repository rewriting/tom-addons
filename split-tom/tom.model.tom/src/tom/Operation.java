/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.Operation#getType <em>Type</em>}</li>
 *   <li>{@link tom.Operation#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Linkable {
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
	 * @see tom.TomPackage#getOperation_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link tom.Operation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference.
	 * @see #setArgs(Arguments)
	 * @see tom.TomPackage#getOperation_Args()
	 * @model containment="true"
	 * @generated
	 */
	Arguments getArgs();

	/**
	 * Sets the value of the '{@link tom.Operation#getArgs <em>Args</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' containment reference.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(Arguments value);

} // Operation
