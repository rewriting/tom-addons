/**
 */
package tom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.TermGraph#getName <em>Name</em>}</li>
 *   <li>{@link tom.TermGraph#getTermGraph <em>Term Graph</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getTermGraph()
 * @model
 * @generated
 */
public interface TermGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tom.TomPackage#getTermGraph_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tom.TermGraph#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Term Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Graph</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Graph</em>' containment reference.
	 * @see #setTermGraph(PlainTermGraph)
	 * @see tom.TomPackage#getTermGraph_TermGraph()
	 * @model containment="true"
	 * @generated
	 */
	PlainTermGraph getTermGraph();

	/**
	 * Sets the value of the '{@link tom.TermGraph#getTermGraph <em>Term Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Graph</em>' containment reference.
	 * @see #getTermGraph()
	 * @generated
	 */
	void setTermGraph(PlainTermGraph value);

} // TermGraph
