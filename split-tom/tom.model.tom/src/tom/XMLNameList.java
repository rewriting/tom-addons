/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Name List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.XMLNameList#getXMLName <em>XML Name</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getXMLNameList()
 * @model
 * @generated
 */
public interface XMLNameList extends EObject {
	/**
	 * Returns the value of the '<em><b>XML Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XML Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XML Name</em>' attribute list.
	 * @see tom.TomPackage#getXMLNameList_XMLName()
	 * @model unique="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='XMLAttrList'"
	 * @generated
	 */
	EList<String> getXMLName();

} // XMLNameList
