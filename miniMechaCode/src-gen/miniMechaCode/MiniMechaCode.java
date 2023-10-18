/**
 */
package miniMechaCode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mini Mecha Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miniMechaCode.MiniMechaCode#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see miniMechaCode.MiniMechaCodePackage#getMiniMechaCode()
 * @model
 * @generated
 */
public interface MiniMechaCode extends EObject {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link miniMechaCode.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see miniMechaCode.MiniMechaCodePackage#getMiniMechaCode_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // MiniMechaCode
