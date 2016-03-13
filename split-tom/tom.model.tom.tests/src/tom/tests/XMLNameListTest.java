/**
 */
package tom.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tom.TomFactory;
import tom.XMLNameList;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XML Name List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLNameListTest extends TestCase {

	/**
	 * The fixture for this XML Name List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLNameList fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XMLNameListTest.class);
	}

	/**
	 * Constructs a new XML Name List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLNameListTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this XML Name List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(XMLNameList fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this XML Name List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLNameList getFixture() {
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
		setFixture(TomFactory.eINSTANCE.createXMLNameList());
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

} //XMLNameListTest
