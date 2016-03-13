/**
 */
package tom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Rule Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.NamedRulePattern#getPlainRulePattern <em>Plain Rule Pattern</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getNamedRulePattern()
 * @model
 * @generated
 */
public interface NamedRulePattern extends RulePattern, LocalVariable {
	/**
	 * Returns the value of the '<em><b>Plain Rule Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plain Rule Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plain Rule Pattern</em>' containment reference.
	 * @see #setPlainRulePattern(EObject)
	 * @see tom.TomPackage#getNamedRulePattern_PlainRulePattern()
	 * @model containment="true"
	 * @generated
	 */
	EObject getPlainRulePattern();

	/**
	 * Sets the value of the '{@link tom.NamedRulePattern#getPlainRulePattern <em>Plain Rule Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plain Rule Pattern</em>' containment reference.
	 * @see #getPlainRulePattern()
	 * @generated
	 */
	void setPlainRulePattern(EObject value);

} // NamedRulePattern
