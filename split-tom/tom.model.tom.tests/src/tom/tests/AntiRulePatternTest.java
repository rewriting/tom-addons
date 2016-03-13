/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.AntiRulePattern;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Anti Rule Pattern</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AntiRulePatternTest extends RulePatternTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AntiRulePatternTest.class);
	}

	/**
	 * Constructs a new Anti Rule Pattern test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntiRulePatternTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Anti Rule Pattern test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AntiRulePattern getFixture() {
		return (AntiRulePattern)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createAntiRulePattern());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AntiRulePatternTest
