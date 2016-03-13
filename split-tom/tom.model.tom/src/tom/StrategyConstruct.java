/**
 */
package tom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tom.StrategyConstruct#getImplement <em>Implement</em>}</li>
 *   <li>{@link tom.StrategyConstruct#getArgs <em>Args</em>}</li>
 *   <li>{@link tom.StrategyConstruct#getVisitlist <em>Visitlist</em>}</li>
 * </ul>
 *
 * @see tom.TomPackage#getStrategyConstruct()
 * @model
 * @generated
 */
public interface StrategyConstruct extends Type, Block {
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
	 * @see tom.TomPackage#getStrategyConstruct_Implement()
	 * @model containment="true"
	 * @generated
	 */
	TermOperation getImplement();

	/**
	 * Sets the value of the '{@link tom.StrategyConstruct#getImplement <em>Implement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implement</em>' containment reference.
	 * @see #getImplement()
	 * @generated
	 */
	void setImplement(TermOperation value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference.
	 * @see #setArgs(Arguments)
	 * @see tom.TomPackage#getStrategyConstruct_Args()
	 * @model containment="true"
	 * @generated
	 */
	Arguments getArgs();

	/**
	 * Sets the value of the '{@link tom.StrategyConstruct#getArgs <em>Args</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' containment reference.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(Arguments value);

	/**
	 * Returns the value of the '<em><b>Visitlist</b></em>' containment reference list.
	 * The list contents are of type {@link tom.StrategyVisit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visitlist</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visitlist</em>' containment reference list.
	 * @see tom.TomPackage#getStrategyConstruct_Visitlist()
	 * @model containment="true"
	 * @generated
	 */
	EList<StrategyVisit> getVisitlist();

} // StrategyConstruct
