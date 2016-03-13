/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.TermOperation#getOp <em>Op</em>}</li>
 *   <li>{@link tom.TermOperation#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getTermOperation()
 * @model
 * @generated
 */
public interface TermOperation extends Term {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' reference.
	 * @see #setOp(Operation)
	 * @see tom.TomPackage#getTermOperation_Op()
	 * @model
	 * @generated
	 */
	Operation getOp();

	/**
	 * Sets the value of the '{@link tom.TermOperation#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Operation value);

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
	 * @see tom.TomPackage#getTermOperation_Terms()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Term> getTerms();

} // TermOperation
