/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.PatternAction#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link tom.PatternAction#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getPatternAction()
 * @model
 * @generated
 */
public interface PatternAction extends Context, Linkable {
	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patterns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' containment reference.
	 * @see #setPatterns(PatternList)
	 * @see tom.TomPackage#getPatternAction_Patterns()
	 * @model containment="true"
	 * @generated
	 */
	PatternList getPatterns();

	/**
	 * Sets the value of the '{@link tom.PatternAction#getPatterns <em>Patterns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patterns</em>' containment reference.
	 * @see #getPatterns()
	 * @generated
	 */
	void setPatterns(PatternList value);

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
	 * @see tom.TomPackage#getPatternAction_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // PatternAction
