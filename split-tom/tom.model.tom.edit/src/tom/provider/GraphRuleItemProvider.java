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

import tom.GraphRule;
import tom.TomFactory;
import tom.TomPackage;

/**
 * This is the item provider adapter for a {@link tom.GraphRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphRuleItemProvider 
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
	public GraphRuleItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TomPackage.Literals.GRAPH_RULE__TERMCOND);
			childrenFeatures.add(TomPackage.Literals.GRAPH_RULE__TERM_GRAPH);
			childrenFeatures.add(TomPackage.Literals.GRAPH_RULE__COND);
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
	 * This returns GraphRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GraphRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_GraphRule_type");
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

		switch (notification.getFeatureID(GraphRule.class)) {
			case TomPackage.GRAPH_RULE__TERMCOND:
			case TomPackage.GRAPH_RULE__TERM_GRAPH:
			case TomPackage.GRAPH_RULE__COND:
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
				(TomPackage.Literals.GRAPH_RULE__TERMCOND,
				 TomFactory.eINSTANCE.createTermGraph()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__TERM_GRAPH,
				 TomFactory.eINSTANCE.createTermGraph()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createTermSum()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createTermConst()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createTermNull()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createTermVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createTermOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createPlainPatternConst()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createPlainPatternVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createJokerPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createPlainPatternVariableList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createAnyPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createRulePattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createNamedRulePattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createAntiRulePattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createPlainRulePatternOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createConditionOr()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createConditionAnd()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createConditionP()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createConditionRule()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
				 TomFactory.eINSTANCE.createConditionOp()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.GRAPH_RULE__COND,
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
			childFeature == TomPackage.Literals.GRAPH_RULE__TERMCOND ||
			childFeature == TomPackage.Literals.GRAPH_RULE__TERM_GRAPH;

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
