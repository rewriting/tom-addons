/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arguments List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.ArgumentsList#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getArgumentsList()
 * @model
 * @generated
 */
public interface ArgumentsList extends Arguments {
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
	 * @see tom.TomPackage#getArgumentsList_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link tom.ArgumentsList#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // ArgumentsList
