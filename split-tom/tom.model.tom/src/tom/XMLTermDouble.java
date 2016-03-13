/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Term Double</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.XMLTermDouble#getNameList <em>Name List</em>}</li>
 *   <li>{@link tom.XMLTermDouble#getAttrList <em>Attr List</em>}</li>
 *   <li>{@link tom.XMLTermDouble#getChilds <em>Childs</em>}</li>
 *   <li>{@link tom.XMLTermDouble#getList <em>List</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getXMLTermDouble()
 * @model
 * @generated
 */
public interface XMLTermDouble extends XMLTerm {
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
	 * @see tom.TomPackage#getXMLTermDouble_NameList()
	 * @model containment="true"
	 * @generated
	 */
	XMLNameList getNameList();

	/**
	 * Sets the value of the '{@link tom.XMLTermDouble#getNameList <em>Name List</em>}' containment reference.
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
	 * @see tom.TomPackage#getXMLTermDouble_AttrList()
	 * @model containment="true"
	 * @generated
	 */
	XMLAttrList getAttrList();

	/**
	 * Sets the value of the '{@link tom.XMLTermDouble#getAttrList <em>Attr List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr List</em>' containment reference.
	 * @see #getAttrList()
	 * @generated
	 */
	void setAttrList(XMLAttrList value);

	/**
	 * Returns the value of the '<em><b>Childs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Childs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childs</em>' containment reference.
	 * @see #setChilds(XMLChilds)
	 * @see tom.TomPackage#getXMLTermDouble_Childs()
	 * @model containment="true"
	 * @generated
	 */
	XMLChilds getChilds();

	/**
	 * Sets the value of the '{@link tom.XMLTermDouble#getChilds <em>Childs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Childs</em>' containment reference.
	 * @see #getChilds()
	 * @generated
	 */
	void setChilds(XMLChilds value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(XMLNameList)
	 * @see tom.TomPackage#getXMLTermDouble_List()
	 * @model containment="true"
	 * @generated
	 */
	XMLNameList getList();

	/**
	 * Sets the value of the '{@link tom.XMLTermDouble#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(XMLNameList value);

} // XMLTermDouble
