/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hook Module Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.HookModuleDefinition#getHookType <em>Hook Type</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getHookModuleDefinition()
 * @model
 * @generated
 */
public interface HookModuleDefinition extends HookDefinition {
	/**
	 * Returns the value of the '<em><b>Hook Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hook Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hook Type</em>' reference.
	 * @see #setHookType(GomConstruct)
	 * @see tom.TomPackage#getHookModuleDefinition_HookType()
	 * @model
	 * @generated
	 */
	GomConstruct getHookType();

	/**
	 * Sets the value of the '{@link tom.HookModuleDefinition#getHookType <em>Hook Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hook Type</em>' reference.
	 * @see #getHookType()
	 * @generated
	 */
	void setHookType(GomConstruct value);

} // HookModuleDefinition
