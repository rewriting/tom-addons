/**
 */
package tom.tests;

import junit.textui.TestRunner;

import tom.TomFactory;
import tom.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeDefinitionTest extends TypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypeDefinitionTest.class);
	}

	/**
	 * Constructs a new Type Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Type Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TypeDefinition getFixture() {
		return (TypeDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TomFactory.eINSTANCE.createTypeDefinition());
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

} //TypeDefinitionTest
