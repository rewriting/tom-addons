/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.IncludeConstruct;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Include Construct</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IncludeConstructTest extends BlockTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IncludeConstructTest.class);
	}

	/**
	 * Constructs a new Include Construct test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeConstructTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Include Construct test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IncludeConstruct getFixture() {
		return (IncludeConstruct)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createIncludeConstruct());
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

} //IncludeConstructTest
