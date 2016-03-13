/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Word</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.KeyWord#getArgs <em>Args</em>}</li>
 *   <li>{@link tom.KeyWord#getHote <em>Hote</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getKeyWord()
 * @model
 * @generated
 */
public interface KeyWord extends Linkable {
	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference.
	 * @see #setArgs(Arguments)
	 * @see tom.TomPackage#getKeyWord_Args()
	 * @model containment="true"
	 * @generated
	 */
	Arguments getArgs();

	/**
	 * Sets the value of the '{@link tom.KeyWord#getArgs <em>Args</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' containment reference.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(Arguments value);

	/**
	 * Returns the value of the '<em><b>Hote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hote</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hote</em>' attribute.
	 * @see #setHote(String)
	 * @see tom.TomPackage#getKeyWord_Hote()
	 * @model
	 * @generated
	 */
	String getHote();

	/**
	 * Sets the value of the '{@link tom.KeyWord#getHote <em>Hote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hote</em>' attribute.
	 * @see #getHote()
	 * @generated
	 */
	void setHote(String value);

} // KeyWord
