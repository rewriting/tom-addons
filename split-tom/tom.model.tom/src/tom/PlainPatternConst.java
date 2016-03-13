/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plain Pattern Const</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.PlainPatternConst#getHead <em>Head</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getPlainPatternConst()
 * @model
 * @generated
 */
public interface PlainPatternConst extends Pattern, RulePattern {
	/**
	 * Returns the value of the '<em><b>Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' attribute.
	 * @see #setHead(String)
	 * @see tom.TomPackage#getPlainPatternConst_Head()
	 * @model
	 * @generated
	 */
	String getHead();

	/**
	 * Sets the value of the '{@link tom.PlainPatternConst#getHead <em>Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' attribute.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(String value);

} // PlainPatternConst
