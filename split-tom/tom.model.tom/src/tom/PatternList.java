/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.PatternList#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link tom.PatternList#getRel <em>Rel</em>}</li>
 *   <li>{@link tom.PatternList#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getPatternList()
 * @model
 * @generated
 */
public interface PatternList extends EObject {
	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link tom.Pattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' containment reference list.
	 * @see tom.TomPackage#getPatternList_Patterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern> getPatterns();

	/**
	 * Returns the value of the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel</em>' attribute.
	 * @see #setRel(String)
	 * @see tom.TomPackage#getPatternList_Rel()
	 * @model
	 * @generated
	 */
	String getRel();

	/**
	 * Sets the value of the '{@link tom.PatternList#getRel <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel</em>' attribute.
	 * @see #getRel()
	 * @generated
	 */
	void setRel(String value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(Constraint)
	 * @see tom.TomPackage#getPatternList_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getConstraint();

	/**
	 * Sets the value of the '{@link tom.PatternList#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Constraint value);

} // PatternList
