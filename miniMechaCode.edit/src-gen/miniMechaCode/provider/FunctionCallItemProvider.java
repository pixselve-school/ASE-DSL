/**
 */
package miniMechaCode.provider;

import java.util.Collection;
import java.util.List;

import miniMechaCode.FunctionCall;
import miniMechaCode.MiniMechaCodeFactory;
import miniMechaCode.MiniMechaCodePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link miniMechaCode.FunctionCall} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionCallItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCallItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FunctionCall_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FunctionCall_name_feature",
								"_UI_FunctionCall_type"),
						MiniMechaCodePackage.Literals.FUNCTION_CALL__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS);
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
	 * This returns FunctionCall.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionCall"));
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
		String label = ((FunctionCall) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_FunctionCall_type")
				: getString("_UI_FunctionCall_type") + " " + label;
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

		switch (notification.getFeatureID(FunctionCall.class)) {
		case MiniMechaCodePackage.FUNCTION_CALL__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case MiniMechaCodePackage.FUNCTION_CALL__PARAMETERS:
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

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createBinaryOperator()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createMath()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createMulti()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createNumberLitteral()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createRefVariable()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createBooleanLitteral()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createBooleanOperation()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createLess()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createUnaryOperator()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createUnitOperator()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createMm()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createCm()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.FUNCTION_CALL__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createConvertion()));
	}

}
