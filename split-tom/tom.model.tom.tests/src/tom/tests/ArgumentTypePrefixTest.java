/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.ArgumentTypePrefix;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Argument Type Prefix</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentTypePrefixTest extends ArgumentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArgumentTypePrefixTest.class);
	}

	/**
	 * Constructs a new Argument Type Prefix test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentTypePrefixTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Argument Type Prefix test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArgumentTypePrefix getFixture() {
		return (ArgumentTypePrefix)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createArgumentTypePrefix());
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

} //ArgumentTypePrefixTest
