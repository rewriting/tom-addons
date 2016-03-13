/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.HookTypeDefinition;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hook Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HookTypeDefinitionTest extends HookDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HookTypeDefinitionTest.class);
	}

	/**
	 * Constructs a new Hook Type Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HookTypeDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hook Type Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HookTypeDefinition getFixture() {
		return (HookTypeDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createHookTypeDefinition());
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

} //HookTypeDefinitionTest
