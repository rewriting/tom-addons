/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hook Operator Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.HookOperatorDefinition#getHookType <em>Hook Type</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getHookOperatorDefinition()
 * @model
 * @generated
 */
public interface HookOperatorDefinition extends HookDefinition {
	/**
	 * Returns the value of the '<em><b>Hook Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hook Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hook Type</em>' reference.
	 * @see #setHookType(OperatorDefinition)
	 * @see tom.TomPackage#getHookOperatorDefinition_HookType()
	 * @model
	 * @generated
	 */
	OperatorDefinition getHookType();

	/**
	 * Sets the value of the '{@link tom.HookOperatorDefinition#getHookType <em>Hook Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hook Type</em>' reference.
	 * @see #getHookType()
	 * @generated
	 */
	void setHookType(OperatorDefinition value);

} // HookOperatorDefinition
