/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.NamedRulePattern;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Named Rule Pattern</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NamedRulePatternTest extends RulePatternTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NamedRulePatternTest.class);
	}

	/**
	 * Constructs a new Named Rule Pattern test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedRulePatternTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Named Rule Pattern test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NamedRulePattern getFixture() {
		return (NamedRulePattern)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createNamedRulePattern());
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

} //NamedRulePatternTest
