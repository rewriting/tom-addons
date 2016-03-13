/**
 */
package tom.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tom.Affectation;
import tom.AntiPattern;
import tom.AntiRulePattern;
import tom.AnyPattern;
import tom.Argument;
import tom.ArgumentMatch;
import tom.ArgumentTypePrefix;
import tom.ArgumentTypeSuffix;
import tom.Arguments;
import tom.ArgumentsList;
import tom.Block;
import tom.Call;
import tom.Callback;
import tom.CallbackDefinition;
import tom.Condition;
import tom.ConditionAnd;
import tom.ConditionOp;
import tom.ConditionOr;
import tom.ConditionP;
import tom.ConditionRule;
import tom.Constraint;
import tom.ConstraintAction;
import tom.ConstraintAnd;
import tom.ConstraintMatch;
import tom.ConstraintOp;
import tom.ConstraintOr;
import tom.ConstraintP;
import tom.ConstraintPattern;
import tom.Context;
import tom.Declaration;
import tom.Definition;
import tom.ElementaryTransformation;
import tom.ElementaryTransformationRule;
import tom.ExplicitTermList;
import tom.Expression;
import tom.Function;
import tom.GlobalVariable;
import tom.GomConstruct;
import tom.GraphRule;
import tom.HookDefinition;
import tom.HookModuleDefinition;
import tom.HookOperation;
import tom.HookOperatorDefinition;
import tom.HookTypeDefinition;
import tom.Hook_AU;
import tom.Hook_Block;
import tom.Hook_FL;
import tom.Hook_Free;
import tom.Hook_Graphrules;
import tom.Hook_Imports;
import tom.Hook_Interface;
import tom.Hook_Make;
import tom.Hook_Make_Empty;
import tom.Hook_Make_Insert;
import tom.Hook_Rules;
import tom.HostCode;
import tom.HostHookOperation;
import tom.ImplicitPairList;
import tom.ImportConstruct;
import tom.IncludeConstruct;
import tom.JokerPattern;
import tom.KeyWord;
import tom.Linkable;
import tom.List;
import tom.LocalVariable;
import tom.MatchConsctruct;
import tom.MatchPattern;
import tom.NamedPattern;
import tom.NamedRulePattern;
import tom.Operation;
import tom.OperationList;
import tom.Operator;
import tom.OperatorArray;
import tom.OperatorDefinition;
import tom.OperatorList;
import tom.PairPattern;
import tom.Pattern;
import tom.PatternAction;
import tom.PatternList;
import tom.PlainPatternConst;
import tom.PlainPatternOperation;
import tom.PlainPatternVariable;
import tom.PlainPatternVariableList;
import tom.PlainRulePatternOperation;
import tom.PlainTermGraph;
import tom.RelOperator;
import tom.Resolve;
import tom.Return;
import tom.Rule;
import tom.RulePattern;
import tom.Statement;
import tom.StrategyConstruct;
import tom.StrategyVisit;
import tom.Term;
import tom.TermConst;
import tom.TermGraph;
import tom.TermGraphFunc;
import tom.TermGraphVariable;
import tom.TermNull;
import tom.TermOperation;
import tom.TermSum;
import tom.TermVariable;
import tom.Tom;
import tom.TomFactory;
import tom.TomPackage;
import tom.Tracelink;
import tom.Transformation;
import tom.Type;
import tom.TypeDefinition;
import tom.TypeTerm;
import tom.Variable;
import tom.VariableList;
import tom.VariableSimple;
import tom.VisitAction;
import tom.XMLAttrList;
import tom.XMLAttribute;
import tom.XMLAttribute1;
import tom.XMLAttribute2;
import tom.XMLAttribute3;
import tom.XMLChilds;
import tom.XMLNameList;
import tom.XMLTerm;
import tom.XMLTermComment;
import tom.XMLTermDouble;
import tom.XMLTermProcess;
import tom.XMLTermSimple;
import tom.XMLTermText;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TomPackageImpl extends EPackageImpl implements TomPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affectationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callbackDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentTypeSuffixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentTypePrefixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termSumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termConstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchConsctructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentMatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antiPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainPatternConstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainPatternVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jokerPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainPatternOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explicitTermListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainPatternVariableListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicitPairListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pairPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyVisitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visitActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintMatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gomConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentsListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hookDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hookModuleDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hookTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hookOperatorDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hookOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostHookOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hook_RulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hook_GraphrulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hook_MakeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hook_Make_InsertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hook_Make_EmptyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hook_FreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hook_FLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hook_AUEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hook_InterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hook_ImportsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hook_BlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rulePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedRulePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antiRulePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainRulePatternOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainTermGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termGraphVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termGraphFuncEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTermSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTermDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTermTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTermCommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTermProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlNameListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlAttrListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlAttribute1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlAttribute2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlAttribute3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlChildsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyWordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementaryTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementaryTransformationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracelinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tom.TomPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TomPackageImpl() {
		super(eNS_URI, TomFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TomPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TomPackage init() {
		if (isInited) return (TomPackage)EPackage.Registry.INSTANCE.getEPackage(TomPackage.eNS_URI);

		// Obtain or create and register package
		TomPackageImpl theTomPackage = (TomPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TomPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TomPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTomPackage.createPackageContents();

		// Initialize created meta-data
		theTomPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTomPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TomPackage.eNS_URI, theTomPackage);
		return theTomPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostCode() {
		return hostCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostCode_Code() {
		return (EAttribute)hostCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCall() {
		return callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCall_Call() {
		return (EReference)callEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaration() {
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_Value() {
		return (EReference)declarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffectation() {
		return affectationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAffectation_Variable() {
		return (EReference)affectationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAffectation_Value() {
		return (EReference)affectationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTom() {
		return tomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTom_Namespace() {
		return (EAttribute)tomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTom_Blocs() {
		return (EReference)tomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkable() {
		return linkableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkable_Name() {
		return (EAttribute)linkableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Extend() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Type() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Args() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Type() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVariable() {
		return globalVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalVariable() {
		return localVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableSimple() {
		return variableSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableList() {
		return variableListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Statements() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallback() {
		return callbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallback_Operations() {
		return (EReference)callbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallbackDefinition() {
		return callbackDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArguments() {
		return argumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArguments_Args() {
		return (EReference)argumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentTypeSuffix() {
		return argumentTypeSuffixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentTypePrefix() {
		return argumentTypePrefixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportConstruct() {
		return importConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportConstruct_Type() {
		return (EReference)importConstructEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludeConstruct() {
		return includeConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludeConstruct_ImportURI() {
		return (EAttribute)includeConstructEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludeConstruct_Ext() {
		return (EAttribute)includeConstructEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermSum() {
		return termSumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermSum_Left() {
		return (EReference)termSumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermSum_Right() {
		return (EReference)termSumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermConst() {
		return termConstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermConst_String() {
		return (EAttribute)termConstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermConst_Int() {
		return (EAttribute)termConstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermNull() {
		return termNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermVariable() {
		return termVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermVariable_Var() {
		return (EReference)termVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermOperation() {
		return termOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermOperation_Op() {
		return (EReference)termOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermOperation_Terms() {
		return (EReference)termOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturn() {
		return returnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturn_Return() {
		return (EReference)returnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchConsctruct() {
		return matchConsctructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchPattern() {
		return matchPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchPattern_Args() {
		return (EReference)matchPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchPattern_PatternActions() {
		return (EReference)matchPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentMatch() {
		return argumentMatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentMatch_Type() {
		return (EReference)argumentMatchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentMatch_Var() {
		return (EReference)argumentMatchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternAction() {
		return patternActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternAction_Patterns() {
		return (EReference)patternActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternAction_Statements() {
		return (EReference)patternActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintPattern() {
		return constraintPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintPattern_ConstraintActions() {
		return (EReference)constraintPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintAction() {
		return constraintActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintAction_Constraint() {
		return (EReference)constraintActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintAction_Statements() {
		return (EReference)constraintActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedPattern() {
		return namedPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedPattern_PlainPattern() {
		return (EReference)namedPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAntiPattern() {
		return antiPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAntiPattern_Pattern() {
		return (EReference)antiPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainPatternConst() {
		return plainPatternConstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainPatternConst_Head() {
		return (EAttribute)plainPatternConstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainPatternVariable() {
		return plainPatternVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJokerPattern() {
		return jokerPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainPatternOperation() {
		return plainPatternOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlainPatternOperation_Heads() {
		return (EReference)plainPatternOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlainPatternOperation_List() {
		return (EReference)plainPatternOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationList() {
		return operationListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationList_Heads() {
		return (EReference)operationListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationList_Log() {
		return (EAttribute)operationListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplicitTermList() {
		return explicitTermListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplicitTermList_Patterns() {
		return (EReference)explicitTermListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainPatternVariableList() {
		return plainPatternVariableListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyPattern() {
		return anyPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicitPairList() {
		return implicitPairListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicitPairList_Patterns() {
		return (EReference)implicitPairListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPairPattern() {
		return pairPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPairPattern_Pattern() {
		return (EReference)pairPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategyConstruct() {
		return strategyConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategyConstruct_Implement() {
		return (EReference)strategyConstructEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategyConstruct_Args() {
		return (EReference)strategyConstructEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategyConstruct_Visitlist() {
		return (EReference)strategyConstructEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategyVisit() {
		return strategyVisitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategyVisit_Type() {
		return (EReference)strategyVisitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategyVisit_Actions() {
		return (EReference)strategyVisitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisitAction() {
		return visitActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisitAction_Pattern() {
		return (EReference)visitActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisitAction_Statements() {
		return (EReference)visitActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisitAction_Term() {
		return (EReference)visitActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternList() {
		return patternListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternList_Patterns() {
		return (EReference)patternListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternList_Rel() {
		return (EAttribute)patternListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternList_Constraint() {
		return (EReference)patternListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintOr() {
		return constraintOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintOr_Left() {
		return (EReference)constraintOrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintOr_Right() {
		return (EReference)constraintOrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintAnd() {
		return constraintAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintAnd_Left() {
		return (EReference)constraintAndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintAnd_Right() {
		return (EReference)constraintAndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintP() {
		return constraintPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintP_Constraint() {
		return (EReference)constraintPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintMatch() {
		return constraintMatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintMatch_Pattern() {
		return (EReference)constraintMatchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintMatch_Type() {
		return (EReference)constraintMatchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintMatch_Term() {
		return (EReference)constraintMatchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintOp() {
		return constraintOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintOp_Left() {
		return (EReference)constraintOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintOp_Operator() {
		return (EAttribute)constraintOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintOp_Right() {
		return (EReference)constraintOpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGomConstruct() {
		return gomConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGomConstruct_Option() {
		return (EAttribute)gomConstructEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGomConstruct_Imports() {
		return (EReference)gomConstructEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGomConstruct_Definitions() {
		return (EReference)gomConstructEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinition() {
		return typeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinition_OpDefinition() {
		return (EReference)typeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorDefinition() {
		return operatorDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentsList() {
		return argumentsListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentsList_Type() {
		return (EReference)argumentsListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHookDefinition() {
		return hookDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHookDefinition_HookOperation() {
		return (EReference)hookDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHookModuleDefinition() {
		return hookModuleDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHookModuleDefinition_HookType() {
		return (EReference)hookModuleDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHookTypeDefinition() {
		return hookTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHookTypeDefinition_HookType() {
		return (EReference)hookTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHookOperatorDefinition() {
		return hookOperatorDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHookOperatorDefinition_HookType() {
		return (EReference)hookOperatorDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHookOperation() {
		return hookOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostHookOperation() {
		return hostHookOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostHookOperation_Args() {
		return (EReference)hostHookOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostHookOperation_Statements() {
		return (EReference)hostHookOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHook_Rules() {
		return hook_RulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHook_Rules_Rules() {
		return (EReference)hook_RulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHook_Graphrules() {
		return hook_GraphrulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHook_Graphrules_Mode() {
		return (EAttribute)hook_GraphrulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHook_Graphrules_GraphRules() {
		return (EReference)hook_GraphrulesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHook_Make() {
		return hook_MakeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHook_Make_Insert() {
		return hook_Make_InsertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHook_Make_Empty() {
		return hook_Make_EmptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHook_Free() {
		return hook_FreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHook_FL() {
		return hook_FLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHook_AU() {
		return hook_AUEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHook_AU_Term() {
		return (EReference)hook_AUEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHook_Interface() {
		return hook_InterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHook_Imports() {
		return hook_ImportsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHook_Block() {
		return hook_BlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulePattern() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Term() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Cond() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRulePattern() {
		return rulePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedRulePattern() {
		return namedRulePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedRulePattern_PlainRulePattern() {
		return (EReference)namedRulePatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAntiRulePattern() {
		return antiRulePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAntiRulePattern_Pattern() {
		return (EReference)antiRulePatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainRulePatternOperation() {
		return plainRulePatternOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlainRulePatternOperation_Heads() {
		return (EReference)plainRulePatternOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlainRulePatternOperation_Rules() {
		return (EReference)plainRulePatternOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphRule() {
		return graphRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphRule_Termcond() {
		return (EReference)graphRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphRule_TermGraph() {
		return (EReference)graphRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphRule_Cond() {
		return (EReference)graphRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermGraph() {
		return termGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermGraph_Name() {
		return (EAttribute)termGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermGraph_TermGraph() {
		return (EReference)termGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainTermGraph() {
		return plainTermGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermGraphVariable() {
		return termGraphVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermGraphVariable_Label() {
		return (EAttribute)termGraphVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermGraphFunc() {
		return termGraphFuncEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermGraphFunc_Head() {
		return (EReference)termGraphFuncEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermGraphFunc_Terms() {
		return (EReference)termGraphFuncEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionOr() {
		return conditionOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionOr_Left() {
		return (EReference)conditionOrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionOr_Right() {
		return (EReference)conditionOrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionAnd() {
		return conditionAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionAnd_Left() {
		return (EReference)conditionAndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionAnd_Right() {
		return (EReference)conditionAndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionP() {
		return conditionPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionP_Condition() {
		return (EReference)conditionPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionRule() {
		return conditionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionRule_Rule() {
		return (EReference)conditionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionRule_Term() {
		return (EReference)conditionRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionOp() {
		return conditionOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionOp_Left() {
		return (EReference)conditionOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionOp_Operator() {
		return (EAttribute)conditionOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionOp_Right() {
		return (EReference)conditionOpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLTerm() {
		return xmlTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLTermSimple() {
		return xmlTermSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMLTermSimple_NameList() {
		return (EReference)xmlTermSimpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMLTermSimple_AttrList() {
		return (EReference)xmlTermSimpleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLTermDouble() {
		return xmlTermDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMLTermDouble_NameList() {
		return (EReference)xmlTermDoubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMLTermDouble_AttrList() {
		return (EReference)xmlTermDoubleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMLTermDouble_Childs() {
		return (EReference)xmlTermDoubleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMLTermDouble_List() {
		return (EReference)xmlTermDoubleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLTermText() {
		return xmlTermTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLTermText_Name() {
		return (EAttribute)xmlTermTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLTermComment() {
		return xmlTermCommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLTermComment_Name() {
		return (EAttribute)xmlTermCommentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLTermProcess() {
		return xmlTermProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLTermProcess_Name1() {
		return (EAttribute)xmlTermProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLTermProcess_Name2() {
		return (EAttribute)xmlTermProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLNameList() {
		return xmlNameListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLNameList_XMLName() {
		return (EAttribute)xmlNameListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLAttrList() {
		return xmlAttrListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMLAttrList_Attrs() {
		return (EReference)xmlAttrListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLAttribute() {
		return xmlAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLAttribute1() {
		return xmlAttribute1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLAttribute1_Name() {
		return (EAttribute)xmlAttribute1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLAttribute2() {
		return xmlAttribute2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLAttribute2_AttributeName() {
		return (EAttribute)xmlAttribute2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLAttribute2_AnnotedName() {
		return (EAttribute)xmlAttribute2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLAttribute2_Name() {
		return (EAttribute)xmlAttribute2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLAttribute3() {
		return xmlAttribute3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLAttribute3_AttributeName() {
		return (EAttribute)xmlAttribute3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLAttribute3_AnnotedName() {
		return (EAttribute)xmlAttribute3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLAttribute3_Name() {
		return (EAttribute)xmlAttribute3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLChilds() {
		return xmlChildsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMLChilds_Terms() {
		return (EReference)xmlChildsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeTerm() {
		return typeTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeTerm_Hote() {
		return (EAttribute)typeTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeTerm_Type() {
		return (EReference)typeTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeTerm_Keys() {
		return (EReference)typeTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyWord() {
		return keyWordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyWord_Args() {
		return (EReference)keyWordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyWord_Hote() {
		return (EAttribute)keyWordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_Keys() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorList() {
		return operatorListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorList_Keys() {
		return (EReference)operatorListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorArray() {
		return operatorArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorArray_Keys() {
		return (EReference)operatorArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_FileFrom() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_FileTo() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_ElementaryTranformations() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementaryTransformation() {
		return elementaryTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementaryTransformation_Implement() {
		return (EReference)elementaryTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementaryTransformation_ElementaryTransformationRules() {
		return (EReference)elementaryTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementaryTransformationRule() {
		return elementaryTransformationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementaryTransformationRule_Pattern() {
		return (EReference)elementaryTransformationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementaryTransformationRule_Statements() {
		return (EReference)elementaryTransformationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracelink() {
		return tracelinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracelink_Term() {
		return (EReference)tracelinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolve() {
		return resolveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolve_Source() {
		return (EReference)resolveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolve_Type() {
		return (EReference)resolveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolve_Target() {
		return (EReference)resolveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelOperator() {
		return relOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TomFactory getTomFactory() {
		return (TomFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		hostCodeEClass = createEClass(HOST_CODE);
		createEAttribute(hostCodeEClass, HOST_CODE__CODE);

		expressionEClass = createEClass(EXPRESSION);

		callEClass = createEClass(CALL);
		createEReference(callEClass, CALL__CALL);

		declarationEClass = createEClass(DECLARATION);
		createEReference(declarationEClass, DECLARATION__VALUE);

		affectationEClass = createEClass(AFFECTATION);
		createEReference(affectationEClass, AFFECTATION__VARIABLE);
		createEReference(affectationEClass, AFFECTATION__VALUE);

		tomEClass = createEClass(TOM);
		createEAttribute(tomEClass, TOM__NAMESPACE);
		createEReference(tomEClass, TOM__BLOCS);

		contextEClass = createEClass(CONTEXT);

		linkableEClass = createEClass(LINKABLE);
		createEAttribute(linkableEClass, LINKABLE__NAME);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__EXTEND);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__TYPE);
		createEReference(operationEClass, OPERATION__ARGS);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__TYPE);

		globalVariableEClass = createEClass(GLOBAL_VARIABLE);

		localVariableEClass = createEClass(LOCAL_VARIABLE);

		variableSimpleEClass = createEClass(VARIABLE_SIMPLE);

		variableListEClass = createEClass(VARIABLE_LIST);

		blockEClass = createEClass(BLOCK);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__STATEMENTS);

		callbackEClass = createEClass(CALLBACK);
		createEReference(callbackEClass, CALLBACK__OPERATIONS);

		callbackDefinitionEClass = createEClass(CALLBACK_DEFINITION);

		argumentsEClass = createEClass(ARGUMENTS);
		createEReference(argumentsEClass, ARGUMENTS__ARGS);

		argumentEClass = createEClass(ARGUMENT);

		argumentTypeSuffixEClass = createEClass(ARGUMENT_TYPE_SUFFIX);

		argumentTypePrefixEClass = createEClass(ARGUMENT_TYPE_PREFIX);

		importConstructEClass = createEClass(IMPORT_CONSTRUCT);
		createEReference(importConstructEClass, IMPORT_CONSTRUCT__TYPE);

		includeConstructEClass = createEClass(INCLUDE_CONSTRUCT);
		createEAttribute(includeConstructEClass, INCLUDE_CONSTRUCT__IMPORT_URI);
		createEAttribute(includeConstructEClass, INCLUDE_CONSTRUCT__EXT);

		statementEClass = createEClass(STATEMENT);

		termEClass = createEClass(TERM);

		termSumEClass = createEClass(TERM_SUM);
		createEReference(termSumEClass, TERM_SUM__LEFT);
		createEReference(termSumEClass, TERM_SUM__RIGHT);

		termConstEClass = createEClass(TERM_CONST);
		createEAttribute(termConstEClass, TERM_CONST__STRING);
		createEAttribute(termConstEClass, TERM_CONST__INT);

		termNullEClass = createEClass(TERM_NULL);

		termVariableEClass = createEClass(TERM_VARIABLE);
		createEReference(termVariableEClass, TERM_VARIABLE__VAR);

		termOperationEClass = createEClass(TERM_OPERATION);
		createEReference(termOperationEClass, TERM_OPERATION__OP);
		createEReference(termOperationEClass, TERM_OPERATION__TERMS);

		returnEClass = createEClass(RETURN);
		createEReference(returnEClass, RETURN__RETURN);

		matchConsctructEClass = createEClass(MATCH_CONSCTRUCT);

		matchPatternEClass = createEClass(MATCH_PATTERN);
		createEReference(matchPatternEClass, MATCH_PATTERN__ARGS);
		createEReference(matchPatternEClass, MATCH_PATTERN__PATTERN_ACTIONS);

		argumentMatchEClass = createEClass(ARGUMENT_MATCH);
		createEReference(argumentMatchEClass, ARGUMENT_MATCH__TYPE);
		createEReference(argumentMatchEClass, ARGUMENT_MATCH__VAR);

		patternActionEClass = createEClass(PATTERN_ACTION);
		createEReference(patternActionEClass, PATTERN_ACTION__PATTERNS);
		createEReference(patternActionEClass, PATTERN_ACTION__STATEMENTS);

		constraintPatternEClass = createEClass(CONSTRAINT_PATTERN);
		createEReference(constraintPatternEClass, CONSTRAINT_PATTERN__CONSTRAINT_ACTIONS);

		constraintActionEClass = createEClass(CONSTRAINT_ACTION);
		createEReference(constraintActionEClass, CONSTRAINT_ACTION__CONSTRAINT);
		createEReference(constraintActionEClass, CONSTRAINT_ACTION__STATEMENTS);

		patternEClass = createEClass(PATTERN);

		namedPatternEClass = createEClass(NAMED_PATTERN);
		createEReference(namedPatternEClass, NAMED_PATTERN__PLAIN_PATTERN);

		antiPatternEClass = createEClass(ANTI_PATTERN);
		createEReference(antiPatternEClass, ANTI_PATTERN__PATTERN);

		plainPatternConstEClass = createEClass(PLAIN_PATTERN_CONST);
		createEAttribute(plainPatternConstEClass, PLAIN_PATTERN_CONST__HEAD);

		plainPatternVariableEClass = createEClass(PLAIN_PATTERN_VARIABLE);

		jokerPatternEClass = createEClass(JOKER_PATTERN);

		plainPatternOperationEClass = createEClass(PLAIN_PATTERN_OPERATION);
		createEReference(plainPatternOperationEClass, PLAIN_PATTERN_OPERATION__HEADS);
		createEReference(plainPatternOperationEClass, PLAIN_PATTERN_OPERATION__LIST);

		listEClass = createEClass(LIST);

		operationListEClass = createEClass(OPERATION_LIST);
		createEReference(operationListEClass, OPERATION_LIST__HEADS);
		createEAttribute(operationListEClass, OPERATION_LIST__LOG);

		explicitTermListEClass = createEClass(EXPLICIT_TERM_LIST);
		createEReference(explicitTermListEClass, EXPLICIT_TERM_LIST__PATTERNS);

		plainPatternVariableListEClass = createEClass(PLAIN_PATTERN_VARIABLE_LIST);

		anyPatternEClass = createEClass(ANY_PATTERN);

		implicitPairListEClass = createEClass(IMPLICIT_PAIR_LIST);
		createEReference(implicitPairListEClass, IMPLICIT_PAIR_LIST__PATTERNS);

		pairPatternEClass = createEClass(PAIR_PATTERN);
		createEReference(pairPatternEClass, PAIR_PATTERN__PATTERN);

		strategyConstructEClass = createEClass(STRATEGY_CONSTRUCT);
		createEReference(strategyConstructEClass, STRATEGY_CONSTRUCT__IMPLEMENT);
		createEReference(strategyConstructEClass, STRATEGY_CONSTRUCT__ARGS);
		createEReference(strategyConstructEClass, STRATEGY_CONSTRUCT__VISITLIST);

		strategyVisitEClass = createEClass(STRATEGY_VISIT);
		createEReference(strategyVisitEClass, STRATEGY_VISIT__TYPE);
		createEReference(strategyVisitEClass, STRATEGY_VISIT__ACTIONS);

		visitActionEClass = createEClass(VISIT_ACTION);
		createEReference(visitActionEClass, VISIT_ACTION__PATTERN);
		createEReference(visitActionEClass, VISIT_ACTION__STATEMENTS);
		createEReference(visitActionEClass, VISIT_ACTION__TERM);

		patternListEClass = createEClass(PATTERN_LIST);
		createEReference(patternListEClass, PATTERN_LIST__PATTERNS);
		createEAttribute(patternListEClass, PATTERN_LIST__REL);
		createEReference(patternListEClass, PATTERN_LIST__CONSTRAINT);

		constraintEClass = createEClass(CONSTRAINT);

		constraintOrEClass = createEClass(CONSTRAINT_OR);
		createEReference(constraintOrEClass, CONSTRAINT_OR__LEFT);
		createEReference(constraintOrEClass, CONSTRAINT_OR__RIGHT);

		constraintAndEClass = createEClass(CONSTRAINT_AND);
		createEReference(constraintAndEClass, CONSTRAINT_AND__LEFT);
		createEReference(constraintAndEClass, CONSTRAINT_AND__RIGHT);

		constraintPEClass = createEClass(CONSTRAINT_P);
		createEReference(constraintPEClass, CONSTRAINT_P__CONSTRAINT);

		constraintMatchEClass = createEClass(CONSTRAINT_MATCH);
		createEReference(constraintMatchEClass, CONSTRAINT_MATCH__PATTERN);
		createEReference(constraintMatchEClass, CONSTRAINT_MATCH__TYPE);
		createEReference(constraintMatchEClass, CONSTRAINT_MATCH__TERM);

		constraintOpEClass = createEClass(CONSTRAINT_OP);
		createEReference(constraintOpEClass, CONSTRAINT_OP__LEFT);
		createEAttribute(constraintOpEClass, CONSTRAINT_OP__OPERATOR);
		createEReference(constraintOpEClass, CONSTRAINT_OP__RIGHT);

		gomConstructEClass = createEClass(GOM_CONSTRUCT);
		createEAttribute(gomConstructEClass, GOM_CONSTRUCT__OPTION);
		createEReference(gomConstructEClass, GOM_CONSTRUCT__IMPORTS);
		createEReference(gomConstructEClass, GOM_CONSTRUCT__DEFINITIONS);

		definitionEClass = createEClass(DEFINITION);

		typeDefinitionEClass = createEClass(TYPE_DEFINITION);
		createEReference(typeDefinitionEClass, TYPE_DEFINITION__OP_DEFINITION);

		operatorDefinitionEClass = createEClass(OPERATOR_DEFINITION);

		argumentsListEClass = createEClass(ARGUMENTS_LIST);
		createEReference(argumentsListEClass, ARGUMENTS_LIST__TYPE);

		hookDefinitionEClass = createEClass(HOOK_DEFINITION);
		createEReference(hookDefinitionEClass, HOOK_DEFINITION__HOOK_OPERATION);

		hookModuleDefinitionEClass = createEClass(HOOK_MODULE_DEFINITION);
		createEReference(hookModuleDefinitionEClass, HOOK_MODULE_DEFINITION__HOOK_TYPE);

		hookTypeDefinitionEClass = createEClass(HOOK_TYPE_DEFINITION);
		createEReference(hookTypeDefinitionEClass, HOOK_TYPE_DEFINITION__HOOK_TYPE);

		hookOperatorDefinitionEClass = createEClass(HOOK_OPERATOR_DEFINITION);
		createEReference(hookOperatorDefinitionEClass, HOOK_OPERATOR_DEFINITION__HOOK_TYPE);

		hookOperationEClass = createEClass(HOOK_OPERATION);

		hostHookOperationEClass = createEClass(HOST_HOOK_OPERATION);
		createEReference(hostHookOperationEClass, HOST_HOOK_OPERATION__ARGS);
		createEReference(hostHookOperationEClass, HOST_HOOK_OPERATION__STATEMENTS);

		hook_RulesEClass = createEClass(HOOK_RULES);
		createEReference(hook_RulesEClass, HOOK_RULES__RULES);

		hook_GraphrulesEClass = createEClass(HOOK_GRAPHRULES);
		createEAttribute(hook_GraphrulesEClass, HOOK_GRAPHRULES__MODE);
		createEReference(hook_GraphrulesEClass, HOOK_GRAPHRULES__GRAPH_RULES);

		hook_MakeEClass = createEClass(HOOK_MAKE);

		hook_Make_InsertEClass = createEClass(HOOK_MAKE_INSERT);

		hook_Make_EmptyEClass = createEClass(HOOK_MAKE_EMPTY);

		hook_FreeEClass = createEClass(HOOK_FREE);

		hook_FLEClass = createEClass(HOOK_FL);

		hook_AUEClass = createEClass(HOOK_AU);
		createEReference(hook_AUEClass, HOOK_AU__TERM);

		hook_InterfaceEClass = createEClass(HOOK_INTERFACE);

		hook_ImportsEClass = createEClass(HOOK_IMPORTS);

		hook_BlockEClass = createEClass(HOOK_BLOCK);

		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__RULE_PATTERN);
		createEReference(ruleEClass, RULE__TERM);
		createEReference(ruleEClass, RULE__COND);

		rulePatternEClass = createEClass(RULE_PATTERN);

		namedRulePatternEClass = createEClass(NAMED_RULE_PATTERN);
		createEReference(namedRulePatternEClass, NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN);

		antiRulePatternEClass = createEClass(ANTI_RULE_PATTERN);
		createEReference(antiRulePatternEClass, ANTI_RULE_PATTERN__PATTERN);

		plainRulePatternOperationEClass = createEClass(PLAIN_RULE_PATTERN_OPERATION);
		createEReference(plainRulePatternOperationEClass, PLAIN_RULE_PATTERN_OPERATION__HEADS);
		createEReference(plainRulePatternOperationEClass, PLAIN_RULE_PATTERN_OPERATION__RULES);

		graphRuleEClass = createEClass(GRAPH_RULE);
		createEReference(graphRuleEClass, GRAPH_RULE__TERMCOND);
		createEReference(graphRuleEClass, GRAPH_RULE__TERM_GRAPH);
		createEReference(graphRuleEClass, GRAPH_RULE__COND);

		termGraphEClass = createEClass(TERM_GRAPH);
		createEAttribute(termGraphEClass, TERM_GRAPH__NAME);
		createEReference(termGraphEClass, TERM_GRAPH__TERM_GRAPH);

		plainTermGraphEClass = createEClass(PLAIN_TERM_GRAPH);

		termGraphVariableEClass = createEClass(TERM_GRAPH_VARIABLE);
		createEAttribute(termGraphVariableEClass, TERM_GRAPH_VARIABLE__LABEL);

		termGraphFuncEClass = createEClass(TERM_GRAPH_FUNC);
		createEReference(termGraphFuncEClass, TERM_GRAPH_FUNC__HEAD);
		createEReference(termGraphFuncEClass, TERM_GRAPH_FUNC__TERMS);

		conditionEClass = createEClass(CONDITION);

		conditionOrEClass = createEClass(CONDITION_OR);
		createEReference(conditionOrEClass, CONDITION_OR__LEFT);
		createEReference(conditionOrEClass, CONDITION_OR__RIGHT);

		conditionAndEClass = createEClass(CONDITION_AND);
		createEReference(conditionAndEClass, CONDITION_AND__LEFT);
		createEReference(conditionAndEClass, CONDITION_AND__RIGHT);

		conditionPEClass = createEClass(CONDITION_P);
		createEReference(conditionPEClass, CONDITION_P__CONDITION);

		conditionRuleEClass = createEClass(CONDITION_RULE);
		createEReference(conditionRuleEClass, CONDITION_RULE__RULE);
		createEReference(conditionRuleEClass, CONDITION_RULE__TERM);

		conditionOpEClass = createEClass(CONDITION_OP);
		createEReference(conditionOpEClass, CONDITION_OP__LEFT);
		createEAttribute(conditionOpEClass, CONDITION_OP__OPERATOR);
		createEReference(conditionOpEClass, CONDITION_OP__RIGHT);

		xmlTermEClass = createEClass(XML_TERM);

		xmlTermSimpleEClass = createEClass(XML_TERM_SIMPLE);
		createEReference(xmlTermSimpleEClass, XML_TERM_SIMPLE__NAME_LIST);
		createEReference(xmlTermSimpleEClass, XML_TERM_SIMPLE__ATTR_LIST);

		xmlTermDoubleEClass = createEClass(XML_TERM_DOUBLE);
		createEReference(xmlTermDoubleEClass, XML_TERM_DOUBLE__NAME_LIST);
		createEReference(xmlTermDoubleEClass, XML_TERM_DOUBLE__ATTR_LIST);
		createEReference(xmlTermDoubleEClass, XML_TERM_DOUBLE__CHILDS);
		createEReference(xmlTermDoubleEClass, XML_TERM_DOUBLE__LIST);

		xmlTermTextEClass = createEClass(XML_TERM_TEXT);
		createEAttribute(xmlTermTextEClass, XML_TERM_TEXT__NAME);

		xmlTermCommentEClass = createEClass(XML_TERM_COMMENT);
		createEAttribute(xmlTermCommentEClass, XML_TERM_COMMENT__NAME);

		xmlTermProcessEClass = createEClass(XML_TERM_PROCESS);
		createEAttribute(xmlTermProcessEClass, XML_TERM_PROCESS__NAME1);
		createEAttribute(xmlTermProcessEClass, XML_TERM_PROCESS__NAME2);

		xmlNameListEClass = createEClass(XML_NAME_LIST);
		createEAttribute(xmlNameListEClass, XML_NAME_LIST__XML_NAME);

		xmlAttrListEClass = createEClass(XML_ATTR_LIST);
		createEReference(xmlAttrListEClass, XML_ATTR_LIST__ATTRS);

		xmlAttributeEClass = createEClass(XML_ATTRIBUTE);

		xmlAttribute1EClass = createEClass(XML_ATTRIBUTE1);
		createEAttribute(xmlAttribute1EClass, XML_ATTRIBUTE1__NAME);

		xmlAttribute2EClass = createEClass(XML_ATTRIBUTE2);
		createEAttribute(xmlAttribute2EClass, XML_ATTRIBUTE2__ATTRIBUTE_NAME);
		createEAttribute(xmlAttribute2EClass, XML_ATTRIBUTE2__ANNOTED_NAME);
		createEAttribute(xmlAttribute2EClass, XML_ATTRIBUTE2__NAME);

		xmlAttribute3EClass = createEClass(XML_ATTRIBUTE3);
		createEAttribute(xmlAttribute3EClass, XML_ATTRIBUTE3__ATTRIBUTE_NAME);
		createEAttribute(xmlAttribute3EClass, XML_ATTRIBUTE3__ANNOTED_NAME);
		createEAttribute(xmlAttribute3EClass, XML_ATTRIBUTE3__NAME);

		xmlChildsEClass = createEClass(XML_CHILDS);
		createEReference(xmlChildsEClass, XML_CHILDS__TERMS);

		typeTermEClass = createEClass(TYPE_TERM);
		createEAttribute(typeTermEClass, TYPE_TERM__HOTE);
		createEReference(typeTermEClass, TYPE_TERM__TYPE);
		createEReference(typeTermEClass, TYPE_TERM__KEYS);

		keyWordEClass = createEClass(KEY_WORD);
		createEReference(keyWordEClass, KEY_WORD__ARGS);
		createEAttribute(keyWordEClass, KEY_WORD__HOTE);

		operatorEClass = createEClass(OPERATOR);
		createEReference(operatorEClass, OPERATOR__KEYS);

		operatorListEClass = createEClass(OPERATOR_LIST);
		createEReference(operatorListEClass, OPERATOR_LIST__KEYS);

		operatorArrayEClass = createEClass(OPERATOR_ARRAY);
		createEReference(operatorArrayEClass, OPERATOR_ARRAY__KEYS);

		transformationEClass = createEClass(TRANSFORMATION);
		createEAttribute(transformationEClass, TRANSFORMATION__FILE_FROM);
		createEAttribute(transformationEClass, TRANSFORMATION__FILE_TO);
		createEReference(transformationEClass, TRANSFORMATION__ELEMENTARY_TRANFORMATIONS);

		elementaryTransformationEClass = createEClass(ELEMENTARY_TRANSFORMATION);
		createEReference(elementaryTransformationEClass, ELEMENTARY_TRANSFORMATION__IMPLEMENT);
		createEReference(elementaryTransformationEClass, ELEMENTARY_TRANSFORMATION__ELEMENTARY_TRANSFORMATION_RULES);

		elementaryTransformationRuleEClass = createEClass(ELEMENTARY_TRANSFORMATION_RULE);
		createEReference(elementaryTransformationRuleEClass, ELEMENTARY_TRANSFORMATION_RULE__PATTERN);
		createEReference(elementaryTransformationRuleEClass, ELEMENTARY_TRANSFORMATION_RULE__STATEMENTS);

		tracelinkEClass = createEClass(TRACELINK);
		createEReference(tracelinkEClass, TRACELINK__TERM);

		resolveEClass = createEClass(RESOLVE);
		createEReference(resolveEClass, RESOLVE__SOURCE);
		createEReference(resolveEClass, RESOLVE__TYPE);
		createEReference(resolveEClass, RESOLVE__TARGET);

		// Create enums
		relOperatorEEnum = createEEnum(REL_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hostCodeEClass.getESuperTypes().add(this.getStatement());
		hostCodeEClass.getESuperTypes().add(this.getBlock());
		expressionEClass.getESuperTypes().add(this.getStatement());
		callEClass.getESuperTypes().add(this.getExpression());
		declarationEClass.getESuperTypes().add(this.getExpression());
		declarationEClass.getESuperTypes().add(this.getLocalVariable());
		affectationEClass.getESuperTypes().add(this.getExpression());
		typeEClass.getESuperTypes().add(this.getLinkable());
		operationEClass.getESuperTypes().add(this.getLinkable());
		variableEClass.getESuperTypes().add(this.getLinkable());
		globalVariableEClass.getESuperTypes().add(this.getVariable());
		localVariableEClass.getESuperTypes().add(this.getVariable());
		variableSimpleEClass.getESuperTypes().add(this.getLocalVariable());
		variableListEClass.getESuperTypes().add(this.getLocalVariable());
		blockEClass.getESuperTypes().add(this.getContext());
		functionEClass.getESuperTypes().add(this.getBlock());
		functionEClass.getESuperTypes().add(this.getLinkable());
		functionEClass.getESuperTypes().add(this.getOperation());
		callbackEClass.getESuperTypes().add(this.getBlock());
		callbackDefinitionEClass.getESuperTypes().add(this.getOperation());
		argumentEClass.getESuperTypes().add(this.getVariableSimple());
		argumentTypeSuffixEClass.getESuperTypes().add(this.getArgument());
		argumentTypePrefixEClass.getESuperTypes().add(this.getArgument());
		importConstructEClass.getESuperTypes().add(this.getBlock());
		includeConstructEClass.getESuperTypes().add(this.getBlock());
		statementEClass.getESuperTypes().add(this.getContext());
		termEClass.getESuperTypes().add(this.getConstraint());
		termEClass.getESuperTypes().add(this.getCondition());
		termSumEClass.getESuperTypes().add(this.getTerm());
		termConstEClass.getESuperTypes().add(this.getTerm());
		termNullEClass.getESuperTypes().add(this.getTermConst());
		termVariableEClass.getESuperTypes().add(this.getTerm());
		termOperationEClass.getESuperTypes().add(this.getTerm());
		returnEClass.getESuperTypes().add(this.getStatement());
		matchConsctructEClass.getESuperTypes().add(this.getStatement());
		matchConsctructEClass.getESuperTypes().add(this.getContext());
		matchPatternEClass.getESuperTypes().add(this.getMatchConsctruct());
		patternActionEClass.getESuperTypes().add(this.getContext());
		patternActionEClass.getESuperTypes().add(this.getLinkable());
		constraintPatternEClass.getESuperTypes().add(this.getMatchConsctruct());
		constraintActionEClass.getESuperTypes().add(this.getContext());
		patternEClass.getESuperTypes().add(this.getConstraint());
		namedPatternEClass.getESuperTypes().add(this.getPattern());
		namedPatternEClass.getESuperTypes().add(this.getLocalVariable());
		antiPatternEClass.getESuperTypes().add(this.getPattern());
		plainPatternConstEClass.getESuperTypes().add(this.getPattern());
		plainPatternConstEClass.getESuperTypes().add(this.getRulePattern());
		plainPatternVariableEClass.getESuperTypes().add(this.getPattern());
		plainPatternVariableEClass.getESuperTypes().add(this.getRulePattern());
		plainPatternVariableEClass.getESuperTypes().add(this.getVariableSimple());
		jokerPatternEClass.getESuperTypes().add(this.getPattern());
		jokerPatternEClass.getESuperTypes().add(this.getRulePattern());
		plainPatternOperationEClass.getESuperTypes().add(this.getPattern());
		explicitTermListEClass.getESuperTypes().add(this.getList());
		plainPatternVariableListEClass.getESuperTypes().add(this.getPattern());
		plainPatternVariableListEClass.getESuperTypes().add(this.getRulePattern());
		plainPatternVariableListEClass.getESuperTypes().add(this.getVariableList());
		anyPatternEClass.getESuperTypes().add(this.getPattern());
		anyPatternEClass.getESuperTypes().add(this.getRulePattern());
		implicitPairListEClass.getESuperTypes().add(this.getList());
		pairPatternEClass.getESuperTypes().add(this.getLinkable());
		strategyConstructEClass.getESuperTypes().add(this.getType());
		strategyConstructEClass.getESuperTypes().add(this.getBlock());
		visitActionEClass.getESuperTypes().add(this.getContext());
		constraintOrEClass.getESuperTypes().add(this.getConstraint());
		constraintAndEClass.getESuperTypes().add(this.getConstraint());
		constraintPEClass.getESuperTypes().add(this.getConstraint());
		constraintMatchEClass.getESuperTypes().add(this.getConstraint());
		constraintOpEClass.getESuperTypes().add(this.getConstraint());
		gomConstructEClass.getESuperTypes().add(this.getBlock());
		gomConstructEClass.getESuperTypes().add(this.getLinkable());
		typeDefinitionEClass.getESuperTypes().add(this.getType());
		typeDefinitionEClass.getESuperTypes().add(this.getDefinition());
		operatorDefinitionEClass.getESuperTypes().add(this.getOperation());
		argumentsListEClass.getESuperTypes().add(this.getArguments());
		hookDefinitionEClass.getESuperTypes().add(this.getDefinition());
		hookModuleDefinitionEClass.getESuperTypes().add(this.getHookDefinition());
		hookTypeDefinitionEClass.getESuperTypes().add(this.getHookDefinition());
		hookOperatorDefinitionEClass.getESuperTypes().add(this.getHookDefinition());
		hookOperationEClass.getESuperTypes().add(this.getLinkable());
		hostHookOperationEClass.getESuperTypes().add(this.getHookOperation());
		hook_RulesEClass.getESuperTypes().add(this.getHookOperation());
		hook_GraphrulesEClass.getESuperTypes().add(this.getHookOperation());
		hook_MakeEClass.getESuperTypes().add(this.getHostHookOperation());
		hook_Make_InsertEClass.getESuperTypes().add(this.getHostHookOperation());
		hook_Make_EmptyEClass.getESuperTypes().add(this.getHostHookOperation());
		hook_FreeEClass.getESuperTypes().add(this.getHostHookOperation());
		hook_FLEClass.getESuperTypes().add(this.getHostHookOperation());
		hook_AUEClass.getESuperTypes().add(this.getHostHookOperation());
		hook_InterfaceEClass.getESuperTypes().add(this.getHostHookOperation());
		hook_ImportsEClass.getESuperTypes().add(this.getHostHookOperation());
		hook_BlockEClass.getESuperTypes().add(this.getHostHookOperation());
		rulePatternEClass.getESuperTypes().add(this.getCondition());
		namedRulePatternEClass.getESuperTypes().add(this.getRulePattern());
		namedRulePatternEClass.getESuperTypes().add(this.getLocalVariable());
		antiRulePatternEClass.getESuperTypes().add(this.getRulePattern());
		plainRulePatternOperationEClass.getESuperTypes().add(this.getRulePattern());
		termGraphVariableEClass.getESuperTypes().add(this.getPlainTermGraph());
		termGraphVariableEClass.getESuperTypes().add(this.getLinkable());
		termGraphFuncEClass.getESuperTypes().add(this.getPlainTermGraph());
		conditionOrEClass.getESuperTypes().add(this.getCondition());
		conditionAndEClass.getESuperTypes().add(this.getCondition());
		conditionPEClass.getESuperTypes().add(this.getCondition());
		conditionRuleEClass.getESuperTypes().add(this.getCondition());
		conditionOpEClass.getESuperTypes().add(this.getCondition());
		xmlTermEClass.getESuperTypes().add(this.getPattern());
		xmlTermSimpleEClass.getESuperTypes().add(this.getXMLTerm());
		xmlTermDoubleEClass.getESuperTypes().add(this.getXMLTerm());
		xmlTermTextEClass.getESuperTypes().add(this.getXMLTerm());
		xmlTermCommentEClass.getESuperTypes().add(this.getXMLTerm());
		xmlTermProcessEClass.getESuperTypes().add(this.getXMLTerm());
		xmlAttribute1EClass.getESuperTypes().add(this.getXMLAttribute());
		xmlAttribute2EClass.getESuperTypes().add(this.getXMLAttribute());
		xmlAttribute3EClass.getESuperTypes().add(this.getXMLAttribute());
		typeTermEClass.getESuperTypes().add(this.getBlock());
		typeTermEClass.getESuperTypes().add(this.getType());
		keyWordEClass.getESuperTypes().add(this.getLinkable());
		operatorEClass.getESuperTypes().add(this.getBlock());
		operatorEClass.getESuperTypes().add(this.getOperation());
		operatorListEClass.getESuperTypes().add(this.getBlock());
		operatorListEClass.getESuperTypes().add(this.getOperation());
		operatorArrayEClass.getESuperTypes().add(this.getBlock());
		operatorArrayEClass.getESuperTypes().add(this.getOperation());
		transformationEClass.getESuperTypes().add(this.getBlock());
		transformationEClass.getESuperTypes().add(this.getOperation());
		elementaryTransformationEClass.getESuperTypes().add(this.getOperation());
		elementaryTransformationEClass.getESuperTypes().add(this.getContext());
		elementaryTransformationRuleEClass.getESuperTypes().add(this.getContext());
		tracelinkEClass.getESuperTypes().add(this.getGlobalVariable());
		tracelinkEClass.getESuperTypes().add(this.getStatement());
		resolveEClass.getESuperTypes().add(this.getTerm());

		// Initialize classes, features, and operations; add parameters
		initEClass(hostCodeEClass, HostCode.class, "HostCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostCode_Code(), ecorePackage.getEString(), "code", null, 0, 1, HostCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCall_Call(), this.getTermOperation(), null, "call", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclaration_Value(), this.getTerm(), null, "value", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(affectationEClass, Affectation.class, "Affectation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAffectation_Variable(), this.getVariable(), null, "variable", null, 0, 1, Affectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAffectation_Value(), this.getTerm(), null, "value", null, 0, 1, Affectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tomEClass, Tom.class, "Tom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTom_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, Tom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTom_Blocs(), this.getBlock(), null, "blocs", null, 0, -1, Tom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkableEClass, Linkable.class, "Linkable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Linkable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_Extend(), this.getType(), null, "extend", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Type(), this.getType(), null, "type", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Args(), this.getArguments(), null, "args", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Type(), this.getType(), null, "type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalVariableEClass, GlobalVariable.class, "GlobalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(localVariableEClass, LocalVariable.class, "LocalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableSimpleEClass, VariableSimple.class, "VariableSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableListEClass, VariableList.class, "VariableList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Statements(), this.getStatement(), null, "statements", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callbackEClass, Callback.class, "Callback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallback_Operations(), this.getCallbackDefinition(), null, "operations", null, 0, -1, Callback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(callbackDefinitionEClass, CallbackDefinition.class, "CallbackDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentsEClass, Arguments.class, "Arguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArguments_Args(), this.getArgument(), null, "args", null, 0, -1, Arguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentTypeSuffixEClass, ArgumentTypeSuffix.class, "ArgumentTypeSuffix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentTypePrefixEClass, ArgumentTypePrefix.class, "ArgumentTypePrefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(importConstructEClass, ImportConstruct.class, "ImportConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportConstruct_Type(), this.getType(), null, "type", null, 0, 1, ImportConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includeConstructEClass, IncludeConstruct.class, "IncludeConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncludeConstruct_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, IncludeConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludeConstruct_Ext(), ecorePackage.getEString(), "ext", null, 0, 1, IncludeConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(termSumEClass, TermSum.class, "TermSum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTermSum_Left(), this.getTerm(), null, "left", null, 0, 1, TermSum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTermSum_Right(), this.getTerm(), null, "right", null, 0, 1, TermSum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termConstEClass, TermConst.class, "TermConst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTermConst_String(), ecorePackage.getEString(), "string", null, 0, 1, TermConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTermConst_Int(), ecorePackage.getEInt(), "int", null, 0, 1, TermConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termNullEClass, TermNull.class, "TermNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(termVariableEClass, TermVariable.class, "TermVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTermVariable_Var(), this.getVariable(), null, "var", null, 0, 1, TermVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termOperationEClass, TermOperation.class, "TermOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTermOperation_Op(), this.getOperation(), null, "op", null, 0, 1, TermOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTermOperation_Terms(), this.getTerm(), null, "terms", null, 0, -1, TermOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturn_Return(), this.getTerm(), null, "return", null, 0, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchConsctructEClass, MatchConsctruct.class, "MatchConsctruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(matchPatternEClass, MatchPattern.class, "MatchPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatchPattern_Args(), this.getArgumentMatch(), null, "args", null, 0, -1, MatchPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatchPattern_PatternActions(), this.getPatternAction(), null, "patternActions", null, 0, -1, MatchPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentMatchEClass, ArgumentMatch.class, "ArgumentMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentMatch_Type(), this.getType(), null, "type", null, 0, 1, ArgumentMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentMatch_Var(), this.getVariable(), null, "var", null, 0, 1, ArgumentMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternActionEClass, PatternAction.class, "PatternAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternAction_Patterns(), this.getPatternList(), null, "patterns", null, 0, 1, PatternAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternAction_Statements(), this.getStatement(), null, "statements", null, 0, -1, PatternAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintPatternEClass, ConstraintPattern.class, "ConstraintPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintPattern_ConstraintActions(), this.getConstraintAction(), null, "constraintActions", null, 0, -1, ConstraintPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintActionEClass, ConstraintAction.class, "ConstraintAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintAction_Constraint(), this.getConstraint(), null, "constraint", null, 0, 1, ConstraintAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintAction_Statements(), this.getStatement(), null, "statements", null, 0, -1, ConstraintAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedPatternEClass, NamedPattern.class, "NamedPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedPattern_PlainPattern(), this.getPattern(), null, "plainPattern", null, 0, 1, NamedPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(antiPatternEClass, AntiPattern.class, "AntiPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAntiPattern_Pattern(), this.getPlainPatternOperation(), null, "pattern", null, 0, 1, AntiPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plainPatternConstEClass, PlainPatternConst.class, "PlainPatternConst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlainPatternConst_Head(), ecorePackage.getEString(), "head", null, 0, 1, PlainPatternConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plainPatternVariableEClass, PlainPatternVariable.class, "PlainPatternVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jokerPatternEClass, JokerPattern.class, "JokerPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plainPatternOperationEClass, PlainPatternOperation.class, "PlainPatternOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlainPatternOperation_Heads(), this.getOperationList(), null, "heads", null, 0, 1, PlainPatternOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlainPatternOperation_List(), this.getList(), null, "list", null, 0, 1, PlainPatternOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationListEClass, OperationList.class, "OperationList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationList_Heads(), this.getOperation(), null, "heads", null, 0, -1, OperationList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationList_Log(), ecorePackage.getEBoolean(), "log", null, 0, 1, OperationList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(explicitTermListEClass, ExplicitTermList.class, "ExplicitTermList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExplicitTermList_Patterns(), this.getPattern(), null, "patterns", null, 0, -1, ExplicitTermList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plainPatternVariableListEClass, PlainPatternVariableList.class, "PlainPatternVariableList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anyPatternEClass, AnyPattern.class, "AnyPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implicitPairListEClass, ImplicitPairList.class, "ImplicitPairList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplicitPairList_Patterns(), this.getPairPattern(), null, "patterns", null, 0, -1, ImplicitPairList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pairPatternEClass, PairPattern.class, "PairPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPairPattern_Pattern(), this.getPattern(), null, "pattern", null, 0, 1, PairPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strategyConstructEClass, StrategyConstruct.class, "StrategyConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrategyConstruct_Implement(), this.getTermOperation(), null, "implement", null, 0, 1, StrategyConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrategyConstruct_Args(), this.getArguments(), null, "args", null, 0, 1, StrategyConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrategyConstruct_Visitlist(), this.getStrategyVisit(), null, "visitlist", null, 0, -1, StrategyConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strategyVisitEClass, StrategyVisit.class, "StrategyVisit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrategyVisit_Type(), this.getType(), null, "type", null, 0, 1, StrategyVisit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrategyVisit_Actions(), this.getVisitAction(), null, "actions", null, 0, -1, StrategyVisit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visitActionEClass, VisitAction.class, "VisitAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisitAction_Pattern(), this.getPatternList(), null, "pattern", null, 0, 1, VisitAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisitAction_Statements(), this.getStatement(), null, "statements", null, 0, -1, VisitAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisitAction_Term(), this.getTerm(), null, "term", null, 0, 1, VisitAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternListEClass, PatternList.class, "PatternList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternList_Patterns(), this.getPattern(), null, "patterns", null, 0, -1, PatternList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternList_Rel(), ecorePackage.getEString(), "rel", null, 0, 1, PatternList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternList_Constraint(), this.getConstraint(), null, "constraint", null, 0, 1, PatternList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintOrEClass, ConstraintOr.class, "ConstraintOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintOr_Left(), this.getConstraint(), null, "left", null, 0, 1, ConstraintOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintOr_Right(), this.getConstraint(), null, "right", null, 0, 1, ConstraintOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintAndEClass, ConstraintAnd.class, "ConstraintAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintAnd_Left(), this.getConstraint(), null, "left", null, 0, 1, ConstraintAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintAnd_Right(), this.getConstraint(), null, "right", null, 0, 1, ConstraintAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintPEClass, ConstraintP.class, "ConstraintP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintP_Constraint(), this.getConstraint(), null, "constraint", null, 0, 1, ConstraintP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintMatchEClass, ConstraintMatch.class, "ConstraintMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintMatch_Pattern(), this.getConstraint(), null, "pattern", null, 0, 1, ConstraintMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintMatch_Type(), this.getType(), null, "type", null, 0, 1, ConstraintMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintMatch_Term(), this.getTerm(), null, "term", null, 0, 1, ConstraintMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintOpEClass, ConstraintOp.class, "ConstraintOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintOp_Left(), this.getConstraint(), null, "left", null, 0, 1, ConstraintOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintOp_Operator(), this.getRelOperator(), "operator", null, 0, 1, ConstraintOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintOp_Right(), this.getTerm(), null, "right", null, 0, 1, ConstraintOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gomConstructEClass, GomConstruct.class, "GomConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGomConstruct_Option(), ecorePackage.getEString(), "option", null, 0, 1, GomConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGomConstruct_Imports(), this.getType(), null, "imports", null, 0, -1, GomConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGomConstruct_Definitions(), this.getDefinition(), null, "definitions", null, 0, -1, GomConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDefinition_OpDefinition(), this.getOperatorDefinition(), null, "opDefinition", null, 0, -1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorDefinitionEClass, OperatorDefinition.class, "OperatorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentsListEClass, ArgumentsList.class, "ArgumentsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentsList_Type(), this.getType(), null, "type", null, 0, 1, ArgumentsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hookDefinitionEClass, HookDefinition.class, "HookDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHookDefinition_HookOperation(), this.getHookOperation(), null, "hookOperation", null, 0, 1, HookDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hookModuleDefinitionEClass, HookModuleDefinition.class, "HookModuleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHookModuleDefinition_HookType(), this.getGomConstruct(), null, "hookType", null, 0, 1, HookModuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hookTypeDefinitionEClass, HookTypeDefinition.class, "HookTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHookTypeDefinition_HookType(), this.getTypeDefinition(), null, "hookType", null, 0, 1, HookTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hookOperatorDefinitionEClass, HookOperatorDefinition.class, "HookOperatorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHookOperatorDefinition_HookType(), this.getOperatorDefinition(), null, "hookType", null, 0, 1, HookOperatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hookOperationEClass, HookOperation.class, "HookOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hostHookOperationEClass, HostHookOperation.class, "HostHookOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHostHookOperation_Args(), this.getArguments(), null, "args", null, 0, 1, HostHookOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHostHookOperation_Statements(), this.getStatement(), null, "statements", null, 0, -1, HostHookOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hook_RulesEClass, Hook_Rules.class, "Hook_Rules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHook_Rules_Rules(), this.getRule(), null, "rules", null, 0, -1, Hook_Rules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hook_GraphrulesEClass, Hook_Graphrules.class, "Hook_Graphrules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHook_Graphrules_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, Hook_Graphrules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHook_Graphrules_GraphRules(), this.getGraphRule(), null, "graphRules", null, 0, -1, Hook_Graphrules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hook_MakeEClass, Hook_Make.class, "Hook_Make", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hook_Make_InsertEClass, Hook_Make_Insert.class, "Hook_Make_Insert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hook_Make_EmptyEClass, Hook_Make_Empty.class, "Hook_Make_Empty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hook_FreeEClass, Hook_Free.class, "Hook_Free", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hook_FLEClass, Hook_FL.class, "Hook_FL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hook_AUEClass, Hook_AU.class, "Hook_AU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHook_AU_Term(), this.getTerm(), null, "term", null, 0, 1, Hook_AU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hook_InterfaceEClass, Hook_Interface.class, "Hook_Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hook_ImportsEClass, Hook_Imports.class, "Hook_Imports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hook_BlockEClass, Hook_Block.class, "Hook_Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_RulePattern(), this.getRulePattern(), null, "rulePattern", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Term(), this.getTerm(), null, "term", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Cond(), this.getCondition(), null, "cond", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rulePatternEClass, RulePattern.class, "RulePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedRulePatternEClass, NamedRulePattern.class, "NamedRulePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedRulePattern_PlainRulePattern(), ecorePackage.getEObject(), null, "plainRulePattern", null, 0, 1, NamedRulePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(antiRulePatternEClass, AntiRulePattern.class, "AntiRulePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAntiRulePattern_Pattern(), this.getRulePattern(), null, "pattern", null, 0, 1, AntiRulePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plainRulePatternOperationEClass, PlainRulePatternOperation.class, "PlainRulePatternOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlainRulePatternOperation_Heads(), this.getOperationList(), null, "heads", null, 0, 1, PlainRulePatternOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlainRulePatternOperation_Rules(), this.getRulePattern(), null, "rules", null, 0, -1, PlainRulePatternOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphRuleEClass, GraphRule.class, "GraphRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphRule_Termcond(), this.getTermGraph(), null, "termcond", null, 0, 1, GraphRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphRule_TermGraph(), this.getTermGraph(), null, "termGraph", null, 0, 1, GraphRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphRule_Cond(), this.getCondition(), null, "cond", null, 0, 1, GraphRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termGraphEClass, TermGraph.class, "TermGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTermGraph_Name(), ecorePackage.getEString(), "name", null, 0, 1, TermGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTermGraph_TermGraph(), this.getPlainTermGraph(), null, "termGraph", null, 0, 1, TermGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plainTermGraphEClass, PlainTermGraph.class, "PlainTermGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(termGraphVariableEClass, TermGraphVariable.class, "TermGraphVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTermGraphVariable_Label(), ecorePackage.getEBoolean(), "label", null, 0, 1, TermGraphVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termGraphFuncEClass, TermGraphFunc.class, "TermGraphFunc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTermGraphFunc_Head(), this.getOperationList(), null, "head", null, 0, 1, TermGraphFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTermGraphFunc_Terms(), this.getTermGraph(), null, "terms", null, 0, -1, TermGraphFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionOrEClass, ConditionOr.class, "ConditionOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionOr_Left(), this.getCondition(), null, "left", null, 0, 1, ConditionOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionOr_Right(), this.getCondition(), null, "right", null, 0, 1, ConditionOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionAndEClass, ConditionAnd.class, "ConditionAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionAnd_Left(), this.getCondition(), null, "left", null, 0, 1, ConditionAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionAnd_Right(), this.getCondition(), null, "right", null, 0, 1, ConditionAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionPEClass, ConditionP.class, "ConditionP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionP_Condition(), this.getCondition(), null, "condition", null, 0, 1, ConditionP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionRuleEClass, ConditionRule.class, "ConditionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionRule_Rule(), this.getCondition(), null, "rule", null, 0, 1, ConditionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionRule_Term(), this.getTerm(), null, "term", null, 0, 1, ConditionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionOpEClass, ConditionOp.class, "ConditionOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionOp_Left(), this.getCondition(), null, "left", null, 0, 1, ConditionOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionOp_Operator(), this.getRelOperator(), "operator", null, 0, 1, ConditionOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionOp_Right(), this.getTerm(), null, "right", null, 0, 1, ConditionOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlTermEClass, XMLTerm.class, "XMLTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlTermSimpleEClass, XMLTermSimple.class, "XMLTermSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXMLTermSimple_NameList(), this.getXMLNameList(), null, "nameList", null, 0, 1, XMLTermSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXMLTermSimple_AttrList(), this.getXMLAttrList(), null, "attrList", null, 0, 1, XMLTermSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlTermDoubleEClass, XMLTermDouble.class, "XMLTermDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXMLTermDouble_NameList(), this.getXMLNameList(), null, "nameList", null, 0, 1, XMLTermDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXMLTermDouble_AttrList(), this.getXMLAttrList(), null, "attrList", null, 0, 1, XMLTermDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXMLTermDouble_Childs(), this.getXMLChilds(), null, "childs", null, 0, 1, XMLTermDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXMLTermDouble_List(), this.getXMLNameList(), null, "list", null, 0, 1, XMLTermDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlTermTextEClass, XMLTermText.class, "XMLTermText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLTermText_Name(), ecorePackage.getEString(), "name", null, 0, 1, XMLTermText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlTermCommentEClass, XMLTermComment.class, "XMLTermComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLTermComment_Name(), ecorePackage.getEString(), "name", null, 0, 1, XMLTermComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlTermProcessEClass, XMLTermProcess.class, "XMLTermProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLTermProcess_Name1(), ecorePackage.getEString(), "name1", null, 0, 1, XMLTermProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLTermProcess_Name2(), ecorePackage.getEString(), "name2", null, 0, 1, XMLTermProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlNameListEClass, XMLNameList.class, "XMLNameList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLNameList_XMLName(), ecorePackage.getEString(), "XMLName", null, 0, -1, XMLNameList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlAttrListEClass, XMLAttrList.class, "XMLAttrList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXMLAttrList_Attrs(), this.getXMLAttribute(), null, "attrs", null, 0, -1, XMLAttrList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlAttributeEClass, XMLAttribute.class, "XMLAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlAttribute1EClass, XMLAttribute1.class, "XMLAttribute1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLAttribute1_Name(), ecorePackage.getEString(), "name", null, 0, 1, XMLAttribute1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlAttribute2EClass, XMLAttribute2.class, "XMLAttribute2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLAttribute2_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, XMLAttribute2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLAttribute2_AnnotedName(), ecorePackage.getEString(), "annotedName", null, 0, 1, XMLAttribute2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLAttribute2_Name(), ecorePackage.getEString(), "name", null, 0, 1, XMLAttribute2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlAttribute3EClass, XMLAttribute3.class, "XMLAttribute3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLAttribute3_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, XMLAttribute3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLAttribute3_AnnotedName(), ecorePackage.getEString(), "annotedName", null, 0, 1, XMLAttribute3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLAttribute3_Name(), ecorePackage.getEString(), "name", null, 0, 1, XMLAttribute3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlChildsEClass, XMLChilds.class, "XMLChilds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXMLChilds_Terms(), this.getTerm(), null, "terms", null, 0, -1, XMLChilds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeTermEClass, TypeTerm.class, "TypeTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeTerm_Hote(), ecorePackage.getEString(), "hote", null, 0, 1, TypeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeTerm_Type(), this.getType(), null, "type", null, 0, 1, TypeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeTerm_Keys(), this.getKeyWord(), null, "keys", null, 0, -1, TypeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyWordEClass, KeyWord.class, "KeyWord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKeyWord_Args(), this.getArguments(), null, "args", null, 0, 1, KeyWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyWord_Hote(), ecorePackage.getEString(), "hote", null, 0, 1, KeyWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperator_Keys(), this.getKeyWord(), null, "keys", null, 0, -1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorListEClass, OperatorList.class, "OperatorList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperatorList_Keys(), this.getKeyWord(), null, "keys", null, 0, -1, OperatorList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorArrayEClass, OperatorArray.class, "OperatorArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperatorArray_Keys(), this.getKeyWord(), null, "keys", null, 0, -1, OperatorArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_FileFrom(), ecorePackage.getEString(), "fileFrom", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_FileTo(), ecorePackage.getEString(), "fileTo", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_ElementaryTranformations(), this.getElementaryTransformation(), null, "elementaryTranformations", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementaryTransformationEClass, ElementaryTransformation.class, "ElementaryTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementaryTransformation_Implement(), this.getTermOperation(), null, "implement", null, 0, 1, ElementaryTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementaryTransformation_ElementaryTransformationRules(), this.getElementaryTransformationRule(), null, "elementaryTransformationRules", null, 0, -1, ElementaryTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementaryTransformationRuleEClass, ElementaryTransformationRule.class, "ElementaryTransformationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementaryTransformationRule_Pattern(), this.getPattern(), null, "pattern", null, 0, 1, ElementaryTransformationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementaryTransformationRule_Statements(), this.getStatement(), null, "statements", null, 0, -1, ElementaryTransformationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracelinkEClass, Tracelink.class, "Tracelink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracelink_Term(), this.getTerm(), null, "term", null, 0, 1, Tracelink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resolveEClass, Resolve.class, "Resolve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolve_Source(), this.getVariable(), null, "source", null, 0, 1, Resolve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolve_Type(), this.getType(), null, "type", null, 0, 1, Resolve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolve_Target(), this.getTracelink(), null, "target", null, 0, 1, Resolve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(relOperatorEEnum, RelOperator.class, "RelOperator");
		addEEnumLiteral(relOperatorEEnum, RelOperator.INF);
		addEEnumLiteral(relOperatorEEnum, RelOperator.INFEG);
		addEEnumLiteral(relOperatorEEnum, RelOperator.EG);
		addEEnumLiteral(relOperatorEEnum, RelOperator.SUPEG);
		addEEnumLiteral(relOperatorEEnum, RelOperator.SUP);
		addEEnumLiteral(relOperatorEEnum, RelOperator.NEG);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmofAnnotations() {
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";	
		addAnnotation
		  (getXMLNameList_XMLName(), 
		   source, 
		   new String[] {
			 "body", "XMLAttrList"
		   });	
		addAnnotation
		  (getXMLAttribute3_AttributeName(), 
		   source, 
		   new String[] {
			 "body", "XMLChilds"
		   });
	}

} //TomPackageImpl
