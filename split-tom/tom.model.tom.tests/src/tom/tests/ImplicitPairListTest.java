/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.ImplicitPairList;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Implicit Pair List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplicitPairListTest extends ListTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImplicitPairListTest.class);
	}

	/**
	 * Constructs a new Implicit Pair List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitPairListTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Implicit Pair List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImplicitPairList getFixture() {
		return (ImplicitPairList)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createImplicitPairList());
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

} //ImplicitPairListTest
