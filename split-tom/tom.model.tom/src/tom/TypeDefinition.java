/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.TypeDefinition#getOpDefinition <em>Op Definition</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getTypeDefinition()
 * @model
 * @generated
 */
public interface TypeDefinition extends Type, Definition {
	/**
	 * Returns the value of the '<em><b>Op Definition</b></em>' containment reference list.
	 * The list contents are of type {@link tom.OperatorDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Definition</em>' containment reference list.
	 * @see tom.TomPackage#getTypeDefinition_OpDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperatorDefinition> getOpDefinition();

} // TypeDefinition
