/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.Hook_Make_Empty;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hook Make Empty</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hook_Make_EmptyTest extends HostHookOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Hook_Make_EmptyTest.class);
	}

	/**
	 * Constructs a new Hook Make Empty test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hook_Make_EmptyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hook Make Empty test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Hook_Make_Empty getFixture() {
		return (Hook_Make_Empty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createHook_Make_Empty());
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

} //Hook_Make_EmptyTest
