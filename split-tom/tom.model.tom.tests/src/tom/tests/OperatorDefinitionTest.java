/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.OperatorDefinition;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operator Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatorDefinitionTest extends OperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OperatorDefinitionTest.class);
	}

	/**
	 * Constructs a new Operator Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Operator Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OperatorDefinition getFixture() {
		return (OperatorDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createOperatorDefinition());
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

} //OperatorDefinitionTest
