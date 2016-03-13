/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implicit Pair List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.ImplicitPairList#getPatterns <em>Patterns</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getImplicitPairList()
 * @model
 * @generated
 */
public interface ImplicitPairList extends List {
	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link tom.PairPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' containment reference list.
	 * @see tom.TomPackage#getImplicitPairList_Patterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<PairPattern> getPatterns();

} // ImplicitPairList
