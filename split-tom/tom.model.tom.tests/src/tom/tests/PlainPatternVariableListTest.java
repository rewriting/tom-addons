/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.PlainPatternVariableList;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Plain Pattern Variable List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlainPatternVariableListTest extends PatternTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlainPatternVariableListTest.class);
	}

	/**
	 * Constructs a new Plain Pattern Variable List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainPatternVariableListTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Plain Pattern Variable List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PlainPatternVariableList getFixture() {
		return (PlainPatternVariableList)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createPlainPatternVariableList());
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

} //PlainPatternVariableListTest
