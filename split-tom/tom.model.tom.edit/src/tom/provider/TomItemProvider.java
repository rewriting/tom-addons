/**
 */
package tom.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import tom.Tom;
import tom.TomFactory;
import tom.TomPackage;

/**
 * This is the item provider adapter for a {@link tom.Tom} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TomItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TomItemProvider(AdapterFactory adapterFactory) {
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

			addNamespacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tom_namespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tom_namespace_feature", "_UI_Tom_type"),
				 TomPackage.Literals.TOM__NAMESPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(TomPackage.Literals.TOM__BLOCS);
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
	 * This returns Tom.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Tom"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Tom)object).getNamespace();
		return label == null || label.length() == 0 ?
			getString("_UI_Tom_type") :
			getString("_UI_Tom_type") + " " + label;
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

		switch (notification.getFeatureID(Tom.class)) {
			case TomPackage.TOM__NAMESPACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TomPackage.TOM__BLOCS:
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
				(TomPackage.Literals.TOM__BLOCS,
				 TomFactory.eINSTANCE.createHostCode()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TOM__BLOCS,
				 TomFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TOM__BLOCS,
				 TomFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TOM__BLOCS,
				 TomFactory.eINSTANCE.createCallback()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TOM__BLOCS,
				 TomFactory.eINSTANCE.createImportConstruct()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TOM__BLOCS,
				 TomFactory.eINSTANCE.createIncludeConstruct()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TOM__BLOCS,
				 TomFactory.eINSTANCE.createStrategyConstruct()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TOM__BLOCS,
				 TomFactory.eINSTANCE.createGomConstruct()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TOM__BLOCS,
				 TomFactory.eINSTANCE.createTypeTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TOM__BLOCS,
				 TomFactory.eINSTANCE.createOperator()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TOM__BLOCS,
				 TomFactory.eINSTANCE.createOperatorList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TOM__BLOCS,
				 TomFactory.eINSTANCE.createOperatorArray()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TOM__BLOCS,
				 TomFactory.eINSTANCE.createTransformation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TomEditPlugin.INSTANCE;
	}

}
