/**
 */
package miniMechaCode.util;

import miniMechaCode.Action;
import miniMechaCode.And;
import miniMechaCode.BinaryOperator;
import miniMechaCode.BooleanLitteral;
import miniMechaCode.BooleanOperation;
import miniMechaCode.Cm;
import miniMechaCode.Convertion;
import miniMechaCode.DefFunction;
import miniMechaCode.DefVariable;
import miniMechaCode.Div;
import miniMechaCode.Equal;
import miniMechaCode.Expression;
import miniMechaCode.Forward;
import miniMechaCode.FunctionCall;
import miniMechaCode.FunctionParameter;
import miniMechaCode.Greater;
import miniMechaCode.GreaterOrEqual;
import miniMechaCode.Less;
import miniMechaCode.Loop;
import miniMechaCode.MiniMechaCode;
import miniMechaCode.MiniMechaCodePackage;
import miniMechaCode.Minus;
import miniMechaCode.Mm;
import miniMechaCode.Multi;
import miniMechaCode.Not;
import miniMechaCode.NumberLitteral;
import miniMechaCode.Or;
import miniMechaCode.Plus;
import miniMechaCode.RefVariable;
import miniMechaCode.Rotate;
import miniMechaCode.Statement;
import miniMechaCode.Type;
import miniMechaCode.UnaryOperator;
import miniMechaCode.UnitOperator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see miniMechaCode.MiniMechaCodePackage
 * @generated
 */
