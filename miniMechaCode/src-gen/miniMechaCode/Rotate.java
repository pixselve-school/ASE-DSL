/**
 */
package miniMechaCode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniMechaCode.Rotate#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see miniMechaCode.MiniMechaCodePackage#getRotate()
 * @model
 * @generated
 */
public interface Rotate extends Action {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(Expression)
	 * @see miniMechaCode.MiniMechaCodePackage#getRotate_Angle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAngle();

	/**
	 * Sets the value of the '{@link miniMechaCode.Rotate#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Expression value);

} // Rotate
