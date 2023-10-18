/**
 */
package miniMechaCode;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see miniMechaCode.MiniMechaCodeFactory
 * @model kind="package"
 * @generated
 */
public interface MiniMechaCodePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "miniMechaCode";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/miniMechaCode";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "miniMechaCode";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiniMechaCodePackage eINSTANCE = miniMechaCode.impl.MiniMechaCodePackageImpl.init();

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.MiniMechaCodeImpl <em>Mini Mecha Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.MiniMechaCodeImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getMiniMechaCode()
	 * @generated
	 */
	int MINI_MECHA_CODE = 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MECHA_CODE__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Mini Mecha Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MECHA_CODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mini Mecha Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_MECHA_CODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.TypeImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.NumberImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.BooleanImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 3;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.StatementImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 5;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.DefVariableImpl <em>Def Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.DefVariableImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getDefVariable()
	 * @generated
	 */
	int DEF_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_VARIABLE__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_VARIABLE__VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_VARIABLE__TYPE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Def Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_VARIABLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Def Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_VARIABLE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.ExpressionImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 6;

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
	 * The meta object id for the '{@link miniMechaCode.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.BinaryOperatorImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 23;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR__RIGHT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.MathImpl <em>Math</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.MathImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getMath()
	 * @generated
	 */
	int MATH = 24;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH__RIGHT = BINARY_OPERATOR__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH__LEFT = BINARY_OPERATOR__LEFT;

	/**
	 * The number of structural features of the '<em>Math</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Math</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.MinusImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 7;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__RIGHT = MATH__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__LEFT = MATH__LEFT;

	/**
	 * The number of structural features of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FEATURE_COUNT = MATH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATION_COUNT = MATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.MultiImpl <em>Multi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.MultiImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getMulti()
	 * @generated
	 */
	int MULTI = 8;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI__RIGHT = MATH__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI__LEFT = MATH__LEFT;

	/**
	 * The number of structural features of the '<em>Multi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_COUNT = MATH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OPERATION_COUNT = MATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.DivImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 9;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__RIGHT = MATH__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__LEFT = MATH__LEFT;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = MATH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_OPERATION_COUNT = MATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.NumberLitteralImpl <em>Number Litteral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.NumberLitteralImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getNumberLitteral()
	 * @generated
	 */
	int NUMBER_LITTERAL = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITTERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Litteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITTERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Litteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITTERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.PlusImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 11;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__RIGHT = MATH__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__LEFT = MATH__LEFT;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = MATH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATION_COUNT = MATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.RefVariableImpl <em>Ref Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.RefVariableImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getRefVariable()
	 * @generated
	 */
	int REF_VARIABLE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_VARIABLE__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ref Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_VARIABLE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.BooleanLitteralImpl <em>Boolean Litteral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.BooleanLitteralImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getBooleanLitteral()
	 * @generated
	 */
	int BOOLEAN_LITTERAL = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITTERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Litteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITTERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Litteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITTERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.DefFunctionImpl <em>Def Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.DefFunctionImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getDefFunction()
	 * @generated
	 */
	int DEF_FUNCTION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_FUNCTION__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_FUNCTION__STATEMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_FUNCTION__PARAMETERS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Def Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_FUNCTION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Def Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_FUNCTION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.LoopImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 15;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__STATEMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.GreaterOrEqualImpl <em>Greater Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.GreaterOrEqualImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getGreaterOrEqual()
	 * @generated
	 */
	int GREATER_OR_EQUAL = 16;

	/**
	 * The number of structural features of the '<em>Greater Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Greater Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.BooleanOperationImpl <em>Boolean Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.BooleanOperationImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getBooleanOperation()
	 * @generated
	 */
	int BOOLEAN_OPERATION = 25;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION__RIGHT = BINARY_OPERATOR__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION__LEFT = BINARY_OPERATOR__LEFT;

	/**
	 * The number of structural features of the '<em>Boolean Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.GreaterImpl <em>Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.GreaterImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getGreater()
	 * @generated
	 */
	int GREATER = 17;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__RIGHT = BOOLEAN_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__LEFT = BOOLEAN_OPERATION__LEFT;

	/**
	 * The number of structural features of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = BOOLEAN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATION_COUNT = BOOLEAN_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.LessImpl <em>Less</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.LessImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getLess()
	 * @generated
	 */
	int LESS = 18;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__RIGHT = BOOLEAN_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__LEFT = BOOLEAN_OPERATION__LEFT;

	/**
	 * The number of structural features of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_FEATURE_COUNT = BOOLEAN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATION_COUNT = BOOLEAN_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.EqualImpl <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.EqualImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getEqual()
	 * @generated
	 */
	int EQUAL = 19;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__RIGHT = BOOLEAN_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__LEFT = BOOLEAN_OPERATION__LEFT;

	/**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FEATURE_COUNT = BOOLEAN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATION_COUNT = BOOLEAN_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.OrImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getOr()
	 * @generated
	 */
	int OR = 20;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RIGHT = BOOLEAN_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LEFT = BOOLEAN_OPERATION__LEFT;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BOOLEAN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BOOLEAN_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.AndImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getAnd()
	 * @generated
	 */
	int AND = 21;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT = BOOLEAN_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT = BOOLEAN_OPERATION__LEFT;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BOOLEAN_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BOOLEAN_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.UnaryOperatorImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 27;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR__RIGHT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.NotImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getNot()
	 * @generated
	 */
	int NOT = 22;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__RIGHT = UNARY_OPERATOR__RIGHT;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.FunctionCallImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.UnitOperatorImpl <em>Unit Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.UnitOperatorImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getUnitOperator()
	 * @generated
	 */
	int UNIT_OPERATOR = 28;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATOR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unit Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATOR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.MmImpl <em>Mm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.MmImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getMm()
	 * @generated
	 */
	int MM = 29;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM__LEFT = UNIT_OPERATOR__LEFT;

	/**
	 * The number of structural features of the '<em>Mm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_FEATURE_COUNT = UNIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MM_OPERATION_COUNT = UNIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.CmImpl <em>Cm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.CmImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getCm()
	 * @generated
	 */
	int CM = 30;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM__LEFT = UNIT_OPERATOR__LEFT;

	/**
	 * The number of structural features of the '<em>Cm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_FEATURE_COUNT = UNIT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OPERATION_COUNT = UNIT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.ActionImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 31;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.RotateImpl <em>Rotate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.RotateImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getRotate()
	 * @generated
	 */
	int ROTATE = 32;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__ANGLE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.ForwardImpl <em>Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.ForwardImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getForward()
	 * @generated
	 */
	int FORWARD = 33;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD__DISTANCE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.VoidImpl <em>Void</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.VoidImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getVoid()
	 * @generated
	 */
	int VOID = 34;

	/**
	 * The number of structural features of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.FunctionParameterImpl <em>Function Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.FunctionParameterImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getFunctionParameter()
	 * @generated
	 */
	int FUNCTION_PARAMETER = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miniMechaCode.impl.ConvertionImpl <em>Convertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miniMechaCode.impl.ConvertionImpl
	 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getConvertion()
	 * @generated
	 */
	int CONVERTION = 36;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTION__UNIT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Convertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Convertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link miniMechaCode.MiniMechaCode <em>Mini Mecha Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mini Mecha Code</em>'.
	 * @see miniMechaCode.MiniMechaCode
	 * @generated
	 */
	EClass getMiniMechaCode();

	/**
	 * Returns the meta object for the containment reference list '{@link miniMechaCode.MiniMechaCode#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see miniMechaCode.MiniMechaCode#getStatements()
	 * @see #getMiniMechaCode()
	 * @generated
	 */
	EReference getMiniMechaCode_Statements();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see miniMechaCode.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see miniMechaCode.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see miniMechaCode.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.DefVariable <em>Def Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Def Variable</em>'.
	 * @see miniMechaCode.DefVariable
	 * @generated
	 */
	EClass getDefVariable();

	/**
	 * Returns the meta object for the attribute '{@link miniMechaCode.DefVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see miniMechaCode.DefVariable#getName()
	 * @see #getDefVariable()
	 * @generated
	 */
	EAttribute getDefVariable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link miniMechaCode.DefVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see miniMechaCode.DefVariable#getValue()
	 * @see #getDefVariable()
	 * @generated
	 */
	EReference getDefVariable_Value();

	/**
	 * Returns the meta object for the containment reference '{@link miniMechaCode.DefVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see miniMechaCode.DefVariable#getType()
	 * @see #getDefVariable()
	 * @generated
	 */
	EReference getDefVariable_Type();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see miniMechaCode.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see miniMechaCode.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see miniMechaCode.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Multi <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi</em>'.
	 * @see miniMechaCode.Multi
	 * @generated
	 */
	EClass getMulti();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div</em>'.
	 * @see miniMechaCode.Div
	 * @generated
	 */
	EClass getDiv();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.NumberLitteral <em>Number Litteral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Litteral</em>'.
	 * @see miniMechaCode.NumberLitteral
	 * @generated
	 */
	EClass getNumberLitteral();

	/**
	 * Returns the meta object for the attribute '{@link miniMechaCode.NumberLitteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see miniMechaCode.NumberLitteral#getValue()
	 * @see #getNumberLitteral()
	 * @generated
	 */
	EAttribute getNumberLitteral_Value();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see miniMechaCode.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.RefVariable <em>Ref Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Variable</em>'.
	 * @see miniMechaCode.RefVariable
	 * @generated
	 */
	EClass getRefVariable();

	/**
	 * Returns the meta object for the attribute '{@link miniMechaCode.RefVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see miniMechaCode.RefVariable#getName()
	 * @see #getRefVariable()
	 * @generated
	 */
	EAttribute getRefVariable_Name();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.BooleanLitteral <em>Boolean Litteral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Litteral</em>'.
	 * @see miniMechaCode.BooleanLitteral
	 * @generated
	 */
	EClass getBooleanLitteral();

	/**
	 * Returns the meta object for the attribute '{@link miniMechaCode.BooleanLitteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see miniMechaCode.BooleanLitteral#isValue()
	 * @see #getBooleanLitteral()
	 * @generated
	 */
	EAttribute getBooleanLitteral_Value();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.DefFunction <em>Def Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Def Function</em>'.
	 * @see miniMechaCode.DefFunction
	 * @generated
	 */
	EClass getDefFunction();

	/**
	 * Returns the meta object for the attribute '{@link miniMechaCode.DefFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see miniMechaCode.DefFunction#getName()
	 * @see #getDefFunction()
	 * @generated
	 */
	EAttribute getDefFunction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link miniMechaCode.DefFunction#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see miniMechaCode.DefFunction#getStatements()
	 * @see #getDefFunction()
	 * @generated
	 */
	EReference getDefFunction_Statements();

	/**
	 * Returns the meta object for the containment reference list '{@link miniMechaCode.DefFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see miniMechaCode.DefFunction#getParameters()
	 * @see #getDefFunction()
	 * @generated
	 */
	EReference getDefFunction_Parameters();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see miniMechaCode.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link miniMechaCode.Loop#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see miniMechaCode.Loop#getCondition()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link miniMechaCode.Loop#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see miniMechaCode.Loop#getStatements()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Statements();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.GreaterOrEqual <em>Greater Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Or Equal</em>'.
	 * @see miniMechaCode.GreaterOrEqual
	 * @generated
	 */
	EClass getGreaterOrEqual();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see miniMechaCode.Greater
	 * @generated
	 */
	EClass getGreater();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less</em>'.
	 * @see miniMechaCode.Less
	 * @generated
	 */
	EClass getLess();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see miniMechaCode.Equal
	 * @generated
	 */
	EClass getEqual();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see miniMechaCode.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see miniMechaCode.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see miniMechaCode.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operator</em>'.
	 * @see miniMechaCode.BinaryOperator
	 * @generated
	 */
	EClass getBinaryOperator();

	/**
	 * Returns the meta object for the containment reference '{@link miniMechaCode.BinaryOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see miniMechaCode.BinaryOperator#getRight()
	 * @see #getBinaryOperator()
	 * @generated
	 */
	EReference getBinaryOperator_Right();

	/**
	 * Returns the meta object for the containment reference '{@link miniMechaCode.BinaryOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see miniMechaCode.BinaryOperator#getLeft()
	 * @see #getBinaryOperator()
	 * @generated
	 */
	EReference getBinaryOperator_Left();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Math <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math</em>'.
	 * @see miniMechaCode.Math
	 * @generated
	 */
	EClass getMath();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.BooleanOperation <em>Boolean Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operation</em>'.
	 * @see miniMechaCode.BooleanOperation
	 * @generated
	 */
	EClass getBooleanOperation();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see miniMechaCode.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the attribute '{@link miniMechaCode.FunctionCall#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see miniMechaCode.FunctionCall#getName()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EAttribute getFunctionCall_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link miniMechaCode.FunctionCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see miniMechaCode.FunctionCall#getParameters()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Parameters();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operator</em>'.
	 * @see miniMechaCode.UnaryOperator
	 * @generated
	 */
	EClass getUnaryOperator();

	/**
	 * Returns the meta object for the containment reference '{@link miniMechaCode.UnaryOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see miniMechaCode.UnaryOperator#getRight()
	 * @see #getUnaryOperator()
	 * @generated
	 */
	EReference getUnaryOperator_Right();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.UnitOperator <em>Unit Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Operator</em>'.
	 * @see miniMechaCode.UnitOperator
	 * @generated
	 */
	EClass getUnitOperator();

	/**
	 * Returns the meta object for the containment reference '{@link miniMechaCode.UnitOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see miniMechaCode.UnitOperator#getLeft()
	 * @see #getUnitOperator()
	 * @generated
	 */
	EReference getUnitOperator_Left();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Mm <em>Mm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mm</em>'.
	 * @see miniMechaCode.Mm
	 * @generated
	 */
	EClass getMm();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Cm <em>Cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cm</em>'.
	 * @see miniMechaCode.Cm
	 * @generated
	 */
	EClass getCm();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see miniMechaCode.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate</em>'.
	 * @see miniMechaCode.Rotate
	 * @generated
	 */
	EClass getRotate();

	/**
	 * Returns the meta object for the containment reference '{@link miniMechaCode.Rotate#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see miniMechaCode.Rotate#getAngle()
	 * @see #getRotate()
	 * @generated
	 */
	EReference getRotate_Angle();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward</em>'.
	 * @see miniMechaCode.Forward
	 * @generated
	 */
	EClass getForward();

	/**
	 * Returns the meta object for the containment reference '{@link miniMechaCode.Forward#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance</em>'.
	 * @see miniMechaCode.Forward#getDistance()
	 * @see #getForward()
	 * @generated
	 */
	EReference getForward_Distance();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Void <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void</em>'.
	 * @see miniMechaCode.Void
	 * @generated
	 */
	EClass getVoid();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.FunctionParameter <em>Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Parameter</em>'.
	 * @see miniMechaCode.FunctionParameter
	 * @generated
	 */
	EClass getFunctionParameter();

	/**
	 * Returns the meta object for the attribute '{@link miniMechaCode.FunctionParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see miniMechaCode.FunctionParameter#getName()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EAttribute getFunctionParameter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link miniMechaCode.FunctionParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see miniMechaCode.FunctionParameter#getType()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EReference getFunctionParameter_Type();

	/**
	 * Returns the meta object for class '{@link miniMechaCode.Convertion <em>Convertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convertion</em>'.
	 * @see miniMechaCode.Convertion
	 * @generated
	 */
	EClass getConvertion();

	/**
	 * Returns the meta object for the containment reference '{@link miniMechaCode.Convertion#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see miniMechaCode.Convertion#getLeft()
	 * @see #getConvertion()
	 * @generated
	 */
	EReference getConvertion_Left();

	/**
	 * Returns the meta object for the containment reference '{@link miniMechaCode.Convertion#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see miniMechaCode.Convertion#getUnit()
	 * @see #getConvertion()
	 * @generated
	 */
	EReference getConvertion_Unit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MiniMechaCodeFactory getMiniMechaCodeFactory();

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
		 * The meta object literal for the '{@link miniMechaCode.impl.MiniMechaCodeImpl <em>Mini Mecha Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.MiniMechaCodeImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getMiniMechaCode()
		 * @generated
		 */
		EClass MINI_MECHA_CODE = eINSTANCE.getMiniMechaCode();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINI_MECHA_CODE__STATEMENTS = eINSTANCE.getMiniMechaCode_Statements();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.NumberImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.TypeImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.BooleanImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.DefVariableImpl <em>Def Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.DefVariableImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getDefVariable()
		 * @generated
		 */
		EClass DEF_VARIABLE = eINSTANCE.getDefVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEF_VARIABLE__NAME = eINSTANCE.getDefVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEF_VARIABLE__VALUE = eINSTANCE.getDefVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEF_VARIABLE__TYPE = eINSTANCE.getDefVariable_Type();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.StatementImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.ExpressionImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.MinusImpl <em>Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.MinusImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getMinus()
		 * @generated
		 */
		EClass MINUS = eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.MultiImpl <em>Multi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.MultiImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getMulti()
		 * @generated
		 */
		EClass MULTI = eINSTANCE.getMulti();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.DivImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getDiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDiv();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.NumberLitteralImpl <em>Number Litteral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.NumberLitteralImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getNumberLitteral()
		 * @generated
		 */
		EClass NUMBER_LITTERAL = eINSTANCE.getNumberLitteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_LITTERAL__VALUE = eINSTANCE.getNumberLitteral_Value();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.PlusImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.RefVariableImpl <em>Ref Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.RefVariableImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getRefVariable()
		 * @generated
		 */
		EClass REF_VARIABLE = eINSTANCE.getRefVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_VARIABLE__NAME = eINSTANCE.getRefVariable_Name();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.BooleanLitteralImpl <em>Boolean Litteral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.BooleanLitteralImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getBooleanLitteral()
		 * @generated
		 */
		EClass BOOLEAN_LITTERAL = eINSTANCE.getBooleanLitteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITTERAL__VALUE = eINSTANCE.getBooleanLitteral_Value();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.DefFunctionImpl <em>Def Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.DefFunctionImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getDefFunction()
		 * @generated
		 */
		EClass DEF_FUNCTION = eINSTANCE.getDefFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEF_FUNCTION__NAME = eINSTANCE.getDefFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEF_FUNCTION__STATEMENTS = eINSTANCE.getDefFunction_Statements();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEF_FUNCTION__PARAMETERS = eINSTANCE.getDefFunction_Parameters();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.LoopImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__CONDITION = eINSTANCE.getLoop_Condition();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__STATEMENTS = eINSTANCE.getLoop_Statements();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.GreaterOrEqualImpl <em>Greater Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.GreaterOrEqualImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getGreaterOrEqual()
		 * @generated
		 */
		EClass GREATER_OR_EQUAL = eINSTANCE.getGreaterOrEqual();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.GreaterImpl <em>Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.GreaterImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getGreater()
		 * @generated
		 */
		EClass GREATER = eINSTANCE.getGreater();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.LessImpl <em>Less</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.LessImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getLess()
		 * @generated
		 */
		EClass LESS = eINSTANCE.getLess();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.EqualImpl <em>Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.EqualImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getEqual()
		 * @generated
		 */
		EClass EQUAL = eINSTANCE.getEqual();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.OrImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.AndImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.NotImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.BinaryOperatorImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getBinaryOperator()
		 * @generated
		 */
		EClass BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATOR__RIGHT = eINSTANCE.getBinaryOperator_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATOR__LEFT = eINSTANCE.getBinaryOperator_Left();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.MathImpl <em>Math</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.MathImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getMath()
		 * @generated
		 */
		EClass MATH = eINSTANCE.getMath();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.BooleanOperationImpl <em>Boolean Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.BooleanOperationImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getBooleanOperation()
		 * @generated
		 */
		EClass BOOLEAN_OPERATION = eINSTANCE.getBooleanOperation();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.FunctionCallImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_CALL__NAME = eINSTANCE.getFunctionCall_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__PARAMETERS = eINSTANCE.getFunctionCall_Parameters();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.UnaryOperatorImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getUnaryOperator()
		 * @generated
		 */
		EClass UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_OPERATOR__RIGHT = eINSTANCE.getUnaryOperator_Right();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.UnitOperatorImpl <em>Unit Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.UnitOperatorImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getUnitOperator()
		 * @generated
		 */
		EClass UNIT_OPERATOR = eINSTANCE.getUnitOperator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_OPERATOR__LEFT = eINSTANCE.getUnitOperator_Left();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.MmImpl <em>Mm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.MmImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getMm()
		 * @generated
		 */
		EClass MM = eINSTANCE.getMm();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.CmImpl <em>Cm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.CmImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getCm()
		 * @generated
		 */
		EClass CM = eINSTANCE.getCm();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.ActionImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.RotateImpl <em>Rotate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.RotateImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getRotate()
		 * @generated
		 */
		EClass ROTATE = eINSTANCE.getRotate();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROTATE__ANGLE = eINSTANCE.getRotate_Angle();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.ForwardImpl <em>Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.ForwardImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getForward()
		 * @generated
		 */
		EClass FORWARD = eINSTANCE.getForward();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORWARD__DISTANCE = eINSTANCE.getForward_Distance();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.VoidImpl <em>Void</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.VoidImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getVoid()
		 * @generated
		 */
		EClass VOID = eINSTANCE.getVoid();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.FunctionParameterImpl <em>Function Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.FunctionParameterImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getFunctionParameter()
		 * @generated
		 */
		EClass FUNCTION_PARAMETER = eINSTANCE.getFunctionParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMETER__NAME = eINSTANCE.getFunctionParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_PARAMETER__TYPE = eINSTANCE.getFunctionParameter_Type();

		/**
		 * The meta object literal for the '{@link miniMechaCode.impl.ConvertionImpl <em>Convertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miniMechaCode.impl.ConvertionImpl
		 * @see miniMechaCode.impl.MiniMechaCodePackageImpl#getConvertion()
		 * @generated
		 */
		EClass CONVERTION = eINSTANCE.getConvertion();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERTION__LEFT = eINSTANCE.getConvertion_Left();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERTION__UNIT = eINSTANCE.getConvertion_Unit();

	}

} //MiniMechaCodePackage
