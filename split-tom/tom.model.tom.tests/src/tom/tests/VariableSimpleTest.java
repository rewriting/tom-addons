/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.TomFactory;
import tom.VariableSimple;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Variable Simple</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableSimpleTest extends LocalVariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VariableSimpleTest.class);
	}

	/**
	 * Constructs a new Variable Simple test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableSimpleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Variable Simple test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VariableSimple getFixture() {
		return (VariableSimple)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createVariableSimple());
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

} //VariableSimpleTest
