/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.NamedPattern#getPlainPattern <em>Plain Pattern</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getNamedPattern()
 * @model
 * @generated
 */
public interface NamedPattern extends Pattern, LocalVariable {
	/**
	 * Returns the value of the '<em><b>Plain Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plain Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plain Pattern</em>' containment reference.
	 * @see #setPlainPattern(Pattern)
	 * @see tom.TomPackage#getNamedPattern_PlainPattern()
	 * @model containment="true"
	 * @generated
	 */
	Pattern getPlainPattern();

	/**
	 * Sets the value of the '{@link tom.NamedPattern#getPlainPattern <em>Plain Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plain Pattern</em>' containment reference.
	 * @see #getPlainPattern()
	 * @generated
	 */
	void setPlainPattern(Pattern value);

} // NamedPattern
