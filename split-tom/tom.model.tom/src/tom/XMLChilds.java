/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Childs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.XMLChilds#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getXMLChilds()
 * @model
 * @generated
 */
public interface XMLChilds extends EObject {
	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link tom.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see tom.TomPackage#getXMLChilds_Terms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Term> getTerms();

} // XMLChilds
