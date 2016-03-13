/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Hook Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.HostHookOperation#getArgs <em>Args</em>}</li>
 *   <li>{@link tom.HostHookOperation#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getHostHookOperation()
 * @model
 * @generated
 */
public interface HostHookOperation extends HookOperation {
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
	 * @see tom.TomPackage#getHostHookOperation_Args()
	 * @model containment="true"
	 * @generated
	 */
	Arguments getArgs();

	/**
	 * Sets the value of the '{@link tom.HostHookOperation#getArgs <em>Args</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' containment reference.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(Arguments value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link tom.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see tom.TomPackage#getHostHookOperation_Statements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Statement> getStatements();

} // HostHookOperation
