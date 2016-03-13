/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.TermGraphVariable;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Term Graph Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermGraphVariableTest extends PlainTermGraphTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TermGraphVariableTest.class);
	}

	/**
	 * Constructs a new Term Graph Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermGraphVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Term Graph Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TermGraphVariable getFixture() {
		return (TermGraphVariable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createTermGraphVariable());
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

} //TermGraphVariableTest
