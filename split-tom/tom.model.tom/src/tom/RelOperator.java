/**
 */
package tom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rel Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tom.TomPackage#getRelOperator()
 * @model
 * @generated
 */
public enum RelOperator implements Enumerator {
	/**
	 * The '<em><b>Inf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INF_VALUE
	 * @generated
	 * @ordered
	 */
	INF(0, "inf", "inf"),

	/**
	 * The '<em><b>Infeg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFEG_VALUE
	 * @generated
	 * @ordered
	 */
	INFEG(1, "infeg", "infeg"),

	/**
	 * The '<em><b>Eg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EG_VALUE
	 * @generated
	 * @ordered
	 */
	EG(2, "eg", "eg"),

	/**
	 * The '<em><b>Supeg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPEG_VALUE
	 * @generated
	 * @ordered
	 */
	SUPEG(3, "supeg", "supeg"),

	/**
	 * The '<em><b>Sup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUP_VALUE
	 * @generated
	 * @ordered
	 */
	SUP(4, "sup", "sup"),

	/**
	 * The '<em><b>Neg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEG_VALUE
	 * @generated
	 * @ordered
	 */
	NEG(5, "neg", "neg");

	/**
	 * The '<em><b>Inf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INF
	 * @model name="inf"
	 * @generated
	 * @ordered
	 */
	public static final int INF_VALUE = 0;

	/**
	 * The '<em><b>Infeg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Infeg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFEG
	 * @model name="infeg"
	 * @generated
	 * @ordered
	 */
	public static final int INFEG_VALUE = 1;

	/**
	 * The '<em><b>Eg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EG
	 * @model name="eg"
	 * @generated
	 * @ordered
	 */
	public static final int EG_VALUE = 2;

	/**
	 * The '<em><b>Supeg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Supeg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPEG
	 * @model name="supeg"
	 * @generated
	 * @ordered
	 */
	public static final int SUPEG_VALUE = 3;

	/**
	 * The '<em><b>Sup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sup</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUP
	 * @model name="sup"
	 * @generated
	 * @ordered
	 */
	public static final int SUP_VALUE = 4;

	/**
	 * The '<em><b>Neg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Neg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEG
	 * @model name="neg"
	 * @generated
	 * @ordered
	 */
	public static final int NEG_VALUE = 5;

	/**
	 * An array of all the '<em><b>Rel Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelOperator[] VALUES_ARRAY =
		new RelOperator[] {
			INF,
			INFEG,
			EG,
			SUPEG,
			SUP,
			NEG,
		};

	/**
	 * A public read-only list of all the '<em><b>Rel Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rel Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rel Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rel Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelOperator get(int value) {
		switch (value) {
			case INF_VALUE: return INF;
			case INFEG_VALUE: return INFEG;
			case EG_VALUE: return EG;
			case SUPEG_VALUE: return SUPEG;
			case SUP_VALUE: return SUP;
			case NEG_VALUE: return NEG;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RelOperator(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RelOperator
