/**
 */
package bts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bts.Payment#getPayment_id <em>Payment id</em>}</li>
 * </ul>
 *
 * @see bts.btsPackage#getPayment()
 * @model
 * @generated
 */
public interface Payment extends Online_payment, KIOSK {
	/**
	 * Returns the value of the '<em><b>Payment id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment id</em>' attribute.
	 * @see #setPayment_id(String)
	 * @see bts.btsPackage#getPayment_Payment_id()
	 * @model
	 * @generated
	 */
	String getPayment_id();

	/**
	 * Sets the value of the '{@link bts.Payment#getPayment_id <em>Payment id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment id</em>' attribute.
	 * @see #getPayment_id()
	 * @generated
	 */
	void setPayment_id(String value);

} // Payment
