/**
 */
package bts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Payment method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see bts.btsPackage#getPayment_method()
 * @model
 * @generated
 */
public enum Payment_method implements Enumerator {
	/**
	 * The '<em><b>Debit card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIT_CARD_VALUE
	 * @generated
	 * @ordered
	 */
	DEBIT_CARD(0, "debit_card", "debit_card"),

	/**
	 * The '<em><b>Credit card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREDIT_CARD_VALUE
	 * @generated
	 * @ordered
	 */
	CREDIT_CARD(1, "credit_card", "credit_card"),

	/**
	 * The '<em><b>Bank transfer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANK_TRANSFER_VALUE
	 * @generated
	 * @ordered
	 */
	BANK_TRANSFER(2, "bank_transfer", "bank_transfer");

	/**
	 * The '<em><b>Debit card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIT_CARD
	 * @model name="debit_card"
	 * @generated
	 * @ordered
	 */
	public static final int DEBIT_CARD_VALUE = 0;

	/**
	 * The '<em><b>Credit card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREDIT_CARD
	 * @model name="credit_card"
	 * @generated
	 * @ordered
	 */
	public static final int CREDIT_CARD_VALUE = 1;

	/**
	 * The '<em><b>Bank transfer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANK_TRANSFER
	 * @model name="bank_transfer"
	 * @generated
	 * @ordered
	 */
	public static final int BANK_TRANSFER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Payment method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Payment_method[] VALUES_ARRAY =
		new Payment_method[] {
			DEBIT_CARD,
			CREDIT_CARD,
			BANK_TRANSFER,
		};

	/**
	 * A public read-only list of all the '<em><b>Payment method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Payment_method> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Payment method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Payment_method get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Payment_method result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payment method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Payment_method getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Payment_method result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payment method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Payment_method get(int value) {
		switch (value) {
			case DEBIT_CARD_VALUE: return DEBIT_CARD;
			case CREDIT_CARD_VALUE: return CREDIT_CARD;
			case BANK_TRANSFER_VALUE: return BANK_TRANSFER;
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
	private Payment_method(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //Payment_method
