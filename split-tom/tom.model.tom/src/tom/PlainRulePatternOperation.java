/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plain Rule Pattern Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.PlainRulePatternOperation#getHeads <em>Heads</em>}</li>
 *   <li>{@link tom.PlainRulePatternOperation#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getPlainRulePatternOperation()
 * @model
 * @generated
 */
public interface PlainRulePatternOperation extends RulePattern {
	/**
	 * Returns the value of the '<em><b>Heads</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heads</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heads</em>' containment reference.
	 * @see #setHeads(OperationList)
	 * @see tom.TomPackage#getPlainRulePatternOperation_Heads()
	 * @model containment="true"
	 * @generated
	 */
	OperationList getHeads();

	/**
	 * Sets the value of the '{@link tom.PlainRulePatternOperation#getHeads <em>Heads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heads</em>' containment reference.
	 * @see #getHeads()
	 * @generated
	 */
	void setHeads(OperationList value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link tom.RulePattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see tom.TomPackage#getPlainRulePatternOperation_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<RulePattern> getRules();

} // PlainRulePatternOperation
