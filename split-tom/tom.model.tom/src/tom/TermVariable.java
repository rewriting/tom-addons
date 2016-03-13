/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.TermVariable#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getTermVariable()
 * @model
 * @generated
 */
public interface TermVariable extends Term {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' reference.
	 * @see #setVar(Variable)
	 * @see tom.TomPackage#getTermVariable_Var()
	 * @model
	 * @generated
	 */
	Variable getVar();

	/**
	 * Sets the value of the '{@link tom.TermVariable#getVar <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(Variable value);

} // TermVariable
