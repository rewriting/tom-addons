/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.OperationList#getHeads <em>Heads</em>}</li>
 *   <li>{@link tom.OperationList#isLog <em>Log</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getOperationList()
 * @model
 * @generated
 */
public interface OperationList extends EObject {
	/**
	 * Returns the value of the '<em><b>Heads</b></em>' reference list.
	 * The list contents are of type {@link tom.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heads</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heads</em>' reference list.
	 * @see tom.TomPackage#getOperationList_Heads()
	 * @model
	 * @generated
	 */
	EList<Operation> getHeads();

	/**
	 * Returns the value of the '<em><b>Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' attribute.
	 * @see #setLog(boolean)
	 * @see tom.TomPackage#getOperationList_Log()
	 * @model
	 * @generated
	 */
	boolean isLog();

	/**
	 * Sets the value of the '{@link tom.OperationList#isLog <em>Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log</em>' attribute.
	 * @see #isLog()
	 * @generated
	 */
	void setLog(boolean value);

} // OperationList
