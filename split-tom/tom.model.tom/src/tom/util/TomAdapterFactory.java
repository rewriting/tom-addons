/**
 */
package tom.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tom.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tom.TomPackage
 * @generated
 */
public class TomAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TomPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TomAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TomPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TomSwitch<Adapter> modelSwitch =
		new TomSwitch<Adapter>() {
			@Override
			public Adapter caseHostCode(HostCode object) {
				return createHostCodeAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseCall(Call object) {
				return createCallAdapter();
			}
			@Override
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseAffectation(Affectation object) {
				return createAffectationAdapter();
			}
			@Override
			public Adapter caseTom(Tom object) {
				return createTomAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseLinkable(Linkable object) {
				return createLinkableAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseGlobalVariable(GlobalVariable object) {
				return createGlobalVariableAdapter();
			}
			@Override
			public Adapter caseLocalVariable(LocalVariable object) {
				return createLocalVariableAdapter();
			}
			@Override
			public Adapter caseVariableSimple(VariableSimple object) {
				return createVariableSimpleAdapter();
			}
			@Override
			public Adapter caseVariableList(VariableList object) {
				return createVariableListAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseCallback(Callback object) {
				return createCallbackAdapter();
			}
			@Override
			public Adapter caseCallbackDefinition(CallbackDefinition object) {
				return createCallbackDefinitionAdapter();
			}
			@Override
			public Adapter caseArguments(Arguments object) {
				return createArgumentsAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object) {
				return createArgumentAdapter();
			}
			@Override
			public Adapter caseArgumentTypeSuffix(ArgumentTypeSuffix object) {
				return createArgumentTypeSuffixAdapter();
			}
			@Override
			public Adapter caseArgumentTypePrefix(ArgumentTypePrefix object) {
				return createArgumentTypePrefixAdapter();
			}
			@Override
			public Adapter caseImportConstruct(ImportConstruct object) {
				return createImportConstructAdapter();
			}
			@Override
			public Adapter caseIncludeConstruct(IncludeConstruct object) {
				return createIncludeConstructAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
			}
			@Override
			public Adapter caseTermSum(TermSum object) {
				return createTermSumAdapter();
			}
			@Override
			public Adapter caseTermConst(TermConst object) {
				return createTermConstAdapter();
			}
			@Override
			public Adapter caseTermNull(TermNull object) {
				return createTermNullAdapter();
			}
			@Override
			public Adapter caseTermVariable(TermVariable object) {
				return createTermVariableAdapter();
			}
			@Override
			public Adapter caseTermOperation(TermOperation object) {
				return createTermOperationAdapter();
			}
			@Override
			public Adapter caseReturn(Return object) {
				return createReturnAdapter();
			}
			@Override
			public Adapter caseMatchConsctruct(MatchConsctruct object) {
				return createMatchConsctructAdapter();
			}
			@Override
			public Adapter caseMatchPattern(MatchPattern object) {
				return createMatchPatternAdapter();
			}
			@Override
			public Adapter caseArgumentMatch(ArgumentMatch object) {
				return createArgumentMatchAdapter();
			}
			@Override
			public Adapter casePatternAction(PatternAction object) {
				return createPatternActionAdapter();
			}
			@Override
			public Adapter caseConstraintPattern(ConstraintPattern object) {
				return createConstraintPatternAdapter();
			}
			@Override
			public Adapter caseConstraintAction(ConstraintAction object) {
				return createConstraintActionAdapter();
			}
			@Override
			public Adapter casePattern(Pattern object) {
				return createPatternAdapter();
			}
			@Override
			public Adapter caseNamedPattern(NamedPattern object) {
				return createNamedPatternAdapter();
			}
			@Override
			public Adapter caseAntiPattern(AntiPattern object) {
				return createAntiPatternAdapter();
			}
			@Override
			public Adapter casePlainPatternConst(PlainPatternConst object) {
				return createPlainPatternConstAdapter();
			}
			@Override
			public Adapter casePlainPatternVariable(PlainPatternVariable object) {
				return createPlainPatternVariableAdapter();
			}
			@Override
			public Adapter caseJokerPattern(JokerPattern object) {
				return createJokerPatternAdapter();
			}
			@Override
			public Adapter casePlainPatternOperation(PlainPatternOperation object) {
				return createPlainPatternOperationAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter caseOperationList(OperationList object) {
				return createOperationListAdapter();
			}
			@Override
			public Adapter caseExplicitTermList(ExplicitTermList object) {
				return createExplicitTermListAdapter();
			}
			@Override
			public Adapter casePlainPatternVariableList(PlainPatternVariableList object) {
				return createPlainPatternVariableListAdapter();
			}
			@Override
			public Adapter caseAnyPattern(AnyPattern object) {
				return createAnyPatternAdapter();
			}
			@Override
			public Adapter caseImplicitPairList(ImplicitPairList object) {
				return createImplicitPairListAdapter();
			}
			@Override
			public Adapter casePairPattern(PairPattern object) {
				return createPairPatternAdapter();
			}
			@Override
			public Adapter caseStrategyConstruct(StrategyConstruct object) {
				return createStrategyConstructAdapter();
			}
			@Override
			public Adapter caseStrategyVisit(StrategyVisit object) {
				return createStrategyVisitAdapter();
			}
			@Override
			public Adapter caseVisitAction(VisitAction object) {
				return createVisitActionAdapter();
			}
			@Override
			public Adapter casePatternList(PatternList object) {
				return createPatternListAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseConstraintOr(ConstraintOr object) {
				return createConstraintOrAdapter();
			}
			@Override
			public Adapter caseConstraintAnd(ConstraintAnd object) {
				return createConstraintAndAdapter();
			}
			@Override
			public Adapter caseConstraintP(ConstraintP object) {
				return createConstraintPAdapter();
			}
			@Override
			public Adapter caseConstraintMatch(ConstraintMatch object) {
				return createConstraintMatchAdapter();
			}
			@Override
			public Adapter caseConstraintOp(ConstraintOp object) {
				return createConstraintOpAdapter();
			}
			@Override
			public Adapter caseGomConstruct(GomConstruct object) {
				return createGomConstructAdapter();
			}
			@Override
			public Adapter caseDefinition(Definition object) {
				return createDefinitionAdapter();
			}
			@Override
			public Adapter caseTypeDefinition(TypeDefinition object) {
				return createTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseOperatorDefinition(OperatorDefinition object) {
				return createOperatorDefinitionAdapter();
			}
			@Override
			public Adapter caseArgumentsList(ArgumentsList object) {
				return createArgumentsListAdapter();
			}
			@Override
			public Adapter caseHookDefinition(HookDefinition object) {
				return createHookDefinitionAdapter();
			}
			@Override
			public Adapter caseHookModuleDefinition(HookModuleDefinition object) {
				return createHookModuleDefinitionAdapter();
			}
			@Override
			public Adapter caseHookTypeDefinition(HookTypeDefinition object) {
				return createHookTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseHookOperatorDefinition(HookOperatorDefinition object) {
				return createHookOperatorDefinitionAdapter();
			}
			@Override
			public Adapter caseHookOperation(HookOperation object) {
				return createHookOperationAdapter();
			}
			@Override
			public Adapter caseHostHookOperation(HostHookOperation object) {
				return createHostHookOperationAdapter();
			}
			@Override
			public Adapter caseHook_Rules(Hook_Rules object) {
				return createHook_RulesAdapter();
			}
			@Override
			public Adapter caseHook_Graphrules(Hook_Graphrules object) {
				return createHook_GraphrulesAdapter();
			}
			@Override
			public Adapter caseHook_Make(Hook_Make object) {
				return createHook_MakeAdapter();
			}
			@Override
			public Adapter caseHook_Make_Insert(Hook_Make_Insert object) {
				return createHook_Make_InsertAdapter();
			}
			@Override
			public Adapter caseHook_Make_Empty(Hook_Make_Empty object) {
				return createHook_Make_EmptyAdapter();
			}
			@Override
			public Adapter caseHook_Free(Hook_Free object) {
				return createHook_FreeAdapter();
			}
			@Override
			public Adapter caseHook_FL(Hook_FL object) {
				return createHook_FLAdapter();
			}
			@Override
			public Adapter caseHook_AU(Hook_AU object) {
				return createHook_AUAdapter();
			}
			@Override
			public Adapter caseHook_Interface(Hook_Interface object) {
				return createHook_InterfaceAdapter();
			}
			@Override
			public Adapter caseHook_Imports(Hook_Imports object) {
				return createHook_ImportsAdapter();
			}
			@Override
			public Adapter caseHook_Block(Hook_Block object) {
				return createHook_BlockAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseRulePattern(RulePattern object) {
				return createRulePatternAdapter();
			}
			@Override
			public Adapter caseNamedRulePattern(NamedRulePattern object) {
				return createNamedRulePatternAdapter();
			}
			@Override
			public Adapter caseAntiRulePattern(AntiRulePattern object) {
				return createAntiRulePatternAdapter();
			}
			@Override
			public Adapter casePlainRulePatternOperation(PlainRulePatternOperation object) {
				return createPlainRulePatternOperationAdapter();
			}
			@Override
			public Adapter caseGraphRule(GraphRule object) {
				return createGraphRuleAdapter();
			}
			@Override
			public Adapter caseTermGraph(TermGraph object) {
				return createTermGraphAdapter();
			}
			@Override
			public Adapter casePlainTermGraph(PlainTermGraph object) {
				return createPlainTermGraphAdapter();
			}
			@Override
			public Adapter caseTermGraphVariable(TermGraphVariable object) {
				return createTermGraphVariableAdapter();
			}
			@Override
			public Adapter caseTermGraphFunc(TermGraphFunc object) {
				return createTermGraphFuncAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseConditionOr(ConditionOr object) {
				return createConditionOrAdapter();
			}
			@Override
			public Adapter caseConditionAnd(ConditionAnd object) {
				return createConditionAndAdapter();
			}
			@Override
			public Adapter caseConditionP(ConditionP object) {
				return createConditionPAdapter();
			}
			@Override
			public Adapter caseConditionRule(ConditionRule object) {
				return createConditionRuleAdapter();
			}
			@Override
			public Adapter caseConditionOp(ConditionOp object) {
				return createConditionOpAdapter();
			}
			@Override
			public Adapter caseXMLTerm(XMLTerm object) {
				return createXMLTermAdapter();
			}
			@Override
			public Adapter caseXMLTermSimple(XMLTermSimple object) {
				return createXMLTermSimpleAdapter();
			}
			@Override
			public Adapter caseXMLTermDouble(XMLTermDouble object) {
				return createXMLTermDoubleAdapter();
			}
			@Override
			public Adapter caseXMLTermText(XMLTermText object) {
				return createXMLTermTextAdapter();
			}
			@Override
			public Adapter caseXMLTermComment(XMLTermComment object) {
				return createXMLTermCommentAdapter();
			}
			@Override
			public Adapter caseXMLTermProcess(XMLTermProcess object) {
				return createXMLTermProcessAdapter();
			}
			@Override
			public Adapter caseXMLNameList(XMLNameList object) {
				return createXMLNameListAdapter();
			}
			@Override
			public Adapter caseXMLAttrList(XMLAttrList object) {
				return createXMLAttrListAdapter();
			}
			@Override
			public Adapter caseXMLAttribute(XMLAttribute object) {
				return createXMLAttributeAdapter();
			}
			@Override
			public Adapter caseXMLAttribute1(XMLAttribute1 object) {
				return createXMLAttribute1Adapter();
			}
			@Override
			public Adapter caseXMLAttribute2(XMLAttribute2 object) {
				return createXMLAttribute2Adapter();
			}
			@Override
			public Adapter caseXMLAttribute3(XMLAttribute3 object) {
				return createXMLAttribute3Adapter();
			}
			@Override
			public Adapter caseXMLChilds(XMLChilds object) {
				return createXMLChildsAdapter();
			}
			@Override
			public Adapter caseTypeTerm(TypeTerm object) {
				return createTypeTermAdapter();
			}
			@Override
			public Adapter caseKeyWord(KeyWord object) {
				return createKeyWordAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseOperatorList(OperatorList object) {
				return createOperatorListAdapter();
			}
			@Override
			public Adapter caseOperatorArray(OperatorArray object) {
				return createOperatorArrayAdapter();
			}
			@Override
			public Adapter caseTransformation(Transformation object) {
				return createTransformationAdapter();
			}
			@Override
			public Adapter caseElementaryTransformation(ElementaryTransformation object) {
				return createElementaryTransformationAdapter();
			}
			@Override
			public Adapter caseElementaryTransformationRule(ElementaryTransformationRule object) {
				return createElementaryTransformationRuleAdapter();
			}
			@Override
			public Adapter caseTracelink(Tracelink object) {
				return createTracelinkAdapter();
			}
			@Override
			public Adapter caseResolve(Resolve object) {
				return createResolveAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tom.HostCode <em>Host Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.HostCode
	 * @generated
	 */
	public Adapter createHostCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Call
	 * @generated
	 */
	public Adapter createCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Affectation <em>Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Affectation
	 * @generated
	 */
	public Adapter createAffectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Tom <em>Tom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Tom
	 * @generated
	 */
	public Adapter createTomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Linkable <em>Linkable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Linkable
	 * @generated
	 */
	public Adapter createLinkableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.GlobalVariable
	 * @generated
	 */
	public Adapter createGlobalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.LocalVariable
	 * @generated
	 */
	public Adapter createLocalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.VariableSimple <em>Variable Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.VariableSimple
	 * @generated
	 */
	public Adapter createVariableSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.VariableList <em>Variable List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.VariableList
	 * @generated
	 */
	public Adapter createVariableListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Callback <em>Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Callback
	 * @generated
	 */
	public Adapter createCallbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.CallbackDefinition <em>Callback Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.CallbackDefinition
	 * @generated
	 */
	public Adapter createCallbackDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Arguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Arguments
	 * @generated
	 */
	public Adapter createArgumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ArgumentTypeSuffix <em>Argument Type Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ArgumentTypeSuffix
	 * @generated
	 */
	public Adapter createArgumentTypeSuffixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ArgumentTypePrefix <em>Argument Type Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ArgumentTypePrefix
	 * @generated
	 */
	public Adapter createArgumentTypePrefixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ImportConstruct <em>Import Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ImportConstruct
	 * @generated
	 */
	public Adapter createImportConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.IncludeConstruct <em>Include Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.IncludeConstruct
	 * @generated
	 */
	public Adapter createIncludeConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.TermSum <em>Term Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.TermSum
	 * @generated
	 */
	public Adapter createTermSumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.TermConst <em>Term Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.TermConst
	 * @generated
	 */
	public Adapter createTermConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.TermNull <em>Term Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.TermNull
	 * @generated
	 */
	public Adapter createTermNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.TermVariable <em>Term Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.TermVariable
	 * @generated
	 */
	public Adapter createTermVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.TermOperation <em>Term Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.TermOperation
	 * @generated
	 */
	public Adapter createTermOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Return
	 * @generated
	 */
	public Adapter createReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.MatchConsctruct <em>Match Consctruct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.MatchConsctruct
	 * @generated
	 */
	public Adapter createMatchConsctructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.MatchPattern <em>Match Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.MatchPattern
	 * @generated
	 */
	public Adapter createMatchPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ArgumentMatch <em>Argument Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ArgumentMatch
	 * @generated
	 */
	public Adapter createArgumentMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.PatternAction <em>Pattern Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.PatternAction
	 * @generated
	 */
	public Adapter createPatternActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ConstraintPattern <em>Constraint Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ConstraintPattern
	 * @generated
	 */
	public Adapter createConstraintPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ConstraintAction <em>Constraint Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ConstraintAction
	 * @generated
	 */
	public Adapter createConstraintActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Pattern
	 * @generated
	 */
	public Adapter createPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.NamedPattern <em>Named Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.NamedPattern
	 * @generated
	 */
	public Adapter createNamedPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.AntiPattern <em>Anti Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.AntiPattern
	 * @generated
	 */
	public Adapter createAntiPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.PlainPatternConst <em>Plain Pattern Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.PlainPatternConst
	 * @generated
	 */
	public Adapter createPlainPatternConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.PlainPatternVariable <em>Plain Pattern Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.PlainPatternVariable
	 * @generated
	 */
	public Adapter createPlainPatternVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.JokerPattern <em>Joker Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.JokerPattern
	 * @generated
	 */
	public Adapter createJokerPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.PlainPatternOperation <em>Plain Pattern Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.PlainPatternOperation
	 * @generated
	 */
	public Adapter createPlainPatternOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.OperationList <em>Operation List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.OperationList
	 * @generated
	 */
	public Adapter createOperationListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ExplicitTermList <em>Explicit Term List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ExplicitTermList
	 * @generated
	 */
	public Adapter createExplicitTermListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.PlainPatternVariableList <em>Plain Pattern Variable List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.PlainPatternVariableList
	 * @generated
	 */
	public Adapter createPlainPatternVariableListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.AnyPattern <em>Any Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.AnyPattern
	 * @generated
	 */
	public Adapter createAnyPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ImplicitPairList <em>Implicit Pair List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ImplicitPairList
	 * @generated
	 */
	public Adapter createImplicitPairListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.PairPattern <em>Pair Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.PairPattern
	 * @generated
	 */
	public Adapter createPairPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.StrategyConstruct <em>Strategy Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.StrategyConstruct
	 * @generated
	 */
	public Adapter createStrategyConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.StrategyVisit <em>Strategy Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.StrategyVisit
	 * @generated
	 */
	public Adapter createStrategyVisitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.VisitAction <em>Visit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.VisitAction
	 * @generated
	 */
	public Adapter createVisitActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.PatternList <em>Pattern List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.PatternList
	 * @generated
	 */
	public Adapter createPatternListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ConstraintOr <em>Constraint Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ConstraintOr
	 * @generated
	 */
	public Adapter createConstraintOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ConstraintAnd <em>Constraint And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ConstraintAnd
	 * @generated
	 */
	public Adapter createConstraintAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ConstraintP <em>Constraint P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ConstraintP
	 * @generated
	 */
	public Adapter createConstraintPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ConstraintMatch <em>Constraint Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ConstraintMatch
	 * @generated
	 */
	public Adapter createConstraintMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ConstraintOp <em>Constraint Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ConstraintOp
	 * @generated
	 */
	public Adapter createConstraintOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.GomConstruct <em>Gom Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.GomConstruct
	 * @generated
	 */
	public Adapter createGomConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.TypeDefinition
	 * @generated
	 */
	public Adapter createTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.OperatorDefinition <em>Operator Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.OperatorDefinition
	 * @generated
	 */
	public Adapter createOperatorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ArgumentsList <em>Arguments List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ArgumentsList
	 * @generated
	 */
	public Adapter createArgumentsListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.HookDefinition <em>Hook Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.HookDefinition
	 * @generated
	 */
	public Adapter createHookDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.HookModuleDefinition <em>Hook Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.HookModuleDefinition
	 * @generated
	 */
	public Adapter createHookModuleDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.HookTypeDefinition <em>Hook Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.HookTypeDefinition
	 * @generated
	 */
	public Adapter createHookTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.HookOperatorDefinition <em>Hook Operator Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.HookOperatorDefinition
	 * @generated
	 */
	public Adapter createHookOperatorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.HookOperation <em>Hook Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.HookOperation
	 * @generated
	 */
	public Adapter createHookOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.HostHookOperation <em>Host Hook Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.HostHookOperation
	 * @generated
	 */
	public Adapter createHostHookOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Hook_Rules <em>Hook Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Hook_Rules
	 * @generated
	 */
	public Adapter createHook_RulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Hook_Graphrules <em>Hook Graphrules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Hook_Graphrules
	 * @generated
	 */
	public Adapter createHook_GraphrulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Hook_Make <em>Hook Make</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Hook_Make
	 * @generated
	 */
	public Adapter createHook_MakeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Hook_Make_Insert <em>Hook Make Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Hook_Make_Insert
	 * @generated
	 */
	public Adapter createHook_Make_InsertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Hook_Make_Empty <em>Hook Make Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Hook_Make_Empty
	 * @generated
	 */
	public Adapter createHook_Make_EmptyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Hook_Free <em>Hook Free</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Hook_Free
	 * @generated
	 */
	public Adapter createHook_FreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Hook_FL <em>Hook FL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Hook_FL
	 * @generated
	 */
	public Adapter createHook_FLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Hook_AU <em>Hook AU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Hook_AU
	 * @generated
	 */
	public Adapter createHook_AUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Hook_Interface <em>Hook Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Hook_Interface
	 * @generated
	 */
	public Adapter createHook_InterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Hook_Imports <em>Hook Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Hook_Imports
	 * @generated
	 */
	public Adapter createHook_ImportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Hook_Block <em>Hook Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Hook_Block
	 * @generated
	 */
	public Adapter createHook_BlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.RulePattern <em>Rule Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.RulePattern
	 * @generated
	 */
	public Adapter createRulePatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.NamedRulePattern <em>Named Rule Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.NamedRulePattern
	 * @generated
	 */
	public Adapter createNamedRulePatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.AntiRulePattern <em>Anti Rule Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.AntiRulePattern
	 * @generated
	 */
	public Adapter createAntiRulePatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.PlainRulePatternOperation <em>Plain Rule Pattern Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.PlainRulePatternOperation
	 * @generated
	 */
	public Adapter createPlainRulePatternOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.GraphRule <em>Graph Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.GraphRule
	 * @generated
	 */
	public Adapter createGraphRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.TermGraph <em>Term Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.TermGraph
	 * @generated
	 */
	public Adapter createTermGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.PlainTermGraph <em>Plain Term Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.PlainTermGraph
	 * @generated
	 */
	public Adapter createPlainTermGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.TermGraphVariable <em>Term Graph Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.TermGraphVariable
	 * @generated
	 */
	public Adapter createTermGraphVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.TermGraphFunc <em>Term Graph Func</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.TermGraphFunc
	 * @generated
	 */
	public Adapter createTermGraphFuncAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ConditionOr <em>Condition Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ConditionOr
	 * @generated
	 */
	public Adapter createConditionOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ConditionAnd <em>Condition And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ConditionAnd
	 * @generated
	 */
	public Adapter createConditionAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ConditionP <em>Condition P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ConditionP
	 * @generated
	 */
	public Adapter createConditionPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ConditionRule <em>Condition Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ConditionRule
	 * @generated
	 */
	public Adapter createConditionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ConditionOp <em>Condition Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ConditionOp
	 * @generated
	 */
	public Adapter createConditionOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.XMLTerm <em>XML Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.XMLTerm
	 * @generated
	 */
	public Adapter createXMLTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.XMLTermSimple <em>XML Term Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.XMLTermSimple
	 * @generated
	 */
	public Adapter createXMLTermSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.XMLTermDouble <em>XML Term Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.XMLTermDouble
	 * @generated
	 */
	public Adapter createXMLTermDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.XMLTermText <em>XML Term Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.XMLTermText
	 * @generated
	 */
	public Adapter createXMLTermTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.XMLTermComment <em>XML Term Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.XMLTermComment
	 * @generated
	 */
	public Adapter createXMLTermCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.XMLTermProcess <em>XML Term Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.XMLTermProcess
	 * @generated
	 */
	public Adapter createXMLTermProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.XMLNameList <em>XML Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.XMLNameList
	 * @generated
	 */
	public Adapter createXMLNameListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.XMLAttrList <em>XML Attr List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.XMLAttrList
	 * @generated
	 */
	public Adapter createXMLAttrListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.XMLAttribute <em>XML Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.XMLAttribute
	 * @generated
	 */
	public Adapter createXMLAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.XMLAttribute1 <em>XML Attribute1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.XMLAttribute1
	 * @generated
	 */
	public Adapter createXMLAttribute1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.XMLAttribute2 <em>XML Attribute2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.XMLAttribute2
	 * @generated
	 */
	public Adapter createXMLAttribute2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.XMLAttribute3 <em>XML Attribute3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.XMLAttribute3
	 * @generated
	 */
	public Adapter createXMLAttribute3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.XMLChilds <em>XML Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.XMLChilds
	 * @generated
	 */
	public Adapter createXMLChildsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.TypeTerm <em>Type Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.TypeTerm
	 * @generated
	 */
	public Adapter createTypeTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.KeyWord <em>Key Word</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.KeyWord
	 * @generated
	 */
	public Adapter createKeyWordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.OperatorList <em>Operator List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.OperatorList
	 * @generated
	 */
	public Adapter createOperatorListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.OperatorArray <em>Operator Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.OperatorArray
	 * @generated
	 */
	public Adapter createOperatorArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ElementaryTransformation <em>Elementary Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ElementaryTransformation
	 * @generated
	 */
	public Adapter createElementaryTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.ElementaryTransformationRule <em>Elementary Transformation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.ElementaryTransformationRule
	 * @generated
	 */
	public Adapter createElementaryTransformationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Tracelink <em>Tracelink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Tracelink
	 * @generated
	 */
	public Adapter createTracelinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tom.Resolve <em>Resolve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tom.Resolve
	 * @generated
	 */
	public Adapter createResolveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TomAdapterFactory
