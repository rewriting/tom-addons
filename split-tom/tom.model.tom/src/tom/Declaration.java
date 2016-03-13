/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.Declaration#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends Expression, LocalVariable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Term)
	 * @see tom.TomPackage#getDeclaration_Value()
	 * @model containment="true"
	 * @generated
	 */
	Term getValue();

	/**
	 * Sets the value of the '{@link tom.Declaration#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Term value);

} // Declaration
