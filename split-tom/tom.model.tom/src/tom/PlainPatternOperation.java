/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plain Pattern Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.PlainPatternOperation#getHeads <em>Heads</em>}</li>
 *   <li>{@link tom.PlainPatternOperation#getList <em>List</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getPlainPatternOperation()
 * @model
 * @generated
 */
public interface PlainPatternOperation extends Pattern {
	/**
	 * Returns the value of the '<em><b>Heads</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heads</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heads</em>' containment reference.
	 * @see #setHeads(OperationList)
	 * @see tom.TomPackage#getPlainPatternOperation_Heads()
	 * @model containment="true"
	 * @generated
	 */
	OperationList getHeads();

	/**
	 * Sets the value of the '{@link tom.PlainPatternOperation#getHeads <em>Heads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heads</em>' containment reference.
	 * @see #getHeads()
	 * @generated
	 */
	void setHeads(OperationList value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(List)
	 * @see tom.TomPackage#getPlainPatternOperation_List()
	 * @model containment="true"
	 * @generated
	 */
	List getList();

	/**
	 * Sets the value of the '{@link tom.PlainPatternOperation#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(List value);

} // PlainPatternOperation
