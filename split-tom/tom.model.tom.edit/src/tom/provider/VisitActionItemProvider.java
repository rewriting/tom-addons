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

import tom.TomFactory;
import tom.TomPackage;
import tom.VisitAction;

/**
 * This is the item provider adapter for a {@link tom.VisitAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VisitActionItemProvider extends ContextItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisitActionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TomPackage.Literals.VISIT_ACTION__PATTERN);
			childrenFeatures.add(TomPackage.Literals.VISIT_ACTION__STATEMENTS);
			childrenFeatures.add(TomPackage.Literals.VISIT_ACTION__TERM);
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
	 * This returns VisitAction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VisitAction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_VisitAction_type");
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

		switch (notification.getFeatureID(VisitAction.class)) {
			case TomPackage.VISIT_ACTION__PATTERN:
			case TomPackage.VISIT_ACTION__STATEMENTS:
			case TomPackage.VISIT_ACTION__TERM:
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
				(TomPackage.Literals.VISIT_ACTION__PATTERN,
				 TomFactory.eINSTANCE.createPatternList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__STATEMENTS,
				 TomFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__STATEMENTS,
				 TomFactory.eINSTANCE.createHostCode()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__STATEMENTS,
				 TomFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__STATEMENTS,
				 TomFactory.eINSTANCE.createCall()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__STATEMENTS,
				 TomFactory.eINSTANCE.createDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__STATEMENTS,
				 TomFactory.eINSTANCE.createAffectation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__STATEMENTS,
				 TomFactory.eINSTANCE.createReturn()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__STATEMENTS,
				 TomFactory.eINSTANCE.createMatchConsctruct()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__STATEMENTS,
				 TomFactory.eINSTANCE.createMatchPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__STATEMENTS,
				 TomFactory.eINSTANCE.createConstraintPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__STATEMENTS,
				 TomFactory.eINSTANCE.createTracelink()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__TERM,
				 TomFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__TERM,
				 TomFactory.eINSTANCE.createTermSum()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__TERM,
				 TomFactory.eINSTANCE.createTermConst()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__TERM,
				 TomFactory.eINSTANCE.createTermNull()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__TERM,
				 TomFactory.eINSTANCE.createTermVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__TERM,
				 TomFactory.eINSTANCE.createTermOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.VISIT_ACTION__TERM,
				 TomFactory.eINSTANCE.createResolve()));
	}

}
