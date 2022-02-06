/**
 */
package bts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bts.Seat#getSeat_id <em>Seat id</em>}</li>
 *   <li>{@link bts.Seat#getBooking2 <em>Booking2</em>}</li>
 * </ul>
 *
 * @see bts.btsPackage#getSeat()
 * @model
 * @generated
 */
public interface Seat extends EObject {
	/**
	 * Returns the value of the '<em><b>Seat id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat id</em>' attribute.
	 * @see #setSeat_id(String)
	 * @see bts.btsPackage#getSeat_Seat_id()
	 * @model
	 * @generated
	 */
	String getSeat_id();

	/**
	 * Sets the value of the '{@link bts.Seat#getSeat_id <em>Seat id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat id</em>' attribute.
	 * @see #getSeat_id()
	 * @generated
	 */
	void setSeat_id(String value);

	/**
	 * Returns the value of the '<em><b>Booking2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bts.Booking#getSeat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking2</em>' reference.
	 * @see #setBooking2(Booking)
	 * @see bts.btsPackage#getSeat_Booking2()
	 * @see bts.Booking#getSeat
	 * @model opposite="seat" required="true"
	 * @generated
	 */
	Booking getBooking2();

	/**
	 * Sets the value of the '{@link bts.Seat#getBooking2 <em>Booking2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking2</em>' reference.
	 * @see #getBooking2()
	 * @generated
	 */
	void setBooking2(Booking value);

} // Seat
