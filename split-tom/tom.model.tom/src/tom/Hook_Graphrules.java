/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hook Graphrules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.Hook_Graphrules#getMode <em>Mode</em>}</li>
 *   <li>{@link tom.Hook_Graphrules#getGraphRules <em>Graph Rules</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getHook_Graphrules()
 * @model
 * @generated
 */
public interface Hook_Graphrules extends HookOperation {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(String)
	 * @see tom.TomPackage#getHook_Graphrules_Mode()
	 * @model
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link tom.Hook_Graphrules#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

	/**
	 * Returns the value of the '<em><b>Graph Rules</b></em>' containment reference list.
	 * The list contents are of type {@link tom.GraphRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Rules</em>' containment reference list.
	 * @see tom.TomPackage#getHook_Graphrules_GraphRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphRule> getGraphRules();

} // Hook_Graphrules
