/**
 */
package miniMechaCode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Convertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniMechaCode.Convertion#getLeft <em>Left</em>}</li>
 *   <li>{@link miniMechaCode.Convertion#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see miniMechaCode.MiniMechaCodePackage#getConvertion()
 * @model
 * @generated
 */
public interface Convertion extends Expression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see miniMechaCode.MiniMechaCodePackage#getConvertion_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link miniMechaCode.Convertion#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(UnitOperator)
	 * @see miniMechaCode.MiniMechaCodePackage#getConvertion_Unit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UnitOperator getUnit();

	/**
	 * Sets the value of the '{@link miniMechaCode.Convertion#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitOperator value);

} // Convertion
