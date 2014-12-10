/**
 */
package HotelSystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Payment Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see HotelSystem.HotelSystemPackage#getPaymentMethod()
 * @model
 * @generated
 */
public final class PaymentMethod extends AbstractEnumerator {
	/**
	 * The '<em><b>Prepaid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prepaid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREPAID_LITERAL
	 * @model name="Prepaid"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Pre paid'"
	 * @generated
	 * @ordered
	 */
	public static final int PREPAID = 0;

	/**
	 * The '<em><b>Payoncheckout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Payoncheckout</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAYONCHECKOUT_LITERAL
	 * @model name="Payoncheckout"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Pay on checkout'"
	 * @generated
	 * @ordered
	 */
	public static final int PAYONCHECKOUT = 1;

	/**
	 * The '<em><b>Prepaid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREPAID
	 * @generated
	 * @ordered
	 */
	public static final PaymentMethod PREPAID_LITERAL = new PaymentMethod(PREPAID, "Prepaid", "Prepaid");

	/**
	 * The '<em><b>Payoncheckout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYONCHECKOUT
	 * @generated
	 * @ordered
	 */
	public static final PaymentMethod PAYONCHECKOUT_LITERAL = new PaymentMethod(PAYONCHECKOUT, "Payoncheckout", "Payoncheckout");

	/**
	 * An array of all the '<em><b>Payment Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PaymentMethod[] VALUES_ARRAY =
		new PaymentMethod[] {
			PREPAID_LITERAL,
			PAYONCHECKOUT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Payment Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
			case PREPAID: return PREPAID_LITERAL;
			case PAYONCHECKOUT: return PAYONCHECKOUT_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PaymentMethod(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PaymentMethod
