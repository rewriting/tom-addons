/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.Operator#getKeys <em>Keys</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getOperator()
 * @model
 * @generated
 */
public interface Operator extends Block, Operation {
	/**
	 * Returns the value of the '<em><b>Keys</b></em>' containment reference list.
	 * The list contents are of type {@link tom.KeyWord}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' containment reference list.
	 * @see tom.TomPackage#getOperator_Keys()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyWord> getKeys();

} // Operator
