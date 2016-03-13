/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elementary Transformation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.ElementaryTransformationRule#getPattern <em>Pattern</em>}</li>
 *   <li>{@link tom.ElementaryTransformationRule#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getElementaryTransformationRule()
 * @model
 * @generated
 */
public interface ElementaryTransformationRule extends Context {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(Pattern)
	 * @see tom.TomPackage#getElementaryTransformationRule_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link tom.ElementaryTransformationRule#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

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
	 * @see tom.TomPackage#getElementaryTransformationRule_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // ElementaryTransformationRule
