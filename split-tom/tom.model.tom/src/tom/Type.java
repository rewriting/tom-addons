/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.Type#getExtend <em>Extend</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getType()
 * @model
 * @generated
 */
public interface Type extends Linkable {
	/**
	 * Returns the value of the '<em><b>Extend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extend</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend</em>' reference.
	 * @see #setExtend(Type)
	 * @see tom.TomPackage#getType_Extend()
	 * @model
	 * @generated
	 */
	Type getExtend();

	/**
	 * Sets the value of the '{@link tom.Type#getExtend <em>Extend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extend</em>' reference.
	 * @see #getExtend()
	 * @generated
	 */
	void setExtend(Type value);

} // Type
