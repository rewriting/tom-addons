/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.PlainPatternOperation;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Plain Pattern Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlainPatternOperationTest extends PatternTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlainPatternOperationTest.class);
	}

	/**
	 * Constructs a new Plain Pattern Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainPatternOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Plain Pattern Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PlainPatternOperation getFixture() {
		return (PlainPatternOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createPlainPatternOperation());
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

} //PlainPatternOperationTest
