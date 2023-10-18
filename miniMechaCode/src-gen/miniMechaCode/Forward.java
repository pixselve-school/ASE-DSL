/**
 */
package miniMechaCode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniMechaCode.Forward#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see miniMechaCode.MiniMechaCodePackage#getForward()
 * @model
 * @generated
 */
public interface Forward extends Action {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' containment reference.
	 * @see #setDistance(Expression)
	 * @see miniMechaCode.MiniMechaCodePackage#getForward_Distance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getDistance();

	/**
	 * Sets the value of the '{@link miniMechaCode.Forward#getDistance <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' containment reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(Expression value);

} // Forward
