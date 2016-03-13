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

import tom.TermSum;
import tom.TomFactory;
import tom.TomPackage;

/**
 * This is the item provider adapter for a {@link tom.TermSum} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TermSumItemProvider extends TermItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermSumItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TomPackage.Literals.TERM_SUM__LEFT);
			childrenFeatures.add(TomPackage.Literals.TERM_SUM__RIGHT);
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
	 * This returns TermSum.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TermSum"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TermSum_type");
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

		switch (notification.getFeatureID(TermSum.class)) {
			case TomPackage.TERM_SUM__LEFT:
			case TomPackage.TERM_SUM__RIGHT:
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
				(TomPackage.Literals.TERM_SUM__LEFT,
				 TomFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TERM_SUM__LEFT,
				 TomFactory.eINSTANCE.createTermSum()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TERM_SUM__LEFT,
				 TomFactory.eINSTANCE.createTermConst()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TERM_SUM__LEFT,
				 TomFactory.eINSTANCE.createTermNull()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TERM_SUM__LEFT,
				 TomFactory.eINSTANCE.createTermVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TERM_SUM__LEFT,
				 TomFactory.eINSTANCE.createTermOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TERM_SUM__LEFT,
				 TomFactory.eINSTANCE.createResolve()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TERM_SUM__RIGHT,
				 TomFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TERM_SUM__RIGHT,
				 TomFactory.eINSTANCE.createTermSum()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TERM_SUM__RIGHT,
				 TomFactory.eINSTANCE.createTermConst()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TERM_SUM__RIGHT,
				 TomFactory.eINSTANCE.createTermNull()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TERM_SUM__RIGHT,
				 TomFactory.eINSTANCE.createTermVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TERM_SUM__RIGHT,
				 TomFactory.eINSTANCE.createTermOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.TERM_SUM__RIGHT,
				 TomFactory.eINSTANCE.createResolve()));
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

		boolean qualify =
			childFeature == TomPackage.Literals.TERM_SUM__LEFT ||
			childFeature == TomPackage.Literals.TERM_SUM__RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
