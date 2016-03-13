/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Term Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.XMLTermSimple#getNameList <em>Name List</em>}</li>
 *   <li>{@link tom.XMLTermSimple#getAttrList <em>Attr List</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getXMLTermSimple()
 * @model
 * @generated
 */
public interface XMLTermSimple extends XMLTerm {
	/**
	 * Returns the value of the '<em><b>Name List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name List</em>' containment reference.
	 * @see #setNameList(XMLNameList)
	 * @see tom.TomPackage#getXMLTermSimple_NameList()
	 * @model containment="true"
	 * @generated
	 */
	XMLNameList getNameList();

	/**
	 * Sets the value of the '{@link tom.XMLTermSimple#getNameList <em>Name List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name List</em>' containment reference.
	 * @see #getNameList()
	 * @generated
	 */
	void setNameList(XMLNameList value);

	/**
	 * Returns the value of the '<em><b>Attr List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr List</em>' containment reference.
	 * @see #setAttrList(XMLAttrList)
	 * @see tom.TomPackage#getXMLTermSimple_AttrList()
	 * @model containment="true"
	 * @generated
	 */
	XMLAttrList getAttrList();

	/**
	 * Sets the value of the '{@link tom.XMLTermSimple#getAttrList <em>Attr List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr List</em>' containment reference.
	 * @see #getAttrList()
	 * @generated
	 */
	void setAttrList(XMLAttrList value);

} // XMLTermSimple
