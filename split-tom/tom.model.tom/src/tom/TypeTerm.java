/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.TypeTerm#getHote <em>Hote</em>}</li>
 *   <li>{@link tom.TypeTerm#getType <em>Type</em>}</li>
 *   <li>{@link tom.TypeTerm#getKeys <em>Keys</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getTypeTerm()
 * @model
 * @generated
 */
public interface TypeTerm extends Block, Type {
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
	 * @see tom.TomPackage#getTypeTerm_Hote()
	 * @model
	 * @generated
	 */
	String getHote();

	/**
	 * Sets the value of the '{@link tom.TypeTerm#getHote <em>Hote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hote</em>' attribute.
	 * @see #getHote()
	 * @generated
	 */
	void setHote(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see tom.TomPackage#getTypeTerm_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link tom.TypeTerm#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' containment reference list.
	 * The list contents are of type {@link tom.KeyWord}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' containment reference list.
	 * @see tom.TomPackage#getTypeTerm_Keys()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyWord> getKeys();

} // TypeTerm
