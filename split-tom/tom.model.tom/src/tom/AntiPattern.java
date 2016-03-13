/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anti Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.AntiPattern#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getAntiPattern()
 * @model
 * @generated
 */
public interface AntiPattern extends Pattern {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(PlainPatternOperation)
	 * @see tom.TomPackage#getAntiPattern_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	PlainPatternOperation getPattern();

	/**
	 * Sets the value of the '{@link tom.AntiPattern#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(PlainPatternOperation value);

} // AntiPattern
