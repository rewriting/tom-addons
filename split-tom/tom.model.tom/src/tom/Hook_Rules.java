/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hook Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.Hook_Rules#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getHook_Rules()
 * @model
 * @generated
 */
public interface Hook_Rules extends HookOperation {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link tom.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see tom.TomPackage#getHook_Rules_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // Hook_Rules
