/**
 */
package tom;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tom.TomPackage
 * @generated
 */
public interface TomFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TomFactory eINSTANCE = tom.impl.TomFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Host Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Code</em>'.
	 * @generated
	 */
	HostCode createHostCode();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call</em>'.
	 * @generated
	 */
	Call createCall();

	/**
	 * Returns a new object of class '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaration</em>'.
	 * @generated
	 */
	Declaration createDeclaration();

	/**
	 * Returns a new object of class '<em>Affectation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Affectation</em>'.
	 * @generated
	 */
	Affectation createAffectation();

	/**
	 * Returns a new object of class '<em>Tom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tom</em>'.
	 * @generated
	 */
	Tom createTom();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Linkable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linkable</em>'.
	 * @generated
	 */
	Linkable createLinkable();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Variable</em>'.
	 * @generated
	 */
	GlobalVariable createGlobalVariable();

	/**
	 * Returns a new object of class '<em>Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Variable</em>'.
	 * @generated
	 */
	LocalVariable createLocalVariable();

	/**
	 * Returns a new object of class '<em>Variable Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Simple</em>'.
	 * @generated
	 */
	VariableSimple createVariableSimple();

	/**
	 * Returns a new object of class '<em>Variable List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable List</em>'.
	 * @generated
	 */
	VariableList createVariableList();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Callback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Callback</em>'.
	 * @generated
	 */
	Callback createCallback();

	/**
	 * Returns a new object of class '<em>Callback Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Callback Definition</em>'.
	 * @generated
	 */
	CallbackDefinition createCallbackDefinition();

	/**
	 * Returns a new object of class '<em>Arguments</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arguments</em>'.
	 * @generated
	 */
	Arguments createArguments();

	/**
	 * Returns a new object of class '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument</em>'.
	 * @generated
	 */
	Argument createArgument();

	/**
	 * Returns a new object of class '<em>Argument Type Suffix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument Type Suffix</em>'.
	 * @generated
	 */
	ArgumentTypeSuffix createArgumentTypeSuffix();

	/**
	 * Returns a new object of class '<em>Argument Type Prefix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument Type Prefix</em>'.
	 * @generated
	 */
	ArgumentTypePrefix createArgumentTypePrefix();

	/**
	 * Returns a new object of class '<em>Import Construct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Construct</em>'.
	 * @generated
	 */
	ImportConstruct createImportConstruct();

	/**
	 * Returns a new object of class '<em>Include Construct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Include Construct</em>'.
	 * @generated
	 */
	IncludeConstruct createIncludeConstruct();

	/**
	 * Returns a new object of class '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement</em>'.
	 * @generated
	 */
	Statement createStatement();

	/**
	 * Returns a new object of class '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term</em>'.
	 * @generated
	 */
	Term createTerm();

	/**
	 * Returns a new object of class '<em>Term Sum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Sum</em>'.
	 * @generated
	 */
	TermSum createTermSum();

	/**
	 * Returns a new object of class '<em>Term Const</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Const</em>'.
	 * @generated
	 */
	TermConst createTermConst();

	/**
	 * Returns a new object of class '<em>Term Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Null</em>'.
	 * @generated
	 */
	TermNull createTermNull();

	/**
	 * Returns a new object of class '<em>Term Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Variable</em>'.
	 * @generated
	 */
	TermVariable createTermVariable();

	/**
	 * Returns a new object of class '<em>Term Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Operation</em>'.
	 * @generated
	 */
	TermOperation createTermOperation();

	/**
	 * Returns a new object of class '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return</em>'.
	 * @generated
	 */
	Return createReturn();

	/**
	 * Returns a new object of class '<em>Match Consctruct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match Consctruct</em>'.
	 * @generated
	 */
	MatchConsctruct createMatchConsctruct();

	/**
	 * Returns a new object of class '<em>Match Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match Pattern</em>'.
	 * @generated
	 */
	MatchPattern createMatchPattern();

	/**
	 * Returns a new object of class '<em>Argument Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument Match</em>'.
	 * @generated
	 */
	ArgumentMatch createArgumentMatch();

	/**
	 * Returns a new object of class '<em>Pattern Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Action</em>'.
	 * @generated
	 */
	PatternAction createPatternAction();

	/**
	 * Returns a new object of class '<em>Constraint Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Pattern</em>'.
	 * @generated
	 */
	ConstraintPattern createConstraintPattern();

	/**
	 * Returns a new object of class '<em>Constraint Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Action</em>'.
	 * @generated
	 */
	ConstraintAction createConstraintAction();

	/**
	 * Returns a new object of class '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern</em>'.
	 * @generated
	 */
	Pattern createPattern();

	/**
	 * Returns a new object of class '<em>Named Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Pattern</em>'.
	 * @generated
	 */
	NamedPattern createNamedPattern();

	/**
	 * Returns a new object of class '<em>Anti Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anti Pattern</em>'.
	 * @generated
	 */
	AntiPattern createAntiPattern();

	/**
	 * Returns a new object of class '<em>Plain Pattern Const</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Pattern Const</em>'.
	 * @generated
	 */
	PlainPatternConst createPlainPatternConst();

	/**
	 * Returns a new object of class '<em>Plain Pattern Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Pattern Variable</em>'.
	 * @generated
	 */
	PlainPatternVariable createPlainPatternVariable();

	/**
	 * Returns a new object of class '<em>Joker Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joker Pattern</em>'.
	 * @generated
	 */
	JokerPattern createJokerPattern();

	/**
	 * Returns a new object of class '<em>Plain Pattern Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Pattern Operation</em>'.
	 * @generated
	 */
	PlainPatternOperation createPlainPatternOperation();

	/**
	 * Returns a new object of class '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List</em>'.
	 * @generated
	 */
	List createList();

	/**
	 * Returns a new object of class '<em>Operation List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation List</em>'.
	 * @generated
	 */
	OperationList createOperationList();

	/**
	 * Returns a new object of class '<em>Explicit Term List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explicit Term List</em>'.
	 * @generated
	 */
	ExplicitTermList createExplicitTermList();

	/**
	 * Returns a new object of class '<em>Plain Pattern Variable List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Pattern Variable List</em>'.
	 * @generated
	 */
	PlainPatternVariableList createPlainPatternVariableList();

	/**
	 * Returns a new object of class '<em>Any Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Pattern</em>'.
	 * @generated
	 */
	AnyPattern createAnyPattern();

	/**
	 * Returns a new object of class '<em>Implicit Pair List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implicit Pair List</em>'.
	 * @generated
	 */
	ImplicitPairList createImplicitPairList();

	/**
	 * Returns a new object of class '<em>Pair Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pair Pattern</em>'.
	 * @generated
	 */
	PairPattern createPairPattern();

	/**
	 * Returns a new object of class '<em>Strategy Construct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strategy Construct</em>'.
	 * @generated
	 */
	StrategyConstruct createStrategyConstruct();

	/**
	 * Returns a new object of class '<em>Strategy Visit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strategy Visit</em>'.
	 * @generated
	 */
	StrategyVisit createStrategyVisit();

	/**
	 * Returns a new object of class '<em>Visit Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visit Action</em>'.
	 * @generated
	 */
	VisitAction createVisitAction();

	/**
	 * Returns a new object of class '<em>Pattern List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern List</em>'.
	 * @generated
	 */
	PatternList createPatternList();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Constraint Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Or</em>'.
	 * @generated
	 */
	ConstraintOr createConstraintOr();

	/**
	 * Returns a new object of class '<em>Constraint And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint And</em>'.
	 * @generated
	 */
	ConstraintAnd createConstraintAnd();

	/**
	 * Returns a new object of class '<em>Constraint P</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint P</em>'.
	 * @generated
	 */
	ConstraintP createConstraintP();

	/**
	 * Returns a new object of class '<em>Constraint Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Match</em>'.
	 * @generated
	 */
	ConstraintMatch createConstraintMatch();

	/**
	 * Returns a new object of class '<em>Constraint Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Op</em>'.
	 * @generated
	 */
	ConstraintOp createConstraintOp();

	/**
	 * Returns a new object of class '<em>Gom Construct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gom Construct</em>'.
	 * @generated
	 */
	GomConstruct createGomConstruct();

	/**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
	Definition createDefinition();

	/**
	 * Returns a new object of class '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Definition</em>'.
	 * @generated
	 */
	TypeDefinition createTypeDefinition();

	/**
	 * Returns a new object of class '<em>Operator Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operator Definition</em>'.
	 * @generated
	 */
	OperatorDefinition createOperatorDefinition();

	/**
	 * Returns a new object of class '<em>Arguments List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arguments List</em>'.
	 * @generated
	 */
	ArgumentsList createArgumentsList();

	/**
	 * Returns a new object of class '<em>Hook Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook Definition</em>'.
	 * @generated
	 */
	HookDefinition createHookDefinition();

	/**
	 * Returns a new object of class '<em>Hook Module Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook Module Definition</em>'.
	 * @generated
	 */
	HookModuleDefinition createHookModuleDefinition();

	/**
	 * Returns a new object of class '<em>Hook Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook Type Definition</em>'.
	 * @generated
	 */
	HookTypeDefinition createHookTypeDefinition();

	/**
	 * Returns a new object of class '<em>Hook Operator Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook Operator Definition</em>'.
	 * @generated
	 */
	HookOperatorDefinition createHookOperatorDefinition();

	/**
	 * Returns a new object of class '<em>Hook Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook Operation</em>'.
	 * @generated
	 */
	HookOperation createHookOperation();

	/**
	 * Returns a new object of class '<em>Host Hook Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Hook Operation</em>'.
	 * @generated
	 */
	HostHookOperation createHostHookOperation();

	/**
	 * Returns a new object of class '<em>Hook Rules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook Rules</em>'.
	 * @generated
	 */
	Hook_Rules createHook_Rules();

	/**
	 * Returns a new object of class '<em>Hook Graphrules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook Graphrules</em>'.
	 * @generated
	 */
	Hook_Graphrules createHook_Graphrules();

	/**
	 * Returns a new object of class '<em>Hook Make</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook Make</em>'.
	 * @generated
	 */
	Hook_Make createHook_Make();

	/**
	 * Returns a new object of class '<em>Hook Make Insert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook Make Insert</em>'.
	 * @generated
	 */
	Hook_Make_Insert createHook_Make_Insert();

	/**
	 * Returns a new object of class '<em>Hook Make Empty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook Make Empty</em>'.
	 * @generated
	 */
	Hook_Make_Empty createHook_Make_Empty();

	/**
	 * Returns a new object of class '<em>Hook Free</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook Free</em>'.
	 * @generated
	 */
	Hook_Free createHook_Free();

	/**
	 * Returns a new object of class '<em>Hook FL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook FL</em>'.
	 * @generated
	 */
	Hook_FL createHook_FL();

	/**
	 * Returns a new object of class '<em>Hook AU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook AU</em>'.
	 * @generated
	 */
	Hook_AU createHook_AU();

	/**
	 * Returns a new object of class '<em>Hook Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook Interface</em>'.
	 * @generated
	 */
	Hook_Interface createHook_Interface();

	/**
	 * Returns a new object of class '<em>Hook Imports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook Imports</em>'.
	 * @generated
	 */
	Hook_Imports createHook_Imports();

	/**
	 * Returns a new object of class '<em>Hook Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook Block</em>'.
	 * @generated
	 */
	Hook_Block createHook_Block();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Rule Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Pattern</em>'.
	 * @generated
	 */
	RulePattern createRulePattern();

	/**
	 * Returns a new object of class '<em>Named Rule Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Rule Pattern</em>'.
	 * @generated
	 */
	NamedRulePattern createNamedRulePattern();

	/**
	 * Returns a new object of class '<em>Anti Rule Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anti Rule Pattern</em>'.
	 * @generated
	 */
	AntiRulePattern createAntiRulePattern();

	/**
	 * Returns a new object of class '<em>Plain Rule Pattern Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Rule Pattern Operation</em>'.
	 * @generated
	 */
	PlainRulePatternOperation createPlainRulePatternOperation();

	/**
	 * Returns a new object of class '<em>Graph Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph Rule</em>'.
	 * @generated
	 */
	GraphRule createGraphRule();

	/**
	 * Returns a new object of class '<em>Term Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Graph</em>'.
	 * @generated
	 */
	TermGraph createTermGraph();

	/**
	 * Returns a new object of class '<em>Plain Term Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Term Graph</em>'.
	 * @generated
	 */
	PlainTermGraph createPlainTermGraph();

	/**
	 * Returns a new object of class '<em>Term Graph Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Graph Variable</em>'.
	 * @generated
	 */
	TermGraphVariable createTermGraphVariable();

	/**
	 * Returns a new object of class '<em>Term Graph Func</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Graph Func</em>'.
	 * @generated
	 */
	TermGraphFunc createTermGraphFunc();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Condition Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Or</em>'.
	 * @generated
	 */
	ConditionOr createConditionOr();

	/**
	 * Returns a new object of class '<em>Condition And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition And</em>'.
	 * @generated
	 */
	ConditionAnd createConditionAnd();

	/**
	 * Returns a new object of class '<em>Condition P</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition P</em>'.
	 * @generated
	 */
	ConditionP createConditionP();

	/**
	 * Returns a new object of class '<em>Condition Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Rule</em>'.
	 * @generated
	 */
	ConditionRule createConditionRule();

	/**
	 * Returns a new object of class '<em>Condition Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Op</em>'.
	 * @generated
	 */
	ConditionOp createConditionOp();

	/**
	 * Returns a new object of class '<em>XML Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Term</em>'.
	 * @generated
	 */
	XMLTerm createXMLTerm();

	/**
	 * Returns a new object of class '<em>XML Term Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Term Simple</em>'.
	 * @generated
	 */
	XMLTermSimple createXMLTermSimple();

	/**
	 * Returns a new object of class '<em>XML Term Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Term Double</em>'.
	 * @generated
	 */
	XMLTermDouble createXMLTermDouble();

	/**
	 * Returns a new object of class '<em>XML Term Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Term Text</em>'.
	 * @generated
	 */
	XMLTermText createXMLTermText();

	/**
	 * Returns a new object of class '<em>XML Term Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Term Comment</em>'.
	 * @generated
	 */
	XMLTermComment createXMLTermComment();

	/**
	 * Returns a new object of class '<em>XML Term Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Term Process</em>'.
	 * @generated
	 */
	XMLTermProcess createXMLTermProcess();

	/**
	 * Returns a new object of class '<em>XML Name List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Name List</em>'.
	 * @generated
	 */
	XMLNameList createXMLNameList();

	/**
	 * Returns a new object of class '<em>XML Attr List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Attr List</em>'.
	 * @generated
	 */
	XMLAttrList createXMLAttrList();

	/**
	 * Returns a new object of class '<em>XML Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Attribute</em>'.
	 * @generated
	 */
	XMLAttribute createXMLAttribute();

	/**
	 * Returns a new object of class '<em>XML Attribute1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Attribute1</em>'.
	 * @generated
	 */
	XMLAttribute1 createXMLAttribute1();

	/**
	 * Returns a new object of class '<em>XML Attribute2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Attribute2</em>'.
	 * @generated
	 */
	XMLAttribute2 createXMLAttribute2();

	/**
	 * Returns a new object of class '<em>XML Attribute3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Attribute3</em>'.
	 * @generated
	 */
	XMLAttribute3 createXMLAttribute3();

	/**
	 * Returns a new object of class '<em>XML Childs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Childs</em>'.
	 * @generated
	 */
	XMLChilds createXMLChilds();

	/**
	 * Returns a new object of class '<em>Type Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Term</em>'.
	 * @generated
	 */
	TypeTerm createTypeTerm();

	/**
	 * Returns a new object of class '<em>Key Word</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Word</em>'.
	 * @generated
	 */
	KeyWord createKeyWord();

	/**
	 * Returns a new object of class '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operator</em>'.
	 * @generated
	 */
	Operator createOperator();

	/**
	 * Returns a new object of class '<em>Operator List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operator List</em>'.
	 * @generated
	 */
	OperatorList createOperatorList();

	/**
	 * Returns a new object of class '<em>Operator Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operator Array</em>'.
	 * @generated
	 */
	OperatorArray createOperatorArray();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	Transformation createTransformation();

	/**
	 * Returns a new object of class '<em>Elementary Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elementary Transformation</em>'.
	 * @generated
	 */
	ElementaryTransformation createElementaryTransformation();

	/**
	 * Returns a new object of class '<em>Elementary Transformation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elementary Transformation Rule</em>'.
	 * @generated
	 */
	ElementaryTransformationRule createElementaryTransformationRule();

	/**
	 * Returns a new object of class '<em>Tracelink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tracelink</em>'.
	 * @generated
	 */
	Tracelink createTracelink();

	/**
	 * Returns a new object of class '<em>Resolve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolve</em>'.
	 * @generated
	 */
	Resolve createResolve();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TomPackage getTomPackage();

} //TomFactory
