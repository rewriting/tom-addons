/**
 */
package tom.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tom.ArgumentMatch;
import tom.MatchPattern;
import tom.PatternAction;
import tom.TomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tom.impl.MatchPatternImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link tom.impl.MatchPatternImpl#getPatternActions <em>Pattern Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchPatternImpl extends MatchConsctructImpl implements MatchPattern {
	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentMatch> args;

	/**
	 * The cached value of the '{@link #getPatternActions() <em>Pattern Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternActions()
	 * @generated
	 * @ordered
	 */
	protected EList<PatternAction> patternActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TomPackage.Literals.MATCH_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentMatch> getArgs() {
		if (args == null) {
			args = new EObjectContainmentEList<ArgumentMatch>(ArgumentMatch.class, this, TomPackage.MATCH_PATTERN__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatternAction> getPatternActions() {
		if (patternActions == null) {
			patternActions = new EObjectContainmentEList<PatternAction>(PatternAction.class, this, TomPackage.MATCH_PATTERN__PATTERN_ACTIONS);
		}
		return patternActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TomPackage.MATCH_PATTERN__ARGS:
				return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
			case TomPackage.MATCH_PATTERN__PATTERN_ACTIONS:
				return ((InternalEList<?>)getPatternActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TomPackage.MATCH_PATTERN__ARGS:
				return getArgs();
			case TomPackage.MATCH_PATTERN__PATTERN_ACTIONS:
				return getPatternActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TomPackage.MATCH_PATTERN__ARGS:
				getArgs().clear();
				getArgs().addAll((Collection<? extends ArgumentMatch>)newValue);
				return;
			case TomPackage.MATCH_PATTERN__PATTERN_ACTIONS:
				getPatternActions().clear();
				getPatternActions().addAll((Collection<? extends PatternAction>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TomPackage.MATCH_PATTERN__ARGS:
				getArgs().clear();
				return;
			case TomPackage.MATCH_PATTERN__PATTERN_ACTIONS:
				getPatternActions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TomPackage.MATCH_PATTERN__ARGS:
				return args != null && !args.isEmpty();
			case TomPackage.MATCH_PATTERN__PATTERN_ACTIONS:
				return patternActions != null && !patternActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MatchPatternImpl
