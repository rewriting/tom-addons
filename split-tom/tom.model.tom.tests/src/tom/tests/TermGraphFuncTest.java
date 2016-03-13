/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.TermGraphFunc;
import tom.TomFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Term Graph Func</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermGraphFuncTest extends PlainTermGraphTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TermGraphFuncTest.class);
	}

	/**
	 * Constructs a new Term Graph Func test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermGraphFuncTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Term Graph Func test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TermGraphFunc getFixture() {
		return (TermGraphFunc)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createTermGraphFunc());
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

} //TermGraphFuncTest
