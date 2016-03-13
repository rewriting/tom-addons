/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hook AU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.Hook_AU#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getHook_AU()
 * @model
 * @generated
 */
public interface Hook_AU extends HostHookOperation {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(Term)
	 * @see tom.TomPackage#getHook_AU_Term()
	 * @model containment="true"
	 * @generated
	 */
	Term getTerm();

	/**
	 * Sets the value of the '{@link tom.Hook_AU#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(Term value);

} // Hook_AU