public class MiniMechaCodeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MiniMechaCodePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniMechaCodeSwitch() {
		if (modelPackage == null) {
			modelPackage = MiniMechaCodePackage.eINSTANCE;
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
		case MiniMechaCodePackage.MINI_MECHA_CODE: {
			MiniMechaCode miniMechaCode = (MiniMechaCode) theEObject;
			T result = caseMiniMechaCode(miniMechaCode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.NUMBER: {
			miniMechaCode.Number number = (miniMechaCode.Number) theEObject;
			T result = caseNumber(number);
			if (result == null)
				result = caseType(number);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.TYPE: {
			Type type = (Type) theEObject;
			T result = caseType(type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.BOOLEAN: {
			miniMechaCode.Boolean boolean_ = (miniMechaCode.Boolean) theEObject;
			T result = caseBoolean(boolean_);
			if (result == null)
				result = caseType(boolean_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.DEF_VARIABLE: {
			DefVariable defVariable = (DefVariable) theEObject;
			T result = caseDefVariable(defVariable);
			if (result == null)
				result = caseStatement(defVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.STATEMENT: {
			Statement statement = (Statement) theEObject;
			T result = caseStatement(statement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = caseStatement(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.MINUS: {
			Minus minus = (Minus) theEObject;
			T result = caseMinus(minus);
			if (result == null)
				result = caseMath(minus);
			if (result == null)
				result = caseBinaryOperator(minus);
			if (result == null)
				result = caseExpression(minus);
			if (result == null)
				result = caseStatement(minus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.MULTI: {
			Multi multi = (Multi) theEObject;
			T result = caseMulti(multi);
			if (result == null)
				result = caseMath(multi);
			if (result == null)
				result = caseBinaryOperator(multi);
			if (result == null)
				result = caseExpression(multi);
			if (result == null)
				result = caseStatement(multi);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.DIV: {
			Div div = (Div) theEObject;
			T result = caseDiv(div);
			if (result == null)
				result = caseMath(div);
			if (result == null)
				result = caseBinaryOperator(div);
			if (result == null)
				result = caseExpression(div);
			if (result == null)
				result = caseStatement(div);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.NUMBER_LITTERAL: {
			NumberLitteral numberLitteral = (NumberLitteral) theEObject;
			T result = caseNumberLitteral(numberLitteral);
			if (result == null)
				result = caseExpression(numberLitteral);
			if (result == null)
				result = caseStatement(numberLitteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.PLUS: {
			Plus plus = (Plus) theEObject;
			T result = casePlus(plus);
			if (result == null)
				result = caseMath(plus);
			if (result == null)
				result = caseBinaryOperator(plus);
			if (result == null)
				result = caseExpression(plus);
			if (result == null)
				result = caseStatement(plus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.REF_VARIABLE: {
			RefVariable refVariable = (RefVariable) theEObject;
			T result = caseRefVariable(refVariable);
			if (result == null)
				result = caseExpression(refVariable);
			if (result == null)
				result = caseStatement(refVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.BOOLEAN_LITTERAL: {
			BooleanLitteral booleanLitteral = (BooleanLitteral) theEObject;
			T result = caseBooleanLitteral(booleanLitteral);
			if (result == null)
				result = caseExpression(booleanLitteral);
			if (result == null)
				result = caseStatement(booleanLitteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.DEF_FUNCTION: {
			DefFunction defFunction = (DefFunction) theEObject;
			T result = caseDefFunction(defFunction);
			if (result == null)
				result = caseStatement(defFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.LOOP: {
			Loop loop = (Loop) theEObject;
			T result = caseLoop(loop);
			if (result == null)
				result = caseStatement(loop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.GREATER_OR_EQUAL: {
			GreaterOrEqual greaterOrEqual = (GreaterOrEqual) theEObject;
			T result = caseGreaterOrEqual(greaterOrEqual);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.GREATER: {
			Greater greater = (Greater) theEObject;
			T result = caseGreater(greater);
			if (result == null)
				result = caseBooleanOperation(greater);
			if (result == null)
				result = caseBinaryOperator(greater);
			if (result == null)
				result = caseExpression(greater);
			if (result == null)
				result = caseStatement(greater);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.LESS: {
			Less less = (Less) theEObject;
			T result = caseLess(less);
			if (result == null)
				result = caseBooleanOperation(less);
			if (result == null)
				result = caseBinaryOperator(less);
			if (result == null)
				result = caseExpression(less);
			if (result == null)
				result = caseStatement(less);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.EQUAL: {
			Equal equal = (Equal) theEObject;
			T result = caseEqual(equal);
			if (result == null)
				result = caseBooleanOperation(equal);
			if (result == null)
				result = caseBinaryOperator(equal);
			if (result == null)
				result = caseExpression(equal);
			if (result == null)
				result = caseStatement(equal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.OR: {
			Or or = (Or) theEObject;
			T result = caseOr(or);
			if (result == null)
				result = caseBooleanOperation(or);
			if (result == null)
				result = caseBinaryOperator(or);
			if (result == null)
				result = caseExpression(or);
			if (result == null)
				result = caseStatement(or);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.AND: {
			And and = (And) theEObject;
			T result = caseAnd(and);
			if (result == null)
				result = caseBooleanOperation(and);
			if (result == null)
				result = caseBinaryOperator(and);
			if (result == null)
				result = caseExpression(and);
			if (result == null)
				result = caseStatement(and);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.NOT: {
			Not not = (Not) theEObject;
			T result = caseNot(not);
			if (result == null)
				result = caseUnaryOperator(not);
			if (result == null)
				result = caseExpression(not);
			if (result == null)
				result = caseStatement(not);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.BINARY_OPERATOR: {
			BinaryOperator binaryOperator = (BinaryOperator) theEObject;
			T result = caseBinaryOperator(binaryOperator);
			if (result == null)
				result = caseExpression(binaryOperator);
			if (result == null)
				result = caseStatement(binaryOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.MATH: {
			miniMechaCode.Math math = (miniMechaCode.Math) theEObject;
			T result = caseMath(math);
			if (result == null)
				result = caseBinaryOperator(math);
			if (result == null)
				result = caseExpression(math);
			if (result == null)
				result = caseStatement(math);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.BOOLEAN_OPERATION: {
			BooleanOperation booleanOperation = (BooleanOperation) theEObject;
			T result = caseBooleanOperation(booleanOperation);
			if (result == null)
				result = caseBinaryOperator(booleanOperation);
			if (result == null)
				result = caseExpression(booleanOperation);
			if (result == null)
				result = caseStatement(booleanOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.FUNCTION_CALL: {
			FunctionCall functionCall = (FunctionCall) theEObject;
			T result = caseFunctionCall(functionCall);
			if (result == null)
				result = caseExpression(functionCall);
			if (result == null)
				result = caseStatement(functionCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.UNARY_OPERATOR: {
			UnaryOperator unaryOperator = (UnaryOperator) theEObject;
			T result = caseUnaryOperator(unaryOperator);
			if (result == null)
				result = caseExpression(unaryOperator);
			if (result == null)
				result = caseStatement(unaryOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.UNIT_OPERATOR: {
			UnitOperator unitOperator = (UnitOperator) theEObject;
			T result = caseUnitOperator(unitOperator);
			if (result == null)
				result = caseExpression(unitOperator);
			if (result == null)
				result = caseStatement(unitOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.MM: {
			Mm mm = (Mm) theEObject;
			T result = caseMm(mm);
			if (result == null)
				result = caseUnitOperator(mm);
			if (result == null)
				result = caseExpression(mm);
			if (result == null)
				result = caseStatement(mm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.CM: {
			Cm cm = (Cm) theEObject;
			T result = caseCm(cm);
			if (result == null)
				result = caseUnitOperator(cm);
			if (result == null)
				result = caseExpression(cm);
			if (result == null)
				result = caseStatement(cm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.ACTION: {
			Action action = (Action) theEObject;
			T result = caseAction(action);
			if (result == null)
				result = caseStatement(action);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.ROTATE: {
			Rotate rotate = (Rotate) theEObject;
			T result = caseRotate(rotate);
			if (result == null)
				result = caseAction(rotate);
			if (result == null)
				result = caseStatement(rotate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.FORWARD: {
			Forward forward = (Forward) theEObject;
			T result = caseForward(forward);
			if (result == null)
				result = caseAction(forward);
			if (result == null)
				result = caseStatement(forward);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.VOID: {
			miniMechaCode.Void void_ = (miniMechaCode.Void) theEObject;
			T result = caseVoid(void_);
			if (result == null)
				result = caseType(void_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.FUNCTION_PARAMETER: {
			FunctionParameter functionParameter = (FunctionParameter) theEObject;
			T result = caseFunctionParameter(functionParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MiniMechaCodePackage.CONVERTION: {
			Convertion convertion = (Convertion) theEObject;
			T result = caseConvertion(convertion);
			if (result == null)
				result = caseExpression(convertion);
			if (result == null)
				result = caseStatement(convertion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mini Mecha Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mini Mecha Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiniMechaCode(MiniMechaCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber(miniMechaCode.Number object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(miniMechaCode.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Def Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Def Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefVariable(DefVariable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinus(Minus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMulti(Multi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiv(Div object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Litteral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Litteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberLitteral(NumberLitteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlus(Plus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefVariable(RefVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Litteral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Litteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLitteral(BooleanLitteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Def Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Def Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefFunction(DefFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterOrEqual(GreaterOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreater(Greater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLess(Less object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqual(Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOperator(BinaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMath(miniMechaCode.Math object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOperation(BooleanOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionCall(FunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryOperator(UnaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitOperator(UnitOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMm(Mm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCm(Cm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotate(Rotate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForward(Forward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoid(miniMechaCode.Void object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionParameter(FunctionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvertion(Convertion object) {
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

} //MiniMechaCodeSwitch
