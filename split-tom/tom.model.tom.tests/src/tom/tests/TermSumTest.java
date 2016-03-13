/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.TermSum;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Term Sum</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermSumTest extends TermTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TermSumTest.class);
	}

	/**
	 * Constructs a new Term Sum test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermSumTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Term Sum test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TermSum getFixture() {
		return (TermSum)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createTermSum());
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

} //TermSumTest
