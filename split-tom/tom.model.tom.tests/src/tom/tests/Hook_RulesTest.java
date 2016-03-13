/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.Hook_Rules;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hook Rules</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hook_RulesTest extends HookOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Hook_RulesTest.class);
	}

	/**
	 * Constructs a new Hook Rules test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hook_RulesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hook Rules test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Hook_Rules getFixture() {
		return (Hook_Rules)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createHook_Rules());
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

} //Hook_RulesTest
