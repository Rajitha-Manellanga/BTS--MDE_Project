/**
 */
package bts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KIOSK</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bts.KIOSK#getBooking_id <em>Booking id</em>}</li>
 * </ul>
 *
 * @see bts.btsPackage#getKIOSK()
 * @model
 * @generated
 */
public interface KIOSK extends EObject {
	/**
	 * Returns the value of the '<em><b>Booking id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking id</em>' attribute.
	 * @see #setBooking_id(String)
	 * @see bts.btsPackage#getKIOSK_Booking_id()
	 * @model
	 * @generated
	 */
	String getBooking_id();

	/**
	 * Sets the value of the '{@link bts.KIOSK#getBooking_id <em>Booking id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking id</em>' attribute.
	 * @see #getBooking_id()
	 * @generated
	 */
	void setBooking_id(String value);

} // KIOSK
