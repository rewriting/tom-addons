/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.TomFactory;
import tom.TypeTerm;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type Term</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeTermTest extends BlockTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypeTermTest.class);
	}

	/**
	 * Constructs a new Type Term test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTermTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Type Term test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TypeTerm getFixture() {
		return (TypeTerm)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createTypeTerm());
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

} //TypeTermTest
