/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hook Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.HookDefinition#getHookOperation <em>Hook Operation</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getHookDefinition()
 * @model
 * @generated
 */
public interface HookDefinition extends Definition {
	/**
	 * Returns the value of the '<em><b>Hook Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hook Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hook Operation</em>' containment reference.
	 * @see #setHookOperation(HookOperation)
	 * @see tom.TomPackage#getHookDefinition_HookOperation()
	 * @model containment="true"
	 * @generated
	 */
	HookOperation getHookOperation();

	/**
	 * Sets the value of the '{@link tom.HookDefinition#getHookOperation <em>Hook Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hook Operation</em>' containment reference.
	 * @see #getHookOperation()
	 * @generated
	 */
	void setHookOperation(HookOperation value);

} // HookDefinition
