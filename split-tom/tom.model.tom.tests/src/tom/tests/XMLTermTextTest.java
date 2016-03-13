/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.TomFactory;
import tom.XMLTermText;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XML Term Text</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLTermTextTest extends XMLTermTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XMLTermTextTest.class);
	}

	/**
	 * Constructs a new XML Term Text test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLTermTextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this XML Term Text test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XMLTermText getFixture() {
		return (XMLTermText)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createXMLTermText());
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

} //XMLTermTextTest
