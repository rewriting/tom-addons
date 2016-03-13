/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.Transformation#getFileFrom <em>File From</em>}</li>
 *   <li>{@link tom.Transformation#getFileTo <em>File To</em>}</li>
 *   <li>{@link tom.Transformation#getElementaryTranformations <em>Elementary Tranformations</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends Block, Operation {
	/**
	 * Returns the value of the '<em><b>File From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File From</em>' attribute.
	 * @see #setFileFrom(String)
	 * @see tom.TomPackage#getTransformation_FileFrom()
	 * @model
	 * @generated
	 */
	String getFileFrom();

	/**
	 * Sets the value of the '{@link tom.Transformation#getFileFrom <em>File From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File From</em>' attribute.
	 * @see #getFileFrom()
	 * @generated
	 */
	void setFileFrom(String value);

	/**
	 * Returns the value of the '<em><b>File To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File To</em>' attribute.
	 * @see #setFileTo(String)
	 * @see tom.TomPackage#getTransformation_FileTo()
	 * @model
	 * @generated
	 */
	String getFileTo();

	/**
	 * Sets the value of the '{@link tom.Transformation#getFileTo <em>File To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File To</em>' attribute.
	 * @see #getFileTo()
	 * @generated
	 */
	void setFileTo(String value);

	/**
	 * Returns the value of the '<em><b>Elementary Tranformations</b></em>' containment reference list.
	 * The list contents are of type {@link tom.ElementaryTransformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elementary Tranformations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementary Tranformations</em>' containment reference list.
	 * @see tom.TomPackage#getTransformation_ElementaryTranformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementaryTransformation> getElementaryTranformations();

} // Transformation
