/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.HookModuleDefinition;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hook Module Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HookModuleDefinitionTest extends HookDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HookModuleDefinitionTest.class);
	}

	/**
	 * Constructs a new Hook Module Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HookModuleDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hook Module Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HookModuleDefinition getFixture() {
		return (HookModuleDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createHookModuleDefinition());
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

} //HookModuleDefinitionTest
