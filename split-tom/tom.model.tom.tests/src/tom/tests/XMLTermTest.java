/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.TomFactory;
import tom.XMLTerm;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XML Term</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLTermTest extends PatternTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XMLTermTest.class);
	}

	/**
	 * Constructs a new XML Term test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLTermTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this XML Term test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XMLTerm getFixture() {
		return (XMLTerm)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createXMLTerm());
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

} //XMLTermTest
