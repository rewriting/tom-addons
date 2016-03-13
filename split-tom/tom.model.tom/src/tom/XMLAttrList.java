/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Attr List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.XMLAttrList#getAttrs <em>Attrs</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getXMLAttrList()
 * @model
 * @generated
 */
public interface XMLAttrList extends EObject {
	/**
	 * Returns the value of the '<em><b>Attrs</b></em>' containment reference list.
	 * The list contents are of type {@link tom.XMLAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attrs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attrs</em>' containment reference list.
	 * @see tom.TomPackage#getXMLAttrList_Attrs()
	 * @model containment="true"
	 * @generated
	 */
	EList<XMLAttribute> getAttrs();

} // XMLAttrList
