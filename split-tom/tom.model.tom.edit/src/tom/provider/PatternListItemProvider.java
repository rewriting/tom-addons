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

import tom.PatternList;
import tom.TomFactory;
import tom.TomPackage;

/**
 * This is the item provider adapter for a {@link tom.PatternList} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternListItemProvider 
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
	public PatternListItemProvider(AdapterFactory adapterFactory) {
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

			addRelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Rel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PatternList_rel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PatternList_rel_feature", "_UI_PatternList_type"),
				 TomPackage.Literals.PATTERN_LIST__REL,
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
			childrenFeatures.add(TomPackage.Literals.PATTERN_LIST__PATTERNS);
			childrenFeatures.add(TomPackage.Literals.PATTERN_LIST__CONSTRAINT);
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
	 * This returns PatternList.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PatternList"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PatternList)object).getRel();
		return label == null || label.length() == 0 ?
			getString("_UI_PatternList_type") :
			getString("_UI_PatternList_type") + " " + label;
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

		switch (notification.getFeatureID(PatternList.class)) {
			case TomPackage.PATTERN_LIST__REL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TomPackage.PATTERN_LIST__PATTERNS:
			case TomPackage.PATTERN_LIST__CONSTRAINT:
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
				(TomPackage.Literals.PATTERN_LIST__PATTERNS,
				 TomFactory.eINSTANCE.createPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__PATTERNS,
				 TomFactory.eINSTANCE.createNamedPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__PATTERNS,
				 TomFactory.eINSTANCE.createAntiPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__PATTERNS,
				 TomFactory.eINSTANCE.createPlainPatternConst()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__PATTERNS,
				 TomFactory.eINSTANCE.createPlainPatternVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__PATTERNS,
				 TomFactory.eINSTANCE.createJokerPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__PATTERNS,
				 TomFactory.eINSTANCE.createPlainPatternOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__PATTERNS,
				 TomFactory.eINSTANCE.createPlainPatternVariableList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__PATTERNS,
				 TomFactory.eINSTANCE.createAnyPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__PATTERNS,
				 TomFactory.eINSTANCE.createXMLTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__PATTERNS,
				 TomFactory.eINSTANCE.createXMLTermSimple()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__PATTERNS,
				 TomFactory.eINSTANCE.createXMLTermDouble()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__PATTERNS,
				 TomFactory.eINSTANCE.createXMLTermText()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__PATTERNS,
				 TomFactory.eINSTANCE.createXMLTermComment()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__PATTERNS,
				 TomFactory.eINSTANCE.createXMLTermProcess()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createTermSum()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createTermConst()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createTermNull()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createTermVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createTermOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createNamedPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createAntiPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createPlainPatternConst()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createPlainPatternVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createJokerPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createPlainPatternOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createPlainPatternVariableList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createAnyPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createConstraintOr()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createConstraintAnd()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createConstraintP()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createConstraintMatch()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createConstraintOp()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createXMLTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createXMLTermSimple()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createXMLTermDouble()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createXMLTermText()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createXMLTermComment()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
				 TomFactory.eINSTANCE.createXMLTermProcess()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.PATTERN_LIST__CONSTRAINT,
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
			childFeature == TomPackage.Literals.PATTERN_LIST__PATTERNS ||
			childFeature == TomPackage.Literals.PATTERN_LIST__CONSTRAINT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
