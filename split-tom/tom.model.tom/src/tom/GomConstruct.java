/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gom Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.GomConstruct#getOption <em>Option</em>}</li>
 *   <li>{@link tom.GomConstruct#getImports <em>Imports</em>}</li>
 *   <li>{@link tom.GomConstruct#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getGomConstruct()
 * @model
 * @generated
 */
public interface GomConstruct extends Block, Linkable {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' attribute.
	 * @see #setOption(String)
	 * @see tom.TomPackage#getGomConstruct_Option()
	 * @model
	 * @generated
	 */
	String getOption();

	/**
	 * Sets the value of the '{@link tom.GomConstruct#getOption <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' attribute.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference list.
	 * The list contents are of type {@link tom.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' reference list.
	 * @see tom.TomPackage#getGomConstruct_Imports()
	 * @model
	 * @generated
	 */
	EList<Type> getImports();

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link tom.Definition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see tom.TomPackage#getGomConstruct_Definitions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Definition> getDefinitions();

} // GomConstruct
