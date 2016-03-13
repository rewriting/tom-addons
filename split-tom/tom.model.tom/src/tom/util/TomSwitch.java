/**
 */
package tom.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tom.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tom.TomPackage
 * @generated
 */
public class TomSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TomPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TomSwitch() {
		if (modelPackage == null) {
			modelPackage = TomPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TomPackage.HOST_CODE: {
				HostCode hostCode = (HostCode)theEObject;
				T result = caseHostCode(hostCode);
				if (result == null) result = caseStatement(hostCode);
				if (result == null) result = caseBlock(hostCode);
				if (result == null) result = caseContext(hostCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseStatement(expression);
				if (result == null) result = caseContext(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CALL: {
				Call call = (Call)theEObject;
				T result = caseCall(call);
				if (result == null) result = caseExpression(call);
				if (result == null) result = caseStatement(call);
				if (result == null) result = caseContext(call);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.DECLARATION: {
				Declaration declaration = (Declaration)theEObject;
				T result = caseDeclaration(declaration);
				if (result == null) result = caseExpression(declaration);
				if (result == null) result = caseLocalVariable(declaration);
				if (result == null) result = caseStatement(declaration);
				if (result == null) result = caseVariable(declaration);
				if (result == null) result = caseContext(declaration);
				if (result == null) result = caseLinkable(declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.AFFECTATION: {
				Affectation affectation = (Affectation)theEObject;
				T result = caseAffectation(affectation);
				if (result == null) result = caseExpression(affectation);
				if (result == null) result = caseStatement(affectation);
				if (result == null) result = caseContext(affectation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.TOM: {
				Tom tom = (Tom)theEObject;
				T result = caseTom(tom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.LINKABLE: {
				Linkable linkable = (Linkable)theEObject;
				T result = caseLinkable(linkable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseLinkable(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseLinkable(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseLinkable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.GLOBAL_VARIABLE: {
				GlobalVariable globalVariable = (GlobalVariable)theEObject;
				T result = caseGlobalVariable(globalVariable);
				if (result == null) result = caseVariable(globalVariable);
				if (result == null) result = caseLinkable(globalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.LOCAL_VARIABLE: {
				LocalVariable localVariable = (LocalVariable)theEObject;
				T result = caseLocalVariable(localVariable);
				if (result == null) result = caseVariable(localVariable);
				if (result == null) result = caseLinkable(localVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.VARIABLE_SIMPLE: {
				VariableSimple variableSimple = (VariableSimple)theEObject;
				T result = caseVariableSimple(variableSimple);
				if (result == null) result = caseLocalVariable(variableSimple);
				if (result == null) result = caseVariable(variableSimple);
				if (result == null) result = caseLinkable(variableSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.VARIABLE_LIST: {
				VariableList variableList = (VariableList)theEObject;
				T result = caseVariableList(variableList);
				if (result == null) result = caseLocalVariable(variableList);
				if (result == null) result = caseVariable(variableList);
				if (result == null) result = caseLinkable(variableList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseContext(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseBlock(function);
				if (result == null) result = caseOperation(function);
				if (result == null) result = caseContext(function);
				if (result == null) result = caseLinkable(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CALLBACK: {
				Callback callback = (Callback)theEObject;
				T result = caseCallback(callback);
				if (result == null) result = caseBlock(callback);
				if (result == null) result = caseContext(callback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CALLBACK_DEFINITION: {
				CallbackDefinition callbackDefinition = (CallbackDefinition)theEObject;
				T result = caseCallbackDefinition(callbackDefinition);
				if (result == null) result = caseOperation(callbackDefinition);
				if (result == null) result = caseLinkable(callbackDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.ARGUMENTS: {
				Arguments arguments = (Arguments)theEObject;
				T result = caseArguments(arguments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.ARGUMENT: {
				Argument argument = (Argument)theEObject;
				T result = caseArgument(argument);
				if (result == null) result = caseVariableSimple(argument);
				if (result == null) result = caseLocalVariable(argument);
				if (result == null) result = caseVariable(argument);
				if (result == null) result = caseLinkable(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.ARGUMENT_TYPE_SUFFIX: {
				ArgumentTypeSuffix argumentTypeSuffix = (ArgumentTypeSuffix)theEObject;
				T result = caseArgumentTypeSuffix(argumentTypeSuffix);
				if (result == null) result = caseArgument(argumentTypeSuffix);
				if (result == null) result = caseVariableSimple(argumentTypeSuffix);
				if (result == null) result = caseLocalVariable(argumentTypeSuffix);
				if (result == null) result = caseVariable(argumentTypeSuffix);
				if (result == null) result = caseLinkable(argumentTypeSuffix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.ARGUMENT_TYPE_PREFIX: {
				ArgumentTypePrefix argumentTypePrefix = (ArgumentTypePrefix)theEObject;
				T result = caseArgumentTypePrefix(argumentTypePrefix);
				if (result == null) result = caseArgument(argumentTypePrefix);
				if (result == null) result = caseVariableSimple(argumentTypePrefix);
				if (result == null) result = caseLocalVariable(argumentTypePrefix);
				if (result == null) result = caseVariable(argumentTypePrefix);
				if (result == null) result = caseLinkable(argumentTypePrefix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.IMPORT_CONSTRUCT: {
				ImportConstruct importConstruct = (ImportConstruct)theEObject;
				T result = caseImportConstruct(importConstruct);
				if (result == null) result = caseBlock(importConstruct);
				if (result == null) result = caseContext(importConstruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.INCLUDE_CONSTRUCT: {
				IncludeConstruct includeConstruct = (IncludeConstruct)theEObject;
				T result = caseIncludeConstruct(includeConstruct);
				if (result == null) result = caseBlock(includeConstruct);
				if (result == null) result = caseContext(includeConstruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = caseContext(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = caseConstraint(term);
				if (result == null) result = caseCondition(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.TERM_SUM: {
				TermSum termSum = (TermSum)theEObject;
				T result = caseTermSum(termSum);
				if (result == null) result = caseTerm(termSum);
				if (result == null) result = caseConstraint(termSum);
				if (result == null) result = caseCondition(termSum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.TERM_CONST: {
				TermConst termConst = (TermConst)theEObject;
				T result = caseTermConst(termConst);
				if (result == null) result = caseTerm(termConst);
				if (result == null) result = caseConstraint(termConst);
				if (result == null) result = caseCondition(termConst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.TERM_NULL: {
				TermNull termNull = (TermNull)theEObject;
				T result = caseTermNull(termNull);
				if (result == null) result = caseTermConst(termNull);
				if (result == null) result = caseTerm(termNull);
				if (result == null) result = caseConstraint(termNull);
				if (result == null) result = caseCondition(termNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.TERM_VARIABLE: {
				TermVariable termVariable = (TermVariable)theEObject;
				T result = caseTermVariable(termVariable);
				if (result == null) result = caseTerm(termVariable);
				if (result == null) result = caseConstraint(termVariable);
				if (result == null) result = caseCondition(termVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.TERM_OPERATION: {
				TermOperation termOperation = (TermOperation)theEObject;
				T result = caseTermOperation(termOperation);
				if (result == null) result = caseTerm(termOperation);
				if (result == null) result = caseConstraint(termOperation);
				if (result == null) result = caseCondition(termOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.RETURN: {
				Return return_ = (Return)theEObject;
				T result = caseReturn(return_);
				if (result == null) result = caseStatement(return_);
				if (result == null) result = caseContext(return_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.MATCH_CONSCTRUCT: {
				MatchConsctruct matchConsctruct = (MatchConsctruct)theEObject;
				T result = caseMatchConsctruct(matchConsctruct);
				if (result == null) result = caseStatement(matchConsctruct);
				if (result == null) result = caseContext(matchConsctruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.MATCH_PATTERN: {
				MatchPattern matchPattern = (MatchPattern)theEObject;
				T result = caseMatchPattern(matchPattern);
				if (result == null) result = caseMatchConsctruct(matchPattern);
				if (result == null) result = caseStatement(matchPattern);
				if (result == null) result = caseContext(matchPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.ARGUMENT_MATCH: {
				ArgumentMatch argumentMatch = (ArgumentMatch)theEObject;
				T result = caseArgumentMatch(argumentMatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.PATTERN_ACTION: {
				PatternAction patternAction = (PatternAction)theEObject;
				T result = casePatternAction(patternAction);
				if (result == null) result = caseContext(patternAction);
				if (result == null) result = caseLinkable(patternAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CONSTRAINT_PATTERN: {
				ConstraintPattern constraintPattern = (ConstraintPattern)theEObject;
				T result = caseConstraintPattern(constraintPattern);
				if (result == null) result = caseMatchConsctruct(constraintPattern);
				if (result == null) result = caseStatement(constraintPattern);
				if (result == null) result = caseContext(constraintPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CONSTRAINT_ACTION: {
				ConstraintAction constraintAction = (ConstraintAction)theEObject;
				T result = caseConstraintAction(constraintAction);
				if (result == null) result = caseContext(constraintAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.PATTERN: {
				Pattern pattern = (Pattern)theEObject;
				T result = casePattern(pattern);
				if (result == null) result = caseConstraint(pattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.NAMED_PATTERN: {
				NamedPattern namedPattern = (NamedPattern)theEObject;
				T result = caseNamedPattern(namedPattern);
				if (result == null) result = casePattern(namedPattern);
				if (result == null) result = caseLocalVariable(namedPattern);
				if (result == null) result = caseConstraint(namedPattern);
				if (result == null) result = caseVariable(namedPattern);
				if (result == null) result = caseLinkable(namedPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.ANTI_PATTERN: {
				AntiPattern antiPattern = (AntiPattern)theEObject;
				T result = caseAntiPattern(antiPattern);
				if (result == null) result = casePattern(antiPattern);
				if (result == null) result = caseConstraint(antiPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.PLAIN_PATTERN_CONST: {
				PlainPatternConst plainPatternConst = (PlainPatternConst)theEObject;
				T result = casePlainPatternConst(plainPatternConst);
				if (result == null) result = casePattern(plainPatternConst);
				if (result == null) result = caseRulePattern(plainPatternConst);
				if (result == null) result = caseConstraint(plainPatternConst);
				if (result == null) result = caseCondition(plainPatternConst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.PLAIN_PATTERN_VARIABLE: {
				PlainPatternVariable plainPatternVariable = (PlainPatternVariable)theEObject;
				T result = casePlainPatternVariable(plainPatternVariable);
				if (result == null) result = casePattern(plainPatternVariable);
				if (result == null) result = caseRulePattern(plainPatternVariable);
				if (result == null) result = caseVariableSimple(plainPatternVariable);
				if (result == null) result = caseConstraint(plainPatternVariable);
				if (result == null) result = caseCondition(plainPatternVariable);
				if (result == null) result = caseLocalVariable(plainPatternVariable);
				if (result == null) result = caseVariable(plainPatternVariable);
				if (result == null) result = caseLinkable(plainPatternVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.JOKER_PATTERN: {
				JokerPattern jokerPattern = (JokerPattern)theEObject;
				T result = caseJokerPattern(jokerPattern);
				if (result == null) result = casePattern(jokerPattern);
				if (result == null) result = caseRulePattern(jokerPattern);
				if (result == null) result = caseConstraint(jokerPattern);
				if (result == null) result = caseCondition(jokerPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.PLAIN_PATTERN_OPERATION: {
				PlainPatternOperation plainPatternOperation = (PlainPatternOperation)theEObject;
				T result = casePlainPatternOperation(plainPatternOperation);
				if (result == null) result = casePattern(plainPatternOperation);
				if (result == null) result = caseConstraint(plainPatternOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.LIST: {
				List list = (List)theEObject;
				T result = caseList(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.OPERATION_LIST: {
				OperationList operationList = (OperationList)theEObject;
				T result = caseOperationList(operationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.EXPLICIT_TERM_LIST: {
				ExplicitTermList explicitTermList = (ExplicitTermList)theEObject;
				T result = caseExplicitTermList(explicitTermList);
				if (result == null) result = caseList(explicitTermList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.PLAIN_PATTERN_VARIABLE_LIST: {
				PlainPatternVariableList plainPatternVariableList = (PlainPatternVariableList)theEObject;
				T result = casePlainPatternVariableList(plainPatternVariableList);
				if (result == null) result = casePattern(plainPatternVariableList);
				if (result == null) result = caseRulePattern(plainPatternVariableList);
				if (result == null) result = caseVariableList(plainPatternVariableList);
				if (result == null) result = caseConstraint(plainPatternVariableList);
				if (result == null) result = caseCondition(plainPatternVariableList);
				if (result == null) result = caseLocalVariable(plainPatternVariableList);
				if (result == null) result = caseVariable(plainPatternVariableList);
				if (result == null) result = caseLinkable(plainPatternVariableList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.ANY_PATTERN: {
				AnyPattern anyPattern = (AnyPattern)theEObject;
				T result = caseAnyPattern(anyPattern);
				if (result == null) result = casePattern(anyPattern);
				if (result == null) result = caseRulePattern(anyPattern);
				if (result == null) result = caseConstraint(anyPattern);
				if (result == null) result = caseCondition(anyPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.IMPLICIT_PAIR_LIST: {
				ImplicitPairList implicitPairList = (ImplicitPairList)theEObject;
				T result = caseImplicitPairList(implicitPairList);
				if (result == null) result = caseList(implicitPairList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.PAIR_PATTERN: {
				PairPattern pairPattern = (PairPattern)theEObject;
				T result = casePairPattern(pairPattern);
				if (result == null) result = caseLinkable(pairPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.STRATEGY_CONSTRUCT: {
				StrategyConstruct strategyConstruct = (StrategyConstruct)theEObject;
				T result = caseStrategyConstruct(strategyConstruct);
				if (result == null) result = caseType(strategyConstruct);
				if (result == null) result = caseBlock(strategyConstruct);
				if (result == null) result = caseLinkable(strategyConstruct);
				if (result == null) result = caseContext(strategyConstruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.STRATEGY_VISIT: {
				StrategyVisit strategyVisit = (StrategyVisit)theEObject;
				T result = caseStrategyVisit(strategyVisit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.VISIT_ACTION: {
				VisitAction visitAction = (VisitAction)theEObject;
				T result = caseVisitAction(visitAction);
				if (result == null) result = caseContext(visitAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.PATTERN_LIST: {
				PatternList patternList = (PatternList)theEObject;
				T result = casePatternList(patternList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CONSTRAINT_OR: {
				ConstraintOr constraintOr = (ConstraintOr)theEObject;
				T result = caseConstraintOr(constraintOr);
				if (result == null) result = caseConstraint(constraintOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CONSTRAINT_AND: {
				ConstraintAnd constraintAnd = (ConstraintAnd)theEObject;
				T result = caseConstraintAnd(constraintAnd);
				if (result == null) result = caseConstraint(constraintAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CONSTRAINT_P: {
				ConstraintP constraintP = (ConstraintP)theEObject;
				T result = caseConstraintP(constraintP);
				if (result == null) result = caseConstraint(constraintP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CONSTRAINT_MATCH: {
				ConstraintMatch constraintMatch = (ConstraintMatch)theEObject;
				T result = caseConstraintMatch(constraintMatch);
				if (result == null) result = caseConstraint(constraintMatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CONSTRAINT_OP: {
				ConstraintOp constraintOp = (ConstraintOp)theEObject;
				T result = caseConstraintOp(constraintOp);
				if (result == null) result = caseConstraint(constraintOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.GOM_CONSTRUCT: {
				GomConstruct gomConstruct = (GomConstruct)theEObject;
				T result = caseGomConstruct(gomConstruct);
				if (result == null) result = caseBlock(gomConstruct);
				if (result == null) result = caseLinkable(gomConstruct);
				if (result == null) result = caseContext(gomConstruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.DEFINITION: {
				Definition definition = (Definition)theEObject;
				T result = caseDefinition(definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.TYPE_DEFINITION: {
				TypeDefinition typeDefinition = (TypeDefinition)theEObject;
				T result = caseTypeDefinition(typeDefinition);
				if (result == null) result = caseType(typeDefinition);
				if (result == null) result = caseDefinition(typeDefinition);
				if (result == null) result = caseLinkable(typeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.OPERATOR_DEFINITION: {
				OperatorDefinition operatorDefinition = (OperatorDefinition)theEObject;
				T result = caseOperatorDefinition(operatorDefinition);
				if (result == null) result = caseOperation(operatorDefinition);
				if (result == null) result = caseLinkable(operatorDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.ARGUMENTS_LIST: {
				ArgumentsList argumentsList = (ArgumentsList)theEObject;
				T result = caseArgumentsList(argumentsList);
				if (result == null) result = caseArguments(argumentsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.HOOK_DEFINITION: {
				HookDefinition hookDefinition = (HookDefinition)theEObject;
				T result = caseHookDefinition(hookDefinition);
				if (result == null) result = caseDefinition(hookDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.HOOK_MODULE_DEFINITION: {
				HookModuleDefinition hookModuleDefinition = (HookModuleDefinition)theEObject;
				T result = caseHookModuleDefinition(hookModuleDefinition);
				if (result == null) result = caseHookDefinition(hookModuleDefinition);
				if (result == null) result = caseDefinition(hookModuleDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.HOOK_TYPE_DEFINITION: {
				HookTypeDefinition hookTypeDefinition = (HookTypeDefinition)theEObject;
				T result = caseHookTypeDefinition(hookTypeDefinition);
				if (result == null) result = caseHookDefinition(hookTypeDefinition);
				if (result == null) result = caseDefinition(hookTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.HOOK_OPERATOR_DEFINITION: {
				HookOperatorDefinition hookOperatorDefinition = (HookOperatorDefinition)theEObject;
				T result = caseHookOperatorDefinition(hookOperatorDefinition);
				if (result == null) result = caseHookDefinition(hookOperatorDefinition);
				if (result == null) result = caseDefinition(hookOperatorDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.HOOK_OPERATION: {
				HookOperation hookOperation = (HookOperation)theEObject;
				T result = caseHookOperation(hookOperation);
				if (result == null) result = caseLinkable(hookOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.HOST_HOOK_OPERATION: {
				HostHookOperation hostHookOperation = (HostHookOperation)theEObject;
				T result = caseHostHookOperation(hostHookOperation);
				if (result == null) result = caseHookOperation(hostHookOperation);
				if (result == null) result = caseLinkable(hostHookOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.HOOK_RULES: {
				Hook_Rules hook_Rules = (Hook_Rules)theEObject;
				T result = caseHook_Rules(hook_Rules);
				if (result == null) result = caseHookOperation(hook_Rules);
				if (result == null) result = caseLinkable(hook_Rules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.HOOK_GRAPHRULES: {
				Hook_Graphrules hook_Graphrules = (Hook_Graphrules)theEObject;
				T result = caseHook_Graphrules(hook_Graphrules);
				if (result == null) result = caseHookOperation(hook_Graphrules);
				if (result == null) result = caseLinkable(hook_Graphrules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.HOOK_MAKE: {
				Hook_Make hook_Make = (Hook_Make)theEObject;
				T result = caseHook_Make(hook_Make);
				if (result == null) result = caseHostHookOperation(hook_Make);
				if (result == null) result = caseHookOperation(hook_Make);
				if (result == null) result = caseLinkable(hook_Make);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.HOOK_MAKE_INSERT: {
				Hook_Make_Insert hook_Make_Insert = (Hook_Make_Insert)theEObject;
				T result = caseHook_Make_Insert(hook_Make_Insert);
				if (result == null) result = caseHostHookOperation(hook_Make_Insert);
				if (result == null) result = caseHookOperation(hook_Make_Insert);
				if (result == null) result = caseLinkable(hook_Make_Insert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.HOOK_MAKE_EMPTY: {
				Hook_Make_Empty hook_Make_Empty = (Hook_Make_Empty)theEObject;
				T result = caseHook_Make_Empty(hook_Make_Empty);
				if (result == null) result = caseHostHookOperation(hook_Make_Empty);
				if (result == null) result = caseHookOperation(hook_Make_Empty);
				if (result == null) result = caseLinkable(hook_Make_Empty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.HOOK_FREE: {
				Hook_Free hook_Free = (Hook_Free)theEObject;
				T result = caseHook_Free(hook_Free);
				if (result == null) result = caseHostHookOperation(hook_Free);
				if (result == null) result = caseHookOperation(hook_Free);
				if (result == null) result = caseLinkable(hook_Free);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.HOOK_FL: {
				Hook_FL hook_FL = (Hook_FL)theEObject;
				T result = caseHook_FL(hook_FL);
				if (result == null) result = caseHostHookOperation(hook_FL);
				if (result == null) result = caseHookOperation(hook_FL);
				if (result == null) result = caseLinkable(hook_FL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.HOOK_AU: {
				Hook_AU hook_AU = (Hook_AU)theEObject;
				T result = caseHook_AU(hook_AU);
				if (result == null) result = caseHostHookOperation(hook_AU);
				if (result == null) result = caseHookOperation(hook_AU);
				if (result == null) result = caseLinkable(hook_AU);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.HOOK_INTERFACE: {
				Hook_Interface hook_Interface = (Hook_Interface)theEObject;
				T result = caseHook_Interface(hook_Interface);
				if (result == null) result = caseHostHookOperation(hook_Interface);
				if (result == null) result = caseHookOperation(hook_Interface);
				if (result == null) result = caseLinkable(hook_Interface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.HOOK_IMPORTS: {
				Hook_Imports hook_Imports = (Hook_Imports)theEObject;
				T result = caseHook_Imports(hook_Imports);
				if (result == null) result = caseHostHookOperation(hook_Imports);
				if (result == null) result = caseHookOperation(hook_Imports);
				if (result == null) result = caseLinkable(hook_Imports);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.HOOK_BLOCK: {
				Hook_Block hook_Block = (Hook_Block)theEObject;
				T result = caseHook_Block(hook_Block);
				if (result == null) result = caseHostHookOperation(hook_Block);
				if (result == null) result = caseHookOperation(hook_Block);
				if (result == null) result = caseLinkable(hook_Block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.RULE_PATTERN: {
				RulePattern rulePattern = (RulePattern)theEObject;
				T result = caseRulePattern(rulePattern);
				if (result == null) result = caseCondition(rulePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.NAMED_RULE_PATTERN: {
				NamedRulePattern namedRulePattern = (NamedRulePattern)theEObject;
				T result = caseNamedRulePattern(namedRulePattern);
				if (result == null) result = caseRulePattern(namedRulePattern);
				if (result == null) result = caseLocalVariable(namedRulePattern);
				if (result == null) result = caseCondition(namedRulePattern);
				if (result == null) result = caseVariable(namedRulePattern);
				if (result == null) result = caseLinkable(namedRulePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.ANTI_RULE_PATTERN: {
				AntiRulePattern antiRulePattern = (AntiRulePattern)theEObject;
				T result = caseAntiRulePattern(antiRulePattern);
				if (result == null) result = caseRulePattern(antiRulePattern);
				if (result == null) result = caseCondition(antiRulePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.PLAIN_RULE_PATTERN_OPERATION: {
				PlainRulePatternOperation plainRulePatternOperation = (PlainRulePatternOperation)theEObject;
				T result = casePlainRulePatternOperation(plainRulePatternOperation);
				if (result == null) result = caseRulePattern(plainRulePatternOperation);
				if (result == null) result = caseCondition(plainRulePatternOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.GRAPH_RULE: {
				GraphRule graphRule = (GraphRule)theEObject;
				T result = caseGraphRule(graphRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.TERM_GRAPH: {
				TermGraph termGraph = (TermGraph)theEObject;
				T result = caseTermGraph(termGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.PLAIN_TERM_GRAPH: {
				PlainTermGraph plainTermGraph = (PlainTermGraph)theEObject;
				T result = casePlainTermGraph(plainTermGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.TERM_GRAPH_VARIABLE: {
				TermGraphVariable termGraphVariable = (TermGraphVariable)theEObject;
				T result = caseTermGraphVariable(termGraphVariable);
				if (result == null) result = casePlainTermGraph(termGraphVariable);
				if (result == null) result = caseLinkable(termGraphVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.TERM_GRAPH_FUNC: {
				TermGraphFunc termGraphFunc = (TermGraphFunc)theEObject;
				T result = caseTermGraphFunc(termGraphFunc);
				if (result == null) result = casePlainTermGraph(termGraphFunc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CONDITION_OR: {
				ConditionOr conditionOr = (ConditionOr)theEObject;
				T result = caseConditionOr(conditionOr);
				if (result == null) result = caseCondition(conditionOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CONDITION_AND: {
				ConditionAnd conditionAnd = (ConditionAnd)theEObject;
				T result = caseConditionAnd(conditionAnd);
				if (result == null) result = caseCondition(conditionAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CONDITION_P: {
				ConditionP conditionP = (ConditionP)theEObject;
				T result = caseConditionP(conditionP);
				if (result == null) result = caseCondition(conditionP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CONDITION_RULE: {
				ConditionRule conditionRule = (ConditionRule)theEObject;
				T result = caseConditionRule(conditionRule);
				if (result == null) result = caseCondition(conditionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.CONDITION_OP: {
				ConditionOp conditionOp = (ConditionOp)theEObject;
				T result = caseConditionOp(conditionOp);
				if (result == null) result = caseCondition(conditionOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.XML_TERM: {
				XMLTerm xmlTerm = (XMLTerm)theEObject;
				T result = caseXMLTerm(xmlTerm);
				if (result == null) result = casePattern(xmlTerm);
				if (result == null) result = caseConstraint(xmlTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.XML_TERM_SIMPLE: {
				XMLTermSimple xmlTermSimple = (XMLTermSimple)theEObject;
				T result = caseXMLTermSimple(xmlTermSimple);
				if (result == null) result = caseXMLTerm(xmlTermSimple);
				if (result == null) result = casePattern(xmlTermSimple);
				if (result == null) result = caseConstraint(xmlTermSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.XML_TERM_DOUBLE: {
				XMLTermDouble xmlTermDouble = (XMLTermDouble)theEObject;
				T result = caseXMLTermDouble(xmlTermDouble);
				if (result == null) result = caseXMLTerm(xmlTermDouble);
				if (result == null) result = casePattern(xmlTermDouble);
				if (result == null) result = caseConstraint(xmlTermDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.XML_TERM_TEXT: {
				XMLTermText xmlTermText = (XMLTermText)theEObject;
				T result = caseXMLTermText(xmlTermText);
				if (result == null) result = caseXMLTerm(xmlTermText);
				if (result == null) result = casePattern(xmlTermText);
				if (result == null) result = caseConstraint(xmlTermText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.XML_TERM_COMMENT: {
				XMLTermComment xmlTermComment = (XMLTermComment)theEObject;
				T result = caseXMLTermComment(xmlTermComment);
				if (result == null) result = caseXMLTerm(xmlTermComment);
				if (result == null) result = casePattern(xmlTermComment);
				if (result == null) result = caseConstraint(xmlTermComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.XML_TERM_PROCESS: {
				XMLTermProcess xmlTermProcess = (XMLTermProcess)theEObject;
				T result = caseXMLTermProcess(xmlTermProcess);
				if (result == null) result = caseXMLTerm(xmlTermProcess);
				if (result == null) result = casePattern(xmlTermProcess);
				if (result == null) result = caseConstraint(xmlTermProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.XML_NAME_LIST: {
				XMLNameList xmlNameList = (XMLNameList)theEObject;
				T result = caseXMLNameList(xmlNameList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.XML_ATTR_LIST: {
				XMLAttrList xmlAttrList = (XMLAttrList)theEObject;
				T result = caseXMLAttrList(xmlAttrList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.XML_ATTRIBUTE: {
				XMLAttribute xmlAttribute = (XMLAttribute)theEObject;
				T result = caseXMLAttribute(xmlAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.XML_ATTRIBUTE1: {
				XMLAttribute1 xmlAttribute1 = (XMLAttribute1)theEObject;
				T result = caseXMLAttribute1(xmlAttribute1);
				if (result == null) result = caseXMLAttribute(xmlAttribute1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.XML_ATTRIBUTE2: {
				XMLAttribute2 xmlAttribute2 = (XMLAttribute2)theEObject;
				T result = caseXMLAttribute2(xmlAttribute2);
				if (result == null) result = caseXMLAttribute(xmlAttribute2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.XML_ATTRIBUTE3: {
				XMLAttribute3 xmlAttribute3 = (XMLAttribute3)theEObject;
				T result = caseXMLAttribute3(xmlAttribute3);
				if (result == null) result = caseXMLAttribute(xmlAttribute3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.XML_CHILDS: {
				XMLChilds xmlChilds = (XMLChilds)theEObject;
				T result = caseXMLChilds(xmlChilds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.TYPE_TERM: {
				TypeTerm typeTerm = (TypeTerm)theEObject;
				T result = caseTypeTerm(typeTerm);
				if (result == null) result = caseBlock(typeTerm);
				if (result == null) result = caseType(typeTerm);
				if (result == null) result = caseContext(typeTerm);
				if (result == null) result = caseLinkable(typeTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.KEY_WORD: {
				KeyWord keyWord = (KeyWord)theEObject;
				T result = caseKeyWord(keyWord);
				if (result == null) result = caseLinkable(keyWord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = caseBlock(operator);
				if (result == null) result = caseOperation(operator);
				if (result == null) result = caseContext(operator);
				if (result == null) result = caseLinkable(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.OPERATOR_LIST: {
				OperatorList operatorList = (OperatorList)theEObject;
				T result = caseOperatorList(operatorList);
				if (result == null) result = caseBlock(operatorList);
				if (result == null) result = caseOperation(operatorList);
				if (result == null) result = caseContext(operatorList);
				if (result == null) result = caseLinkable(operatorList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.OPERATOR_ARRAY: {
				OperatorArray operatorArray = (OperatorArray)theEObject;
				T result = caseOperatorArray(operatorArray);
				if (result == null) result = caseBlock(operatorArray);
				if (result == null) result = caseOperation(operatorArray);
				if (result == null) result = caseContext(operatorArray);
				if (result == null) result = caseLinkable(operatorArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.TRANSFORMATION: {
				Transformation transformation = (Transformation)theEObject;
				T result = caseTransformation(transformation);
				if (result == null) result = caseBlock(transformation);
				if (result == null) result = caseOperation(transformation);
				if (result == null) result = caseContext(transformation);
				if (result == null) result = caseLinkable(transformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.ELEMENTARY_TRANSFORMATION: {
				ElementaryTransformation elementaryTransformation = (ElementaryTransformation)theEObject;
				T result = caseElementaryTransformation(elementaryTransformation);
				if (result == null) result = caseOperation(elementaryTransformation);
				if (result == null) result = caseContext(elementaryTransformation);
				if (result == null) result = caseLinkable(elementaryTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.ELEMENTARY_TRANSFORMATION_RULE: {
				ElementaryTransformationRule elementaryTransformationRule = (ElementaryTransformationRule)theEObject;
				T result = caseElementaryTransformationRule(elementaryTransformationRule);
				if (result == null) result = caseContext(elementaryTransformationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.TRACELINK: {
				Tracelink tracelink = (Tracelink)theEObject;
				T result = caseTracelink(tracelink);
				if (result == null) result = caseGlobalVariable(tracelink);
				if (result == null) result = caseStatement(tracelink);
				if (result == null) result = caseVariable(tracelink);
				if (result == null) result = caseContext(tracelink);
				if (result == null) result = caseLinkable(tracelink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TomPackage.RESOLVE: {
				Resolve resolve = (Resolve)theEObject;
				T result = caseResolve(resolve);
				if (result == null) result = caseTerm(resolve);
				if (result == null) result = caseConstraint(resolve);
				if (result == null) result = caseCondition(resolve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostCode(HostCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCall(Call object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affectation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affectation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffectation(Affectation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTom(Tom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linkable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linkable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkable(Linkable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVariable(GlobalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalVariable(LocalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableSimple(VariableSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableList(VariableList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallback(Callback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callback Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callback Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallbackDefinition(CallbackDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arguments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arguments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArguments(Arguments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgument(Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Type Suffix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Type Suffix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentTypeSuffix(ArgumentTypeSuffix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Type Prefix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Type Prefix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentTypePrefix(ArgumentTypePrefix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportConstruct(ImportConstruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludeConstruct(IncludeConstruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Sum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Sum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermSum(TermSum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermConst(TermConst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermNull(TermNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermVariable(TermVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermOperation(TermOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturn(Return object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Consctruct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Consctruct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchConsctruct(MatchConsctruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchPattern(MatchPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentMatch(ArgumentMatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternAction(PatternAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintPattern(ConstraintPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintAction(ConstraintAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern(Pattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedPattern(NamedPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anti Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anti Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntiPattern(AntiPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Pattern Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Pattern Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainPatternConst(PlainPatternConst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Pattern Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Pattern Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainPatternVariable(PlainPatternVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Joker Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joker Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJokerPattern(JokerPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Pattern Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Pattern Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainPatternOperation(PlainPatternOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationList(OperationList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explicit Term List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explicit Term List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplicitTermList(ExplicitTermList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Pattern Variable List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Pattern Variable List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainPatternVariableList(PlainPatternVariableList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyPattern(AnyPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implicit Pair List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implicit Pair List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicitPairList(ImplicitPairList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pair Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pair Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePairPattern(PairPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategyConstruct(StrategyConstruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy Visit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy Visit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategyVisit(StrategyVisit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visit Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visit Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisitAction(VisitAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternList(PatternList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintOr(ConstraintOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintAnd(ConstraintAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint P</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint P</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintP(ConstraintP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintMatch(ConstraintMatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintOp(ConstraintOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gom Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gom Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGomConstruct(GomConstruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefinition(TypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatorDefinition(OperatorDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arguments List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arguments List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentsList(ArgumentsList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHookDefinition(HookDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook Module Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook Module Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHookModuleDefinition(HookModuleDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHookTypeDefinition(HookTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook Operator Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook Operator Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHookOperatorDefinition(HookOperatorDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHookOperation(HookOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Hook Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Hook Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostHookOperation(HostHookOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHook_Rules(Hook_Rules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook Graphrules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook Graphrules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHook_Graphrules(Hook_Graphrules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook Make</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook Make</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHook_Make(Hook_Make object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook Make Insert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook Make Insert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHook_Make_Insert(Hook_Make_Insert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook Make Empty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook Make Empty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHook_Make_Empty(Hook_Make_Empty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook Free</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook Free</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHook_Free(Hook_Free object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook FL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook FL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHook_FL(Hook_FL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook AU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook AU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHook_AU(Hook_AU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHook_Interface(Hook_Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook Imports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook Imports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHook_Imports(Hook_Imports object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHook_Block(Hook_Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRulePattern(RulePattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Rule Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Rule Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedRulePattern(NamedRulePattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anti Rule Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anti Rule Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntiRulePattern(AntiRulePattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Rule Pattern Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Rule Pattern Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainRulePatternOperation(PlainRulePatternOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphRule(GraphRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermGraph(TermGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Term Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Term Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainTermGraph(PlainTermGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Graph Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Graph Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermGraphVariable(TermGraphVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Graph Func</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Graph Func</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermGraphFunc(TermGraphFunc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionOr(ConditionOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionAnd(ConditionAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition P</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition P</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionP(ConditionP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionRule(ConditionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionOp(ConditionOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLTerm(XMLTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Term Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Term Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLTermSimple(XMLTermSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Term Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Term Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLTermDouble(XMLTermDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Term Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Term Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLTermText(XMLTermText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Term Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Term Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLTermComment(XMLTermComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Term Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Term Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLTermProcess(XMLTermProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Name List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Name List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLNameList(XMLNameList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Attr List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Attr List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLAttrList(XMLAttrList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLAttribute(XMLAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Attribute1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Attribute1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLAttribute1(XMLAttribute1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Attribute2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Attribute2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLAttribute2(XMLAttribute2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Attribute3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Attribute3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLAttribute3(XMLAttribute3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Childs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Childs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLChilds(XMLChilds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeTerm(TypeTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Word</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Word</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyWord(KeyWord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatorList(OperatorList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatorArray(OperatorArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elementary Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elementary Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementaryTransformation(ElementaryTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elementary Transformation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elementary Transformation Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementaryTransformationRule(ElementaryTransformationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tracelink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tracelink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracelink(Tracelink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolve(Resolve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TomSwitch
