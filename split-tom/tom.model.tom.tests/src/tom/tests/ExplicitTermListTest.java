/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.ExplicitTermList;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Explicit Term List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExplicitTermListTest extends ListTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExplicitTermListTest.class);
	}

	/**
	 * Constructs a new Explicit Term List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplicitTermListTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Explicit Term List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExplicitTermList getFixture() {
		return (ExplicitTermList)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createExplicitTermList());
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

} //ExplicitTermListTest
