/**
 */
package miniMechaCode;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see miniMechaCode.MiniMechaCodePackage
 * @generated
 */
public interface MiniMechaCodeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiniMechaCodeFactory eINSTANCE = miniMechaCode.impl.MiniMechaCodeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mini Mecha Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mini Mecha Code</em>'.
	 * @generated
	 */
	MiniMechaCode createMiniMechaCode();

	/**
	 * Returns a new object of class '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number</em>'.
	 * @generated
	 */
	Number createNumber();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean</em>'.
	 * @generated
	 */
	Boolean createBoolean();

	/**
	 * Returns a new object of class '<em>Def Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Def Variable</em>'.
	 * @generated
	 */
	DefVariable createDefVariable();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minus</em>'.
	 * @generated
	 */
	Minus createMinus();

	/**
	 * Returns a new object of class '<em>Multi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi</em>'.
	 * @generated
	 */
	Multi createMulti();

	/**
	 * Returns a new object of class '<em>Div</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Div</em>'.
	 * @generated
	 */
	Div createDiv();

	/**
	 * Returns a new object of class '<em>Number Litteral</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Litteral</em>'.
	 * @generated
	 */
	NumberLitteral createNumberLitteral();

	/**
	 * Returns a new object of class '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plus</em>'.
	 * @generated
	 */
	Plus createPlus();

	/**
	 * Returns a new object of class '<em>Ref Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Variable</em>'.
	 * @generated
	 */
	RefVariable createRefVariable();

	/**
	 * Returns a new object of class '<em>Boolean Litteral</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Litteral</em>'.
	 * @generated
	 */
	BooleanLitteral createBooleanLitteral();

	/**
	 * Returns a new object of class '<em>Def Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Def Function</em>'.
	 * @generated
	 */
	DefFunction createDefFunction();

	/**
	 * Returns a new object of class '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop</em>'.
	 * @generated
	 */
	Loop createLoop();

	/**
	 * Returns a new object of class '<em>Greater Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Or Equal</em>'.
	 * @generated
	 */
	GreaterOrEqual createGreaterOrEqual();

	/**
	 * Returns a new object of class '<em>Greater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater</em>'.
	 * @generated
	 */
	Greater createGreater();

	/**
	 * Returns a new object of class '<em>Less</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less</em>'.
	 * @generated
	 */
	Less createLess();

	/**
	 * Returns a new object of class '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equal</em>'.
	 * @generated
	 */
	Equal createEqual();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not</em>'.
	 * @generated
	 */
	Not createNot();

	/**
	 * Returns a new object of class '<em>Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Operator</em>'.
	 * @generated
	 */
	BinaryOperator createBinaryOperator();

	/**
	 * Returns a new object of class '<em>Math</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Math</em>'.
	 * @generated
	 */
	Math createMath();

	/**
	 * Returns a new object of class '<em>Boolean Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Operation</em>'.
	 * @generated
	 */
	BooleanOperation createBooleanOperation();

	/**
	 * Returns a new object of class '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Call</em>'.
	 * @generated
	 */
	FunctionCall createFunctionCall();

	/**
	 * Returns a new object of class '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Operator</em>'.
	 * @generated
	 */
	UnaryOperator createUnaryOperator();

	/**
	 * Returns a new object of class '<em>Unit Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Operator</em>'.
	 * @generated
	 */
	UnitOperator createUnitOperator();

	/**
	 * Returns a new object of class '<em>Mm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mm</em>'.
	 * @generated
	 */
	Mm createMm();

	/**
	 * Returns a new object of class '<em>Cm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cm</em>'.
	 * @generated
	 */
	Cm createCm();

	/**
	 * Returns a new object of class '<em>Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotate</em>'.
	 * @generated
	 */
	Rotate createRotate();

	/**
	 * Returns a new object of class '<em>Forward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forward</em>'.
	 * @generated
	 */
	Forward createForward();

	/**
	 * Returns a new object of class '<em>Void</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Void</em>'.
	 * @generated
	 */
	Void createVoid();

	/**
	 * Returns a new object of class '<em>Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Parameter</em>'.
	 * @generated
	 */
	FunctionParameter createFunctionParameter();

	/**
	 * Returns a new object of class '<em>Convertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convertion</em>'.
	 * @generated
	 */
	Convertion createConvertion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MiniMechaCodePackage getMiniMechaCodePackage();

} //MiniMechaCodeFactory
