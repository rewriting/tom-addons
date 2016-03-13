/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.TomFactory;
import tom.XMLTermProcess;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XML Term Process</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLTermProcessTest extends XMLTermTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XMLTermProcessTest.class);
	}

	/**
	 * Constructs a new XML Term Process test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLTermProcessTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this XML Term Process test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XMLTermProcess getFixture() {
		return (XMLTermProcess)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createXMLTermProcess());
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

} //XMLTermProcessTest
