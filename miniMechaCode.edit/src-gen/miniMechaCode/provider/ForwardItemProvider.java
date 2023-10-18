/**
 */
package miniMechaCode.provider;

import java.util.Collection;
import java.util.List;

import miniMechaCode.Forward;
import miniMechaCode.MiniMechaCodeFactory;
import miniMechaCode.MiniMechaCodePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link miniMechaCode.Forward} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ForwardItemProvider extends ActionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MiniMechaCodePackage.Literals.FORWARD__DISTANCE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Forward.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Forward"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Forward_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Forward.class)) {
		case MiniMechaCodePackage.FORWARD__DISTANCE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createBinaryOperator()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createMath()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createMulti()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createNumberLitteral()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createRefVariable()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createBooleanLitteral()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createBooleanOperation()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createLess()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createUnaryOperator()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createUnitOperator()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createMm()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createCm()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FORWARD__DISTANCE,
				MiniMechaCodeFactory.eINSTANCE.createConvertion()));
	}

}
