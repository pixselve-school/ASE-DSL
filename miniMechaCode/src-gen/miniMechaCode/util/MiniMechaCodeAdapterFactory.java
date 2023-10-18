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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see miniMechaCode.MiniMechaCodePackage
 * @generated
 */
public class MiniMechaCodeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MiniMechaCodePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniMechaCodeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MiniMechaCodePackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiniMechaCodeSwitch<Adapter> modelSwitch = new MiniMechaCodeSwitch<Adapter>() {
		@Override
		public Adapter caseMiniMechaCode(MiniMechaCode object) {
			return createMiniMechaCodeAdapter();
		}

		@Override
		public Adapter caseNumber(miniMechaCode.Number object) {
			return createNumberAdapter();
		}

		@Override
		public Adapter caseType(Type object) {
			return createTypeAdapter();
		}

		@Override
		public Adapter caseBoolean(miniMechaCode.Boolean object) {
			return createBooleanAdapter();
		}

		@Override
		public Adapter caseDefVariable(DefVariable object) {
			return createDefVariableAdapter();
		}

		@Override
		public Adapter caseStatement(Statement object) {
			return createStatementAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseMinus(Minus object) {
			return createMinusAdapter();
		}

		@Override
		public Adapter caseMulti(Multi object) {
			return createMultiAdapter();
		}

		@Override
		public Adapter caseDiv(Div object) {
			return createDivAdapter();
		}

		@Override
		public Adapter caseNumberLitteral(NumberLitteral object) {
			return createNumberLitteralAdapter();
		}

		@Override
		public Adapter casePlus(Plus object) {
			return createPlusAdapter();
		}

		@Override
		public Adapter caseRefVariable(RefVariable object) {
			return createRefVariableAdapter();
		}

		@Override
		public Adapter caseBooleanLitteral(BooleanLitteral object) {
			return createBooleanLitteralAdapter();
		}

		@Override
		public Adapter caseDefFunction(DefFunction object) {
			return createDefFunctionAdapter();
		}

		@Override
		public Adapter caseLoop(Loop object) {
			return createLoopAdapter();
		}

		@Override
		public Adapter caseGreaterOrEqual(GreaterOrEqual object) {
			return createGreaterOrEqualAdapter();
		}

		@Override
		public Adapter caseGreater(Greater object) {
			return createGreaterAdapter();
		}

		@Override
		public Adapter caseLess(Less object) {
			return createLessAdapter();
		}

		@Override
		public Adapter caseEqual(Equal object) {
			return createEqualAdapter();
		}

		@Override
		public Adapter caseOr(Or object) {
			return createOrAdapter();
		}

		@Override
		public Adapter caseAnd(And object) {
			return createAndAdapter();
		}

		@Override
		public Adapter caseNot(Not object) {
			return createNotAdapter();
		}

		@Override
		public Adapter caseBinaryOperator(BinaryOperator object) {
			return createBinaryOperatorAdapter();
		}

		@Override
		public Adapter caseMath(miniMechaCode.Math object) {
			return createMathAdapter();
		}

		@Override
		public Adapter caseBooleanOperation(BooleanOperation object) {
			return createBooleanOperationAdapter();
		}

		@Override
		public Adapter caseFunctionCall(FunctionCall object) {
			return createFunctionCallAdapter();
		}

		@Override
		public Adapter caseUnaryOperator(UnaryOperator object) {
			return createUnaryOperatorAdapter();
		}

		@Override
		public Adapter caseUnitOperator(UnitOperator object) {
			return createUnitOperatorAdapter();
		}

		@Override
		public Adapter caseMm(Mm object) {
			return createMmAdapter();
		}

		@Override
		public Adapter caseCm(Cm object) {
			return createCmAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseRotate(Rotate object) {
			return createRotateAdapter();
		}

		@Override
		public Adapter caseForward(Forward object) {
			return createForwardAdapter();
		}

		@Override
		public Adapter caseVoid(miniMechaCode.Void object) {
			return createVoidAdapter();
		}

		@Override
		public Adapter caseFunctionParameter(FunctionParameter object) {
			return createFunctionParameterAdapter();
		}

		@Override
		public Adapter caseConvertion(Convertion object) {
			return createConvertionAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.MiniMechaCode <em>Mini Mecha Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.MiniMechaCode
	 * @generated
	 */
	public Adapter createMiniMechaCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.DefVariable <em>Def Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.DefVariable
	 * @generated
	 */
	public Adapter createDefVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Minus
	 * @generated
	 */
	public Adapter createMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Multi <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Multi
	 * @generated
	 */
	public Adapter createMultiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Div
	 * @generated
	 */
	public Adapter createDivAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.NumberLitteral <em>Number Litteral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.NumberLitteral
	 * @generated
	 */
	public Adapter createNumberLitteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Plus
	 * @generated
	 */
	public Adapter createPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.RefVariable <em>Ref Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.RefVariable
	 * @generated
	 */
	public Adapter createRefVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.BooleanLitteral <em>Boolean Litteral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.BooleanLitteral
	 * @generated
	 */
	public Adapter createBooleanLitteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.DefFunction <em>Def Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.DefFunction
	 * @generated
	 */
	public Adapter createDefFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.GreaterOrEqual <em>Greater Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.GreaterOrEqual
	 * @generated
	 */
	public Adapter createGreaterOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Greater
	 * @generated
	 */
	public Adapter createGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Less
	 * @generated
	 */
	public Adapter createLessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Equal
	 * @generated
	 */
	public Adapter createEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.BinaryOperator
	 * @generated
	 */
	public Adapter createBinaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Math <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Math
	 * @generated
	 */
	public Adapter createMathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.BooleanOperation <em>Boolean Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.BooleanOperation
	 * @generated
	 */
	public Adapter createBooleanOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.FunctionCall
	 * @generated
	 */
	public Adapter createFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.UnaryOperator
	 * @generated
	 */
	public Adapter createUnaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.UnitOperator <em>Unit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.UnitOperator
	 * @generated
	 */
	public Adapter createUnitOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Mm <em>Mm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Mm
	 * @generated
	 */
	public Adapter createMmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Cm <em>Cm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Cm
	 * @generated
	 */
	public Adapter createCmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Rotate
	 * @generated
	 */
	public Adapter createRotateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Forward
	 * @generated
	 */
	public Adapter createForwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Void <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Void
	 * @generated
	 */
	public Adapter createVoidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.FunctionParameter <em>Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.FunctionParameter
	 * @generated
	 */
	public Adapter createFunctionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link miniMechaCode.Convertion <em>Convertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see miniMechaCode.Convertion
	 * @generated
	 */
	public Adapter createConvertionAdapter() {
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

} //MiniMechaCodeAdapterFactory
