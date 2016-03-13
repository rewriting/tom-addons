/**
 */
package tom;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tom.TomFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TomPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tom";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.tom3.tom/tom";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tom";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TomPackage eINSTANCE = tom.impl.TomPackageImpl.init();

	/**
	 * The meta object id for the '{@link tom.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ContextImpl
	 * @see tom.impl.TomPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 6;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.StatementImpl
	 * @see tom.impl.TomPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 25;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.HostCodeImpl <em>Host Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.HostCodeImpl
	 * @see tom.impl.TomPackageImpl#getHostCode()
	 * @generated
	 */
	int HOST_CODE = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CODE__CODE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Host Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CODE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Host Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CODE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ExpressionImpl
	 * @see tom.impl.TomPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.CallImpl
	 * @see tom.impl.TomPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 2;

	/**
	 * The feature id for the '<em><b>Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__CALL = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.DeclarationImpl
	 * @see tom.impl.TomPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__TYPE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__VALUE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.AffectationImpl <em>Affectation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.AffectationImpl
	 * @see tom.impl.TomPackageImpl#getAffectation()
	 * @generated
	 */
	int AFFECTATION = 4;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION__VALUE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Affectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Affectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.TomImpl <em>Tom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.TomImpl
	 * @see tom.impl.TomPackageImpl#getTom()
	 * @generated
	 */
	int TOM = 5;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOM__NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Blocs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOM__BLOCS = 1;

	/**
	 * The number of structural features of the '<em>Tom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.LinkableImpl <em>Linkable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.LinkableImpl
	 * @see tom.impl.TomPackageImpl#getLinkable()
	 * @generated
	 */
	int LINKABLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Linkable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Linkable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.TypeImpl
	 * @see tom.impl.TomPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = LINKABLE__NAME;

	/**
	 * The feature id for the '<em><b>Extend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__EXTEND = LINKABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = LINKABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = LINKABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.OperationImpl
	 * @see tom.impl.TomPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = LINKABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE = LINKABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ARGS = LINKABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = LINKABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = LINKABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.VariableImpl
	 * @see tom.impl.TomPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = LINKABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = LINKABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = LINKABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = LINKABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.GlobalVariableImpl
	 * @see tom.impl.TomPackageImpl#getGlobalVariable()
	 * @generated
	 */
	int GLOBAL_VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__TYPE = VARIABLE__TYPE;

	/**
	 * The number of structural features of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.LocalVariableImpl <em>Local Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.LocalVariableImpl
	 * @see tom.impl.TomPackageImpl#getLocalVariable()
	 * @generated
	 */
	int LOCAL_VARIABLE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__TYPE = VARIABLE__TYPE;

	/**
	 * The number of structural features of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.VariableSimpleImpl <em>Variable Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.VariableSimpleImpl
	 * @see tom.impl.TomPackageImpl#getVariableSimple()
	 * @generated
	 */
	int VARIABLE_SIMPLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SIMPLE__NAME = LOCAL_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SIMPLE__TYPE = LOCAL_VARIABLE__TYPE;

	/**
	 * The number of structural features of the '<em>Variable Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SIMPLE_FEATURE_COUNT = LOCAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SIMPLE_OPERATION_COUNT = LOCAL_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.VariableListImpl <em>Variable List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.VariableListImpl
	 * @see tom.impl.TomPackageImpl#getVariableList()
	 * @generated
	 */
	int VARIABLE_LIST = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_LIST__NAME = LOCAL_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_LIST__TYPE = LOCAL_VARIABLE__TYPE;

	/**
	 * The number of structural features of the '<em>Variable List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_LIST_FEATURE_COUNT = LOCAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_LIST_OPERATION_COUNT = LOCAL_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.BlockImpl
	 * @see tom.impl.TomPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 15;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.FunctionImpl
	 * @see tom.impl.TomPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TYPE = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ARGS = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__STATEMENTS = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.CallbackImpl <em>Callback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.CallbackImpl
	 * @see tom.impl.TomPackageImpl#getCallback()
	 * @generated
	 */
	int CALLBACK = 17;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__OPERATIONS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.CallbackDefinitionImpl <em>Callback Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.CallbackDefinitionImpl
	 * @see tom.impl.TomPackageImpl#getCallbackDefinition()
	 * @generated
	 */
	int CALLBACK_DEFINITION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_DEFINITION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_DEFINITION__TYPE = OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_DEFINITION__ARGS = OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>Callback Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_DEFINITION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Callback Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_DEFINITION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ArgumentsImpl <em>Arguments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ArgumentsImpl
	 * @see tom.impl.TomPackageImpl#getArguments()
	 * @generated
	 */
	int ARGUMENTS = 19;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS__ARGS = 0;

	/**
	 * The number of structural features of the '<em>Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ArgumentImpl
	 * @see tom.impl.TomPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = VARIABLE_SIMPLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__TYPE = VARIABLE_SIMPLE__TYPE;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = VARIABLE_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = VARIABLE_SIMPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ArgumentTypeSuffixImpl <em>Argument Type Suffix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ArgumentTypeSuffixImpl
	 * @see tom.impl.TomPackageImpl#getArgumentTypeSuffix()
	 * @generated
	 */
	int ARGUMENT_TYPE_SUFFIX = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_SUFFIX__NAME = ARGUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_SUFFIX__TYPE = ARGUMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Argument Type Suffix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_SUFFIX_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Argument Type Suffix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_SUFFIX_OPERATION_COUNT = ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ArgumentTypePrefixImpl <em>Argument Type Prefix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ArgumentTypePrefixImpl
	 * @see tom.impl.TomPackageImpl#getArgumentTypePrefix()
	 * @generated
	 */
	int ARGUMENT_TYPE_PREFIX = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_PREFIX__NAME = ARGUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_PREFIX__TYPE = ARGUMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Argument Type Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_PREFIX_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Argument Type Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_PREFIX_OPERATION_COUNT = ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ImportConstructImpl <em>Import Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ImportConstructImpl
	 * @see tom.impl.TomPackageImpl#getImportConstruct()
	 * @generated
	 */
	int IMPORT_CONSTRUCT = 23;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_CONSTRUCT__TYPE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_CONSTRUCT_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Import Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_CONSTRUCT_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.IncludeConstructImpl <em>Include Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.IncludeConstructImpl
	 * @see tom.impl.TomPackageImpl#getIncludeConstruct()
	 * @generated
	 */
	int INCLUDE_CONSTRUCT = 24;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_CONSTRUCT__IMPORT_URI = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_CONSTRUCT__EXT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Include Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_CONSTRUCT_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Include Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_CONSTRUCT_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ConstraintImpl
	 * @see tom.impl.TomPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 57;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.TermImpl
	 * @see tom.impl.TomPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 26;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.TermSumImpl <em>Term Sum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.TermSumImpl
	 * @see tom.impl.TomPackageImpl#getTermSum()
	 * @generated
	 */
	int TERM_SUM = 27;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_SUM__LEFT = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_SUM__RIGHT = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Term Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_SUM_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Term Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_SUM_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.TermConstImpl <em>Term Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.TermConstImpl
	 * @see tom.impl.TomPackageImpl#getTermConst()
	 * @generated
	 */
	int TERM_CONST = 28;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_CONST__STRING = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_CONST__INT = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Term Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_CONST_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Term Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_CONST_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.TermNullImpl <em>Term Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.TermNullImpl
	 * @see tom.impl.TomPackageImpl#getTermNull()
	 * @generated
	 */
	int TERM_NULL = 29;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_NULL__STRING = TERM_CONST__STRING;

	/**
	 * The feature id for the '<em><b>Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_NULL__INT = TERM_CONST__INT;

	/**
	 * The number of structural features of the '<em>Term Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_NULL_FEATURE_COUNT = TERM_CONST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Term Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_NULL_OPERATION_COUNT = TERM_CONST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.TermVariableImpl <em>Term Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.TermVariableImpl
	 * @see tom.impl.TomPackageImpl#getTermVariable()
	 * @generated
	 */
	int TERM_VARIABLE = 30;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_VARIABLE__VAR = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Term Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_VARIABLE_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Term Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_VARIABLE_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.TermOperationImpl <em>Term Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.TermOperationImpl
	 * @see tom.impl.TomPackageImpl#getTermOperation()
	 * @generated
	 */
	int TERM_OPERATION = 31;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION__OP = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION__TERMS = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Term Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Term Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ReturnImpl
	 * @see tom.impl.TomPackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 32;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__RETURN = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.MatchConsctructImpl <em>Match Consctruct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.MatchConsctructImpl
	 * @see tom.impl.TomPackageImpl#getMatchConsctruct()
	 * @generated
	 */
	int MATCH_CONSCTRUCT = 33;

	/**
	 * The number of structural features of the '<em>Match Consctruct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_CONSCTRUCT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Match Consctruct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_CONSCTRUCT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.MatchPatternImpl <em>Match Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.MatchPatternImpl
	 * @see tom.impl.TomPackageImpl#getMatchPattern()
	 * @generated
	 */
	int MATCH_PATTERN = 34;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_PATTERN__ARGS = MATCH_CONSCTRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_PATTERN__PATTERN_ACTIONS = MATCH_CONSCTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Match Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_PATTERN_FEATURE_COUNT = MATCH_CONSCTRUCT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Match Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_PATTERN_OPERATION_COUNT = MATCH_CONSCTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ArgumentMatchImpl <em>Argument Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ArgumentMatchImpl
	 * @see tom.impl.TomPackageImpl#getArgumentMatch()
	 * @generated
	 */
	int ARGUMENT_MATCH = 35;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MATCH__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MATCH__VAR = 1;

	/**
	 * The number of structural features of the '<em>Argument Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MATCH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Argument Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.PatternActionImpl <em>Pattern Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.PatternActionImpl
	 * @see tom.impl.TomPackageImpl#getPatternAction()
	 * @generated
	 */
	int PATTERN_ACTION = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ACTION__NAME = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ACTION__PATTERNS = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ACTION__STATEMENTS = CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ACTION_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pattern Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ACTION_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ConstraintPatternImpl <em>Constraint Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ConstraintPatternImpl
	 * @see tom.impl.TomPackageImpl#getConstraintPattern()
	 * @generated
	 */
	int CONSTRAINT_PATTERN = 37;

	/**
	 * The feature id for the '<em><b>Constraint Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PATTERN__CONSTRAINT_ACTIONS = MATCH_CONSCTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PATTERN_FEATURE_COUNT = MATCH_CONSCTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constraint Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PATTERN_OPERATION_COUNT = MATCH_CONSCTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ConstraintActionImpl <em>Constraint Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ConstraintActionImpl
	 * @see tom.impl.TomPackageImpl#getConstraintAction()
	 * @generated
	 */
	int CONSTRAINT_ACTION = 38;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_ACTION__CONSTRAINT = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_ACTION__STATEMENTS = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constraint Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_ACTION_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constraint Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_ACTION_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.PatternImpl
	 * @see tom.impl.TomPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 39;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.NamedPatternImpl <em>Named Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.NamedPatternImpl
	 * @see tom.impl.TomPackageImpl#getNamedPattern()
	 * @generated
	 */
	int NAMED_PATTERN = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PATTERN__NAME = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PATTERN__TYPE = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Plain Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PATTERN__PLAIN_PATTERN = PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Named Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Named Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PATTERN_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.AntiPatternImpl <em>Anti Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.AntiPatternImpl
	 * @see tom.impl.TomPackageImpl#getAntiPattern()
	 * @generated
	 */
	int ANTI_PATTERN = 41;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_PATTERN__PATTERN = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anti Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Anti Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_PATTERN_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.PlainPatternConstImpl <em>Plain Pattern Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.PlainPatternConstImpl
	 * @see tom.impl.TomPackageImpl#getPlainPatternConst()
	 * @generated
	 */
	int PLAIN_PATTERN_CONST = 42;

	/**
	 * The feature id for the '<em><b>Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PATTERN_CONST__HEAD = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plain Pattern Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PATTERN_CONST_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Plain Pattern Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PATTERN_CONST_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.PlainPatternVariableImpl <em>Plain Pattern Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.PlainPatternVariableImpl
	 * @see tom.impl.TomPackageImpl#getPlainPatternVariable()
	 * @generated
	 */
	int PLAIN_PATTERN_VARIABLE = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PATTERN_VARIABLE__NAME = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PATTERN_VARIABLE__TYPE = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plain Pattern Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PATTERN_VARIABLE_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Plain Pattern Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PATTERN_VARIABLE_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.JokerPatternImpl <em>Joker Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.JokerPatternImpl
	 * @see tom.impl.TomPackageImpl#getJokerPattern()
	 * @generated
	 */
	int JOKER_PATTERN = 44;

	/**
	 * The number of structural features of the '<em>Joker Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOKER_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Joker Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOKER_PATTERN_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.PlainPatternOperationImpl <em>Plain Pattern Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.PlainPatternOperationImpl
	 * @see tom.impl.TomPackageImpl#getPlainPatternOperation()
	 * @generated
	 */
	int PLAIN_PATTERN_OPERATION = 45;

	/**
	 * The feature id for the '<em><b>Heads</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PATTERN_OPERATION__HEADS = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PATTERN_OPERATION__LIST = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plain Pattern Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PATTERN_OPERATION_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Plain Pattern Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PATTERN_OPERATION_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ListImpl
	 * @see tom.impl.TomPackageImpl#getList()
	 * @generated
	 */
	int LIST = 46;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.OperationListImpl <em>Operation List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.OperationListImpl
	 * @see tom.impl.TomPackageImpl#getOperationList()
	 * @generated
	 */
	int OPERATION_LIST = 47;

	/**
	 * The feature id for the '<em><b>Heads</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LIST__HEADS = 0;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LIST__LOG = 1;

	/**
	 * The number of structural features of the '<em>Operation List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operation List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.ExplicitTermListImpl <em>Explicit Term List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ExplicitTermListImpl
	 * @see tom.impl.TomPackageImpl#getExplicitTermList()
	 * @generated
	 */
	int EXPLICIT_TERM_LIST = 48;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_TERM_LIST__PATTERNS = LIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Explicit Term List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_TERM_LIST_FEATURE_COUNT = LIST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Explicit Term List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_TERM_LIST_OPERATION_COUNT = LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.PlainPatternVariableListImpl <em>Plain Pattern Variable List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.PlainPatternVariableListImpl
	 * @see tom.impl.TomPackageImpl#getPlainPatternVariableList()
	 * @generated
	 */
	int PLAIN_PATTERN_VARIABLE_LIST = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PATTERN_VARIABLE_LIST__NAME = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PATTERN_VARIABLE_LIST__TYPE = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plain Pattern Variable List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PATTERN_VARIABLE_LIST_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Plain Pattern Variable List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PATTERN_VARIABLE_LIST_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.AnyPatternImpl <em>Any Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.AnyPatternImpl
	 * @see tom.impl.TomPackageImpl#getAnyPattern()
	 * @generated
	 */
	int ANY_PATTERN = 50;

	/**
	 * The number of structural features of the '<em>Any Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Any Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_PATTERN_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ImplicitPairListImpl <em>Implicit Pair List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ImplicitPairListImpl
	 * @see tom.impl.TomPackageImpl#getImplicitPairList()
	 * @generated
	 */
	int IMPLICIT_PAIR_LIST = 51;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_PAIR_LIST__PATTERNS = LIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Implicit Pair List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_PAIR_LIST_FEATURE_COUNT = LIST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Implicit Pair List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_PAIR_LIST_OPERATION_COUNT = LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.PairPatternImpl <em>Pair Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.PairPatternImpl
	 * @see tom.impl.TomPackageImpl#getPairPattern()
	 * @generated
	 */
	int PAIR_PATTERN = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_PATTERN__NAME = LINKABLE__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_PATTERN__PATTERN = LINKABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pair Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_PATTERN_FEATURE_COUNT = LINKABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pair Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_PATTERN_OPERATION_COUNT = LINKABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.StrategyConstructImpl <em>Strategy Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.StrategyConstructImpl
	 * @see tom.impl.TomPackageImpl#getStrategyConstruct()
	 * @generated
	 */
	int STRATEGY_CONSTRUCT = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_CONSTRUCT__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Extend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_CONSTRUCT__EXTEND = TYPE__EXTEND;

	/**
	 * The feature id for the '<em><b>Implement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_CONSTRUCT__IMPLEMENT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_CONSTRUCT__ARGS = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visitlist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_CONSTRUCT__VISITLIST = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Strategy Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_CONSTRUCT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Strategy Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_CONSTRUCT_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.StrategyVisitImpl <em>Strategy Visit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.StrategyVisitImpl
	 * @see tom.impl.TomPackageImpl#getStrategyVisit()
	 * @generated
	 */
	int STRATEGY_VISIT = 54;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_VISIT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_VISIT__ACTIONS = 1;

	/**
	 * The number of structural features of the '<em>Strategy Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_VISIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Strategy Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_VISIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.VisitActionImpl <em>Visit Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.VisitActionImpl
	 * @see tom.impl.TomPackageImpl#getVisitAction()
	 * @generated
	 */
	int VISIT_ACTION = 55;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT_ACTION__PATTERN = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT_ACTION__STATEMENTS = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT_ACTION__TERM = CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Visit Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT_ACTION_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Visit Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT_ACTION_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.PatternListImpl <em>Pattern List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.PatternListImpl
	 * @see tom.impl.TomPackageImpl#getPatternList()
	 * @generated
	 */
	int PATTERN_LIST = 56;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LIST__PATTERNS = 0;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LIST__REL = 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LIST__CONSTRAINT = 2;

	/**
	 * The number of structural features of the '<em>Pattern List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LIST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pattern List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.ConstraintOrImpl <em>Constraint Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ConstraintOrImpl
	 * @see tom.impl.TomPackageImpl#getConstraintOr()
	 * @generated
	 */
	int CONSTRAINT_OR = 58;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OR__LEFT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OR__RIGHT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constraint Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OR_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constraint Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OR_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ConstraintAndImpl <em>Constraint And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ConstraintAndImpl
	 * @see tom.impl.TomPackageImpl#getConstraintAnd()
	 * @generated
	 */
	int CONSTRAINT_AND = 59;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_AND__LEFT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_AND__RIGHT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constraint And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_AND_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constraint And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_AND_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ConstraintPImpl <em>Constraint P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ConstraintPImpl
	 * @see tom.impl.TomPackageImpl#getConstraintP()
	 * @generated
	 */
	int CONSTRAINT_P = 60;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_P__CONSTRAINT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_P_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constraint P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_P_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ConstraintMatchImpl <em>Constraint Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ConstraintMatchImpl
	 * @see tom.impl.TomPackageImpl#getConstraintMatch()
	 * @generated
	 */
	int CONSTRAINT_MATCH = 61;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_MATCH__PATTERN = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_MATCH__TYPE = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_MATCH__TERM = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraint Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_MATCH_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Constraint Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_MATCH_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ConstraintOpImpl <em>Constraint Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ConstraintOpImpl
	 * @see tom.impl.TomPackageImpl#getConstraintOp()
	 * @generated
	 */
	int CONSTRAINT_OP = 62;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OP__LEFT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OP__OPERATOR = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OP__RIGHT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraint Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OP_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Constraint Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OP_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.GomConstructImpl <em>Gom Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.GomConstructImpl
	 * @see tom.impl.TomPackageImpl#getGomConstruct()
	 * @generated
	 */
	int GOM_CONSTRUCT = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOM_CONSTRUCT__NAME = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOM_CONSTRUCT__OPTION = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOM_CONSTRUCT__IMPORTS = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOM_CONSTRUCT__DEFINITIONS = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gom Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOM_CONSTRUCT_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Gom Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOM_CONSTRUCT_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.DefinitionImpl
	 * @see tom.impl.TomPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 64;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.TypeDefinitionImpl
	 * @see tom.impl.TomPackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Extend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__EXTEND = TYPE__EXTEND;

	/**
	 * The feature id for the '<em><b>Op Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__OP_DEFINITION = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.OperatorDefinitionImpl <em>Operator Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.OperatorDefinitionImpl
	 * @see tom.impl.TomPackageImpl#getOperatorDefinition()
	 * @generated
	 */
	int OPERATOR_DEFINITION = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_DEFINITION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_DEFINITION__TYPE = OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_DEFINITION__ARGS = OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>Operator Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_DEFINITION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operator Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_DEFINITION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ArgumentsListImpl <em>Arguments List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ArgumentsListImpl
	 * @see tom.impl.TomPackageImpl#getArgumentsList()
	 * @generated
	 */
	int ARGUMENTS_LIST = 67;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_LIST__ARGS = ARGUMENTS__ARGS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_LIST__TYPE = ARGUMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arguments List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_LIST_FEATURE_COUNT = ARGUMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arguments List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_LIST_OPERATION_COUNT = ARGUMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.HookDefinitionImpl <em>Hook Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.HookDefinitionImpl
	 * @see tom.impl.TomPackageImpl#getHookDefinition()
	 * @generated
	 */
	int HOOK_DEFINITION = 68;

	/**
	 * The feature id for the '<em><b>Hook Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_DEFINITION__HOOK_OPERATION = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hook Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hook Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_DEFINITION_OPERATION_COUNT = DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.HookModuleDefinitionImpl <em>Hook Module Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.HookModuleDefinitionImpl
	 * @see tom.impl.TomPackageImpl#getHookModuleDefinition()
	 * @generated
	 */
	int HOOK_MODULE_DEFINITION = 69;

	/**
	 * The feature id for the '<em><b>Hook Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MODULE_DEFINITION__HOOK_OPERATION = HOOK_DEFINITION__HOOK_OPERATION;

	/**
	 * The feature id for the '<em><b>Hook Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MODULE_DEFINITION__HOOK_TYPE = HOOK_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hook Module Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MODULE_DEFINITION_FEATURE_COUNT = HOOK_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hook Module Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MODULE_DEFINITION_OPERATION_COUNT = HOOK_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.HookTypeDefinitionImpl <em>Hook Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.HookTypeDefinitionImpl
	 * @see tom.impl.TomPackageImpl#getHookTypeDefinition()
	 * @generated
	 */
	int HOOK_TYPE_DEFINITION = 70;

	/**
	 * The feature id for the '<em><b>Hook Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_TYPE_DEFINITION__HOOK_OPERATION = HOOK_DEFINITION__HOOK_OPERATION;

	/**
	 * The feature id for the '<em><b>Hook Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_TYPE_DEFINITION__HOOK_TYPE = HOOK_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hook Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_TYPE_DEFINITION_FEATURE_COUNT = HOOK_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hook Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_TYPE_DEFINITION_OPERATION_COUNT = HOOK_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.HookOperatorDefinitionImpl <em>Hook Operator Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.HookOperatorDefinitionImpl
	 * @see tom.impl.TomPackageImpl#getHookOperatorDefinition()
	 * @generated
	 */
	int HOOK_OPERATOR_DEFINITION = 71;

	/**
	 * The feature id for the '<em><b>Hook Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_OPERATOR_DEFINITION__HOOK_OPERATION = HOOK_DEFINITION__HOOK_OPERATION;

	/**
	 * The feature id for the '<em><b>Hook Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_OPERATOR_DEFINITION__HOOK_TYPE = HOOK_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hook Operator Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_OPERATOR_DEFINITION_FEATURE_COUNT = HOOK_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hook Operator Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_OPERATOR_DEFINITION_OPERATION_COUNT = HOOK_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.HookOperationImpl <em>Hook Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.HookOperationImpl
	 * @see tom.impl.TomPackageImpl#getHookOperation()
	 * @generated
	 */
	int HOOK_OPERATION = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_OPERATION__NAME = LINKABLE__NAME;

	/**
	 * The number of structural features of the '<em>Hook Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_OPERATION_FEATURE_COUNT = LINKABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hook Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_OPERATION_OPERATION_COUNT = LINKABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.HostHookOperationImpl <em>Host Hook Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.HostHookOperationImpl
	 * @see tom.impl.TomPackageImpl#getHostHookOperation()
	 * @generated
	 */
	int HOST_HOOK_OPERATION = 73;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_HOOK_OPERATION__NAME = HOOK_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_HOOK_OPERATION__ARGS = HOOK_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_HOOK_OPERATION__STATEMENTS = HOOK_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Host Hook Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_HOOK_OPERATION_FEATURE_COUNT = HOOK_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Host Hook Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_HOOK_OPERATION_OPERATION_COUNT = HOOK_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.Hook_RulesImpl <em>Hook Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.Hook_RulesImpl
	 * @see tom.impl.TomPackageImpl#getHook_Rules()
	 * @generated
	 */
	int HOOK_RULES = 74;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_RULES__NAME = HOOK_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_RULES__RULES = HOOK_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hook Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_RULES_FEATURE_COUNT = HOOK_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hook Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_RULES_OPERATION_COUNT = HOOK_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.Hook_GraphrulesImpl <em>Hook Graphrules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.Hook_GraphrulesImpl
	 * @see tom.impl.TomPackageImpl#getHook_Graphrules()
	 * @generated
	 */
	int HOOK_GRAPHRULES = 75;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_GRAPHRULES__NAME = HOOK_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_GRAPHRULES__MODE = HOOK_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Graph Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_GRAPHRULES__GRAPH_RULES = HOOK_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hook Graphrules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_GRAPHRULES_FEATURE_COUNT = HOOK_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hook Graphrules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_GRAPHRULES_OPERATION_COUNT = HOOK_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.Hook_MakeImpl <em>Hook Make</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.Hook_MakeImpl
	 * @see tom.impl.TomPackageImpl#getHook_Make()
	 * @generated
	 */
	int HOOK_MAKE = 76;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MAKE__NAME = HOST_HOOK_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MAKE__ARGS = HOST_HOOK_OPERATION__ARGS;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MAKE__STATEMENTS = HOST_HOOK_OPERATION__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Hook Make</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MAKE_FEATURE_COUNT = HOST_HOOK_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hook Make</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MAKE_OPERATION_COUNT = HOST_HOOK_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.Hook_Make_InsertImpl <em>Hook Make Insert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.Hook_Make_InsertImpl
	 * @see tom.impl.TomPackageImpl#getHook_Make_Insert()
	 * @generated
	 */
	int HOOK_MAKE_INSERT = 77;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MAKE_INSERT__NAME = HOST_HOOK_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MAKE_INSERT__ARGS = HOST_HOOK_OPERATION__ARGS;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MAKE_INSERT__STATEMENTS = HOST_HOOK_OPERATION__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Hook Make Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MAKE_INSERT_FEATURE_COUNT = HOST_HOOK_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hook Make Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MAKE_INSERT_OPERATION_COUNT = HOST_HOOK_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.Hook_Make_EmptyImpl <em>Hook Make Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.Hook_Make_EmptyImpl
	 * @see tom.impl.TomPackageImpl#getHook_Make_Empty()
	 * @generated
	 */
	int HOOK_MAKE_EMPTY = 78;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MAKE_EMPTY__NAME = HOST_HOOK_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MAKE_EMPTY__ARGS = HOST_HOOK_OPERATION__ARGS;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MAKE_EMPTY__STATEMENTS = HOST_HOOK_OPERATION__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Hook Make Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MAKE_EMPTY_FEATURE_COUNT = HOST_HOOK_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hook Make Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_MAKE_EMPTY_OPERATION_COUNT = HOST_HOOK_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.Hook_FreeImpl <em>Hook Free</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.Hook_FreeImpl
	 * @see tom.impl.TomPackageImpl#getHook_Free()
	 * @generated
	 */
	int HOOK_FREE = 79;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_FREE__NAME = HOST_HOOK_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_FREE__ARGS = HOST_HOOK_OPERATION__ARGS;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_FREE__STATEMENTS = HOST_HOOK_OPERATION__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Hook Free</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_FREE_FEATURE_COUNT = HOST_HOOK_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hook Free</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_FREE_OPERATION_COUNT = HOST_HOOK_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.Hook_FLImpl <em>Hook FL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.Hook_FLImpl
	 * @see tom.impl.TomPackageImpl#getHook_FL()
	 * @generated
	 */
	int HOOK_FL = 80;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_FL__NAME = HOST_HOOK_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_FL__ARGS = HOST_HOOK_OPERATION__ARGS;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_FL__STATEMENTS = HOST_HOOK_OPERATION__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Hook FL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_FL_FEATURE_COUNT = HOST_HOOK_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hook FL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_FL_OPERATION_COUNT = HOST_HOOK_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.Hook_AUImpl <em>Hook AU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.Hook_AUImpl
	 * @see tom.impl.TomPackageImpl#getHook_AU()
	 * @generated
	 */
	int HOOK_AU = 81;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_AU__NAME = HOST_HOOK_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_AU__ARGS = HOST_HOOK_OPERATION__ARGS;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_AU__STATEMENTS = HOST_HOOK_OPERATION__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_AU__TERM = HOST_HOOK_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hook AU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_AU_FEATURE_COUNT = HOST_HOOK_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hook AU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_AU_OPERATION_COUNT = HOST_HOOK_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.Hook_InterfaceImpl <em>Hook Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.Hook_InterfaceImpl
	 * @see tom.impl.TomPackageImpl#getHook_Interface()
	 * @generated
	 */
	int HOOK_INTERFACE = 82;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_INTERFACE__NAME = HOST_HOOK_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_INTERFACE__ARGS = HOST_HOOK_OPERATION__ARGS;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_INTERFACE__STATEMENTS = HOST_HOOK_OPERATION__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Hook Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_INTERFACE_FEATURE_COUNT = HOST_HOOK_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hook Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_INTERFACE_OPERATION_COUNT = HOST_HOOK_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.Hook_ImportsImpl <em>Hook Imports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.Hook_ImportsImpl
	 * @see tom.impl.TomPackageImpl#getHook_Imports()
	 * @generated
	 */
	int HOOK_IMPORTS = 83;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_IMPORTS__NAME = HOST_HOOK_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_IMPORTS__ARGS = HOST_HOOK_OPERATION__ARGS;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_IMPORTS__STATEMENTS = HOST_HOOK_OPERATION__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Hook Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_IMPORTS_FEATURE_COUNT = HOST_HOOK_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hook Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_IMPORTS_OPERATION_COUNT = HOST_HOOK_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.Hook_BlockImpl <em>Hook Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.Hook_BlockImpl
	 * @see tom.impl.TomPackageImpl#getHook_Block()
	 * @generated
	 */
	int HOOK_BLOCK = 84;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_BLOCK__NAME = HOST_HOOK_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_BLOCK__ARGS = HOST_HOOK_OPERATION__ARGS;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_BLOCK__STATEMENTS = HOST_HOOK_OPERATION__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Hook Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_BLOCK_FEATURE_COUNT = HOST_HOOK_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hook Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_BLOCK_OPERATION_COUNT = HOST_HOOK_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.RuleImpl
	 * @see tom.impl.TomPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 85;

	/**
	 * The feature id for the '<em><b>Rule Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TERM = 1;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__COND = 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ConditionImpl
	 * @see tom.impl.TomPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 95;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.RulePatternImpl <em>Rule Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.RulePatternImpl
	 * @see tom.impl.TomPackageImpl#getRulePattern()
	 * @generated
	 */
	int RULE_PATTERN = 86;

	/**
	 * The number of structural features of the '<em>Rule Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PATTERN_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rule Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PATTERN_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.NamedRulePatternImpl <em>Named Rule Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.NamedRulePatternImpl
	 * @see tom.impl.TomPackageImpl#getNamedRulePattern()
	 * @generated
	 */
	int NAMED_RULE_PATTERN = 87;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RULE_PATTERN__NAME = RULE_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RULE_PATTERN__TYPE = RULE_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Plain Rule Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN = RULE_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Named Rule Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RULE_PATTERN_FEATURE_COUNT = RULE_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Named Rule Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_RULE_PATTERN_OPERATION_COUNT = RULE_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.AntiRulePatternImpl <em>Anti Rule Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.AntiRulePatternImpl
	 * @see tom.impl.TomPackageImpl#getAntiRulePattern()
	 * @generated
	 */
	int ANTI_RULE_PATTERN = 88;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RULE_PATTERN__PATTERN = RULE_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anti Rule Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RULE_PATTERN_FEATURE_COUNT = RULE_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Anti Rule Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_RULE_PATTERN_OPERATION_COUNT = RULE_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.PlainRulePatternOperationImpl <em>Plain Rule Pattern Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.PlainRulePatternOperationImpl
	 * @see tom.impl.TomPackageImpl#getPlainRulePatternOperation()
	 * @generated
	 */
	int PLAIN_RULE_PATTERN_OPERATION = 89;

	/**
	 * The feature id for the '<em><b>Heads</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_RULE_PATTERN_OPERATION__HEADS = RULE_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_RULE_PATTERN_OPERATION__RULES = RULE_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plain Rule Pattern Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_RULE_PATTERN_OPERATION_FEATURE_COUNT = RULE_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Plain Rule Pattern Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_RULE_PATTERN_OPERATION_OPERATION_COUNT = RULE_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.GraphRuleImpl <em>Graph Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.GraphRuleImpl
	 * @see tom.impl.TomPackageImpl#getGraphRule()
	 * @generated
	 */
	int GRAPH_RULE = 90;

	/**
	 * The feature id for the '<em><b>Termcond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_RULE__TERMCOND = 0;

	/**
	 * The feature id for the '<em><b>Term Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_RULE__TERM_GRAPH = 1;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_RULE__COND = 2;

	/**
	 * The number of structural features of the '<em>Graph Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Graph Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.TermGraphImpl <em>Term Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.TermGraphImpl
	 * @see tom.impl.TomPackageImpl#getTermGraph()
	 * @generated
	 */
	int TERM_GRAPH = 91;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_GRAPH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Term Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_GRAPH__TERM_GRAPH = 1;

	/**
	 * The number of structural features of the '<em>Term Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_GRAPH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Term Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.PlainTermGraphImpl <em>Plain Term Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.PlainTermGraphImpl
	 * @see tom.impl.TomPackageImpl#getPlainTermGraph()
	 * @generated
	 */
	int PLAIN_TERM_GRAPH = 92;

	/**
	 * The number of structural features of the '<em>Plain Term Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TERM_GRAPH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Plain Term Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TERM_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.TermGraphVariableImpl <em>Term Graph Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.TermGraphVariableImpl
	 * @see tom.impl.TomPackageImpl#getTermGraphVariable()
	 * @generated
	 */
	int TERM_GRAPH_VARIABLE = 93;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_GRAPH_VARIABLE__NAME = PLAIN_TERM_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_GRAPH_VARIABLE__LABEL = PLAIN_TERM_GRAPH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Term Graph Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_GRAPH_VARIABLE_FEATURE_COUNT = PLAIN_TERM_GRAPH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Term Graph Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_GRAPH_VARIABLE_OPERATION_COUNT = PLAIN_TERM_GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.TermGraphFuncImpl <em>Term Graph Func</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.TermGraphFuncImpl
	 * @see tom.impl.TomPackageImpl#getTermGraphFunc()
	 * @generated
	 */
	int TERM_GRAPH_FUNC = 94;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_GRAPH_FUNC__HEAD = PLAIN_TERM_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_GRAPH_FUNC__TERMS = PLAIN_TERM_GRAPH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Term Graph Func</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_GRAPH_FUNC_FEATURE_COUNT = PLAIN_TERM_GRAPH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Term Graph Func</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_GRAPH_FUNC_OPERATION_COUNT = PLAIN_TERM_GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ConditionOrImpl <em>Condition Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ConditionOrImpl
	 * @see tom.impl.TomPackageImpl#getConditionOr()
	 * @generated
	 */
	int CONDITION_OR = 96;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OR__LEFT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OR__RIGHT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OR_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Condition Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OR_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ConditionAndImpl <em>Condition And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ConditionAndImpl
	 * @see tom.impl.TomPackageImpl#getConditionAnd()
	 * @generated
	 */
	int CONDITION_AND = 97;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_AND__LEFT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_AND__RIGHT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_AND_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Condition And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_AND_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ConditionPImpl <em>Condition P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ConditionPImpl
	 * @see tom.impl.TomPackageImpl#getConditionP()
	 * @generated
	 */
	int CONDITION_P = 98;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_P__CONDITION = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_P_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Condition P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_P_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ConditionRuleImpl <em>Condition Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ConditionRuleImpl
	 * @see tom.impl.TomPackageImpl#getConditionRule()
	 * @generated
	 */
	int CONDITION_RULE = 99;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_RULE__RULE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_RULE__TERM = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_RULE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Condition Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_RULE_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ConditionOpImpl <em>Condition Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ConditionOpImpl
	 * @see tom.impl.TomPackageImpl#getConditionOp()
	 * @generated
	 */
	int CONDITION_OP = 100;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OP__LEFT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OP__OPERATOR = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OP__RIGHT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Condition Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OP_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Condition Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OP_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.XMLTermImpl <em>XML Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.XMLTermImpl
	 * @see tom.impl.TomPackageImpl#getXMLTerm()
	 * @generated
	 */
	int XML_TERM = 101;

	/**
	 * The number of structural features of the '<em>XML Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XML Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.XMLTermSimpleImpl <em>XML Term Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.XMLTermSimpleImpl
	 * @see tom.impl.TomPackageImpl#getXMLTermSimple()
	 * @generated
	 */
	int XML_TERM_SIMPLE = 102;

	/**
	 * The feature id for the '<em><b>Name List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_SIMPLE__NAME_LIST = XML_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_SIMPLE__ATTR_LIST = XML_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XML Term Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_SIMPLE_FEATURE_COUNT = XML_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XML Term Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_SIMPLE_OPERATION_COUNT = XML_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.XMLTermDoubleImpl <em>XML Term Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.XMLTermDoubleImpl
	 * @see tom.impl.TomPackageImpl#getXMLTermDouble()
	 * @generated
	 */
	int XML_TERM_DOUBLE = 103;

	/**
	 * The feature id for the '<em><b>Name List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_DOUBLE__NAME_LIST = XML_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_DOUBLE__ATTR_LIST = XML_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_DOUBLE__CHILDS = XML_TERM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_DOUBLE__LIST = XML_TERM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>XML Term Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_DOUBLE_FEATURE_COUNT = XML_TERM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>XML Term Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_DOUBLE_OPERATION_COUNT = XML_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.XMLTermTextImpl <em>XML Term Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.XMLTermTextImpl
	 * @see tom.impl.TomPackageImpl#getXMLTermText()
	 * @generated
	 */
	int XML_TERM_TEXT = 104;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_TEXT__NAME = XML_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XML Term Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_TEXT_FEATURE_COUNT = XML_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XML Term Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_TEXT_OPERATION_COUNT = XML_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.XMLTermCommentImpl <em>XML Term Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.XMLTermCommentImpl
	 * @see tom.impl.TomPackageImpl#getXMLTermComment()
	 * @generated
	 */
	int XML_TERM_COMMENT = 105;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_COMMENT__NAME = XML_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XML Term Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_COMMENT_FEATURE_COUNT = XML_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XML Term Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_COMMENT_OPERATION_COUNT = XML_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.XMLTermProcessImpl <em>XML Term Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.XMLTermProcessImpl
	 * @see tom.impl.TomPackageImpl#getXMLTermProcess()
	 * @generated
	 */
	int XML_TERM_PROCESS = 106;

	/**
	 * The feature id for the '<em><b>Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_PROCESS__NAME1 = XML_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_PROCESS__NAME2 = XML_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XML Term Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_PROCESS_FEATURE_COUNT = XML_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XML Term Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TERM_PROCESS_OPERATION_COUNT = XML_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.XMLNameListImpl <em>XML Name List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.XMLNameListImpl
	 * @see tom.impl.TomPackageImpl#getXMLNameList()
	 * @generated
	 */
	int XML_NAME_LIST = 107;

	/**
	 * The feature id for the '<em><b>XML Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAME_LIST__XML_NAME = 0;

	/**
	 * The number of structural features of the '<em>XML Name List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAME_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>XML Name List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_NAME_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.XMLAttrListImpl <em>XML Attr List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.XMLAttrListImpl
	 * @see tom.impl.TomPackageImpl#getXMLAttrList()
	 * @generated
	 */
	int XML_ATTR_LIST = 108;

	/**
	 * The feature id for the '<em><b>Attrs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTR_LIST__ATTRS = 0;

	/**
	 * The number of structural features of the '<em>XML Attr List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTR_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>XML Attr List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTR_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.XMLAttributeImpl <em>XML Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.XMLAttributeImpl
	 * @see tom.impl.TomPackageImpl#getXMLAttribute()
	 * @generated
	 */
	int XML_ATTRIBUTE = 109;

	/**
	 * The number of structural features of the '<em>XML Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>XML Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.XMLAttribute1Impl <em>XML Attribute1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.XMLAttribute1Impl
	 * @see tom.impl.TomPackageImpl#getXMLAttribute1()
	 * @generated
	 */
	int XML_ATTRIBUTE1 = 110;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE1__NAME = XML_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XML Attribute1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE1_FEATURE_COUNT = XML_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XML Attribute1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE1_OPERATION_COUNT = XML_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.XMLAttribute2Impl <em>XML Attribute2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.XMLAttribute2Impl
	 * @see tom.impl.TomPackageImpl#getXMLAttribute2()
	 * @generated
	 */
	int XML_ATTRIBUTE2 = 111;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE2__ATTRIBUTE_NAME = XML_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annoted Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE2__ANNOTED_NAME = XML_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE2__NAME = XML_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XML Attribute2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE2_FEATURE_COUNT = XML_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>XML Attribute2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE2_OPERATION_COUNT = XML_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.XMLAttribute3Impl <em>XML Attribute3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.XMLAttribute3Impl
	 * @see tom.impl.TomPackageImpl#getXMLAttribute3()
	 * @generated
	 */
	int XML_ATTRIBUTE3 = 112;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE3__ATTRIBUTE_NAME = XML_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annoted Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE3__ANNOTED_NAME = XML_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE3__NAME = XML_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XML Attribute3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE3_FEATURE_COUNT = XML_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>XML Attribute3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE3_OPERATION_COUNT = XML_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.XMLChildsImpl <em>XML Childs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.XMLChildsImpl
	 * @see tom.impl.TomPackageImpl#getXMLChilds()
	 * @generated
	 */
	int XML_CHILDS = 113;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CHILDS__TERMS = 0;

	/**
	 * The number of structural features of the '<em>XML Childs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CHILDS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>XML Childs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CHILDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tom.impl.TypeTermImpl <em>Type Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.TypeTermImpl
	 * @see tom.impl.TomPackageImpl#getTypeTerm()
	 * @generated
	 */
	int TYPE_TERM = 114;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TERM__NAME = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TERM__EXTEND = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TERM__HOTE = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TERM__TYPE = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TERM__KEYS = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Type Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TERM_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Type Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TERM_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.KeyWordImpl <em>Key Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.KeyWordImpl
	 * @see tom.impl.TomPackageImpl#getKeyWord()
	 * @generated
	 */
	int KEY_WORD = 115;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_WORD__NAME = LINKABLE__NAME;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_WORD__ARGS = LINKABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_WORD__HOTE = LINKABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Key Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_WORD_FEATURE_COUNT = LINKABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Key Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_WORD_OPERATION_COUNT = LINKABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.OperatorImpl
	 * @see tom.impl.TomPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 116;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__NAME = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__TYPE = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__ARGS = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__KEYS = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.OperatorListImpl <em>Operator List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.OperatorListImpl
	 * @see tom.impl.TomPackageImpl#getOperatorList()
	 * @generated
	 */
	int OPERATOR_LIST = 117;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST__NAME = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST__TYPE = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST__ARGS = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST__KEYS = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Operator List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Operator List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_LIST_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.OperatorArrayImpl <em>Operator Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.OperatorArrayImpl
	 * @see tom.impl.TomPackageImpl#getOperatorArray()
	 * @generated
	 */
	int OPERATOR_ARRAY = 118;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_ARRAY__NAME = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_ARRAY__TYPE = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_ARRAY__ARGS = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_ARRAY__KEYS = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Operator Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_ARRAY_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Operator Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_ARRAY_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.TransformationImpl
	 * @see tom.impl.TomPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 119;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TYPE = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__ARGS = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__FILE_FROM = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>File To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__FILE_TO = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Elementary Tranformations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__ELEMENTARY_TRANFORMATIONS = BLOCK_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ElementaryTransformationImpl <em>Elementary Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ElementaryTransformationImpl
	 * @see tom.impl.TomPackageImpl#getElementaryTransformation()
	 * @generated
	 */
	int ELEMENTARY_TRANSFORMATION = 120;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TRANSFORMATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TRANSFORMATION__TYPE = OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TRANSFORMATION__ARGS = OPERATION__ARGS;

	/**
	 * The feature id for the '<em><b>Implement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TRANSFORMATION__IMPLEMENT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elementary Transformation Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TRANSFORMATION__ELEMENTARY_TRANSFORMATION_RULES = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Elementary Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TRANSFORMATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Elementary Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TRANSFORMATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ElementaryTransformationRuleImpl <em>Elementary Transformation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ElementaryTransformationRuleImpl
	 * @see tom.impl.TomPackageImpl#getElementaryTransformationRule()
	 * @generated
	 */
	int ELEMENTARY_TRANSFORMATION_RULE = 121;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TRANSFORMATION_RULE__PATTERN = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TRANSFORMATION_RULE__STATEMENTS = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Elementary Transformation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TRANSFORMATION_RULE_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Elementary Transformation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_TRANSFORMATION_RULE_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.TracelinkImpl <em>Tracelink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.TracelinkImpl
	 * @see tom.impl.TomPackageImpl#getTracelink()
	 * @generated
	 */
	int TRACELINK = 122;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACELINK__NAME = GLOBAL_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACELINK__TYPE = GLOBAL_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACELINK__TERM = GLOBAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tracelink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACELINK_FEATURE_COUNT = GLOBAL_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tracelink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACELINK_OPERATION_COUNT = GLOBAL_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.impl.ResolveImpl <em>Resolve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.impl.ResolveImpl
	 * @see tom.impl.TomPackageImpl#getResolve()
	 * @generated
	 */
	int RESOLVE = 123;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE__SOURCE = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE__TYPE = TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE__TARGET = TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resolve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_FEATURE_COUNT = TERM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Resolve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tom.RelOperator <em>Rel Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tom.RelOperator
	 * @see tom.impl.TomPackageImpl#getRelOperator()
	 * @generated
	 */
	int REL_OPERATOR = 124;


	/**
	 * Returns the meta object for class '{@link tom.HostCode <em>Host Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Code</em>'.
	 * @see tom.HostCode
	 * @generated
	 */
	EClass getHostCode();

	/**
	 * Returns the meta object for the attribute '{@link tom.HostCode#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tom.HostCode#getCode()
	 * @see #getHostCode()
	 * @generated
	 */
	EAttribute getHostCode_Code();

	/**
	 * Returns the meta object for class '{@link tom.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see tom.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link tom.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see tom.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the containment reference '{@link tom.Call#getCall <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Call</em>'.
	 * @see tom.Call#getCall()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Call();

	/**
	 * Returns the meta object for class '{@link tom.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see tom.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link tom.Declaration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see tom.Declaration#getValue()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Value();

	/**
	 * Returns the meta object for class '{@link tom.Affectation <em>Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affectation</em>'.
	 * @see tom.Affectation
	 * @generated
	 */
	EClass getAffectation();

	/**
	 * Returns the meta object for the reference '{@link tom.Affectation#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see tom.Affectation#getVariable()
	 * @see #getAffectation()
	 * @generated
	 */
	EReference getAffectation_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link tom.Affectation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see tom.Affectation#getValue()
	 * @see #getAffectation()
	 * @generated
	 */
	EReference getAffectation_Value();

	/**
	 * Returns the meta object for class '{@link tom.Tom <em>Tom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tom</em>'.
	 * @see tom.Tom
	 * @generated
	 */
	EClass getTom();

	/**
	 * Returns the meta object for the attribute '{@link tom.Tom#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see tom.Tom#getNamespace()
	 * @see #getTom()
	 * @generated
	 */
	EAttribute getTom_Namespace();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.Tom#getBlocs <em>Blocs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocs</em>'.
	 * @see tom.Tom#getBlocs()
	 * @see #getTom()
	 * @generated
	 */
	EReference getTom_Blocs();

	/**
	 * Returns the meta object for class '{@link tom.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see tom.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link tom.Linkable <em>Linkable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linkable</em>'.
	 * @see tom.Linkable
	 * @generated
	 */
	EClass getLinkable();

	/**
	 * Returns the meta object for the attribute '{@link tom.Linkable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tom.Linkable#getName()
	 * @see #getLinkable()
	 * @generated
	 */
	EAttribute getLinkable_Name();

	/**
	 * Returns the meta object for class '{@link tom.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see tom.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the reference '{@link tom.Type#getExtend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extend</em>'.
	 * @see tom.Type#getExtend()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Extend();

	/**
	 * Returns the meta object for class '{@link tom.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see tom.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference '{@link tom.Operation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see tom.Operation#getType()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Type();

	/**
	 * Returns the meta object for the containment reference '{@link tom.Operation#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Args</em>'.
	 * @see tom.Operation#getArgs()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Args();

	/**
	 * Returns the meta object for class '{@link tom.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see tom.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link tom.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see tom.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for class '{@link tom.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable</em>'.
	 * @see tom.GlobalVariable
	 * @generated
	 */
	EClass getGlobalVariable();

	/**
	 * Returns the meta object for class '{@link tom.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable</em>'.
	 * @see tom.LocalVariable
	 * @generated
	 */
	EClass getLocalVariable();

	/**
	 * Returns the meta object for class '{@link tom.VariableSimple <em>Variable Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Simple</em>'.
	 * @see tom.VariableSimple
	 * @generated
	 */
	EClass getVariableSimple();

	/**
	 * Returns the meta object for class '{@link tom.VariableList <em>Variable List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable List</em>'.
	 * @see tom.VariableList
	 * @generated
	 */
	EClass getVariableList();

	/**
	 * Returns the meta object for class '{@link tom.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see tom.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for class '{@link tom.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see tom.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.Function#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see tom.Function#getStatements()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Statements();

	/**
	 * Returns the meta object for class '{@link tom.Callback <em>Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callback</em>'.
	 * @see tom.Callback
	 * @generated
	 */
	EClass getCallback();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.Callback#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see tom.Callback#getOperations()
	 * @see #getCallback()
	 * @generated
	 */
	EReference getCallback_Operations();

	/**
	 * Returns the meta object for class '{@link tom.CallbackDefinition <em>Callback Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callback Definition</em>'.
	 * @see tom.CallbackDefinition
	 * @generated
	 */
	EClass getCallbackDefinition();

	/**
	 * Returns the meta object for class '{@link tom.Arguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arguments</em>'.
	 * @see tom.Arguments
	 * @generated
	 */
	EClass getArguments();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.Arguments#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see tom.Arguments#getArgs()
	 * @see #getArguments()
	 * @generated
	 */
	EReference getArguments_Args();

	/**
	 * Returns the meta object for class '{@link tom.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see tom.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for class '{@link tom.ArgumentTypeSuffix <em>Argument Type Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Type Suffix</em>'.
	 * @see tom.ArgumentTypeSuffix
	 * @generated
	 */
	EClass getArgumentTypeSuffix();

	/**
	 * Returns the meta object for class '{@link tom.ArgumentTypePrefix <em>Argument Type Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Type Prefix</em>'.
	 * @see tom.ArgumentTypePrefix
	 * @generated
	 */
	EClass getArgumentTypePrefix();

	/**
	 * Returns the meta object for class '{@link tom.ImportConstruct <em>Import Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Construct</em>'.
	 * @see tom.ImportConstruct
	 * @generated
	 */
	EClass getImportConstruct();

	/**
	 * Returns the meta object for the reference '{@link tom.ImportConstruct#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see tom.ImportConstruct#getType()
	 * @see #getImportConstruct()
	 * @generated
	 */
	EReference getImportConstruct_Type();

	/**
	 * Returns the meta object for class '{@link tom.IncludeConstruct <em>Include Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include Construct</em>'.
	 * @see tom.IncludeConstruct
	 * @generated
	 */
	EClass getIncludeConstruct();

	/**
	 * Returns the meta object for the attribute '{@link tom.IncludeConstruct#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see tom.IncludeConstruct#getImportURI()
	 * @see #getIncludeConstruct()
	 * @generated
	 */
	EAttribute getIncludeConstruct_ImportURI();

	/**
	 * Returns the meta object for the attribute '{@link tom.IncludeConstruct#getExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext</em>'.
	 * @see tom.IncludeConstruct#getExt()
	 * @see #getIncludeConstruct()
	 * @generated
	 */
	EAttribute getIncludeConstruct_Ext();

	/**
	 * Returns the meta object for class '{@link tom.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see tom.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link tom.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see tom.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for class '{@link tom.TermSum <em>Term Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Sum</em>'.
	 * @see tom.TermSum
	 * @generated
	 */
	EClass getTermSum();

	/**
	 * Returns the meta object for the containment reference '{@link tom.TermSum#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see tom.TermSum#getLeft()
	 * @see #getTermSum()
	 * @generated
	 */
	EReference getTermSum_Left();

	/**
	 * Returns the meta object for the containment reference '{@link tom.TermSum#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see tom.TermSum#getRight()
	 * @see #getTermSum()
	 * @generated
	 */
	EReference getTermSum_Right();

	/**
	 * Returns the meta object for class '{@link tom.TermConst <em>Term Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Const</em>'.
	 * @see tom.TermConst
	 * @generated
	 */
	EClass getTermConst();

	/**
	 * Returns the meta object for the attribute '{@link tom.TermConst#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see tom.TermConst#getString()
	 * @see #getTermConst()
	 * @generated
	 */
	EAttribute getTermConst_String();

	/**
	 * Returns the meta object for the attribute '{@link tom.TermConst#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int</em>'.
	 * @see tom.TermConst#getInt()
	 * @see #getTermConst()
	 * @generated
	 */
	EAttribute getTermConst_Int();

	/**
	 * Returns the meta object for class '{@link tom.TermNull <em>Term Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Null</em>'.
	 * @see tom.TermNull
	 * @generated
	 */
	EClass getTermNull();

	/**
	 * Returns the meta object for class '{@link tom.TermVariable <em>Term Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Variable</em>'.
	 * @see tom.TermVariable
	 * @generated
	 */
	EClass getTermVariable();

	/**
	 * Returns the meta object for the reference '{@link tom.TermVariable#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var</em>'.
	 * @see tom.TermVariable#getVar()
	 * @see #getTermVariable()
	 * @generated
	 */
	EReference getTermVariable_Var();

	/**
	 * Returns the meta object for class '{@link tom.TermOperation <em>Term Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Operation</em>'.
	 * @see tom.TermOperation
	 * @generated
	 */
	EClass getTermOperation();

	/**
	 * Returns the meta object for the reference '{@link tom.TermOperation#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see tom.TermOperation#getOp()
	 * @see #getTermOperation()
	 * @generated
	 */
	EReference getTermOperation_Op();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.TermOperation#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see tom.TermOperation#getTerms()
	 * @see #getTermOperation()
	 * @generated
	 */
	EReference getTermOperation_Terms();

	/**
	 * Returns the meta object for class '{@link tom.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see tom.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the containment reference '{@link tom.Return#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see tom.Return#getReturn()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_Return();

	/**
	 * Returns the meta object for class '{@link tom.MatchConsctruct <em>Match Consctruct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Consctruct</em>'.
	 * @see tom.MatchConsctruct
	 * @generated
	 */
	EClass getMatchConsctruct();

	/**
	 * Returns the meta object for class '{@link tom.MatchPattern <em>Match Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Pattern</em>'.
	 * @see tom.MatchPattern
	 * @generated
	 */
	EClass getMatchPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.MatchPattern#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see tom.MatchPattern#getArgs()
	 * @see #getMatchPattern()
	 * @generated
	 */
	EReference getMatchPattern_Args();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.MatchPattern#getPatternActions <em>Pattern Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pattern Actions</em>'.
	 * @see tom.MatchPattern#getPatternActions()
	 * @see #getMatchPattern()
	 * @generated
	 */
	EReference getMatchPattern_PatternActions();

	/**
	 * Returns the meta object for class '{@link tom.ArgumentMatch <em>Argument Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Match</em>'.
	 * @see tom.ArgumentMatch
	 * @generated
	 */
	EClass getArgumentMatch();

	/**
	 * Returns the meta object for the reference '{@link tom.ArgumentMatch#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see tom.ArgumentMatch#getType()
	 * @see #getArgumentMatch()
	 * @generated
	 */
	EReference getArgumentMatch_Type();

	/**
	 * Returns the meta object for the reference '{@link tom.ArgumentMatch#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var</em>'.
	 * @see tom.ArgumentMatch#getVar()
	 * @see #getArgumentMatch()
	 * @generated
	 */
	EReference getArgumentMatch_Var();

	/**
	 * Returns the meta object for class '{@link tom.PatternAction <em>Pattern Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Action</em>'.
	 * @see tom.PatternAction
	 * @generated
	 */
	EClass getPatternAction();

	/**
	 * Returns the meta object for the containment reference '{@link tom.PatternAction#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Patterns</em>'.
	 * @see tom.PatternAction#getPatterns()
	 * @see #getPatternAction()
	 * @generated
	 */
	EReference getPatternAction_Patterns();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.PatternAction#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see tom.PatternAction#getStatements()
	 * @see #getPatternAction()
	 * @generated
	 */
	EReference getPatternAction_Statements();

	/**
	 * Returns the meta object for class '{@link tom.ConstraintPattern <em>Constraint Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Pattern</em>'.
	 * @see tom.ConstraintPattern
	 * @generated
	 */
	EClass getConstraintPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.ConstraintPattern#getConstraintActions <em>Constraint Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint Actions</em>'.
	 * @see tom.ConstraintPattern#getConstraintActions()
	 * @see #getConstraintPattern()
	 * @generated
	 */
	EReference getConstraintPattern_ConstraintActions();

	/**
	 * Returns the meta object for class '{@link tom.ConstraintAction <em>Constraint Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Action</em>'.
	 * @see tom.ConstraintAction
	 * @generated
	 */
	EClass getConstraintAction();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConstraintAction#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see tom.ConstraintAction#getConstraint()
	 * @see #getConstraintAction()
	 * @generated
	 */
	EReference getConstraintAction_Constraint();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.ConstraintAction#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see tom.ConstraintAction#getStatements()
	 * @see #getConstraintAction()
	 * @generated
	 */
	EReference getConstraintAction_Statements();

	/**
	 * Returns the meta object for class '{@link tom.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see tom.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for class '{@link tom.NamedPattern <em>Named Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Pattern</em>'.
	 * @see tom.NamedPattern
	 * @generated
	 */
	EClass getNamedPattern();

	/**
	 * Returns the meta object for the containment reference '{@link tom.NamedPattern#getPlainPattern <em>Plain Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plain Pattern</em>'.
	 * @see tom.NamedPattern#getPlainPattern()
	 * @see #getNamedPattern()
	 * @generated
	 */
	EReference getNamedPattern_PlainPattern();

	/**
	 * Returns the meta object for class '{@link tom.AntiPattern <em>Anti Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anti Pattern</em>'.
	 * @see tom.AntiPattern
	 * @generated
	 */
	EClass getAntiPattern();

	/**
	 * Returns the meta object for the containment reference '{@link tom.AntiPattern#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see tom.AntiPattern#getPattern()
	 * @see #getAntiPattern()
	 * @generated
	 */
	EReference getAntiPattern_Pattern();

	/**
	 * Returns the meta object for class '{@link tom.PlainPatternConst <em>Plain Pattern Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Pattern Const</em>'.
	 * @see tom.PlainPatternConst
	 * @generated
	 */
	EClass getPlainPatternConst();

	/**
	 * Returns the meta object for the attribute '{@link tom.PlainPatternConst#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Head</em>'.
	 * @see tom.PlainPatternConst#getHead()
	 * @see #getPlainPatternConst()
	 * @generated
	 */
	EAttribute getPlainPatternConst_Head();

	/**
	 * Returns the meta object for class '{@link tom.PlainPatternVariable <em>Plain Pattern Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Pattern Variable</em>'.
	 * @see tom.PlainPatternVariable
	 * @generated
	 */
	EClass getPlainPatternVariable();

	/**
	 * Returns the meta object for class '{@link tom.JokerPattern <em>Joker Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joker Pattern</em>'.
	 * @see tom.JokerPattern
	 * @generated
	 */
	EClass getJokerPattern();

	/**
	 * Returns the meta object for class '{@link tom.PlainPatternOperation <em>Plain Pattern Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Pattern Operation</em>'.
	 * @see tom.PlainPatternOperation
	 * @generated
	 */
	EClass getPlainPatternOperation();

	/**
	 * Returns the meta object for the containment reference '{@link tom.PlainPatternOperation#getHeads <em>Heads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Heads</em>'.
	 * @see tom.PlainPatternOperation#getHeads()
	 * @see #getPlainPatternOperation()
	 * @generated
	 */
	EReference getPlainPatternOperation_Heads();

	/**
	 * Returns the meta object for the containment reference '{@link tom.PlainPatternOperation#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see tom.PlainPatternOperation#getList()
	 * @see #getPlainPatternOperation()
	 * @generated
	 */
	EReference getPlainPatternOperation_List();

	/**
	 * Returns the meta object for class '{@link tom.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see tom.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for class '{@link tom.OperationList <em>Operation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation List</em>'.
	 * @see tom.OperationList
	 * @generated
	 */
	EClass getOperationList();

	/**
	 * Returns the meta object for the reference list '{@link tom.OperationList#getHeads <em>Heads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Heads</em>'.
	 * @see tom.OperationList#getHeads()
	 * @see #getOperationList()
	 * @generated
	 */
	EReference getOperationList_Heads();

	/**
	 * Returns the meta object for the attribute '{@link tom.OperationList#isLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log</em>'.
	 * @see tom.OperationList#isLog()
	 * @see #getOperationList()
	 * @generated
	 */
	EAttribute getOperationList_Log();

	/**
	 * Returns the meta object for class '{@link tom.ExplicitTermList <em>Explicit Term List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explicit Term List</em>'.
	 * @see tom.ExplicitTermList
	 * @generated
	 */
	EClass getExplicitTermList();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.ExplicitTermList#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patterns</em>'.
	 * @see tom.ExplicitTermList#getPatterns()
	 * @see #getExplicitTermList()
	 * @generated
	 */
	EReference getExplicitTermList_Patterns();

	/**
	 * Returns the meta object for class '{@link tom.PlainPatternVariableList <em>Plain Pattern Variable List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Pattern Variable List</em>'.
	 * @see tom.PlainPatternVariableList
	 * @generated
	 */
	EClass getPlainPatternVariableList();

	/**
	 * Returns the meta object for class '{@link tom.AnyPattern <em>Any Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Pattern</em>'.
	 * @see tom.AnyPattern
	 * @generated
	 */
	EClass getAnyPattern();

	/**
	 * Returns the meta object for class '{@link tom.ImplicitPairList <em>Implicit Pair List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Pair List</em>'.
	 * @see tom.ImplicitPairList
	 * @generated
	 */
	EClass getImplicitPairList();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.ImplicitPairList#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patterns</em>'.
	 * @see tom.ImplicitPairList#getPatterns()
	 * @see #getImplicitPairList()
	 * @generated
	 */
	EReference getImplicitPairList_Patterns();

	/**
	 * Returns the meta object for class '{@link tom.PairPattern <em>Pair Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pair Pattern</em>'.
	 * @see tom.PairPattern
	 * @generated
	 */
	EClass getPairPattern();

	/**
	 * Returns the meta object for the containment reference '{@link tom.PairPattern#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see tom.PairPattern#getPattern()
	 * @see #getPairPattern()
	 * @generated
	 */
	EReference getPairPattern_Pattern();

	/**
	 * Returns the meta object for class '{@link tom.StrategyConstruct <em>Strategy Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy Construct</em>'.
	 * @see tom.StrategyConstruct
	 * @generated
	 */
	EClass getStrategyConstruct();

	/**
	 * Returns the meta object for the containment reference '{@link tom.StrategyConstruct#getImplement <em>Implement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implement</em>'.
	 * @see tom.StrategyConstruct#getImplement()
	 * @see #getStrategyConstruct()
	 * @generated
	 */
	EReference getStrategyConstruct_Implement();

	/**
	 * Returns the meta object for the containment reference '{@link tom.StrategyConstruct#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Args</em>'.
	 * @see tom.StrategyConstruct#getArgs()
	 * @see #getStrategyConstruct()
	 * @generated
	 */
	EReference getStrategyConstruct_Args();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.StrategyConstruct#getVisitlist <em>Visitlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visitlist</em>'.
	 * @see tom.StrategyConstruct#getVisitlist()
	 * @see #getStrategyConstruct()
	 * @generated
	 */
	EReference getStrategyConstruct_Visitlist();

	/**
	 * Returns the meta object for class '{@link tom.StrategyVisit <em>Strategy Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy Visit</em>'.
	 * @see tom.StrategyVisit
	 * @generated
	 */
	EClass getStrategyVisit();

	/**
	 * Returns the meta object for the reference '{@link tom.StrategyVisit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see tom.StrategyVisit#getType()
	 * @see #getStrategyVisit()
	 * @generated
	 */
	EReference getStrategyVisit_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.StrategyVisit#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see tom.StrategyVisit#getActions()
	 * @see #getStrategyVisit()
	 * @generated
	 */
	EReference getStrategyVisit_Actions();

	/**
	 * Returns the meta object for class '{@link tom.VisitAction <em>Visit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visit Action</em>'.
	 * @see tom.VisitAction
	 * @generated
	 */
	EClass getVisitAction();

	/**
	 * Returns the meta object for the containment reference '{@link tom.VisitAction#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see tom.VisitAction#getPattern()
	 * @see #getVisitAction()
	 * @generated
	 */
	EReference getVisitAction_Pattern();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.VisitAction#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see tom.VisitAction#getStatements()
	 * @see #getVisitAction()
	 * @generated
	 */
	EReference getVisitAction_Statements();

	/**
	 * Returns the meta object for the containment reference '{@link tom.VisitAction#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see tom.VisitAction#getTerm()
	 * @see #getVisitAction()
	 * @generated
	 */
	EReference getVisitAction_Term();

	/**
	 * Returns the meta object for class '{@link tom.PatternList <em>Pattern List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern List</em>'.
	 * @see tom.PatternList
	 * @generated
	 */
	EClass getPatternList();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.PatternList#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patterns</em>'.
	 * @see tom.PatternList#getPatterns()
	 * @see #getPatternList()
	 * @generated
	 */
	EReference getPatternList_Patterns();

	/**
	 * Returns the meta object for the attribute '{@link tom.PatternList#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see tom.PatternList#getRel()
	 * @see #getPatternList()
	 * @generated
	 */
	EAttribute getPatternList_Rel();

	/**
	 * Returns the meta object for the containment reference '{@link tom.PatternList#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see tom.PatternList#getConstraint()
	 * @see #getPatternList()
	 * @generated
	 */
	EReference getPatternList_Constraint();

	/**
	 * Returns the meta object for class '{@link tom.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see tom.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link tom.ConstraintOr <em>Constraint Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Or</em>'.
	 * @see tom.ConstraintOr
	 * @generated
	 */
	EClass getConstraintOr();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConstraintOr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see tom.ConstraintOr#getLeft()
	 * @see #getConstraintOr()
	 * @generated
	 */
	EReference getConstraintOr_Left();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConstraintOr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see tom.ConstraintOr#getRight()
	 * @see #getConstraintOr()
	 * @generated
	 */
	EReference getConstraintOr_Right();

	/**
	 * Returns the meta object for class '{@link tom.ConstraintAnd <em>Constraint And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint And</em>'.
	 * @see tom.ConstraintAnd
	 * @generated
	 */
	EClass getConstraintAnd();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConstraintAnd#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see tom.ConstraintAnd#getLeft()
	 * @see #getConstraintAnd()
	 * @generated
	 */
	EReference getConstraintAnd_Left();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConstraintAnd#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see tom.ConstraintAnd#getRight()
	 * @see #getConstraintAnd()
	 * @generated
	 */
	EReference getConstraintAnd_Right();

	/**
	 * Returns the meta object for class '{@link tom.ConstraintP <em>Constraint P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint P</em>'.
	 * @see tom.ConstraintP
	 * @generated
	 */
	EClass getConstraintP();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConstraintP#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see tom.ConstraintP#getConstraint()
	 * @see #getConstraintP()
	 * @generated
	 */
	EReference getConstraintP_Constraint();

	/**
	 * Returns the meta object for class '{@link tom.ConstraintMatch <em>Constraint Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Match</em>'.
	 * @see tom.ConstraintMatch
	 * @generated
	 */
	EClass getConstraintMatch();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConstraintMatch#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see tom.ConstraintMatch#getPattern()
	 * @see #getConstraintMatch()
	 * @generated
	 */
	EReference getConstraintMatch_Pattern();

	/**
	 * Returns the meta object for the reference '{@link tom.ConstraintMatch#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see tom.ConstraintMatch#getType()
	 * @see #getConstraintMatch()
	 * @generated
	 */
	EReference getConstraintMatch_Type();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConstraintMatch#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see tom.ConstraintMatch#getTerm()
	 * @see #getConstraintMatch()
	 * @generated
	 */
	EReference getConstraintMatch_Term();

	/**
	 * Returns the meta object for class '{@link tom.ConstraintOp <em>Constraint Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Op</em>'.
	 * @see tom.ConstraintOp
	 * @generated
	 */
	EClass getConstraintOp();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConstraintOp#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see tom.ConstraintOp#getLeft()
	 * @see #getConstraintOp()
	 * @generated
	 */
	EReference getConstraintOp_Left();

	/**
	 * Returns the meta object for the attribute '{@link tom.ConstraintOp#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see tom.ConstraintOp#getOperator()
	 * @see #getConstraintOp()
	 * @generated
	 */
	EAttribute getConstraintOp_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConstraintOp#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see tom.ConstraintOp#getRight()
	 * @see #getConstraintOp()
	 * @generated
	 */
	EReference getConstraintOp_Right();

	/**
	 * Returns the meta object for class '{@link tom.GomConstruct <em>Gom Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gom Construct</em>'.
	 * @see tom.GomConstruct
	 * @generated
	 */
	EClass getGomConstruct();

	/**
	 * Returns the meta object for the attribute '{@link tom.GomConstruct#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option</em>'.
	 * @see tom.GomConstruct#getOption()
	 * @see #getGomConstruct()
	 * @generated
	 */
	EAttribute getGomConstruct_Option();

	/**
	 * Returns the meta object for the reference list '{@link tom.GomConstruct#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see tom.GomConstruct#getImports()
	 * @see #getGomConstruct()
	 * @generated
	 */
	EReference getGomConstruct_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.GomConstruct#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see tom.GomConstruct#getDefinitions()
	 * @see #getGomConstruct()
	 * @generated
	 */
	EReference getGomConstruct_Definitions();

	/**
	 * Returns the meta object for class '{@link tom.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see tom.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for class '{@link tom.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see tom.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.TypeDefinition#getOpDefinition <em>Op Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Op Definition</em>'.
	 * @see tom.TypeDefinition#getOpDefinition()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EReference getTypeDefinition_OpDefinition();

	/**
	 * Returns the meta object for class '{@link tom.OperatorDefinition <em>Operator Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Definition</em>'.
	 * @see tom.OperatorDefinition
	 * @generated
	 */
	EClass getOperatorDefinition();

	/**
	 * Returns the meta object for class '{@link tom.ArgumentsList <em>Arguments List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arguments List</em>'.
	 * @see tom.ArgumentsList
	 * @generated
	 */
	EClass getArgumentsList();

	/**
	 * Returns the meta object for the reference '{@link tom.ArgumentsList#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see tom.ArgumentsList#getType()
	 * @see #getArgumentsList()
	 * @generated
	 */
	EReference getArgumentsList_Type();

	/**
	 * Returns the meta object for class '{@link tom.HookDefinition <em>Hook Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook Definition</em>'.
	 * @see tom.HookDefinition
	 * @generated
	 */
	EClass getHookDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link tom.HookDefinition#getHookOperation <em>Hook Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hook Operation</em>'.
	 * @see tom.HookDefinition#getHookOperation()
	 * @see #getHookDefinition()
	 * @generated
	 */
	EReference getHookDefinition_HookOperation();

	/**
	 * Returns the meta object for class '{@link tom.HookModuleDefinition <em>Hook Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook Module Definition</em>'.
	 * @see tom.HookModuleDefinition
	 * @generated
	 */
	EClass getHookModuleDefinition();

	/**
	 * Returns the meta object for the reference '{@link tom.HookModuleDefinition#getHookType <em>Hook Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hook Type</em>'.
	 * @see tom.HookModuleDefinition#getHookType()
	 * @see #getHookModuleDefinition()
	 * @generated
	 */
	EReference getHookModuleDefinition_HookType();

	/**
	 * Returns the meta object for class '{@link tom.HookTypeDefinition <em>Hook Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook Type Definition</em>'.
	 * @see tom.HookTypeDefinition
	 * @generated
	 */
	EClass getHookTypeDefinition();

	/**
	 * Returns the meta object for the reference '{@link tom.HookTypeDefinition#getHookType <em>Hook Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hook Type</em>'.
	 * @see tom.HookTypeDefinition#getHookType()
	 * @see #getHookTypeDefinition()
	 * @generated
	 */
	EReference getHookTypeDefinition_HookType();

	/**
	 * Returns the meta object for class '{@link tom.HookOperatorDefinition <em>Hook Operator Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook Operator Definition</em>'.
	 * @see tom.HookOperatorDefinition
	 * @generated
	 */
	EClass getHookOperatorDefinition();

	/**
	 * Returns the meta object for the reference '{@link tom.HookOperatorDefinition#getHookType <em>Hook Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hook Type</em>'.
	 * @see tom.HookOperatorDefinition#getHookType()
	 * @see #getHookOperatorDefinition()
	 * @generated
	 */
	EReference getHookOperatorDefinition_HookType();

	/**
	 * Returns the meta object for class '{@link tom.HookOperation <em>Hook Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook Operation</em>'.
	 * @see tom.HookOperation
	 * @generated
	 */
	EClass getHookOperation();

	/**
	 * Returns the meta object for class '{@link tom.HostHookOperation <em>Host Hook Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Hook Operation</em>'.
	 * @see tom.HostHookOperation
	 * @generated
	 */
	EClass getHostHookOperation();

	/**
	 * Returns the meta object for the containment reference '{@link tom.HostHookOperation#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Args</em>'.
	 * @see tom.HostHookOperation#getArgs()
	 * @see #getHostHookOperation()
	 * @generated
	 */
	EReference getHostHookOperation_Args();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.HostHookOperation#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see tom.HostHookOperation#getStatements()
	 * @see #getHostHookOperation()
	 * @generated
	 */
	EReference getHostHookOperation_Statements();

	/**
	 * Returns the meta object for class '{@link tom.Hook_Rules <em>Hook Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook Rules</em>'.
	 * @see tom.Hook_Rules
	 * @generated
	 */
	EClass getHook_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.Hook_Rules#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see tom.Hook_Rules#getRules()
	 * @see #getHook_Rules()
	 * @generated
	 */
	EReference getHook_Rules_Rules();

	/**
	 * Returns the meta object for class '{@link tom.Hook_Graphrules <em>Hook Graphrules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook Graphrules</em>'.
	 * @see tom.Hook_Graphrules
	 * @generated
	 */
	EClass getHook_Graphrules();

	/**
	 * Returns the meta object for the attribute '{@link tom.Hook_Graphrules#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see tom.Hook_Graphrules#getMode()
	 * @see #getHook_Graphrules()
	 * @generated
	 */
	EAttribute getHook_Graphrules_Mode();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.Hook_Graphrules#getGraphRules <em>Graph Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graph Rules</em>'.
	 * @see tom.Hook_Graphrules#getGraphRules()
	 * @see #getHook_Graphrules()
	 * @generated
	 */
	EReference getHook_Graphrules_GraphRules();

	/**
	 * Returns the meta object for class '{@link tom.Hook_Make <em>Hook Make</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook Make</em>'.
	 * @see tom.Hook_Make
	 * @generated
	 */
	EClass getHook_Make();

	/**
	 * Returns the meta object for class '{@link tom.Hook_Make_Insert <em>Hook Make Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook Make Insert</em>'.
	 * @see tom.Hook_Make_Insert
	 * @generated
	 */
	EClass getHook_Make_Insert();

	/**
	 * Returns the meta object for class '{@link tom.Hook_Make_Empty <em>Hook Make Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook Make Empty</em>'.
	 * @see tom.Hook_Make_Empty
	 * @generated
	 */
	EClass getHook_Make_Empty();

	/**
	 * Returns the meta object for class '{@link tom.Hook_Free <em>Hook Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook Free</em>'.
	 * @see tom.Hook_Free
	 * @generated
	 */
	EClass getHook_Free();

	/**
	 * Returns the meta object for class '{@link tom.Hook_FL <em>Hook FL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook FL</em>'.
	 * @see tom.Hook_FL
	 * @generated
	 */
	EClass getHook_FL();

	/**
	 * Returns the meta object for class '{@link tom.Hook_AU <em>Hook AU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook AU</em>'.
	 * @see tom.Hook_AU
	 * @generated
	 */
	EClass getHook_AU();

	/**
	 * Returns the meta object for the containment reference '{@link tom.Hook_AU#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see tom.Hook_AU#getTerm()
	 * @see #getHook_AU()
	 * @generated
	 */
	EReference getHook_AU_Term();

	/**
	 * Returns the meta object for class '{@link tom.Hook_Interface <em>Hook Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook Interface</em>'.
	 * @see tom.Hook_Interface
	 * @generated
	 */
	EClass getHook_Interface();

	/**
	 * Returns the meta object for class '{@link tom.Hook_Imports <em>Hook Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook Imports</em>'.
	 * @see tom.Hook_Imports
	 * @generated
	 */
	EClass getHook_Imports();

	/**
	 * Returns the meta object for class '{@link tom.Hook_Block <em>Hook Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook Block</em>'.
	 * @see tom.Hook_Block
	 * @generated
	 */
	EClass getHook_Block();

	/**
	 * Returns the meta object for class '{@link tom.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see tom.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the containment reference '{@link tom.Rule#getRulePattern <em>Rule Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule Pattern</em>'.
	 * @see tom.Rule#getRulePattern()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RulePattern();

	/**
	 * Returns the meta object for the containment reference '{@link tom.Rule#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see tom.Rule#getTerm()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Term();

	/**
	 * Returns the meta object for the containment reference '{@link tom.Rule#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond</em>'.
	 * @see tom.Rule#getCond()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Cond();

	/**
	 * Returns the meta object for class '{@link tom.RulePattern <em>Rule Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Pattern</em>'.
	 * @see tom.RulePattern
	 * @generated
	 */
	EClass getRulePattern();

	/**
	 * Returns the meta object for class '{@link tom.NamedRulePattern <em>Named Rule Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Rule Pattern</em>'.
	 * @see tom.NamedRulePattern
	 * @generated
	 */
	EClass getNamedRulePattern();

	/**
	 * Returns the meta object for the containment reference '{@link tom.NamedRulePattern#getPlainRulePattern <em>Plain Rule Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plain Rule Pattern</em>'.
	 * @see tom.NamedRulePattern#getPlainRulePattern()
	 * @see #getNamedRulePattern()
	 * @generated
	 */
	EReference getNamedRulePattern_PlainRulePattern();

	/**
	 * Returns the meta object for class '{@link tom.AntiRulePattern <em>Anti Rule Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anti Rule Pattern</em>'.
	 * @see tom.AntiRulePattern
	 * @generated
	 */
	EClass getAntiRulePattern();

	/**
	 * Returns the meta object for the containment reference '{@link tom.AntiRulePattern#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see tom.AntiRulePattern#getPattern()
	 * @see #getAntiRulePattern()
	 * @generated
	 */
	EReference getAntiRulePattern_Pattern();

	/**
	 * Returns the meta object for class '{@link tom.PlainRulePatternOperation <em>Plain Rule Pattern Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Rule Pattern Operation</em>'.
	 * @see tom.PlainRulePatternOperation
	 * @generated
	 */
	EClass getPlainRulePatternOperation();

	/**
	 * Returns the meta object for the containment reference '{@link tom.PlainRulePatternOperation#getHeads <em>Heads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Heads</em>'.
	 * @see tom.PlainRulePatternOperation#getHeads()
	 * @see #getPlainRulePatternOperation()
	 * @generated
	 */
	EReference getPlainRulePatternOperation_Heads();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.PlainRulePatternOperation#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see tom.PlainRulePatternOperation#getRules()
	 * @see #getPlainRulePatternOperation()
	 * @generated
	 */
	EReference getPlainRulePatternOperation_Rules();

	/**
	 * Returns the meta object for class '{@link tom.GraphRule <em>Graph Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Rule</em>'.
	 * @see tom.GraphRule
	 * @generated
	 */
	EClass getGraphRule();

	/**
	 * Returns the meta object for the containment reference '{@link tom.GraphRule#getTermcond <em>Termcond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Termcond</em>'.
	 * @see tom.GraphRule#getTermcond()
	 * @see #getGraphRule()
	 * @generated
	 */
	EReference getGraphRule_Termcond();

	/**
	 * Returns the meta object for the containment reference '{@link tom.GraphRule#getTermGraph <em>Term Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term Graph</em>'.
	 * @see tom.GraphRule#getTermGraph()
	 * @see #getGraphRule()
	 * @generated
	 */
	EReference getGraphRule_TermGraph();

	/**
	 * Returns the meta object for the containment reference '{@link tom.GraphRule#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond</em>'.
	 * @see tom.GraphRule#getCond()
	 * @see #getGraphRule()
	 * @generated
	 */
	EReference getGraphRule_Cond();

	/**
	 * Returns the meta object for class '{@link tom.TermGraph <em>Term Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Graph</em>'.
	 * @see tom.TermGraph
	 * @generated
	 */
	EClass getTermGraph();

	/**
	 * Returns the meta object for the attribute '{@link tom.TermGraph#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tom.TermGraph#getName()
	 * @see #getTermGraph()
	 * @generated
	 */
	EAttribute getTermGraph_Name();

	/**
	 * Returns the meta object for the containment reference '{@link tom.TermGraph#getTermGraph <em>Term Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term Graph</em>'.
	 * @see tom.TermGraph#getTermGraph()
	 * @see #getTermGraph()
	 * @generated
	 */
	EReference getTermGraph_TermGraph();

	/**
	 * Returns the meta object for class '{@link tom.PlainTermGraph <em>Plain Term Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Term Graph</em>'.
	 * @see tom.PlainTermGraph
	 * @generated
	 */
	EClass getPlainTermGraph();

	/**
	 * Returns the meta object for class '{@link tom.TermGraphVariable <em>Term Graph Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Graph Variable</em>'.
	 * @see tom.TermGraphVariable
	 * @generated
	 */
	EClass getTermGraphVariable();

	/**
	 * Returns the meta object for the attribute '{@link tom.TermGraphVariable#isLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see tom.TermGraphVariable#isLabel()
	 * @see #getTermGraphVariable()
	 * @generated
	 */
	EAttribute getTermGraphVariable_Label();

	/**
	 * Returns the meta object for class '{@link tom.TermGraphFunc <em>Term Graph Func</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Graph Func</em>'.
	 * @see tom.TermGraphFunc
	 * @generated
	 */
	EClass getTermGraphFunc();

	/**
	 * Returns the meta object for the containment reference '{@link tom.TermGraphFunc#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see tom.TermGraphFunc#getHead()
	 * @see #getTermGraphFunc()
	 * @generated
	 */
	EReference getTermGraphFunc_Head();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.TermGraphFunc#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see tom.TermGraphFunc#getTerms()
	 * @see #getTermGraphFunc()
	 * @generated
	 */
	EReference getTermGraphFunc_Terms();

	/**
	 * Returns the meta object for class '{@link tom.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see tom.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link tom.ConditionOr <em>Condition Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Or</em>'.
	 * @see tom.ConditionOr
	 * @generated
	 */
	EClass getConditionOr();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConditionOr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see tom.ConditionOr#getLeft()
	 * @see #getConditionOr()
	 * @generated
	 */
	EReference getConditionOr_Left();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConditionOr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see tom.ConditionOr#getRight()
	 * @see #getConditionOr()
	 * @generated
	 */
	EReference getConditionOr_Right();

	/**
	 * Returns the meta object for class '{@link tom.ConditionAnd <em>Condition And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition And</em>'.
	 * @see tom.ConditionAnd
	 * @generated
	 */
	EClass getConditionAnd();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConditionAnd#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see tom.ConditionAnd#getLeft()
	 * @see #getConditionAnd()
	 * @generated
	 */
	EReference getConditionAnd_Left();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConditionAnd#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see tom.ConditionAnd#getRight()
	 * @see #getConditionAnd()
	 * @generated
	 */
	EReference getConditionAnd_Right();

	/**
	 * Returns the meta object for class '{@link tom.ConditionP <em>Condition P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition P</em>'.
	 * @see tom.ConditionP
	 * @generated
	 */
	EClass getConditionP();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConditionP#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see tom.ConditionP#getCondition()
	 * @see #getConditionP()
	 * @generated
	 */
	EReference getConditionP_Condition();

	/**
	 * Returns the meta object for class '{@link tom.ConditionRule <em>Condition Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Rule</em>'.
	 * @see tom.ConditionRule
	 * @generated
	 */
	EClass getConditionRule();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConditionRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see tom.ConditionRule#getRule()
	 * @see #getConditionRule()
	 * @generated
	 */
	EReference getConditionRule_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConditionRule#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see tom.ConditionRule#getTerm()
	 * @see #getConditionRule()
	 * @generated
	 */
	EReference getConditionRule_Term();

	/**
	 * Returns the meta object for class '{@link tom.ConditionOp <em>Condition Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Op</em>'.
	 * @see tom.ConditionOp
	 * @generated
	 */
	EClass getConditionOp();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConditionOp#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see tom.ConditionOp#getLeft()
	 * @see #getConditionOp()
	 * @generated
	 */
	EReference getConditionOp_Left();

	/**
	 * Returns the meta object for the attribute '{@link tom.ConditionOp#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see tom.ConditionOp#getOperator()
	 * @see #getConditionOp()
	 * @generated
	 */
	EAttribute getConditionOp_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ConditionOp#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see tom.ConditionOp#getRight()
	 * @see #getConditionOp()
	 * @generated
	 */
	EReference getConditionOp_Right();

	/**
	 * Returns the meta object for class '{@link tom.XMLTerm <em>XML Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Term</em>'.
	 * @see tom.XMLTerm
	 * @generated
	 */
	EClass getXMLTerm();

	/**
	 * Returns the meta object for class '{@link tom.XMLTermSimple <em>XML Term Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Term Simple</em>'.
	 * @see tom.XMLTermSimple
	 * @generated
	 */
	EClass getXMLTermSimple();

	/**
	 * Returns the meta object for the containment reference '{@link tom.XMLTermSimple#getNameList <em>Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name List</em>'.
	 * @see tom.XMLTermSimple#getNameList()
	 * @see #getXMLTermSimple()
	 * @generated
	 */
	EReference getXMLTermSimple_NameList();

	/**
	 * Returns the meta object for the containment reference '{@link tom.XMLTermSimple#getAttrList <em>Attr List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attr List</em>'.
	 * @see tom.XMLTermSimple#getAttrList()
	 * @see #getXMLTermSimple()
	 * @generated
	 */
	EReference getXMLTermSimple_AttrList();

	/**
	 * Returns the meta object for class '{@link tom.XMLTermDouble <em>XML Term Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Term Double</em>'.
	 * @see tom.XMLTermDouble
	 * @generated
	 */
	EClass getXMLTermDouble();

	/**
	 * Returns the meta object for the containment reference '{@link tom.XMLTermDouble#getNameList <em>Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name List</em>'.
	 * @see tom.XMLTermDouble#getNameList()
	 * @see #getXMLTermDouble()
	 * @generated
	 */
	EReference getXMLTermDouble_NameList();

	/**
	 * Returns the meta object for the containment reference '{@link tom.XMLTermDouble#getAttrList <em>Attr List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attr List</em>'.
	 * @see tom.XMLTermDouble#getAttrList()
	 * @see #getXMLTermDouble()
	 * @generated
	 */
	EReference getXMLTermDouble_AttrList();

	/**
	 * Returns the meta object for the containment reference '{@link tom.XMLTermDouble#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Childs</em>'.
	 * @see tom.XMLTermDouble#getChilds()
	 * @see #getXMLTermDouble()
	 * @generated
	 */
	EReference getXMLTermDouble_Childs();

	/**
	 * Returns the meta object for the containment reference '{@link tom.XMLTermDouble#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see tom.XMLTermDouble#getList()
	 * @see #getXMLTermDouble()
	 * @generated
	 */
	EReference getXMLTermDouble_List();

	/**
	 * Returns the meta object for class '{@link tom.XMLTermText <em>XML Term Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Term Text</em>'.
	 * @see tom.XMLTermText
	 * @generated
	 */
	EClass getXMLTermText();

	/**
	 * Returns the meta object for the attribute '{@link tom.XMLTermText#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tom.XMLTermText#getName()
	 * @see #getXMLTermText()
	 * @generated
	 */
	EAttribute getXMLTermText_Name();

	/**
	 * Returns the meta object for class '{@link tom.XMLTermComment <em>XML Term Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Term Comment</em>'.
	 * @see tom.XMLTermComment
	 * @generated
	 */
	EClass getXMLTermComment();

	/**
	 * Returns the meta object for the attribute '{@link tom.XMLTermComment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tom.XMLTermComment#getName()
	 * @see #getXMLTermComment()
	 * @generated
	 */
	EAttribute getXMLTermComment_Name();

	/**
	 * Returns the meta object for class '{@link tom.XMLTermProcess <em>XML Term Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Term Process</em>'.
	 * @see tom.XMLTermProcess
	 * @generated
	 */
	EClass getXMLTermProcess();

	/**
	 * Returns the meta object for the attribute '{@link tom.XMLTermProcess#getName1 <em>Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name1</em>'.
	 * @see tom.XMLTermProcess#getName1()
	 * @see #getXMLTermProcess()
	 * @generated
	 */
	EAttribute getXMLTermProcess_Name1();

	/**
	 * Returns the meta object for the attribute '{@link tom.XMLTermProcess#getName2 <em>Name2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name2</em>'.
	 * @see tom.XMLTermProcess#getName2()
	 * @see #getXMLTermProcess()
	 * @generated
	 */
	EAttribute getXMLTermProcess_Name2();

	/**
	 * Returns the meta object for class '{@link tom.XMLNameList <em>XML Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Name List</em>'.
	 * @see tom.XMLNameList
	 * @generated
	 */
	EClass getXMLNameList();

	/**
	 * Returns the meta object for the attribute list '{@link tom.XMLNameList#getXMLName <em>XML Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>XML Name</em>'.
	 * @see tom.XMLNameList#getXMLName()
	 * @see #getXMLNameList()
	 * @generated
	 */
	EAttribute getXMLNameList_XMLName();

	/**
	 * Returns the meta object for class '{@link tom.XMLAttrList <em>XML Attr List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Attr List</em>'.
	 * @see tom.XMLAttrList
	 * @generated
	 */
	EClass getXMLAttrList();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.XMLAttrList#getAttrs <em>Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attrs</em>'.
	 * @see tom.XMLAttrList#getAttrs()
	 * @see #getXMLAttrList()
	 * @generated
	 */
	EReference getXMLAttrList_Attrs();

	/**
	 * Returns the meta object for class '{@link tom.XMLAttribute <em>XML Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Attribute</em>'.
	 * @see tom.XMLAttribute
	 * @generated
	 */
	EClass getXMLAttribute();

	/**
	 * Returns the meta object for class '{@link tom.XMLAttribute1 <em>XML Attribute1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Attribute1</em>'.
	 * @see tom.XMLAttribute1
	 * @generated
	 */
	EClass getXMLAttribute1();

	/**
	 * Returns the meta object for the attribute '{@link tom.XMLAttribute1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tom.XMLAttribute1#getName()
	 * @see #getXMLAttribute1()
	 * @generated
	 */
	EAttribute getXMLAttribute1_Name();

	/**
	 * Returns the meta object for class '{@link tom.XMLAttribute2 <em>XML Attribute2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Attribute2</em>'.
	 * @see tom.XMLAttribute2
	 * @generated
	 */
	EClass getXMLAttribute2();

	/**
	 * Returns the meta object for the attribute '{@link tom.XMLAttribute2#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see tom.XMLAttribute2#getAttributeName()
	 * @see #getXMLAttribute2()
	 * @generated
	 */
	EAttribute getXMLAttribute2_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link tom.XMLAttribute2#getAnnotedName <em>Annoted Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annoted Name</em>'.
	 * @see tom.XMLAttribute2#getAnnotedName()
	 * @see #getXMLAttribute2()
	 * @generated
	 */
	EAttribute getXMLAttribute2_AnnotedName();

	/**
	 * Returns the meta object for the attribute '{@link tom.XMLAttribute2#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tom.XMLAttribute2#getName()
	 * @see #getXMLAttribute2()
	 * @generated
	 */
	EAttribute getXMLAttribute2_Name();

	/**
	 * Returns the meta object for class '{@link tom.XMLAttribute3 <em>XML Attribute3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Attribute3</em>'.
	 * @see tom.XMLAttribute3
	 * @generated
	 */
	EClass getXMLAttribute3();

	/**
	 * Returns the meta object for the attribute '{@link tom.XMLAttribute3#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see tom.XMLAttribute3#getAttributeName()
	 * @see #getXMLAttribute3()
	 * @generated
	 */
	EAttribute getXMLAttribute3_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link tom.XMLAttribute3#getAnnotedName <em>Annoted Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annoted Name</em>'.
	 * @see tom.XMLAttribute3#getAnnotedName()
	 * @see #getXMLAttribute3()
	 * @generated
	 */
	EAttribute getXMLAttribute3_AnnotedName();

	/**
	 * Returns the meta object for the attribute '{@link tom.XMLAttribute3#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tom.XMLAttribute3#getName()
	 * @see #getXMLAttribute3()
	 * @generated
	 */
	EAttribute getXMLAttribute3_Name();

	/**
	 * Returns the meta object for class '{@link tom.XMLChilds <em>XML Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Childs</em>'.
	 * @see tom.XMLChilds
	 * @generated
	 */
	EClass getXMLChilds();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.XMLChilds#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see tom.XMLChilds#getTerms()
	 * @see #getXMLChilds()
	 * @generated
	 */
	EReference getXMLChilds_Terms();

	/**
	 * Returns the meta object for class '{@link tom.TypeTerm <em>Type Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Term</em>'.
	 * @see tom.TypeTerm
	 * @generated
	 */
	EClass getTypeTerm();

	/**
	 * Returns the meta object for the attribute '{@link tom.TypeTerm#getHote <em>Hote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hote</em>'.
	 * @see tom.TypeTerm#getHote()
	 * @see #getTypeTerm()
	 * @generated
	 */
	EAttribute getTypeTerm_Hote();

	/**
	 * Returns the meta object for the reference '{@link tom.TypeTerm#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see tom.TypeTerm#getType()
	 * @see #getTypeTerm()
	 * @generated
	 */
	EReference getTypeTerm_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.TypeTerm#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keys</em>'.
	 * @see tom.TypeTerm#getKeys()
	 * @see #getTypeTerm()
	 * @generated
	 */
	EReference getTypeTerm_Keys();

	/**
	 * Returns the meta object for class '{@link tom.KeyWord <em>Key Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Word</em>'.
	 * @see tom.KeyWord
	 * @generated
	 */
	EClass getKeyWord();

	/**
	 * Returns the meta object for the containment reference '{@link tom.KeyWord#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Args</em>'.
	 * @see tom.KeyWord#getArgs()
	 * @see #getKeyWord()
	 * @generated
	 */
	EReference getKeyWord_Args();

	/**
	 * Returns the meta object for the attribute '{@link tom.KeyWord#getHote <em>Hote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hote</em>'.
	 * @see tom.KeyWord#getHote()
	 * @see #getKeyWord()
	 * @generated
	 */
	EAttribute getKeyWord_Hote();

	/**
	 * Returns the meta object for class '{@link tom.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see tom.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.Operator#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keys</em>'.
	 * @see tom.Operator#getKeys()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Keys();

	/**
	 * Returns the meta object for class '{@link tom.OperatorList <em>Operator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator List</em>'.
	 * @see tom.OperatorList
	 * @generated
	 */
	EClass getOperatorList();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.OperatorList#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keys</em>'.
	 * @see tom.OperatorList#getKeys()
	 * @see #getOperatorList()
	 * @generated
	 */
	EReference getOperatorList_Keys();

	/**
	 * Returns the meta object for class '{@link tom.OperatorArray <em>Operator Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Array</em>'.
	 * @see tom.OperatorArray
	 * @generated
	 */
	EClass getOperatorArray();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.OperatorArray#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keys</em>'.
	 * @see tom.OperatorArray#getKeys()
	 * @see #getOperatorArray()
	 * @generated
	 */
	EReference getOperatorArray_Keys();

	/**
	 * Returns the meta object for class '{@link tom.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see tom.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link tom.Transformation#getFileFrom <em>File From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File From</em>'.
	 * @see tom.Transformation#getFileFrom()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_FileFrom();

	/**
	 * Returns the meta object for the attribute '{@link tom.Transformation#getFileTo <em>File To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File To</em>'.
	 * @see tom.Transformation#getFileTo()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_FileTo();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.Transformation#getElementaryTranformations <em>Elementary Tranformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementary Tranformations</em>'.
	 * @see tom.Transformation#getElementaryTranformations()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_ElementaryTranformations();

	/**
	 * Returns the meta object for class '{@link tom.ElementaryTransformation <em>Elementary Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementary Transformation</em>'.
	 * @see tom.ElementaryTransformation
	 * @generated
	 */
	EClass getElementaryTransformation();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ElementaryTransformation#getImplement <em>Implement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implement</em>'.
	 * @see tom.ElementaryTransformation#getImplement()
	 * @see #getElementaryTransformation()
	 * @generated
	 */
	EReference getElementaryTransformation_Implement();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.ElementaryTransformation#getElementaryTransformationRules <em>Elementary Transformation Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementary Transformation Rules</em>'.
	 * @see tom.ElementaryTransformation#getElementaryTransformationRules()
	 * @see #getElementaryTransformation()
	 * @generated
	 */
	EReference getElementaryTransformation_ElementaryTransformationRules();

	/**
	 * Returns the meta object for class '{@link tom.ElementaryTransformationRule <em>Elementary Transformation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementary Transformation Rule</em>'.
	 * @see tom.ElementaryTransformationRule
	 * @generated
	 */
	EClass getElementaryTransformationRule();

	/**
	 * Returns the meta object for the containment reference '{@link tom.ElementaryTransformationRule#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see tom.ElementaryTransformationRule#getPattern()
	 * @see #getElementaryTransformationRule()
	 * @generated
	 */
	EReference getElementaryTransformationRule_Pattern();

	/**
	 * Returns the meta object for the containment reference list '{@link tom.ElementaryTransformationRule#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see tom.ElementaryTransformationRule#getStatements()
	 * @see #getElementaryTransformationRule()
	 * @generated
	 */
	EReference getElementaryTransformationRule_Statements();

	/**
	 * Returns the meta object for class '{@link tom.Tracelink <em>Tracelink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tracelink</em>'.
	 * @see tom.Tracelink
	 * @generated
	 */
	EClass getTracelink();

	/**
	 * Returns the meta object for the containment reference '{@link tom.Tracelink#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see tom.Tracelink#getTerm()
	 * @see #getTracelink()
	 * @generated
	 */
	EReference getTracelink_Term();

	/**
	 * Returns the meta object for class '{@link tom.Resolve <em>Resolve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve</em>'.
	 * @see tom.Resolve
	 * @generated
	 */
	EClass getResolve();

	/**
	 * Returns the meta object for the reference '{@link tom.Resolve#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see tom.Resolve#getSource()
	 * @see #getResolve()
	 * @generated
	 */
	EReference getResolve_Source();

	/**
	 * Returns the meta object for the reference '{@link tom.Resolve#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see tom.Resolve#getType()
	 * @see #getResolve()
	 * @generated
	 */
	EReference getResolve_Type();

	/**
	 * Returns the meta object for the reference '{@link tom.Resolve#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see tom.Resolve#getTarget()
	 * @see #getResolve()
	 * @generated
	 */
	EReference getResolve_Target();

	/**
	 * Returns the meta object for enum '{@link tom.RelOperator <em>Rel Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rel Operator</em>'.
	 * @see tom.RelOperator
	 * @generated
	 */
	EEnum getRelOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TomFactory getTomFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tom.impl.HostCodeImpl <em>Host Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.HostCodeImpl
		 * @see tom.impl.TomPackageImpl#getHostCode()
		 * @generated
		 */
		EClass HOST_CODE = eINSTANCE.getHostCode();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_CODE__CODE = eINSTANCE.getHostCode_Code();

		/**
		 * The meta object literal for the '{@link tom.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ExpressionImpl
		 * @see tom.impl.TomPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link tom.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.CallImpl
		 * @see tom.impl.TomPackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '<em><b>Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__CALL = eINSTANCE.getCall_Call();

		/**
		 * The meta object literal for the '{@link tom.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.DeclarationImpl
		 * @see tom.impl.TomPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__VALUE = eINSTANCE.getDeclaration_Value();

		/**
		 * The meta object literal for the '{@link tom.impl.AffectationImpl <em>Affectation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.AffectationImpl
		 * @see tom.impl.TomPackageImpl#getAffectation()
		 * @generated
		 */
		EClass AFFECTATION = eINSTANCE.getAffectation();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECTATION__VARIABLE = eINSTANCE.getAffectation_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECTATION__VALUE = eINSTANCE.getAffectation_Value();

		/**
		 * The meta object literal for the '{@link tom.impl.TomImpl <em>Tom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.TomImpl
		 * @see tom.impl.TomPackageImpl#getTom()
		 * @generated
		 */
		EClass TOM = eINSTANCE.getTom();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOM__NAMESPACE = eINSTANCE.getTom_Namespace();

		/**
		 * The meta object literal for the '<em><b>Blocs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOM__BLOCS = eINSTANCE.getTom_Blocs();

		/**
		 * The meta object literal for the '{@link tom.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ContextImpl
		 * @see tom.impl.TomPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link tom.impl.LinkableImpl <em>Linkable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.LinkableImpl
		 * @see tom.impl.TomPackageImpl#getLinkable()
		 * @generated
		 */
		EClass LINKABLE = eINSTANCE.getLinkable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINKABLE__NAME = eINSTANCE.getLinkable_Name();

		/**
		 * The meta object literal for the '{@link tom.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.TypeImpl
		 * @see tom.impl.TomPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Extend</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__EXTEND = eINSTANCE.getType_Extend();

		/**
		 * The meta object literal for the '{@link tom.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.OperationImpl
		 * @see tom.impl.TomPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__TYPE = eINSTANCE.getOperation_Type();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__ARGS = eINSTANCE.getOperation_Args();

		/**
		 * The meta object literal for the '{@link tom.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.VariableImpl
		 * @see tom.impl.TomPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link tom.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.GlobalVariableImpl
		 * @see tom.impl.TomPackageImpl#getGlobalVariable()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable();

		/**
		 * The meta object literal for the '{@link tom.impl.LocalVariableImpl <em>Local Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.LocalVariableImpl
		 * @see tom.impl.TomPackageImpl#getLocalVariable()
		 * @generated
		 */
		EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

		/**
		 * The meta object literal for the '{@link tom.impl.VariableSimpleImpl <em>Variable Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.VariableSimpleImpl
		 * @see tom.impl.TomPackageImpl#getVariableSimple()
		 * @generated
		 */
		EClass VARIABLE_SIMPLE = eINSTANCE.getVariableSimple();

		/**
		 * The meta object literal for the '{@link tom.impl.VariableListImpl <em>Variable List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.VariableListImpl
		 * @see tom.impl.TomPackageImpl#getVariableList()
		 * @generated
		 */
		EClass VARIABLE_LIST = eINSTANCE.getVariableList();

		/**
		 * The meta object literal for the '{@link tom.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.BlockImpl
		 * @see tom.impl.TomPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '{@link tom.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.FunctionImpl
		 * @see tom.impl.TomPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__STATEMENTS = eINSTANCE.getFunction_Statements();

		/**
		 * The meta object literal for the '{@link tom.impl.CallbackImpl <em>Callback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.CallbackImpl
		 * @see tom.impl.TomPackageImpl#getCallback()
		 * @generated
		 */
		EClass CALLBACK = eINSTANCE.getCallback();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLBACK__OPERATIONS = eINSTANCE.getCallback_Operations();

		/**
		 * The meta object literal for the '{@link tom.impl.CallbackDefinitionImpl <em>Callback Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.CallbackDefinitionImpl
		 * @see tom.impl.TomPackageImpl#getCallbackDefinition()
		 * @generated
		 */
		EClass CALLBACK_DEFINITION = eINSTANCE.getCallbackDefinition();

		/**
		 * The meta object literal for the '{@link tom.impl.ArgumentsImpl <em>Arguments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ArgumentsImpl
		 * @see tom.impl.TomPackageImpl#getArguments()
		 * @generated
		 */
		EClass ARGUMENTS = eINSTANCE.getArguments();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENTS__ARGS = eINSTANCE.getArguments_Args();

		/**
		 * The meta object literal for the '{@link tom.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ArgumentImpl
		 * @see tom.impl.TomPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '{@link tom.impl.ArgumentTypeSuffixImpl <em>Argument Type Suffix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ArgumentTypeSuffixImpl
		 * @see tom.impl.TomPackageImpl#getArgumentTypeSuffix()
		 * @generated
		 */
		EClass ARGUMENT_TYPE_SUFFIX = eINSTANCE.getArgumentTypeSuffix();

		/**
		 * The meta object literal for the '{@link tom.impl.ArgumentTypePrefixImpl <em>Argument Type Prefix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ArgumentTypePrefixImpl
		 * @see tom.impl.TomPackageImpl#getArgumentTypePrefix()
		 * @generated
		 */
		EClass ARGUMENT_TYPE_PREFIX = eINSTANCE.getArgumentTypePrefix();

		/**
		 * The meta object literal for the '{@link tom.impl.ImportConstructImpl <em>Import Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ImportConstructImpl
		 * @see tom.impl.TomPackageImpl#getImportConstruct()
		 * @generated
		 */
		EClass IMPORT_CONSTRUCT = eINSTANCE.getImportConstruct();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_CONSTRUCT__TYPE = eINSTANCE.getImportConstruct_Type();

		/**
		 * The meta object literal for the '{@link tom.impl.IncludeConstructImpl <em>Include Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.IncludeConstructImpl
		 * @see tom.impl.TomPackageImpl#getIncludeConstruct()
		 * @generated
		 */
		EClass INCLUDE_CONSTRUCT = eINSTANCE.getIncludeConstruct();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_CONSTRUCT__IMPORT_URI = eINSTANCE.getIncludeConstruct_ImportURI();

		/**
		 * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_CONSTRUCT__EXT = eINSTANCE.getIncludeConstruct_Ext();

		/**
		 * The meta object literal for the '{@link tom.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.StatementImpl
		 * @see tom.impl.TomPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link tom.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.TermImpl
		 * @see tom.impl.TomPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '{@link tom.impl.TermSumImpl <em>Term Sum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.TermSumImpl
		 * @see tom.impl.TomPackageImpl#getTermSum()
		 * @generated
		 */
		EClass TERM_SUM = eINSTANCE.getTermSum();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_SUM__LEFT = eINSTANCE.getTermSum_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_SUM__RIGHT = eINSTANCE.getTermSum_Right();

		/**
		 * The meta object literal for the '{@link tom.impl.TermConstImpl <em>Term Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.TermConstImpl
		 * @see tom.impl.TomPackageImpl#getTermConst()
		 * @generated
		 */
		EClass TERM_CONST = eINSTANCE.getTermConst();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_CONST__STRING = eINSTANCE.getTermConst_String();

		/**
		 * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_CONST__INT = eINSTANCE.getTermConst_Int();

		/**
		 * The meta object literal for the '{@link tom.impl.TermNullImpl <em>Term Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.TermNullImpl
		 * @see tom.impl.TomPackageImpl#getTermNull()
		 * @generated
		 */
		EClass TERM_NULL = eINSTANCE.getTermNull();

		/**
		 * The meta object literal for the '{@link tom.impl.TermVariableImpl <em>Term Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.TermVariableImpl
		 * @see tom.impl.TomPackageImpl#getTermVariable()
		 * @generated
		 */
		EClass TERM_VARIABLE = eINSTANCE.getTermVariable();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_VARIABLE__VAR = eINSTANCE.getTermVariable_Var();

		/**
		 * The meta object literal for the '{@link tom.impl.TermOperationImpl <em>Term Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.TermOperationImpl
		 * @see tom.impl.TomPackageImpl#getTermOperation()
		 * @generated
		 */
		EClass TERM_OPERATION = eINSTANCE.getTermOperation();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_OPERATION__OP = eINSTANCE.getTermOperation_Op();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_OPERATION__TERMS = eINSTANCE.getTermOperation_Terms();

		/**
		 * The meta object literal for the '{@link tom.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ReturnImpl
		 * @see tom.impl.TomPackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__RETURN = eINSTANCE.getReturn_Return();

		/**
		 * The meta object literal for the '{@link tom.impl.MatchConsctructImpl <em>Match Consctruct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.MatchConsctructImpl
		 * @see tom.impl.TomPackageImpl#getMatchConsctruct()
		 * @generated
		 */
		EClass MATCH_CONSCTRUCT = eINSTANCE.getMatchConsctruct();

		/**
		 * The meta object literal for the '{@link tom.impl.MatchPatternImpl <em>Match Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.MatchPatternImpl
		 * @see tom.impl.TomPackageImpl#getMatchPattern()
		 * @generated
		 */
		EClass MATCH_PATTERN = eINSTANCE.getMatchPattern();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_PATTERN__ARGS = eINSTANCE.getMatchPattern_Args();

		/**
		 * The meta object literal for the '<em><b>Pattern Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_PATTERN__PATTERN_ACTIONS = eINSTANCE.getMatchPattern_PatternActions();

		/**
		 * The meta object literal for the '{@link tom.impl.ArgumentMatchImpl <em>Argument Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ArgumentMatchImpl
		 * @see tom.impl.TomPackageImpl#getArgumentMatch()
		 * @generated
		 */
		EClass ARGUMENT_MATCH = eINSTANCE.getArgumentMatch();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_MATCH__TYPE = eINSTANCE.getArgumentMatch_Type();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_MATCH__VAR = eINSTANCE.getArgumentMatch_Var();

		/**
		 * The meta object literal for the '{@link tom.impl.PatternActionImpl <em>Pattern Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.PatternActionImpl
		 * @see tom.impl.TomPackageImpl#getPatternAction()
		 * @generated
		 */
		EClass PATTERN_ACTION = eINSTANCE.getPatternAction();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ACTION__PATTERNS = eINSTANCE.getPatternAction_Patterns();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ACTION__STATEMENTS = eINSTANCE.getPatternAction_Statements();

		/**
		 * The meta object literal for the '{@link tom.impl.ConstraintPatternImpl <em>Constraint Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ConstraintPatternImpl
		 * @see tom.impl.TomPackageImpl#getConstraintPattern()
		 * @generated
		 */
		EClass CONSTRAINT_PATTERN = eINSTANCE.getConstraintPattern();

		/**
		 * The meta object literal for the '<em><b>Constraint Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_PATTERN__CONSTRAINT_ACTIONS = eINSTANCE.getConstraintPattern_ConstraintActions();

		/**
		 * The meta object literal for the '{@link tom.impl.ConstraintActionImpl <em>Constraint Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ConstraintActionImpl
		 * @see tom.impl.TomPackageImpl#getConstraintAction()
		 * @generated
		 */
		EClass CONSTRAINT_ACTION = eINSTANCE.getConstraintAction();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_ACTION__CONSTRAINT = eINSTANCE.getConstraintAction_Constraint();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_ACTION__STATEMENTS = eINSTANCE.getConstraintAction_Statements();

		/**
		 * The meta object literal for the '{@link tom.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.PatternImpl
		 * @see tom.impl.TomPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '{@link tom.impl.NamedPatternImpl <em>Named Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.NamedPatternImpl
		 * @see tom.impl.TomPackageImpl#getNamedPattern()
		 * @generated
		 */
		EClass NAMED_PATTERN = eINSTANCE.getNamedPattern();

		/**
		 * The meta object literal for the '<em><b>Plain Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_PATTERN__PLAIN_PATTERN = eINSTANCE.getNamedPattern_PlainPattern();

		/**
		 * The meta object literal for the '{@link tom.impl.AntiPatternImpl <em>Anti Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.AntiPatternImpl
		 * @see tom.impl.TomPackageImpl#getAntiPattern()
		 * @generated
		 */
		EClass ANTI_PATTERN = eINSTANCE.getAntiPattern();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTI_PATTERN__PATTERN = eINSTANCE.getAntiPattern_Pattern();

		/**
		 * The meta object literal for the '{@link tom.impl.PlainPatternConstImpl <em>Plain Pattern Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.PlainPatternConstImpl
		 * @see tom.impl.TomPackageImpl#getPlainPatternConst()
		 * @generated
		 */
		EClass PLAIN_PATTERN_CONST = eINSTANCE.getPlainPatternConst();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_PATTERN_CONST__HEAD = eINSTANCE.getPlainPatternConst_Head();

		/**
		 * The meta object literal for the '{@link tom.impl.PlainPatternVariableImpl <em>Plain Pattern Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.PlainPatternVariableImpl
		 * @see tom.impl.TomPackageImpl#getPlainPatternVariable()
		 * @generated
		 */
		EClass PLAIN_PATTERN_VARIABLE = eINSTANCE.getPlainPatternVariable();

		/**
		 * The meta object literal for the '{@link tom.impl.JokerPatternImpl <em>Joker Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.JokerPatternImpl
		 * @see tom.impl.TomPackageImpl#getJokerPattern()
		 * @generated
		 */
		EClass JOKER_PATTERN = eINSTANCE.getJokerPattern();

		/**
		 * The meta object literal for the '{@link tom.impl.PlainPatternOperationImpl <em>Plain Pattern Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.PlainPatternOperationImpl
		 * @see tom.impl.TomPackageImpl#getPlainPatternOperation()
		 * @generated
		 */
		EClass PLAIN_PATTERN_OPERATION = eINSTANCE.getPlainPatternOperation();

		/**
		 * The meta object literal for the '<em><b>Heads</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_PATTERN_OPERATION__HEADS = eINSTANCE.getPlainPatternOperation_Heads();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_PATTERN_OPERATION__LIST = eINSTANCE.getPlainPatternOperation_List();

		/**
		 * The meta object literal for the '{@link tom.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ListImpl
		 * @see tom.impl.TomPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '{@link tom.impl.OperationListImpl <em>Operation List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.OperationListImpl
		 * @see tom.impl.TomPackageImpl#getOperationList()
		 * @generated
		 */
		EClass OPERATION_LIST = eINSTANCE.getOperationList();

		/**
		 * The meta object literal for the '<em><b>Heads</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_LIST__HEADS = eINSTANCE.getOperationList_Heads();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_LIST__LOG = eINSTANCE.getOperationList_Log();

		/**
		 * The meta object literal for the '{@link tom.impl.ExplicitTermListImpl <em>Explicit Term List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ExplicitTermListImpl
		 * @see tom.impl.TomPackageImpl#getExplicitTermList()
		 * @generated
		 */
		EClass EXPLICIT_TERM_LIST = eINSTANCE.getExplicitTermList();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLICIT_TERM_LIST__PATTERNS = eINSTANCE.getExplicitTermList_Patterns();

		/**
		 * The meta object literal for the '{@link tom.impl.PlainPatternVariableListImpl <em>Plain Pattern Variable List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.PlainPatternVariableListImpl
		 * @see tom.impl.TomPackageImpl#getPlainPatternVariableList()
		 * @generated
		 */
		EClass PLAIN_PATTERN_VARIABLE_LIST = eINSTANCE.getPlainPatternVariableList();

		/**
		 * The meta object literal for the '{@link tom.impl.AnyPatternImpl <em>Any Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.AnyPatternImpl
		 * @see tom.impl.TomPackageImpl#getAnyPattern()
		 * @generated
		 */
		EClass ANY_PATTERN = eINSTANCE.getAnyPattern();

		/**
		 * The meta object literal for the '{@link tom.impl.ImplicitPairListImpl <em>Implicit Pair List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ImplicitPairListImpl
		 * @see tom.impl.TomPackageImpl#getImplicitPairList()
		 * @generated
		 */
		EClass IMPLICIT_PAIR_LIST = eINSTANCE.getImplicitPairList();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICIT_PAIR_LIST__PATTERNS = eINSTANCE.getImplicitPairList_Patterns();

		/**
		 * The meta object literal for the '{@link tom.impl.PairPatternImpl <em>Pair Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.PairPatternImpl
		 * @see tom.impl.TomPackageImpl#getPairPattern()
		 * @generated
		 */
		EClass PAIR_PATTERN = eINSTANCE.getPairPattern();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIR_PATTERN__PATTERN = eINSTANCE.getPairPattern_Pattern();

		/**
		 * The meta object literal for the '{@link tom.impl.StrategyConstructImpl <em>Strategy Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.StrategyConstructImpl
		 * @see tom.impl.TomPackageImpl#getStrategyConstruct()
		 * @generated
		 */
		EClass STRATEGY_CONSTRUCT = eINSTANCE.getStrategyConstruct();

		/**
		 * The meta object literal for the '<em><b>Implement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY_CONSTRUCT__IMPLEMENT = eINSTANCE.getStrategyConstruct_Implement();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY_CONSTRUCT__ARGS = eINSTANCE.getStrategyConstruct_Args();

		/**
		 * The meta object literal for the '<em><b>Visitlist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY_CONSTRUCT__VISITLIST = eINSTANCE.getStrategyConstruct_Visitlist();

		/**
		 * The meta object literal for the '{@link tom.impl.StrategyVisitImpl <em>Strategy Visit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.StrategyVisitImpl
		 * @see tom.impl.TomPackageImpl#getStrategyVisit()
		 * @generated
		 */
		EClass STRATEGY_VISIT = eINSTANCE.getStrategyVisit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY_VISIT__TYPE = eINSTANCE.getStrategyVisit_Type();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY_VISIT__ACTIONS = eINSTANCE.getStrategyVisit_Actions();

		/**
		 * The meta object literal for the '{@link tom.impl.VisitActionImpl <em>Visit Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.VisitActionImpl
		 * @see tom.impl.TomPackageImpl#getVisitAction()
		 * @generated
		 */
		EClass VISIT_ACTION = eINSTANCE.getVisitAction();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIT_ACTION__PATTERN = eINSTANCE.getVisitAction_Pattern();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIT_ACTION__STATEMENTS = eINSTANCE.getVisitAction_Statements();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIT_ACTION__TERM = eINSTANCE.getVisitAction_Term();

		/**
		 * The meta object literal for the '{@link tom.impl.PatternListImpl <em>Pattern List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.PatternListImpl
		 * @see tom.impl.TomPackageImpl#getPatternList()
		 * @generated
		 */
		EClass PATTERN_LIST = eINSTANCE.getPatternList();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_LIST__PATTERNS = eINSTANCE.getPatternList_Patterns();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_LIST__REL = eINSTANCE.getPatternList_Rel();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_LIST__CONSTRAINT = eINSTANCE.getPatternList_Constraint();

		/**
		 * The meta object literal for the '{@link tom.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ConstraintImpl
		 * @see tom.impl.TomPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link tom.impl.ConstraintOrImpl <em>Constraint Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ConstraintOrImpl
		 * @see tom.impl.TomPackageImpl#getConstraintOr()
		 * @generated
		 */
		EClass CONSTRAINT_OR = eINSTANCE.getConstraintOr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_OR__LEFT = eINSTANCE.getConstraintOr_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_OR__RIGHT = eINSTANCE.getConstraintOr_Right();

		/**
		 * The meta object literal for the '{@link tom.impl.ConstraintAndImpl <em>Constraint And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ConstraintAndImpl
		 * @see tom.impl.TomPackageImpl#getConstraintAnd()
		 * @generated
		 */
		EClass CONSTRAINT_AND = eINSTANCE.getConstraintAnd();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_AND__LEFT = eINSTANCE.getConstraintAnd_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_AND__RIGHT = eINSTANCE.getConstraintAnd_Right();

		/**
		 * The meta object literal for the '{@link tom.impl.ConstraintPImpl <em>Constraint P</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ConstraintPImpl
		 * @see tom.impl.TomPackageImpl#getConstraintP()
		 * @generated
		 */
		EClass CONSTRAINT_P = eINSTANCE.getConstraintP();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_P__CONSTRAINT = eINSTANCE.getConstraintP_Constraint();

		/**
		 * The meta object literal for the '{@link tom.impl.ConstraintMatchImpl <em>Constraint Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ConstraintMatchImpl
		 * @see tom.impl.TomPackageImpl#getConstraintMatch()
		 * @generated
		 */
		EClass CONSTRAINT_MATCH = eINSTANCE.getConstraintMatch();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_MATCH__PATTERN = eINSTANCE.getConstraintMatch_Pattern();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_MATCH__TYPE = eINSTANCE.getConstraintMatch_Type();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_MATCH__TERM = eINSTANCE.getConstraintMatch_Term();

		/**
		 * The meta object literal for the '{@link tom.impl.ConstraintOpImpl <em>Constraint Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ConstraintOpImpl
		 * @see tom.impl.TomPackageImpl#getConstraintOp()
		 * @generated
		 */
		EClass CONSTRAINT_OP = eINSTANCE.getConstraintOp();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_OP__LEFT = eINSTANCE.getConstraintOp_Left();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_OP__OPERATOR = eINSTANCE.getConstraintOp_Operator();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_OP__RIGHT = eINSTANCE.getConstraintOp_Right();

		/**
		 * The meta object literal for the '{@link tom.impl.GomConstructImpl <em>Gom Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.GomConstructImpl
		 * @see tom.impl.TomPackageImpl#getGomConstruct()
		 * @generated
		 */
		EClass GOM_CONSTRUCT = eINSTANCE.getGomConstruct();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOM_CONSTRUCT__OPTION = eINSTANCE.getGomConstruct_Option();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOM_CONSTRUCT__IMPORTS = eINSTANCE.getGomConstruct_Imports();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOM_CONSTRUCT__DEFINITIONS = eINSTANCE.getGomConstruct_Definitions();

		/**
		 * The meta object literal for the '{@link tom.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.DefinitionImpl
		 * @see tom.impl.TomPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '{@link tom.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.TypeDefinitionImpl
		 * @see tom.impl.TomPackageImpl#getTypeDefinition()
		 * @generated
		 */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Op Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITION__OP_DEFINITION = eINSTANCE.getTypeDefinition_OpDefinition();

		/**
		 * The meta object literal for the '{@link tom.impl.OperatorDefinitionImpl <em>Operator Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.OperatorDefinitionImpl
		 * @see tom.impl.TomPackageImpl#getOperatorDefinition()
		 * @generated
		 */
		EClass OPERATOR_DEFINITION = eINSTANCE.getOperatorDefinition();

		/**
		 * The meta object literal for the '{@link tom.impl.ArgumentsListImpl <em>Arguments List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ArgumentsListImpl
		 * @see tom.impl.TomPackageImpl#getArgumentsList()
		 * @generated
		 */
		EClass ARGUMENTS_LIST = eINSTANCE.getArgumentsList();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENTS_LIST__TYPE = eINSTANCE.getArgumentsList_Type();

		/**
		 * The meta object literal for the '{@link tom.impl.HookDefinitionImpl <em>Hook Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.HookDefinitionImpl
		 * @see tom.impl.TomPackageImpl#getHookDefinition()
		 * @generated
		 */
		EClass HOOK_DEFINITION = eINSTANCE.getHookDefinition();

		/**
		 * The meta object literal for the '<em><b>Hook Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOOK_DEFINITION__HOOK_OPERATION = eINSTANCE.getHookDefinition_HookOperation();

		/**
		 * The meta object literal for the '{@link tom.impl.HookModuleDefinitionImpl <em>Hook Module Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.HookModuleDefinitionImpl
		 * @see tom.impl.TomPackageImpl#getHookModuleDefinition()
		 * @generated
		 */
		EClass HOOK_MODULE_DEFINITION = eINSTANCE.getHookModuleDefinition();

		/**
		 * The meta object literal for the '<em><b>Hook Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOOK_MODULE_DEFINITION__HOOK_TYPE = eINSTANCE.getHookModuleDefinition_HookType();

		/**
		 * The meta object literal for the '{@link tom.impl.HookTypeDefinitionImpl <em>Hook Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.HookTypeDefinitionImpl
		 * @see tom.impl.TomPackageImpl#getHookTypeDefinition()
		 * @generated
		 */
		EClass HOOK_TYPE_DEFINITION = eINSTANCE.getHookTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Hook Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOOK_TYPE_DEFINITION__HOOK_TYPE = eINSTANCE.getHookTypeDefinition_HookType();

		/**
		 * The meta object literal for the '{@link tom.impl.HookOperatorDefinitionImpl <em>Hook Operator Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.HookOperatorDefinitionImpl
		 * @see tom.impl.TomPackageImpl#getHookOperatorDefinition()
		 * @generated
		 */
		EClass HOOK_OPERATOR_DEFINITION = eINSTANCE.getHookOperatorDefinition();

		/**
		 * The meta object literal for the '<em><b>Hook Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOOK_OPERATOR_DEFINITION__HOOK_TYPE = eINSTANCE.getHookOperatorDefinition_HookType();

		/**
		 * The meta object literal for the '{@link tom.impl.HookOperationImpl <em>Hook Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.HookOperationImpl
		 * @see tom.impl.TomPackageImpl#getHookOperation()
		 * @generated
		 */
		EClass HOOK_OPERATION = eINSTANCE.getHookOperation();

		/**
		 * The meta object literal for the '{@link tom.impl.HostHookOperationImpl <em>Host Hook Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.HostHookOperationImpl
		 * @see tom.impl.TomPackageImpl#getHostHookOperation()
		 * @generated
		 */
		EClass HOST_HOOK_OPERATION = eINSTANCE.getHostHookOperation();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_HOOK_OPERATION__ARGS = eINSTANCE.getHostHookOperation_Args();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_HOOK_OPERATION__STATEMENTS = eINSTANCE.getHostHookOperation_Statements();

		/**
		 * The meta object literal for the '{@link tom.impl.Hook_RulesImpl <em>Hook Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.Hook_RulesImpl
		 * @see tom.impl.TomPackageImpl#getHook_Rules()
		 * @generated
		 */
		EClass HOOK_RULES = eINSTANCE.getHook_Rules();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOOK_RULES__RULES = eINSTANCE.getHook_Rules_Rules();

		/**
		 * The meta object literal for the '{@link tom.impl.Hook_GraphrulesImpl <em>Hook Graphrules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.Hook_GraphrulesImpl
		 * @see tom.impl.TomPackageImpl#getHook_Graphrules()
		 * @generated
		 */
		EClass HOOK_GRAPHRULES = eINSTANCE.getHook_Graphrules();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOOK_GRAPHRULES__MODE = eINSTANCE.getHook_Graphrules_Mode();

		/**
		 * The meta object literal for the '<em><b>Graph Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOOK_GRAPHRULES__GRAPH_RULES = eINSTANCE.getHook_Graphrules_GraphRules();

		/**
		 * The meta object literal for the '{@link tom.impl.Hook_MakeImpl <em>Hook Make</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.Hook_MakeImpl
		 * @see tom.impl.TomPackageImpl#getHook_Make()
		 * @generated
		 */
		EClass HOOK_MAKE = eINSTANCE.getHook_Make();

		/**
		 * The meta object literal for the '{@link tom.impl.Hook_Make_InsertImpl <em>Hook Make Insert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.Hook_Make_InsertImpl
		 * @see tom.impl.TomPackageImpl#getHook_Make_Insert()
		 * @generated
		 */
		EClass HOOK_MAKE_INSERT = eINSTANCE.getHook_Make_Insert();

		/**
		 * The meta object literal for the '{@link tom.impl.Hook_Make_EmptyImpl <em>Hook Make Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.Hook_Make_EmptyImpl
		 * @see tom.impl.TomPackageImpl#getHook_Make_Empty()
		 * @generated
		 */
		EClass HOOK_MAKE_EMPTY = eINSTANCE.getHook_Make_Empty();

		/**
		 * The meta object literal for the '{@link tom.impl.Hook_FreeImpl <em>Hook Free</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.Hook_FreeImpl
		 * @see tom.impl.TomPackageImpl#getHook_Free()
		 * @generated
		 */
		EClass HOOK_FREE = eINSTANCE.getHook_Free();

		/**
		 * The meta object literal for the '{@link tom.impl.Hook_FLImpl <em>Hook FL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.Hook_FLImpl
		 * @see tom.impl.TomPackageImpl#getHook_FL()
		 * @generated
		 */
		EClass HOOK_FL = eINSTANCE.getHook_FL();

		/**
		 * The meta object literal for the '{@link tom.impl.Hook_AUImpl <em>Hook AU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.Hook_AUImpl
		 * @see tom.impl.TomPackageImpl#getHook_AU()
		 * @generated
		 */
		EClass HOOK_AU = eINSTANCE.getHook_AU();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOOK_AU__TERM = eINSTANCE.getHook_AU_Term();

		/**
		 * The meta object literal for the '{@link tom.impl.Hook_InterfaceImpl <em>Hook Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.Hook_InterfaceImpl
		 * @see tom.impl.TomPackageImpl#getHook_Interface()
		 * @generated
		 */
		EClass HOOK_INTERFACE = eINSTANCE.getHook_Interface();

		/**
		 * The meta object literal for the '{@link tom.impl.Hook_ImportsImpl <em>Hook Imports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.Hook_ImportsImpl
		 * @see tom.impl.TomPackageImpl#getHook_Imports()
		 * @generated
		 */
		EClass HOOK_IMPORTS = eINSTANCE.getHook_Imports();

		/**
		 * The meta object literal for the '{@link tom.impl.Hook_BlockImpl <em>Hook Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.Hook_BlockImpl
		 * @see tom.impl.TomPackageImpl#getHook_Block()
		 * @generated
		 */
		EClass HOOK_BLOCK = eINSTANCE.getHook_Block();

		/**
		 * The meta object literal for the '{@link tom.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.RuleImpl
		 * @see tom.impl.TomPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Rule Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_PATTERN = eINSTANCE.getRule_RulePattern();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__TERM = eINSTANCE.getRule_Term();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__COND = eINSTANCE.getRule_Cond();

		/**
		 * The meta object literal for the '{@link tom.impl.RulePatternImpl <em>Rule Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.RulePatternImpl
		 * @see tom.impl.TomPackageImpl#getRulePattern()
		 * @generated
		 */
		EClass RULE_PATTERN = eINSTANCE.getRulePattern();

		/**
		 * The meta object literal for the '{@link tom.impl.NamedRulePatternImpl <em>Named Rule Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.NamedRulePatternImpl
		 * @see tom.impl.TomPackageImpl#getNamedRulePattern()
		 * @generated
		 */
		EClass NAMED_RULE_PATTERN = eINSTANCE.getNamedRulePattern();

		/**
		 * The meta object literal for the '<em><b>Plain Rule Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN = eINSTANCE.getNamedRulePattern_PlainRulePattern();

		/**
		 * The meta object literal for the '{@link tom.impl.AntiRulePatternImpl <em>Anti Rule Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.AntiRulePatternImpl
		 * @see tom.impl.TomPackageImpl#getAntiRulePattern()
		 * @generated
		 */
		EClass ANTI_RULE_PATTERN = eINSTANCE.getAntiRulePattern();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTI_RULE_PATTERN__PATTERN = eINSTANCE.getAntiRulePattern_Pattern();

		/**
		 * The meta object literal for the '{@link tom.impl.PlainRulePatternOperationImpl <em>Plain Rule Pattern Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.PlainRulePatternOperationImpl
		 * @see tom.impl.TomPackageImpl#getPlainRulePatternOperation()
		 * @generated
		 */
		EClass PLAIN_RULE_PATTERN_OPERATION = eINSTANCE.getPlainRulePatternOperation();

		/**
		 * The meta object literal for the '<em><b>Heads</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_RULE_PATTERN_OPERATION__HEADS = eINSTANCE.getPlainRulePatternOperation_Heads();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_RULE_PATTERN_OPERATION__RULES = eINSTANCE.getPlainRulePatternOperation_Rules();

		/**
		 * The meta object literal for the '{@link tom.impl.GraphRuleImpl <em>Graph Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.GraphRuleImpl
		 * @see tom.impl.TomPackageImpl#getGraphRule()
		 * @generated
		 */
		EClass GRAPH_RULE = eINSTANCE.getGraphRule();

		/**
		 * The meta object literal for the '<em><b>Termcond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_RULE__TERMCOND = eINSTANCE.getGraphRule_Termcond();

		/**
		 * The meta object literal for the '<em><b>Term Graph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_RULE__TERM_GRAPH = eINSTANCE.getGraphRule_TermGraph();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_RULE__COND = eINSTANCE.getGraphRule_Cond();

		/**
		 * The meta object literal for the '{@link tom.impl.TermGraphImpl <em>Term Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.TermGraphImpl
		 * @see tom.impl.TomPackageImpl#getTermGraph()
		 * @generated
		 */
		EClass TERM_GRAPH = eINSTANCE.getTermGraph();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_GRAPH__NAME = eINSTANCE.getTermGraph_Name();

		/**
		 * The meta object literal for the '<em><b>Term Graph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_GRAPH__TERM_GRAPH = eINSTANCE.getTermGraph_TermGraph();

		/**
		 * The meta object literal for the '{@link tom.impl.PlainTermGraphImpl <em>Plain Term Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.PlainTermGraphImpl
		 * @see tom.impl.TomPackageImpl#getPlainTermGraph()
		 * @generated
		 */
		EClass PLAIN_TERM_GRAPH = eINSTANCE.getPlainTermGraph();

		/**
		 * The meta object literal for the '{@link tom.impl.TermGraphVariableImpl <em>Term Graph Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.TermGraphVariableImpl
		 * @see tom.impl.TomPackageImpl#getTermGraphVariable()
		 * @generated
		 */
		EClass TERM_GRAPH_VARIABLE = eINSTANCE.getTermGraphVariable();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_GRAPH_VARIABLE__LABEL = eINSTANCE.getTermGraphVariable_Label();

		/**
		 * The meta object literal for the '{@link tom.impl.TermGraphFuncImpl <em>Term Graph Func</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.TermGraphFuncImpl
		 * @see tom.impl.TomPackageImpl#getTermGraphFunc()
		 * @generated
		 */
		EClass TERM_GRAPH_FUNC = eINSTANCE.getTermGraphFunc();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_GRAPH_FUNC__HEAD = eINSTANCE.getTermGraphFunc_Head();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_GRAPH_FUNC__TERMS = eINSTANCE.getTermGraphFunc_Terms();

		/**
		 * The meta object literal for the '{@link tom.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ConditionImpl
		 * @see tom.impl.TomPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link tom.impl.ConditionOrImpl <em>Condition Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ConditionOrImpl
		 * @see tom.impl.TomPackageImpl#getConditionOr()
		 * @generated
		 */
		EClass CONDITION_OR = eINSTANCE.getConditionOr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_OR__LEFT = eINSTANCE.getConditionOr_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_OR__RIGHT = eINSTANCE.getConditionOr_Right();

		/**
		 * The meta object literal for the '{@link tom.impl.ConditionAndImpl <em>Condition And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ConditionAndImpl
		 * @see tom.impl.TomPackageImpl#getConditionAnd()
		 * @generated
		 */
		EClass CONDITION_AND = eINSTANCE.getConditionAnd();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_AND__LEFT = eINSTANCE.getConditionAnd_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_AND__RIGHT = eINSTANCE.getConditionAnd_Right();

		/**
		 * The meta object literal for the '{@link tom.impl.ConditionPImpl <em>Condition P</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ConditionPImpl
		 * @see tom.impl.TomPackageImpl#getConditionP()
		 * @generated
		 */
		EClass CONDITION_P = eINSTANCE.getConditionP();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_P__CONDITION = eINSTANCE.getConditionP_Condition();

		/**
		 * The meta object literal for the '{@link tom.impl.ConditionRuleImpl <em>Condition Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ConditionRuleImpl
		 * @see tom.impl.TomPackageImpl#getConditionRule()
		 * @generated
		 */
		EClass CONDITION_RULE = eINSTANCE.getConditionRule();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_RULE__RULE = eINSTANCE.getConditionRule_Rule();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_RULE__TERM = eINSTANCE.getConditionRule_Term();

		/**
		 * The meta object literal for the '{@link tom.impl.ConditionOpImpl <em>Condition Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ConditionOpImpl
		 * @see tom.impl.TomPackageImpl#getConditionOp()
		 * @generated
		 */
		EClass CONDITION_OP = eINSTANCE.getConditionOp();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_OP__LEFT = eINSTANCE.getConditionOp_Left();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_OP__OPERATOR = eINSTANCE.getConditionOp_Operator();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_OP__RIGHT = eINSTANCE.getConditionOp_Right();

		/**
		 * The meta object literal for the '{@link tom.impl.XMLTermImpl <em>XML Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.XMLTermImpl
		 * @see tom.impl.TomPackageImpl#getXMLTerm()
		 * @generated
		 */
		EClass XML_TERM = eINSTANCE.getXMLTerm();

		/**
		 * The meta object literal for the '{@link tom.impl.XMLTermSimpleImpl <em>XML Term Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.XMLTermSimpleImpl
		 * @see tom.impl.TomPackageImpl#getXMLTermSimple()
		 * @generated
		 */
		EClass XML_TERM_SIMPLE = eINSTANCE.getXMLTermSimple();

		/**
		 * The meta object literal for the '<em><b>Name List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_TERM_SIMPLE__NAME_LIST = eINSTANCE.getXMLTermSimple_NameList();

		/**
		 * The meta object literal for the '<em><b>Attr List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_TERM_SIMPLE__ATTR_LIST = eINSTANCE.getXMLTermSimple_AttrList();

		/**
		 * The meta object literal for the '{@link tom.impl.XMLTermDoubleImpl <em>XML Term Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.XMLTermDoubleImpl
		 * @see tom.impl.TomPackageImpl#getXMLTermDouble()
		 * @generated
		 */
		EClass XML_TERM_DOUBLE = eINSTANCE.getXMLTermDouble();

		/**
		 * The meta object literal for the '<em><b>Name List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_TERM_DOUBLE__NAME_LIST = eINSTANCE.getXMLTermDouble_NameList();

		/**
		 * The meta object literal for the '<em><b>Attr List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_TERM_DOUBLE__ATTR_LIST = eINSTANCE.getXMLTermDouble_AttrList();

		/**
		 * The meta object literal for the '<em><b>Childs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_TERM_DOUBLE__CHILDS = eINSTANCE.getXMLTermDouble_Childs();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_TERM_DOUBLE__LIST = eINSTANCE.getXMLTermDouble_List();

		/**
		 * The meta object literal for the '{@link tom.impl.XMLTermTextImpl <em>XML Term Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.XMLTermTextImpl
		 * @see tom.impl.TomPackageImpl#getXMLTermText()
		 * @generated
		 */
		EClass XML_TERM_TEXT = eINSTANCE.getXMLTermText();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_TERM_TEXT__NAME = eINSTANCE.getXMLTermText_Name();

		/**
		 * The meta object literal for the '{@link tom.impl.XMLTermCommentImpl <em>XML Term Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.XMLTermCommentImpl
		 * @see tom.impl.TomPackageImpl#getXMLTermComment()
		 * @generated
		 */
		EClass XML_TERM_COMMENT = eINSTANCE.getXMLTermComment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_TERM_COMMENT__NAME = eINSTANCE.getXMLTermComment_Name();

		/**
		 * The meta object literal for the '{@link tom.impl.XMLTermProcessImpl <em>XML Term Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.XMLTermProcessImpl
		 * @see tom.impl.TomPackageImpl#getXMLTermProcess()
		 * @generated
		 */
		EClass XML_TERM_PROCESS = eINSTANCE.getXMLTermProcess();

		/**
		 * The meta object literal for the '<em><b>Name1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_TERM_PROCESS__NAME1 = eINSTANCE.getXMLTermProcess_Name1();

		/**
		 * The meta object literal for the '<em><b>Name2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_TERM_PROCESS__NAME2 = eINSTANCE.getXMLTermProcess_Name2();

		/**
		 * The meta object literal for the '{@link tom.impl.XMLNameListImpl <em>XML Name List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.XMLNameListImpl
		 * @see tom.impl.TomPackageImpl#getXMLNameList()
		 * @generated
		 */
		EClass XML_NAME_LIST = eINSTANCE.getXMLNameList();

		/**
		 * The meta object literal for the '<em><b>XML Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_NAME_LIST__XML_NAME = eINSTANCE.getXMLNameList_XMLName();

		/**
		 * The meta object literal for the '{@link tom.impl.XMLAttrListImpl <em>XML Attr List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.XMLAttrListImpl
		 * @see tom.impl.TomPackageImpl#getXMLAttrList()
		 * @generated
		 */
		EClass XML_ATTR_LIST = eINSTANCE.getXMLAttrList();

		/**
		 * The meta object literal for the '<em><b>Attrs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_ATTR_LIST__ATTRS = eINSTANCE.getXMLAttrList_Attrs();

		/**
		 * The meta object literal for the '{@link tom.impl.XMLAttributeImpl <em>XML Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.XMLAttributeImpl
		 * @see tom.impl.TomPackageImpl#getXMLAttribute()
		 * @generated
		 */
		EClass XML_ATTRIBUTE = eINSTANCE.getXMLAttribute();

		/**
		 * The meta object literal for the '{@link tom.impl.XMLAttribute1Impl <em>XML Attribute1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.XMLAttribute1Impl
		 * @see tom.impl.TomPackageImpl#getXMLAttribute1()
		 * @generated
		 */
		EClass XML_ATTRIBUTE1 = eINSTANCE.getXMLAttribute1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ATTRIBUTE1__NAME = eINSTANCE.getXMLAttribute1_Name();

		/**
		 * The meta object literal for the '{@link tom.impl.XMLAttribute2Impl <em>XML Attribute2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.XMLAttribute2Impl
		 * @see tom.impl.TomPackageImpl#getXMLAttribute2()
		 * @generated
		 */
		EClass XML_ATTRIBUTE2 = eINSTANCE.getXMLAttribute2();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ATTRIBUTE2__ATTRIBUTE_NAME = eINSTANCE.getXMLAttribute2_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Annoted Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ATTRIBUTE2__ANNOTED_NAME = eINSTANCE.getXMLAttribute2_AnnotedName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ATTRIBUTE2__NAME = eINSTANCE.getXMLAttribute2_Name();

		/**
		 * The meta object literal for the '{@link tom.impl.XMLAttribute3Impl <em>XML Attribute3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.XMLAttribute3Impl
		 * @see tom.impl.TomPackageImpl#getXMLAttribute3()
		 * @generated
		 */
		EClass XML_ATTRIBUTE3 = eINSTANCE.getXMLAttribute3();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ATTRIBUTE3__ATTRIBUTE_NAME = eINSTANCE.getXMLAttribute3_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Annoted Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ATTRIBUTE3__ANNOTED_NAME = eINSTANCE.getXMLAttribute3_AnnotedName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ATTRIBUTE3__NAME = eINSTANCE.getXMLAttribute3_Name();

		/**
		 * The meta object literal for the '{@link tom.impl.XMLChildsImpl <em>XML Childs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.XMLChildsImpl
		 * @see tom.impl.TomPackageImpl#getXMLChilds()
		 * @generated
		 */
		EClass XML_CHILDS = eINSTANCE.getXMLChilds();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_CHILDS__TERMS = eINSTANCE.getXMLChilds_Terms();

		/**
		 * The meta object literal for the '{@link tom.impl.TypeTermImpl <em>Type Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.TypeTermImpl
		 * @see tom.impl.TomPackageImpl#getTypeTerm()
		 * @generated
		 */
		EClass TYPE_TERM = eINSTANCE.getTypeTerm();

		/**
		 * The meta object literal for the '<em><b>Hote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_TERM__HOTE = eINSTANCE.getTypeTerm_Hote();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TERM__TYPE = eINSTANCE.getTypeTerm_Type();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TERM__KEYS = eINSTANCE.getTypeTerm_Keys();

		/**
		 * The meta object literal for the '{@link tom.impl.KeyWordImpl <em>Key Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.KeyWordImpl
		 * @see tom.impl.TomPackageImpl#getKeyWord()
		 * @generated
		 */
		EClass KEY_WORD = eINSTANCE.getKeyWord();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_WORD__ARGS = eINSTANCE.getKeyWord_Args();

		/**
		 * The meta object literal for the '<em><b>Hote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_WORD__HOTE = eINSTANCE.getKeyWord_Hote();

		/**
		 * The meta object literal for the '{@link tom.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.OperatorImpl
		 * @see tom.impl.TomPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__KEYS = eINSTANCE.getOperator_Keys();

		/**
		 * The meta object literal for the '{@link tom.impl.OperatorListImpl <em>Operator List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.OperatorListImpl
		 * @see tom.impl.TomPackageImpl#getOperatorList()
		 * @generated
		 */
		EClass OPERATOR_LIST = eINSTANCE.getOperatorList();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_LIST__KEYS = eINSTANCE.getOperatorList_Keys();

		/**
		 * The meta object literal for the '{@link tom.impl.OperatorArrayImpl <em>Operator Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.OperatorArrayImpl
		 * @see tom.impl.TomPackageImpl#getOperatorArray()
		 * @generated
		 */
		EClass OPERATOR_ARRAY = eINSTANCE.getOperatorArray();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_ARRAY__KEYS = eINSTANCE.getOperatorArray_Keys();

		/**
		 * The meta object literal for the '{@link tom.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.TransformationImpl
		 * @see tom.impl.TomPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>File From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__FILE_FROM = eINSTANCE.getTransformation_FileFrom();

		/**
		 * The meta object literal for the '<em><b>File To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__FILE_TO = eINSTANCE.getTransformation_FileTo();

		/**
		 * The meta object literal for the '<em><b>Elementary Tranformations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__ELEMENTARY_TRANFORMATIONS = eINSTANCE.getTransformation_ElementaryTranformations();

		/**
		 * The meta object literal for the '{@link tom.impl.ElementaryTransformationImpl <em>Elementary Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ElementaryTransformationImpl
		 * @see tom.impl.TomPackageImpl#getElementaryTransformation()
		 * @generated
		 */
		EClass ELEMENTARY_TRANSFORMATION = eINSTANCE.getElementaryTransformation();

		/**
		 * The meta object literal for the '<em><b>Implement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_TRANSFORMATION__IMPLEMENT = eINSTANCE.getElementaryTransformation_Implement();

		/**
		 * The meta object literal for the '<em><b>Elementary Transformation Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_TRANSFORMATION__ELEMENTARY_TRANSFORMATION_RULES = eINSTANCE.getElementaryTransformation_ElementaryTransformationRules();

		/**
		 * The meta object literal for the '{@link tom.impl.ElementaryTransformationRuleImpl <em>Elementary Transformation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ElementaryTransformationRuleImpl
		 * @see tom.impl.TomPackageImpl#getElementaryTransformationRule()
		 * @generated
		 */
		EClass ELEMENTARY_TRANSFORMATION_RULE = eINSTANCE.getElementaryTransformationRule();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_TRANSFORMATION_RULE__PATTERN = eINSTANCE.getElementaryTransformationRule_Pattern();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_TRANSFORMATION_RULE__STATEMENTS = eINSTANCE.getElementaryTransformationRule_Statements();

		/**
		 * The meta object literal for the '{@link tom.impl.TracelinkImpl <em>Tracelink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.TracelinkImpl
		 * @see tom.impl.TomPackageImpl#getTracelink()
		 * @generated
		 */
		EClass TRACELINK = eINSTANCE.getTracelink();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACELINK__TERM = eINSTANCE.getTracelink_Term();

		/**
		 * The meta object literal for the '{@link tom.impl.ResolveImpl <em>Resolve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.impl.ResolveImpl
		 * @see tom.impl.TomPackageImpl#getResolve()
		 * @generated
		 */
		EClass RESOLVE = eINSTANCE.getResolve();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE__SOURCE = eINSTANCE.getResolve_Source();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE__TYPE = eINSTANCE.getResolve_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE__TARGET = eINSTANCE.getResolve_Target();

		/**
		 * The meta object literal for the '{@link tom.RelOperator <em>Rel Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tom.RelOperator
		 * @see tom.impl.TomPackageImpl#getRelOperator()
		 * @generated
		 */
		EEnum REL_OPERATOR = eINSTANCE.getRelOperator();

	}

} //TomPackage
