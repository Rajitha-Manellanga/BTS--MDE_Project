/**
 */
package bts;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bts.Ticket#getTicket_id <em>Ticket id</em>}</li>
 *   <li>{@link bts.Ticket#getPrice <em>Price</em>}</li>
 *   <li>{@link bts.Ticket#getArrival_city <em>Arrival city</em>}</li>
 *   <li>{@link bts.Ticket#getDeparture_city <em>Departure city</em>}</li>
 *   <li>{@link bts.Ticket#getJourney_date <em>Journey date</em>}</li>
 *   <li>{@link bts.Ticket#getBooking_id <em>Booking id</em>}</li>
 * </ul>
 *
 * @see bts.btsPackage#getTicket()
 * @model
 * @generated
 */
public interface Ticket extends EObject {
	/**
	 * Returns the value of the '<em><b>Ticket id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ticket id</em>' attribute.
	 * @see #setTicket_id(String)
	 * @see bts.btsPackage#getTicket_Ticket_id()
	 * @model
	 * @generated
	 */
	String getTicket_id();

	/**
	 * Sets the value of the '{@link bts.Ticket#getTicket_id <em>Ticket id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ticket id</em>' attribute.
	 * @see #getTicket_id()
	 * @generated
	 */
	void setTicket_id(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see bts.btsPackage#getTicket_Price()
	 * @model required="true"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link bts.Ticket#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Arrival city</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival city</em>' attribute.
	 * @see #setArrival_city(String)
	 * @see bts.btsPackage#getTicket_Arrival_city()
	 * @model
	 * @generated
	 */
	String getArrival_city();

	/**
	 * Sets the value of the '{@link bts.Ticket#getArrival_city <em>Arrival city</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival city</em>' attribute.
	 * @see #getArrival_city()
	 * @generated
	 */
	void setArrival_city(String value);

	/**
	 * Returns the value of the '<em><b>Departure city</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure city</em>' attribute.
	 * @see #setDeparture_city(String)
	 * @see bts.btsPackage#getTicket_Departure_city()
	 * @model
	 * @generated
	 */
	String getDeparture_city();

	/**
	 * Sets the value of the '{@link bts.Ticket#getDeparture_city <em>Departure city</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure city</em>' attribute.
	 * @see #getDeparture_city()
	 * @generated
	 */
	void setDeparture_city(String value);

	/**
	 * Returns the value of the '<em><b>Journey date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey date</em>' attribute.
	 * @see #setJourney_date(Date)
	 * @see bts.btsPackage#getTicket_Journey_date()
	 * @model
	 * @generated
	 */
	Date getJourney_date();

	/**
	 * Sets the value of the '{@link bts.Ticket#getJourney_date <em>Journey date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey date</em>' attribute.
	 * @see #getJourney_date()
	 * @generated
	 */
	void setJourney_date(Date value);

	/**
	 * Returns the value of the '<em><b>Booking id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking id</em>' attribute.
	 * @see #setBooking_id(String)
	 * @see bts.btsPackage#getTicket_Booking_id()
	 * @model
	 * @generated
	 */
	String getBooking_id();

	/**
	 * Sets the value of the '{@link bts.Ticket#getBooking_id <em>Booking id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking id</em>' attribute.
	 * @see #getBooking_id()
	 * @generated
	 */
	void setBooking_id(String value);

} // Ticket
