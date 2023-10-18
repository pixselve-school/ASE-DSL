/**
 */
package miniMechaCode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Litteral</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniMechaCode.BooleanLitteral#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see miniMechaCode.MiniMechaCodePackage#getBooleanLitteral()
 * @model
 * @generated
 */
public interface BooleanLitteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see miniMechaCode.MiniMechaCodePackage#getBooleanLitteral_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link miniMechaCode.BooleanLitteral#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // BooleanLitteral
