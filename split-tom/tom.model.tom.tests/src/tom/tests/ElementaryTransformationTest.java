/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.ElementaryTransformation;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Elementary Transformation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementaryTransformationTest extends OperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ElementaryTransformationTest.class);
	}

	/**
	 * Constructs a new Elementary Transformation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryTransformationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Elementary Transformation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ElementaryTransformation getFixture() {
		return (ElementaryTransformation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createElementaryTransformation());
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

} //ElementaryTransformationTest
