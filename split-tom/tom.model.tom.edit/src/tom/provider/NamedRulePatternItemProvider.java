/**
 */
package tom.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import tom.NamedRulePattern;
import tom.TomFactory;
import tom.TomPackage;

/**
 * This is the item provider adapter for a {@link tom.NamedRulePattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NamedRulePatternItemProvider extends RulePatternItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedRulePatternItemProvider(AdapterFactory adapterFactory) {
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
			addTypePropertyDescriptor(object);
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
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Linkable_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Linkable_name_feature", "_UI_Linkable_type"),
				 TomPackage.Literals.LINKABLE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Variable_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Variable_type_feature", "_UI_Variable_type"),
				 TomPackage.Literals.VARIABLE__TYPE,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN);
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
	 * This returns NamedRulePattern.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NamedRulePattern"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NamedRulePattern)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NamedRulePattern_type") :
			getString("_UI_NamedRulePattern_type") + " " + label;
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

		switch (notification.getFeatureID(NamedRulePattern.class)) {
			case TomPackage.NAMED_RULE_PATTERN__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TomPackage.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN:
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
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHostCode()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createCall()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createAffectation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createTom()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createLinkable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createVariableSimple()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createVariableList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createCallback()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createCallbackDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createArguments()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createArgumentTypeSuffix()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createArgumentTypePrefix()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createImportConstruct()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createIncludeConstruct()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createTermSum()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createTermConst()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createTermNull()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createTermVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createTermOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createReturn()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createMatchConsctruct()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createMatchPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createArgumentMatch()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createPatternAction()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createConstraintPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createConstraintAction()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createNamedPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createAntiPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createPlainPatternConst()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createPlainPatternVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createJokerPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createPlainPatternOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createOperationList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createExplicitTermList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createPlainPatternVariableList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createAnyPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createImplicitPairList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createPairPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createStrategyConstruct()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createStrategyVisit()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createVisitAction()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createPatternList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createConstraintOr()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createConstraintAnd()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createConstraintP()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createConstraintMatch()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createConstraintOp()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createGomConstruct()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createOperatorDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createArgumentsList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHookDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHookModuleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHookTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHookOperatorDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHookOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHostHookOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHook_Rules()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHook_Graphrules()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHook_Make()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHook_Make_Insert()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHook_Make_Empty()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHook_Free()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHook_FL()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHook_AU()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHook_Interface()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHook_Imports()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createHook_Block()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createRule()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createRulePattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createNamedRulePattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createAntiRulePattern()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createPlainRulePatternOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createGraphRule()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createTermGraph()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createPlainTermGraph()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createTermGraphVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createTermGraphFunc()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createConditionOr()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createConditionAnd()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createConditionP()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createConditionRule()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createConditionOp()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createXMLTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createXMLTermSimple()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createXMLTermDouble()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createXMLTermText()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createXMLTermComment()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createXMLTermProcess()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createXMLNameList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createXMLAttrList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createXMLAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createXMLAttribute1()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createXMLAttribute2()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createXMLAttribute3()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createXMLChilds()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createTypeTerm()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createKeyWord()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createOperator()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createOperatorList()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createOperatorArray()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createElementaryTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createElementaryTransformationRule()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createTracelink()));

		newChildDescriptors.add
			(createChildParameter
				(TomPackage.Literals.NAMED_RULE_PATTERN__PLAIN_RULE_PATTERN,
				 TomFactory.eINSTANCE.createResolve()));
	}

}
