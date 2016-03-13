/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.PlainPatternConst;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Plain Pattern Const</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlainPatternConstTest extends PatternTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlainPatternConstTest.class);
	}

	/**
	 * Constructs a new Plain Pattern Const test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainPatternConstTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Plain Pattern Const test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PlainPatternConst getFixture() {
		return (PlainPatternConst)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createPlainPatternConst());
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

} //PlainPatternConstTest
