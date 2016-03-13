/**
 */
package tom.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tom.TomFactory;
import tom.XMLChilds;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XML Childs</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLChildsTest extends TestCase {

	/**
	 * The fixture for this XML Childs test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLChilds fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XMLChildsTest.class);
	}

	/**
	 * Constructs a new XML Childs test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLChildsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this XML Childs test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(XMLChilds fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this XML Childs test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLChilds getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createXMLChilds());
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

} //XMLChildsTest
