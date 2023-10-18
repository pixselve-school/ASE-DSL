/**
 */
package miniMechaCode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Litteral</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniMechaCode.NumberLitteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see miniMechaCode.MiniMechaCodePackage#getNumberLitteral()
 * @model
 * @generated
 */
public interface NumberLitteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see miniMechaCode.MiniMechaCodePackage#getNumberLitteral_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link miniMechaCode.NumberLitteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // NumberLitteral
