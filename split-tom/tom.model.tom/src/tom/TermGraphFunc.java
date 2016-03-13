/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Graph Func</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.TermGraphFunc#getHead <em>Head</em>}</li>
 *   <li>{@link tom.TermGraphFunc#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getTermGraphFunc()
 * @model
 * @generated
 */
public interface TermGraphFunc extends PlainTermGraph {
	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(OperationList)
	 * @see tom.TomPackage#getTermGraphFunc_Head()
	 * @model containment="true"
	 * @generated
	 */
	OperationList getHead();

	/**
	 * Sets the value of the '{@link tom.TermGraphFunc#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(OperationList value);

	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link tom.TermGraph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see tom.TomPackage#getTermGraphFunc_Terms()
	 * @model containment="true"
	 * @generated
	 */
	EList<TermGraph> getTerms();

} // TermGraphFunc
