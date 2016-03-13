/**
 */
package tom.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tom.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TomFactoryImpl extends EFactoryImpl implements TomFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TomFactory init() {
		try {
			TomFactory theTomFactory = (TomFactory)EPackage.Registry.INSTANCE.getEFactory(TomPackage.eNS_URI);
			if (theTomFactory != null) {
				return theTomFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TomFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TomFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TomPackage.HOST_CODE: return createHostCode();
			case TomPackage.EXPRESSION: return createExpression();
			case TomPackage.CALL: return createCall();
			case TomPackage.DECLARATION: return createDeclaration();
			case TomPackage.AFFECTATION: return createAffectation();
			case TomPackage.TOM: return createTom();
			case TomPackage.CONTEXT: return createContext();
			case TomPackage.LINKABLE: return createLinkable();
			case TomPackage.TYPE: return createType();
			case TomPackage.OPERATION: return createOperation();
			case TomPackage.VARIABLE: return createVariable();
			case TomPackage.GLOBAL_VARIABLE: return createGlobalVariable();
			case TomPackage.LOCAL_VARIABLE: return createLocalVariable();
			case TomPackage.VARIABLE_SIMPLE: return createVariableSimple();
			case TomPackage.VARIABLE_LIST: return createVariableList();
			case TomPackage.BLOCK: return createBlock();
			case TomPackage.FUNCTION: return createFunction();
			case TomPackage.CALLBACK: return createCallback();
			case TomPackage.CALLBACK_DEFINITION: return createCallbackDefinition();
			case TomPackage.ARGUMENTS: return createArguments();
			case TomPackage.ARGUMENT: return createArgument();
			case TomPackage.ARGUMENT_TYPE_SUFFIX: return createArgumentTypeSuffix();
			case TomPackage.ARGUMENT_TYPE_PREFIX: return createArgumentTypePrefix();
			case TomPackage.IMPORT_CONSTRUCT: return createImportConstruct();
			case TomPackage.INCLUDE_CONSTRUCT: return createIncludeConstruct();
			case TomPackage.STATEMENT: return createStatement();
			case TomPackage.TERM: return createTerm();
			case TomPackage.TERM_SUM: return createTermSum();
			case TomPackage.TERM_CONST: return createTermConst();
			case TomPackage.TERM_NULL: return createTermNull();
			case TomPackage.TERM_VARIABLE: return createTermVariable();
			case TomPackage.TERM_OPERATION: return createTermOperation();
			case TomPackage.RETURN: return createReturn();
			case TomPackage.MATCH_CONSCTRUCT: return createMatchConsctruct();
			case TomPackage.MATCH_PATTERN: return createMatchPattern();
			case TomPackage.ARGUMENT_MATCH: return createArgumentMatch();
			case TomPackage.PATTERN_ACTION: return createPatternAction();
			case TomPackage.CONSTRAINT_PATTERN: return createConstraintPattern();
			case TomPackage.CONSTRAINT_ACTION: return createConstraintAction();
			case TomPackage.PATTERN: return createPattern();
			case TomPackage.NAMED_PATTERN: return createNamedPattern();
			case TomPackage.ANTI_PATTERN: return createAntiPattern();
			case TomPackage.PLAIN_PATTERN_CONST: return createPlainPatternConst();
			case TomPackage.PLAIN_PATTERN_VARIABLE: return createPlainPatternVariable();
			case TomPackage.JOKER_PATTERN: return createJokerPattern();
			case TomPackage.PLAIN_PATTERN_OPERATION: return createPlainPatternOperation();
			case TomPackage.LIST: return createList();
			case TomPackage.OPERATION_LIST: return createOperationList();
			case TomPackage.EXPLICIT_TERM_LIST: return createExplicitTermList();
			case TomPackage.PLAIN_PATTERN_VARIABLE_LIST: return createPlainPatternVariableList();
			case TomPackage.ANY_PATTERN: return createAnyPattern();
			case TomPackage.IMPLICIT_PAIR_LIST: return createImplicitPairList();
			case TomPackage.PAIR_PATTERN: return createPairPattern();
			case TomPackage.STRATEGY_CONSTRUCT: return createStrategyConstruct();
			case TomPackage.STRATEGY_VISIT: return createStrategyVisit();
			case TomPackage.VISIT_ACTION: return createVisitAction();
			case TomPackage.PATTERN_LIST: return createPatternList();
			case TomPackage.CONSTRAINT: return createConstraint();
			case TomPackage.CONSTRAINT_OR: return createConstraintOr();
			case TomPackage.CONSTRAINT_AND: return createConstraintAnd();
			case TomPackage.CONSTRAINT_P: return createConstraintP();
			case TomPackage.CONSTRAINT_MATCH: return createConstraintMatch();
			case TomPackage.CONSTRAINT_OP: return createConstraintOp();
			case TomPackage.GOM_CONSTRUCT: return createGomConstruct();
			case TomPackage.DEFINITION: return createDefinition();
			case TomPackage.TYPE_DEFINITION: return createTypeDefinition();
			case TomPackage.OPERATOR_DEFINITION: return createOperatorDefinition();
			case TomPackage.ARGUMENTS_LIST: return createArgumentsList();
			case TomPackage.HOOK_DEFINITION: return createHookDefinition();
			case TomPackage.HOOK_MODULE_DEFINITION: return createHookModuleDefinition();
			case TomPackage.HOOK_TYPE_DEFINITION: return createHookTypeDefinition();
			case TomPackage.HOOK_OPERATOR_DEFINITION: return createHookOperatorDefinition();
			case TomPackage.HOOK_OPERATION: return createHookOperation();
			case TomPackage.HOST_HOOK_OPERATION: return createHostHookOperation();
			case TomPackage.HOOK_RULES: return createHook_Rules();
			case TomPackage.HOOK_GRAPHRULES: return createHook_Graphrules();
			case TomPackage.HOOK_MAKE: return createHook_Make();
			case TomPackage.HOOK_MAKE_INSERT: return createHook_Make_Insert();
			case TomPackage.HOOK_MAKE_EMPTY: return createHook_Make_Empty();
			case TomPackage.HOOK_FREE: return createHook_Free();
			case TomPackage.HOOK_FL: return createHook_FL();
			case TomPackage.HOOK_AU: return createHook_AU();
			case TomPackage.HOOK_INTERFACE: return createHook_Interface();
			case TomPackage.HOOK_IMPORTS: return createHook_Imports();
			case TomPackage.HOOK_BLOCK: return createHook_Block();
			case TomPackage.RULE: return createRule();
			case TomPackage.RULE_PATTERN: return createRulePattern();
			case TomPackage.NAMED_RULE_PATTERN: return createNamedRulePattern();
			case TomPackage.ANTI_RULE_PATTERN: return createAntiRulePattern();
			case TomPackage.PLAIN_RULE_PATTERN_OPERATION: return createPlainRulePatternOperation();
			case TomPackage.GRAPH_RULE: return createGraphRule();
			case TomPackage.TERM_GRAPH: return createTermGraph();
			case TomPackage.PLAIN_TERM_GRAPH: return createPlainTermGraph();
			case TomPackage.TERM_GRAPH_VARIABLE: return createTermGraphVariable();
			case TomPackage.TERM_GRAPH_FUNC: return createTermGraphFunc();
			case TomPackage.CONDITION: return createCondition();
			case TomPackage.CONDITION_OR: return createConditionOr();
			case TomPackage.CONDITION_AND: return createConditionAnd();
			case TomPackage.CONDITION_P: return createConditionP();
			case TomPackage.CONDITION_RULE: return createConditionRule();
			case TomPackage.CONDITION_OP: return createConditionOp();
			case TomPackage.XML_TERM: return createXMLTerm();
			case TomPackage.XML_TERM_SIMPLE: return createXMLTermSimple();
			case TomPackage.XML_TERM_DOUBLE: return createXMLTermDouble();
			case TomPackage.XML_TERM_TEXT: return createXMLTermText();
			case TomPackage.XML_TERM_COMMENT: return createXMLTermComment();
			case TomPackage.XML_TERM_PROCESS: return createXMLTermProcess();
			case TomPackage.XML_NAME_LIST: return createXMLNameList();
			case TomPackage.XML_ATTR_LIST: return createXMLAttrList();
			case TomPackage.XML_ATTRIBUTE: return createXMLAttribute();
			case TomPackage.XML_ATTRIBUTE1: return createXMLAttribute1();
			case TomPackage.XML_ATTRIBUTE2: return createXMLAttribute2();
			case TomPackage.XML_ATTRIBUTE3: return createXMLAttribute3();
			case TomPackage.XML_CHILDS: return createXMLChilds();
			case TomPackage.TYPE_TERM: return createTypeTerm();
			case TomPackage.KEY_WORD: return createKeyWord();
			case TomPackage.OPERATOR: return createOperator();
			case TomPackage.OPERATOR_LIST: return createOperatorList();
			case TomPackage.OPERATOR_ARRAY: return createOperatorArray();
			case TomPackage.TRANSFORMATION: return createTransformation();
			case TomPackage.ELEMENTARY_TRANSFORMATION: return createElementaryTransformation();
			case TomPackage.ELEMENTARY_TRANSFORMATION_RULE: return createElementaryTransformationRule();
			case TomPackage.TRACELINK: return createTracelink();
			case TomPackage.RESOLVE: return createResolve();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TomPackage.REL_OPERATOR:
				return createRelOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TomPackage.REL_OPERATOR:
				return convertRelOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostCode createHostCode() {
		HostCodeImpl hostCode = new HostCodeImpl();
		return hostCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call createCall() {
		CallImpl call = new CallImpl();
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declaration createDeclaration() {
		DeclarationImpl declaration = new DeclarationImpl();
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Affectation createAffectation() {
		AffectationImpl affectation = new AffectationImpl();
		return affectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tom createTom() {
		TomImpl tom = new TomImpl();
		return tom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linkable createLinkable() {
		LinkableImpl linkable = new LinkableImpl();
		return linkable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable createGlobalVariable() {
		GlobalVariableImpl globalVariable = new GlobalVariableImpl();
		return globalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable createLocalVariable() {
		LocalVariableImpl localVariable = new LocalVariableImpl();
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableSimple createVariableSimple() {
		VariableSimpleImpl variableSimple = new VariableSimpleImpl();
		return variableSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableList createVariableList() {
		VariableListImpl variableList = new VariableListImpl();
		return variableList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Callback createCallback() {
		CallbackImpl callback = new CallbackImpl();
		return callback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallbackDefinition createCallbackDefinition() {
		CallbackDefinitionImpl callbackDefinition = new CallbackDefinitionImpl();
		return callbackDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arguments createArguments() {
		ArgumentsImpl arguments = new ArgumentsImpl();
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentTypeSuffix createArgumentTypeSuffix() {
		ArgumentTypeSuffixImpl argumentTypeSuffix = new ArgumentTypeSuffixImpl();
		return argumentTypeSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentTypePrefix createArgumentTypePrefix() {
		ArgumentTypePrefixImpl argumentTypePrefix = new ArgumentTypePrefixImpl();
		return argumentTypePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportConstruct createImportConstruct() {
		ImportConstructImpl importConstruct = new ImportConstructImpl();
		return importConstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeConstruct createIncludeConstruct() {
		IncludeConstructImpl includeConstruct = new IncludeConstructImpl();
		return includeConstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term createTerm() {
		TermImpl term = new TermImpl();
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermSum createTermSum() {
		TermSumImpl termSum = new TermSumImpl();
		return termSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermConst createTermConst() {
		TermConstImpl termConst = new TermConstImpl();
		return termConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermNull createTermNull() {
		TermNullImpl termNull = new TermNullImpl();
		return termNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermVariable createTermVariable() {
		TermVariableImpl termVariable = new TermVariableImpl();
		return termVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermOperation createTermOperation() {
		TermOperationImpl termOperation = new TermOperationImpl();
		return termOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchConsctruct createMatchConsctruct() {
		MatchConsctructImpl matchConsctruct = new MatchConsctructImpl();
		return matchConsctruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchPattern createMatchPattern() {
		MatchPatternImpl matchPattern = new MatchPatternImpl();
		return matchPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentMatch createArgumentMatch() {
		ArgumentMatchImpl argumentMatch = new ArgumentMatchImpl();
		return argumentMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternAction createPatternAction() {
		PatternActionImpl patternAction = new PatternActionImpl();
		return patternAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintPattern createConstraintPattern() {
		ConstraintPatternImpl constraintPattern = new ConstraintPatternImpl();
		return constraintPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintAction createConstraintAction() {
		ConstraintActionImpl constraintAction = new ConstraintActionImpl();
		return constraintAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPattern() {
		PatternImpl pattern = new PatternImpl();
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedPattern createNamedPattern() {
		NamedPatternImpl namedPattern = new NamedPatternImpl();
		return namedPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntiPattern createAntiPattern() {
		AntiPatternImpl antiPattern = new AntiPatternImpl();
		return antiPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainPatternConst createPlainPatternConst() {
		PlainPatternConstImpl plainPatternConst = new PlainPatternConstImpl();
		return plainPatternConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainPatternVariable createPlainPatternVariable() {
		PlainPatternVariableImpl plainPatternVariable = new PlainPatternVariableImpl();
		return plainPatternVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JokerPattern createJokerPattern() {
		JokerPatternImpl jokerPattern = new JokerPatternImpl();
		return jokerPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainPatternOperation createPlainPatternOperation() {
		PlainPatternOperationImpl plainPatternOperation = new PlainPatternOperationImpl();
		return plainPatternOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationList createOperationList() {
		OperationListImpl operationList = new OperationListImpl();
		return operationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplicitTermList createExplicitTermList() {
		ExplicitTermListImpl explicitTermList = new ExplicitTermListImpl();
		return explicitTermList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainPatternVariableList createPlainPatternVariableList() {
		PlainPatternVariableListImpl plainPatternVariableList = new PlainPatternVariableListImpl();
		return plainPatternVariableList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyPattern createAnyPattern() {
		AnyPatternImpl anyPattern = new AnyPatternImpl();
		return anyPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitPairList createImplicitPairList() {
		ImplicitPairListImpl implicitPairList = new ImplicitPairListImpl();
		return implicitPairList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PairPattern createPairPattern() {
		PairPatternImpl pairPattern = new PairPatternImpl();
		return pairPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyConstruct createStrategyConstruct() {
		StrategyConstructImpl strategyConstruct = new StrategyConstructImpl();
		return strategyConstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyVisit createStrategyVisit() {
		StrategyVisitImpl strategyVisit = new StrategyVisitImpl();
		return strategyVisit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisitAction createVisitAction() {
		VisitActionImpl visitAction = new VisitActionImpl();
		return visitAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternList createPatternList() {
		PatternListImpl patternList = new PatternListImpl();
		return patternList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintOr createConstraintOr() {
		ConstraintOrImpl constraintOr = new ConstraintOrImpl();
		return constraintOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintAnd createConstraintAnd() {
		ConstraintAndImpl constraintAnd = new ConstraintAndImpl();
		return constraintAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintP createConstraintP() {
		ConstraintPImpl constraintP = new ConstraintPImpl();
		return constraintP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintMatch createConstraintMatch() {
		ConstraintMatchImpl constraintMatch = new ConstraintMatchImpl();
		return constraintMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintOp createConstraintOp() {
		ConstraintOpImpl constraintOp = new ConstraintOpImpl();
		return constraintOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GomConstruct createGomConstruct() {
		GomConstructImpl gomConstruct = new GomConstructImpl();
		return gomConstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition createTypeDefinition() {
		TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorDefinition createOperatorDefinition() {
		OperatorDefinitionImpl operatorDefinition = new OperatorDefinitionImpl();
		return operatorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentsList createArgumentsList() {
		ArgumentsListImpl argumentsList = new ArgumentsListImpl();
		return argumentsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HookDefinition createHookDefinition() {
		HookDefinitionImpl hookDefinition = new HookDefinitionImpl();
		return hookDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HookModuleDefinition createHookModuleDefinition() {
		HookModuleDefinitionImpl hookModuleDefinition = new HookModuleDefinitionImpl();
		return hookModuleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HookTypeDefinition createHookTypeDefinition() {
		HookTypeDefinitionImpl hookTypeDefinition = new HookTypeDefinitionImpl();
		return hookTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HookOperatorDefinition createHookOperatorDefinition() {
		HookOperatorDefinitionImpl hookOperatorDefinition = new HookOperatorDefinitionImpl();
		return hookOperatorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HookOperation createHookOperation() {
		HookOperationImpl hookOperation = new HookOperationImpl();
		return hookOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostHookOperation createHostHookOperation() {
		HostHookOperationImpl hostHookOperation = new HostHookOperationImpl();
		return hostHookOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hook_Rules createHook_Rules() {
		Hook_RulesImpl hook_Rules = new Hook_RulesImpl();
		return hook_Rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hook_Graphrules createHook_Graphrules() {
		Hook_GraphrulesImpl hook_Graphrules = new Hook_GraphrulesImpl();
		return hook_Graphrules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hook_Make createHook_Make() {
		Hook_MakeImpl hook_Make = new Hook_MakeImpl();
		return hook_Make;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hook_Make_Insert createHook_Make_Insert() {
		Hook_Make_InsertImpl hook_Make_Insert = new Hook_Make_InsertImpl();
		return hook_Make_Insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hook_Make_Empty createHook_Make_Empty() {
		Hook_Make_EmptyImpl hook_Make_Empty = new Hook_Make_EmptyImpl();
		return hook_Make_Empty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hook_Free createHook_Free() {
		Hook_FreeImpl hook_Free = new Hook_FreeImpl();
		return hook_Free;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hook_FL createHook_FL() {
		Hook_FLImpl hook_FL = new Hook_FLImpl();
		return hook_FL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hook_AU createHook_AU() {
		Hook_AUImpl hook_AU = new Hook_AUImpl();
		return hook_AU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hook_Interface createHook_Interface() {
		Hook_InterfaceImpl hook_Interface = new Hook_InterfaceImpl();
		return hook_Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hook_Imports createHook_Imports() {
		Hook_ImportsImpl hook_Imports = new Hook_ImportsImpl();
		return hook_Imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hook_Block createHook_Block() {
		Hook_BlockImpl hook_Block = new Hook_BlockImpl();
		return hook_Block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulePattern createRulePattern() {
		RulePatternImpl rulePattern = new RulePatternImpl();
		return rulePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedRulePattern createNamedRulePattern() {
		NamedRulePatternImpl namedRulePattern = new NamedRulePatternImpl();
		return namedRulePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntiRulePattern createAntiRulePattern() {
		AntiRulePatternImpl antiRulePattern = new AntiRulePatternImpl();
		return antiRulePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainRulePatternOperation createPlainRulePatternOperation() {
		PlainRulePatternOperationImpl plainRulePatternOperation = new PlainRulePatternOperationImpl();
		return plainRulePatternOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphRule createGraphRule() {
		GraphRuleImpl graphRule = new GraphRuleImpl();
		return graphRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermGraph createTermGraph() {
		TermGraphImpl termGraph = new TermGraphImpl();
		return termGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainTermGraph createPlainTermGraph() {
		PlainTermGraphImpl plainTermGraph = new PlainTermGraphImpl();
		return plainTermGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermGraphVariable createTermGraphVariable() {
		TermGraphVariableImpl termGraphVariable = new TermGraphVariableImpl();
		return termGraphVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermGraphFunc createTermGraphFunc() {
		TermGraphFuncImpl termGraphFunc = new TermGraphFuncImpl();
		return termGraphFunc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionOr createConditionOr() {
		ConditionOrImpl conditionOr = new ConditionOrImpl();
		return conditionOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionAnd createConditionAnd() {
		ConditionAndImpl conditionAnd = new ConditionAndImpl();
		return conditionAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionP createConditionP() {
		ConditionPImpl conditionP = new ConditionPImpl();
		return conditionP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionRule createConditionRule() {
		ConditionRuleImpl conditionRule = new ConditionRuleImpl();
		return conditionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionOp createConditionOp() {
		ConditionOpImpl conditionOp = new ConditionOpImpl();
		return conditionOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLTerm createXMLTerm() {
		XMLTermImpl xmlTerm = new XMLTermImpl();
		return xmlTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLTermSimple createXMLTermSimple() {
		XMLTermSimpleImpl xmlTermSimple = new XMLTermSimpleImpl();
		return xmlTermSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLTermDouble createXMLTermDouble() {
		XMLTermDoubleImpl xmlTermDouble = new XMLTermDoubleImpl();
		return xmlTermDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLTermText createXMLTermText() {
		XMLTermTextImpl xmlTermText = new XMLTermTextImpl();
		return xmlTermText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLTermComment createXMLTermComment() {
		XMLTermCommentImpl xmlTermComment = new XMLTermCommentImpl();
		return xmlTermComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLTermProcess createXMLTermProcess() {
		XMLTermProcessImpl xmlTermProcess = new XMLTermProcessImpl();
		return xmlTermProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLNameList createXMLNameList() {
		XMLNameListImpl xmlNameList = new XMLNameListImpl();
		return xmlNameList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLAttrList createXMLAttrList() {
		XMLAttrListImpl xmlAttrList = new XMLAttrListImpl();
		return xmlAttrList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLAttribute createXMLAttribute() {
		XMLAttributeImpl xmlAttribute = new XMLAttributeImpl();
		return xmlAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLAttribute1 createXMLAttribute1() {
		XMLAttribute1Impl xmlAttribute1 = new XMLAttribute1Impl();
		return xmlAttribute1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLAttribute2 createXMLAttribute2() {
		XMLAttribute2Impl xmlAttribute2 = new XMLAttribute2Impl();
		return xmlAttribute2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLAttribute3 createXMLAttribute3() {
		XMLAttribute3Impl xmlAttribute3 = new XMLAttribute3Impl();
		return xmlAttribute3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLChilds createXMLChilds() {
		XMLChildsImpl xmlChilds = new XMLChildsImpl();
		return xmlChilds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTerm createTypeTerm() {
		TypeTermImpl typeTerm = new TypeTermImpl();
		return typeTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyWord createKeyWord() {
		KeyWordImpl keyWord = new KeyWordImpl();
		return keyWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperator() {
		OperatorImpl operator = new OperatorImpl();
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorList createOperatorList() {
		OperatorListImpl operatorList = new OperatorListImpl();
		return operatorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorArray createOperatorArray() {
		OperatorArrayImpl operatorArray = new OperatorArrayImpl();
		return operatorArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryTransformation createElementaryTransformation() {
		ElementaryTransformationImpl elementaryTransformation = new ElementaryTransformationImpl();
		return elementaryTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryTransformationRule createElementaryTransformationRule() {
		ElementaryTransformationRuleImpl elementaryTransformationRule = new ElementaryTransformationRuleImpl();
		return elementaryTransformationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tracelink createTracelink() {
		TracelinkImpl tracelink = new TracelinkImpl();
		return tracelink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resolve createResolve() {
		ResolveImpl resolve = new ResolveImpl();
		return resolve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelOperator createRelOperatorFromString(EDataType eDataType, String initialValue) {
		RelOperator result = RelOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TomPackage getTomPackage() {
		return (TomPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TomPackage getPackage() {
		return TomPackage.eINSTANCE;
	}

} //TomFactoryImpl
