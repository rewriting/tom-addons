/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.TomFactory;
import tom.XMLTermSimple;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XML Term Simple</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLTermSimpleTest extends XMLTermTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XMLTermSimpleTest.class);
	}

	/**
	 * Constructs a new XML Term Simple test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLTermSimpleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this XML Term Simple test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XMLTermSimple getFixture() {
		return (XMLTermSimple)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createXMLTermSimple());
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

} //XMLTermSimpleTest
