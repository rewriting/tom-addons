/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.TomFactory;
import tom.XMLTermComment;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XML Term Comment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLTermCommentTest extends XMLTermTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XMLTermCommentTest.class);
	}

	/**
	 * Constructs a new XML Term Comment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLTermCommentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this XML Term Comment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XMLTermComment getFixture() {
		return (XMLTermComment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createXMLTermComment());
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

} //XMLTermCommentTest
