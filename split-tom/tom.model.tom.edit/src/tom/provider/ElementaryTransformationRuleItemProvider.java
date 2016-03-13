/**
 */
package tom.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import tom.ElementaryTransformationRule;
import tom.TomFactory;
import tom.TomPackage;

/**
 * This is the item provider adapter for a {@link tom.ElementaryTransformationRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementaryTransformationRuleItemProvider 
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
	public ElementaryTransformationRuleItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__PATTERN);
			childrenFeatures.add(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__STATEMENTS);
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
	 * This returns ElementaryTransformationRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ElementaryTransformationRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ElementaryTransformationRule_type");
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

		switch (notification.getFeatureID(ElementaryTransformationRule.class)) {
			case TomPackage.ELEMENTARY_TRANSFORMATION_RULE__PATTERN:
			case TomPackage.ELEMENTARY_TRANSFORMATION_RULE__STATEMENTS:
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
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__PATTERN,
				 TomFactory.eINSTANCE.createPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__PATTERN,
				 TomFactory.eINSTANCE.createNamedPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__PATTERN,
				 TomFactory.eINSTANCE.createAntiPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__PATTERN,
				 TomFactory.eINSTANCE.createPlainPatternConst()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__PATTERN,
				 TomFactory.eINSTANCE.createPlainPatternVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__PATTERN,
				 TomFactory.eINSTANCE.createJokerPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__PATTERN,
				 TomFactory.eINSTANCE.createPlainPatternOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__PATTERN,
				 TomFactory.eINSTANCE.createPlainPatternVariableList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__PATTERN,
				 TomFactory.eINSTANCE.createAnyPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__PATTERN,
				 TomFactory.eINSTANCE.createXMLTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__PATTERN,
				 TomFactory.eINSTANCE.createXMLTermSimple()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__PATTERN,
				 TomFactory.eINSTANCE.createXMLTermDouble()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__PATTERN,
				 TomFactory.eINSTANCE.createXMLTermText()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__PATTERN,
				 TomFactory.eINSTANCE.createXMLTermComment()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__PATTERN,
				 TomFactory.eINSTANCE.createXMLTermProcess()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__STATEMENTS,
				 TomFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__STATEMENTS,
				 TomFactory.eINSTANCE.createHostCode()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__STATEMENTS,
				 TomFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__STATEMENTS,
				 TomFactory.eINSTANCE.createCall()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__STATEMENTS,
				 TomFactory.eINSTANCE.createDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__STATEMENTS,
				 TomFactory.eINSTANCE.createAffectation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__STATEMENTS,
				 TomFactory.eINSTANCE.createReturn()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__STATEMENTS,
				 TomFactory.eINSTANCE.createMatchConsctruct()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__STATEMENTS,
				 TomFactory.eINSTANCE.createMatchPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__STATEMENTS,
				 TomFactory.eINSTANCE.createConstraintPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.ELEMENTARY_TRANSFORMATION_RULE__STATEMENTS,
				 TomFactory.eINSTANCE.createTracelink()));
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
