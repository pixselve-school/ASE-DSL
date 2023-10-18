/**
 */
package miniMechaCode.impl;

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
import miniMechaCode.MiniMechaCodeFactory;
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
import miniMechaCode.Type;
import miniMechaCode.UnaryOperator;
import miniMechaCode.UnitOperator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniMechaCodeFactoryImpl extends EFactoryImpl implements MiniMechaCodeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MiniMechaCodeFactory init() {
		try {
			MiniMechaCodeFactory theMiniMechaCodeFactory = (MiniMechaCodeFactory) EPackage.Registry.INSTANCE
					.getEFactory(MiniMechaCodePackage.eNS_URI);
			if (theMiniMechaCodeFactory != null) {
				return theMiniMechaCodeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MiniMechaCodeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniMechaCodeFactoryImpl() {
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
		case MiniMechaCodePackage.MINI_MECHA_CODE:
			return createMiniMechaCode();
		case MiniMechaCodePackage.NUMBER:
			return createNumber();
		case MiniMechaCodePackage.TYPE:
			return createType();
		case MiniMechaCodePackage.BOOLEAN:
			return createBoolean();
		case MiniMechaCodePackage.DEF_VARIABLE:
			return createDefVariable();
		case MiniMechaCodePackage.EXPRESSION:
			return createExpression();
		case MiniMechaCodePackage.MINUS:
			return createMinus();
		case MiniMechaCodePackage.MULTI:
			return createMulti();
		case MiniMechaCodePackage.DIV:
			return createDiv();
		case MiniMechaCodePackage.NUMBER_LITTERAL:
			return createNumberLitteral();
		case MiniMechaCodePackage.PLUS:
			return createPlus();
		case MiniMechaCodePackage.REF_VARIABLE:
			return createRefVariable();
		case MiniMechaCodePackage.BOOLEAN_LITTERAL:
			return createBooleanLitteral();
		case MiniMechaCodePackage.DEF_FUNCTION:
			return createDefFunction();
		case MiniMechaCodePackage.LOOP:
			return createLoop();
		case MiniMechaCodePackage.GREATER_OR_EQUAL:
			return createGreaterOrEqual();
		case MiniMechaCodePackage.GREATER:
			return createGreater();
		case MiniMechaCodePackage.LESS:
			return createLess();
		case MiniMechaCodePackage.EQUAL:
			return createEqual();
		case MiniMechaCodePackage.OR:
			return createOr();
		case MiniMechaCodePackage.AND:
			return createAnd();
		case MiniMechaCodePackage.NOT:
			return createNot();
		case MiniMechaCodePackage.BINARY_OPERATOR:
			return createBinaryOperator();
		case MiniMechaCodePackage.MATH:
			return createMath();
		case MiniMechaCodePackage.BOOLEAN_OPERATION:
			return createBooleanOperation();
		case MiniMechaCodePackage.FUNCTION_CALL:
			return createFunctionCall();
		case MiniMechaCodePackage.UNARY_OPERATOR:
			return createUnaryOperator();
		case MiniMechaCodePackage.UNIT_OPERATOR:
			return createUnitOperator();
		case MiniMechaCodePackage.MM:
			return createMm();
		case MiniMechaCodePackage.CM:
			return createCm();
		case MiniMechaCodePackage.ROTATE:
			return createRotate();
		case MiniMechaCodePackage.FORWARD:
			return createForward();
		case MiniMechaCodePackage.VOID:
			return createVoid();
		case MiniMechaCodePackage.FUNCTION_PARAMETER:
			return createFunctionParameter();
		case MiniMechaCodePackage.CONVERTION:
			return createConvertion();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniMechaCode createMiniMechaCode() {
		MiniMechaCodeImpl miniMechaCode = new MiniMechaCodeImpl();
		return miniMechaCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public miniMechaCode.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
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
	public miniMechaCode.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefVariable createDefVariable() {
		DefVariableImpl defVariable = new DefVariableImpl();
		return defVariable;
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
	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multi createMulti() {
		MultiImpl multi = new MultiImpl();
		return multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberLitteral createNumberLitteral() {
		NumberLitteralImpl numberLitteral = new NumberLitteralImpl();
		return numberLitteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefVariable createRefVariable() {
		RefVariableImpl refVariable = new RefVariableImpl();
		return refVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLitteral createBooleanLitteral() {
		BooleanLitteralImpl booleanLitteral = new BooleanLitteralImpl();
		return booleanLitteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefFunction createDefFunction() {
		DefFunctionImpl defFunction = new DefFunctionImpl();
		return defFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterOrEqual createGreaterOrEqual() {
		GreaterOrEqualImpl greaterOrEqual = new GreaterOrEqualImpl();
		return greaterOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Greater createGreater() {
		GreaterImpl greater = new GreaterImpl();
		return greater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Less createLess() {
		LessImpl less = new LessImpl();
		return less;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equal createEqual() {
		EqualImpl equal = new EqualImpl();
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator createBinaryOperator() {
		BinaryOperatorImpl binaryOperator = new BinaryOperatorImpl();
		return binaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public miniMechaCode.Math createMath() {
		MathImpl math = new MathImpl();
		return math;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperation createBooleanOperation() {
		BooleanOperationImpl booleanOperation = new BooleanOperationImpl();
		return booleanOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator createUnaryOperator() {
		UnaryOperatorImpl unaryOperator = new UnaryOperatorImpl();
		return unaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOperator createUnitOperator() {
		UnitOperatorImpl unitOperator = new UnitOperatorImpl();
		return unitOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mm createMm() {
		MmImpl mm = new MmImpl();
		return mm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cm createCm() {
		CmImpl cm = new CmImpl();
		return cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotate createRotate() {
		RotateImpl rotate = new RotateImpl();
		return rotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Forward createForward() {
		ForwardImpl forward = new ForwardImpl();
		return forward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public miniMechaCode.Void createVoid() {
		VoidImpl void_ = new VoidImpl();
		return void_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionParameter createFunctionParameter() {
		FunctionParameterImpl functionParameter = new FunctionParameterImpl();
		return functionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convertion createConvertion() {
		ConvertionImpl convertion = new ConvertionImpl();
		return convertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniMechaCodePackage getMiniMechaCodePackage() {
		return (MiniMechaCodePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MiniMechaCodePackage getPackage() {
		return MiniMechaCodePackage.eINSTANCE;
	}

} //MiniMechaCodeFactoryImpl
