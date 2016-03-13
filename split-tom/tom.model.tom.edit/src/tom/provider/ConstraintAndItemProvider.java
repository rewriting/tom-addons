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

import tom.ConstraintAnd;
import tom.TomFactory;
import tom.TomPackage;

/**
 * This is the item provider adapter for a {@link tom.ConstraintAnd} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintAndItemProvider extends ConstraintItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintAndItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TomPackage.Literals.CONSTRAINT_AND__LEFT);
			childrenFeatures.add(TomPackage.Literals.CONSTRAINT_AND__RIGHT);
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
	 * This returns ConstraintAnd.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConstraintAnd"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ConstraintAnd_type");
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

		switch (notification.getFeatureID(ConstraintAnd.class)) {
			case TomPackage.CONSTRAINT_AND__LEFT:
			case TomPackage.CONSTRAINT_AND__RIGHT:
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
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createTermSum()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createTermConst()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createTermNull()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createTermVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createTermOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createNamedPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createAntiPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createPlainPatternConst()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createPlainPatternVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createJokerPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createPlainPatternOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createPlainPatternVariableList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createAnyPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createConstraintOr()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createConstraintAnd()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createConstraintP()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createConstraintMatch()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createConstraintOp()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createXMLTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createXMLTermSimple()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createXMLTermDouble()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createXMLTermText()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createXMLTermComment()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createXMLTermProcess()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__LEFT,
				 TomFactory.eINSTANCE.createResolve()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createTermSum()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createTermConst()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createTermNull()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createTermVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createTermOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createNamedPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createAntiPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createPlainPatternConst()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createPlainPatternVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createJokerPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createPlainPatternOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createPlainPatternVariableList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createAnyPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createConstraintOr()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createConstraintAnd()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createConstraintP()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createConstraintMatch()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createConstraintOp()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createXMLTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createXMLTermSimple()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createXMLTermDouble()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createXMLTermText()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createXMLTermComment()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
				 TomFactory.eINSTANCE.createXMLTermProcess()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.CONSTRAINT_AND__RIGHT,
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
			childFeature == TomPackage.Literals.CONSTRAINT_AND__LEFT ||
			childFeature == TomPackage.Literals.CONSTRAINT_AND__RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
