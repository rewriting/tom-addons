/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.TomFactory;
import tom.VisitAction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Visit Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisitActionTest extends ContextTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VisitActionTest.class);
	}

	/**
	 * Constructs a new Visit Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisitActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Visit Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VisitAction getFixture() {
		return (VisitAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createVisitAction());
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

} //VisitActionTest
