/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Term List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.ExplicitTermList#getPatterns <em>Patterns</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getExplicitTermList()
 * @model
 * @generated
 */
public interface ExplicitTermList extends List {
	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link tom.Pattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' containment reference list.
	 * @see tom.TomPackage#getExplicitTermList_Patterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern> getPatterns();

} // ExplicitTermList
