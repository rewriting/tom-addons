/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.PlainPatternVariable;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Plain Pattern Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlainPatternVariableTest extends PatternTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlainPatternVariableTest.class);
	}

	/**
	 * Constructs a new Plain Pattern Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainPatternVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Plain Pattern Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PlainPatternVariable getFixture() {
		return (PlainPatternVariable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createPlainPatternVariable());
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

} //PlainPatternVariableTest
