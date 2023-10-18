/**
 */
package miniMechaCode.impl;

import miniMechaCode.Convertion;
import miniMechaCode.Expression;
import miniMechaCode.MiniMechaCodePackage;
import miniMechaCode.UnitOperator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Convertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link miniMechaCode.impl.ConvertionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link miniMechaCode.impl.ConvertionImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConvertionImpl extends ExpressionImpl implements Convertion {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected Expression left;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitOperator unit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConvertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniMechaCodePackage.Literals.CONVERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs) {
		Expression oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MiniMechaCodePackage.CONVERTION__LEFT, oldLeft, newLeft);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Expression newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject) left).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MiniMechaCodePackage.CONVERTION__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject) newLeft).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MiniMechaCodePackage.CONVERTION__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniMechaCodePackage.CONVERTION__LEFT, newLeft,
					newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOperator getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(UnitOperator newUnit, NotificationChain msgs) {
		UnitOperator oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MiniMechaCodePackage.CONVERTION__UNIT, oldUnit, newUnit);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(UnitOperator newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject) unit).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MiniMechaCodePackage.CONVERTION__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject) newUnit).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MiniMechaCodePackage.CONVERTION__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniMechaCodePackage.CONVERTION__UNIT, newUnit,
					newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MiniMechaCodePackage.CONVERTION__LEFT:
			return basicSetLeft(null, msgs);
		case MiniMechaCodePackage.CONVERTION__UNIT:
			return basicSetUnit(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MiniMechaCodePackage.CONVERTION__LEFT:
			return getLeft();
		case MiniMechaCodePackage.CONVERTION__UNIT:
			return getUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MiniMechaCodePackage.CONVERTION__LEFT:
			setLeft((Expression) newValue);
			return;
		case MiniMechaCodePackage.CONVERTION__UNIT:
			setUnit((UnitOperator) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MiniMechaCodePackage.CONVERTION__LEFT:
			setLeft((Expression) null);
			return;
		case MiniMechaCodePackage.CONVERTION__UNIT:
			setUnit((UnitOperator) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MiniMechaCodePackage.CONVERTION__LEFT:
			return left != null;
		case MiniMechaCodePackage.CONVERTION__UNIT:
			return unit != null;
		}
		return super.eIsSet(featureID);
	}

} //ConvertionImpl
