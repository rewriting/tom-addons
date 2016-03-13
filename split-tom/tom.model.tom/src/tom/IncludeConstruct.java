/**
 */
package tom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.IncludeConstruct#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link tom.IncludeConstruct#getExt <em>Ext</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getIncludeConstruct()
 * @model
 * @generated
 */
public interface IncludeConstruct extends Block {
	/**
	 * Returns the value of the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' attribute.
	 * @see #setImportURI(String)
	 * @see tom.TomPackage#getIncludeConstruct_ImportURI()
	 * @model
	 * @generated
	 */
	String getImportURI();

	/**
	 * Sets the value of the '{@link tom.IncludeConstruct#getImportURI <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' attribute.
	 * @see #getImportURI()
	 * @generated
	 */
	void setImportURI(String value);

	/**
	 * Returns the value of the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext</em>' attribute.
	 * @see #setExt(String)
	 * @see tom.TomPackage#getIncludeConstruct_Ext()
	 * @model
	 * @generated
	 */
	String getExt();

	/**
	 * Sets the value of the '{@link tom.IncludeConstruct#getExt <em>Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext</em>' attribute.
	 * @see #getExt()
	 * @generated
	 */
	void setExt(String value);

} // IncludeConstruct
