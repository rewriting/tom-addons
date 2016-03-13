/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elementary Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.ElementaryTransformation#getImplement <em>Implement</em>}</li>
 *   <li>{@link tom.ElementaryTransformation#getElementaryTransformationRules <em>Elementary Transformation Rules</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getElementaryTransformation()
 * @model
 * @generated
 */
public interface ElementaryTransformation extends Operation, Context {
	/**
	 * Returns the value of the '<em><b>Implement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implement</em>' containment reference.
	 * @see #setImplement(TermOperation)
	 * @see tom.TomPackage#getElementaryTransformation_Implement()
	 * @model containment="true"
	 * @generated
	 */
	TermOperation getImplement();

	/**
	 * Sets the value of the '{@link tom.ElementaryTransformation#getImplement <em>Implement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implement</em>' containment reference.
	 * @see #getImplement()
	 * @generated
	 */
	void setImplement(TermOperation value);

	/**
	 * Returns the value of the '<em><b>Elementary Transformation Rules</b></em>' containment reference list.
	 * The list contents are of type {@link tom.ElementaryTransformationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elementary Transformation Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementary Transformation Rules</em>' containment reference list.
	 * @see tom.TomPackage#getElementaryTransformation_ElementaryTransformationRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementaryTransformationRule> getElementaryTransformationRules();

} // ElementaryTransformation
