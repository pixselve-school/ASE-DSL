/**
 */
package miniMechaCode.provider;

import java.util.Collection;
import java.util.List;

import miniMechaCode.Loop;
import miniMechaCode.MiniMechaCodeFactory;
import miniMechaCode.MiniMechaCodePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link miniMechaCode.Loop} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoopItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(MiniMechaCodePackage.Literals.LOOP__CONDITION);
			childrenFeatures.add(MiniMechaCodePackage.Literals.LOOP__STATEMENTS);
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
	 * This returns Loop.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Loop"));
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
		return getString("_UI_Loop_type");
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

		switch (notification.getFeatureID(Loop.class)) {
		case MiniMechaCodePackage.LOOP__CONDITION:
		case MiniMechaCodePackage.LOOP__STATEMENTS:
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

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createBinaryOperator()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createMath()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createMulti()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createNumberLitteral()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createRefVariable()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createBooleanLitteral()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createBooleanOperation()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createLess()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createUnaryOperator()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createUnitOperator()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createMm()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createCm()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__CONDITION,
				MiniMechaCodeFactory.eINSTANCE.createConvertion()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createDefVariable()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createBinaryOperator()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createMath()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createMulti()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createNumberLitteral()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createRefVariable()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createBooleanLitteral()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createDefFunction()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createBooleanOperation()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createLess()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createUnaryOperator()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createUnitOperator()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createMm()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createCm()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createRotate()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createForward()));

		newChildDescriptors.add(createChildParameter(MiniMechaCodePackage.Literals.LOOP__STATEMENTS,
				MiniMechaCodeFactory.eINSTANCE.createConvertion()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == MiniMechaCodePackage.Literals.LOOP__CONDITION
				|| childFeature == MiniMechaCodePackage.Literals.LOOP__STATEMENTS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
