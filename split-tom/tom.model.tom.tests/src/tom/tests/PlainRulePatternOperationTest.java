/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.PlainRulePatternOperation;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Plain Rule Pattern Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlainRulePatternOperationTest extends RulePatternTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlainRulePatternOperationTest.class);
	}

	/**
	 * Constructs a new Plain Rule Pattern Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainRulePatternOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Plain Rule Pattern Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PlainRulePatternOperation getFixture() {
		return (PlainRulePatternOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createPlainRulePatternOperation());
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

} //PlainRulePatternOperationTest
