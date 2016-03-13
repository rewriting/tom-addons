/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.ConstraintOr;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Constraint Or</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintOrTest extends ConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConstraintOrTest.class);
	}

	/**
	 * Constructs a new Constraint Or test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintOrTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Constraint Or test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConstraintOr getFixture() {
		return (ConstraintOr)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createConstraintOr());
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

} //ConstraintOrTest
