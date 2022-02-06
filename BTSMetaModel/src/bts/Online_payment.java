/**
 */
package bts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Online payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bts.Online_payment#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bts.btsPackage#getOnline_payment()
 * @model
 * @generated
 */
public interface Online_payment extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bts.Payment_method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bts.Payment_method
	 * @see #setType(Payment_method)
	 * @see bts.btsPackage#getOnline_payment_Type()
	 * @model
	 * @generated
	 */
	Payment_method getType();

	/**
	 * Sets the value of the '{@link bts.Online_payment#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bts.Payment_method
	 * @see #getType()
	 * @generated
	 */
	void setType(Payment_method value);

} // Online_payment
