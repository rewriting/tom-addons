/**
 */
package tom.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tom.TomFactory;
import tom.XMLAttribute;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XML Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLAttributeTest extends TestCase {

	/**
	 * The fixture for this XML Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLAttribute fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XMLAttributeTest.class);
	}

	/**
	 * Constructs a new XML Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLAttributeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this XML Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(XMLAttribute fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this XML Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLAttribute getFixture() {
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
		setFixture(TomFactory.eINSTANCE.createXMLAttribute());
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

} //XMLAttributeTest
