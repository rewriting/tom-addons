/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.Hook_Graphrules;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hook Graphrules</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hook_GraphrulesTest extends HookOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Hook_GraphrulesTest.class);
	}

	/**
	 * Constructs a new Hook Graphrules test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hook_GraphrulesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hook Graphrules test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Hook_Graphrules getFixture() {
		return (Hook_Graphrules)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createHook_Graphrules());
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

} //Hook_GraphrulesTest
