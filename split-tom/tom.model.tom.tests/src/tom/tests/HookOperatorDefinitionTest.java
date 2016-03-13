/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.HookOperatorDefinition;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hook Operator Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HookOperatorDefinitionTest extends HookDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HookOperatorDefinitionTest.class);
	}

	/**
	 * Constructs a new Hook Operator Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HookOperatorDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hook Operator Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HookOperatorDefinition getFixture() {
		return (HookOperatorDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createHookOperatorDefinition());
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

} //HookOperatorDefinitionTest
