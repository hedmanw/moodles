/**
 */
package HotelSystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Payment Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see HotelSystem.HotelSystemPackage#getPaymentMethod()
 * @model
 * @generated
 */
public enum PaymentMethod implements Enumerator {
	/**
	 * The '<em><b>Prepaid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREPAID_VALUE
	 * @generated
	 * @ordered
	 */
	PREPAID(0, "Prepaid", "Prepaid"),

	/**
	 * The '<em><b>Payoncheckout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYONCHECKOUT_VALUE
	 * @generated
	 * @ordered
	 */
	PAYONCHECKOUT(1, "Payoncheckout", "Payoncheckout");

	/**
	 * The '<em><b>Prepaid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prepaid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREPAID
	 * @model name="Prepaid"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Pre paid'"
	 * @generated
	 * @ordered
	 */
	public static final int PREPAID_VALUE = 0;

	/**
	 * The '<em><b>Payoncheckout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Payoncheckout</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAYONCHECKOUT
	 * @model name="Payoncheckout"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Pay on checkout'"
	 * @generated
	 * @ordered
	 */
	public static final int PAYONCHECKOUT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Payment Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PaymentMethod[] VALUES_ARRAY =
		new PaymentMethod[] {
			PREPAID,
			PAYONCHECKOUT,
		};

	/**
	 * A public read-only list of all the '<em><b>Payment Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PaymentMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Payment Method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PaymentMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaymentMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payment Method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PaymentMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaymentMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payment Method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PaymentMethod get(int value) {
		switch (value) {
			case PREPAID_VALUE: return PREPAID;
			case PAYONCHECKOUT_VALUE: return PAYONCHECKOUT;
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
	private PaymentMethod(int value, String name, String literal) {
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
	
} //PaymentMethod
