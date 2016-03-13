/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Graph Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.TermGraphVariable#isLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getTermGraphVariable()
 * @model
 * @generated
 */
public interface TermGraphVariable extends PlainTermGraph, Linkable {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(boolean)
	 * @see tom.TomPackage#getTermGraphVariable_Label()
	 * @model
	 * @generated
	 */
	boolean isLabel();

	/**
	 * Sets the value of the '{@link tom.TermGraphVariable#isLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #isLabel()
	 * @generated
	 */
	void setLabel(boolean value);

} // TermGraphVariable
