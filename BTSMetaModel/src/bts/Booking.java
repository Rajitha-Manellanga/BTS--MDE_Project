/**
 */
package bts;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bts.Booking#getBooking_id <em>Booking id</em>}</li>
 *   <li>{@link bts.Booking#getPayment_date <em>Payment date</em>}</li>
 *   <li>{@link bts.Booking#getStatus <em>Status</em>}</li>
 *   <li>{@link bts.Booking#getJourney_date <em>Journey date</em>}</li>
 *   <li>{@link bts.Booking#getTicket <em>Ticket</em>}</li>
 *   <li>{@link bts.Booking#getPayment <em>Payment</em>}</li>
 *   <li>{@link bts.Booking#getBaggage <em>Baggage</em>}</li>
 *   <li>{@link bts.Booking#getMaximumWeight <em>Maximum Weight</em>}</li>
 *   <li>{@link bts.Booking#getTotalAvailableBookings <em>Total Available Bookings</em>}</li>
 *   <li>{@link bts.Booking#getAllowedBags <em>Allowed Bags</em>}</li>
 *   <li>{@link bts.Booking#getSeat <em>Seat</em>}</li>
 *   <li>{@link bts.Booking#getPassenger <em>Passenger</em>}</li>
 * </ul>
 *
 * @see bts.btsPackage#getBooking()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='bagAllowance'"
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Booking id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking id</em>' attribute.
	 * @see #setBooking_id(String)
	 * @see bts.btsPackage#getBooking_Booking_id()
	 * @model
	 * @generated
	 */
	String getBooking_id();

	/**
	 * Sets the value of the '{@link bts.Booking#getBooking_id <em>Booking id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking id</em>' attribute.
	 * @see #getBooking_id()
	 * @generated
	 */
	void setBooking_id(String value);

	/**
	 * Returns the value of the '<em><b>Payment date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment date</em>' attribute.
	 * @see #setPayment_date(Date)
	 * @see bts.btsPackage#getBooking_Payment_date()
	 * @model
	 * @generated
	 */
	Date getPayment_date();

	/**
	 * Sets the value of the '{@link bts.Booking#getPayment_date <em>Payment date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment date</em>' attribute.
	 * @see #getPayment_date()
	 * @generated
	 */
	void setPayment_date(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link bts.booking_status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see bts.booking_status
	 * @see #setStatus(booking_status)
	 * @see bts.btsPackage#getBooking_Status()
	 * @model
	 * @generated
	 */
	booking_status getStatus();

	/**
	 * Sets the value of the '{@link bts.Booking#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see bts.booking_status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(booking_status value);

	/**
	 * Returns the value of the '<em><b>Journey date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey date</em>' attribute.
	 * @see #setJourney_date(Date)
	 * @see bts.btsPackage#getBooking_Journey_date()
	 * @model
	 * @generated
	 */
	Date getJourney_date();

	/**
	 * Sets the value of the '{@link bts.Booking#getJourney_date <em>Journey date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey date</em>' attribute.
	 * @see #getJourney_date()
	 * @generated
	 */
	void setJourney_date(Date value);

	/**
	 * Returns the value of the '<em><b>Ticket</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ticket</em>' containment reference.
	 * @see #setTicket(Ticket)
	 * @see bts.btsPackage#getBooking_Ticket()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Ticket getTicket();

	/**
	 * Sets the value of the '{@link bts.Booking#getTicket <em>Ticket</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ticket</em>' containment reference.
	 * @see #getTicket()
	 * @generated
	 */
	void setTicket(Ticket value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' containment reference list.
	 * The list contents are of type {@link bts.Payment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' containment reference list.
	 * @see bts.btsPackage#getBooking_Payment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Payment> getPayment();

	/**
	 * Returns the value of the '<em><b>Baggage</b></em>' containment reference list.
	 * The list contents are of type {@link bts.Baggage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baggage</em>' containment reference list.
	 * @see bts.btsPackage#getBooking_Baggage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Baggage> getBaggage();

	/**
	 * Returns the value of the '<em><b>Maximum Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Weight</em>' attribute.
	 * @see #setMaximumWeight(Integer)
	 * @see bts.btsPackage#getBooking_MaximumWeight()
	 * @model required="true"
	 * @generated
	 */
	Integer getMaximumWeight();

	/**
	 * Sets the value of the '{@link bts.Booking#getMaximumWeight <em>Maximum Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Weight</em>' attribute.
	 * @see #getMaximumWeight()
	 * @generated
	 */
	void setMaximumWeight(Integer value);

	/**
	 * Returns the value of the '<em><b>Total Available Bookings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Available Bookings</em>' attribute.
	 * @see #setTotalAvailableBookings(int)
	 * @see bts.btsPackage#getBooking_TotalAvailableBookings()
	 * @model required="true"
	 * @generated
	 */
	int getTotalAvailableBookings();

	/**
	 * Sets the value of the '{@link bts.Booking#getTotalAvailableBookings <em>Total Available Bookings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Available Bookings</em>' attribute.
	 * @see #getTotalAvailableBookings()
	 * @generated
	 */
	void setTotalAvailableBookings(int value);

	/**
	 * Returns the value of the '<em><b>Allowed Bags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Bags</em>' attribute.
	 * @see #setAllowedBags(Integer)
	 * @see bts.btsPackage#getBooking_AllowedBags()
	 * @model required="true"
	 * @generated
	 */
	Integer getAllowedBags();

	/**
	 * Sets the value of the '{@link bts.Booking#getAllowedBags <em>Allowed Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Bags</em>' attribute.
	 * @see #getAllowedBags()
	 * @generated
	 */
	void setAllowedBags(Integer value);

	/**
	 * Returns the value of the '<em><b>Seat</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bts.Seat#getBooking2 <em>Booking2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat</em>' reference.
	 * @see #setSeat(Seat)
	 * @see bts.btsPackage#getBooking_Seat()
	 * @see bts.Seat#getBooking2
	 * @model opposite="booking2" required="true"
	 * @generated
	 */
	Seat getSeat();

	/**
	 * Sets the value of the '{@link bts.Booking#getSeat <em>Seat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat</em>' reference.
	 * @see #getSeat()
	 * @generated
	 */
	void setSeat(Seat value);

	/**
	 * Returns the value of the '<em><b>Passenger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger</em>' containment reference.
	 * @see #setPassenger(Passenger)
	 * @see bts.btsPackage#getBooking_Passenger()
	 * @model containment="true"
	 * @generated
	 */
	Passenger getPassenger();

	/**
	 * Sets the value of the '{@link bts.Booking#getPassenger <em>Passenger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger</em>' containment reference.
	 * @see #getPassenger()
	 * @generated
	 */
	void setPassenger(Passenger value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='baggage.weight-&gt;select(baggage.Booking=self)-&gt; size() &lt;= maximumWeight'"
	 * @generated
	 */
	boolean baggageweight(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='baggage.totalBags-&gt;select(baggage.Booking=self)-&gt; size() &lt;= allowedBags'"
	 * @generated
	 */
	boolean bagAllowance(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Booking
