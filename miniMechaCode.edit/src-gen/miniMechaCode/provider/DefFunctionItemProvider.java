/**
 */
package miniMechaCode.provider;

import java.util.Collection;
import java.util.List;

import miniMechaCode.DefFunction;
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
 * This is the item provider adapter for a {@link miniMechaCode.DefFunction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DefFunctionItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefFunctionItemProvider(AdapterFactory adapterFactory) {
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
						getResourceLocator(), getString("_UI_DefFunction_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DefFunction_name_feature",
								"_UI_DefFunction_type"),
						MiniMechaCodePackage.Literals.DEF_FUNCTION__NAME, true, false, false,
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
			childrenFeatures.add(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS);
			childrenFeatures.add(MiniMechaCodePackage.Literals.DEF_FUNCTION__PARAMETERS);
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
	 * This returns DefFunction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DefFunction"));
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
		String label = ((DefFunction) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_DefFunction_type")
				: getString("_UI_DefFunction_type") + " " + label;
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

		switch (notification.getFeatureID(DefFunction.class)) {
		case MiniMechaCodePackage.DEF_FUNCTION__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case MiniMechaCodePackage.DEF_FUNCTION__STATEMENTS:
		case MiniMechaCodePackage.DEF_FUNCTION__PARAMETERS:
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

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createDefVariable()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createBinaryOperator()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createMath()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createMulti()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createNumberLitteral()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createRefVariable()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createBooleanLitteral()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createDefFunction()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createBooleanOperation()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createLess()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createUnaryOperator()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createUnitOperator()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createMm()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createCm()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createRotate()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createForward()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createConvertion()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.DEF_FUNCTION__PARAMETERS,
				MiniMechaCodeFactory.eINSTANCE.createFunctionParameter()));
	}

}
