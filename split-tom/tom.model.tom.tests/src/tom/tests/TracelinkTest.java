/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.TomFactory;
import tom.Tracelink;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tracelink</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TracelinkTest extends GlobalVariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TracelinkTest.class);
	}

	/**
	 * Constructs a new Tracelink test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracelinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tracelink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Tracelink getFixture() {
		return (Tracelink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createTracelink());
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

} //TracelinkTest
