/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.ConstraintPattern#getConstraintActions <em>Constraint Actions</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getConstraintPattern()
 * @model
 * @generated
 */
public interface ConstraintPattern extends MatchConsctruct {
	/**
	 * Returns the value of the '<em><b>Constraint Actions</b></em>' containment reference list.
	 * The list contents are of type {@link tom.ConstraintAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Actions</em>' containment reference list.
	 * @see tom.TomPackage#getConstraintPattern_ConstraintActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstraintAction> getConstraintActions();

} // ConstraintPattern
