/**
 */
package tom.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import tom.HookDefinition;
import tom.TomFactory;
import tom.TomPackage;

/**
 * This is the item provider adapter for a {@link tom.HookDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HookDefinitionItemProvider extends DefinitionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HookDefinitionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TomPackage.Literals.HOOK_DEFINITION__HOOK_OPERATION);
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
	 * This returns HookDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HookDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_HookDefinition_type");
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

		switch (notification.getFeatureID(HookDefinition.class)) {
			case TomPackage.HOOK_DEFINITION__HOOK_OPERATION:
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

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.HOOK_DEFINITION__HOOK_OPERATION,
				 TomFactory.eINSTANCE.createHookOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.HOOK_DEFINITION__HOOK_OPERATION,
				 TomFactory.eINSTANCE.createHostHookOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.HOOK_DEFINITION__HOOK_OPERATION,
				 TomFactory.eINSTANCE.createHook_Rules()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.HOOK_DEFINITION__HOOK_OPERATION,
				 TomFactory.eINSTANCE.createHook_Graphrules()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.HOOK_DEFINITION__HOOK_OPERATION,
				 TomFactory.eINSTANCE.createHook_Make()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.HOOK_DEFINITION__HOOK_OPERATION,
				 TomFactory.eINSTANCE.createHook_Make_Insert()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.HOOK_DEFINITION__HOOK_OPERATION,
				 TomFactory.eINSTANCE.createHook_Make_Empty()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.HOOK_DEFINITION__HOOK_OPERATION,
				 TomFactory.eINSTANCE.createHook_Free()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.HOOK_DEFINITION__HOOK_OPERATION,
				 TomFactory.eINSTANCE.createHook_FL()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.HOOK_DEFINITION__HOOK_OPERATION,
				 TomFactory.eINSTANCE.createHook_AU()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.HOOK_DEFINITION__HOOK_OPERATION,
				 TomFactory.eINSTANCE.createHook_Interface()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.HOOK_DEFINITION__HOOK_OPERATION,
				 TomFactory.eINSTANCE.createHook_Imports()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.HOOK_DEFINITION__HOOK_OPERATION,
				 TomFactory.eINSTANCE.createHook_Block()));
	}

}
