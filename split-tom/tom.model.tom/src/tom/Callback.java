/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.Callback#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getCallback()
 * @model
 * @generated
 */
public interface Callback extends Block {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link tom.CallbackDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see tom.TomPackage#getCallback_Operations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CallbackDefinition> getOperations();

} // Callback
