/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.MatchPattern#getArgs <em>Args</em>}</li>
 *   <li>{@link tom.MatchPattern#getPatternActions <em>Pattern Actions</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getMatchPattern()
 * @model
 * @generated
 */
public interface MatchPattern extends MatchConsctruct {
	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link tom.ArgumentMatch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see tom.TomPackage#getMatchPattern_Args()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentMatch> getArgs();

	/**
	 * Returns the value of the '<em><b>Pattern Actions</b></em>' containment reference list.
	 * The list contents are of type {@link tom.PatternAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Actions</em>' containment reference list.
	 * @see tom.TomPackage#getMatchPattern_PatternActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatternAction> getPatternActions();

} // MatchPattern
