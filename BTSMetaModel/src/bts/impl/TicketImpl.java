/**
 */
package bts.impl;

import bts.Ticket;
import bts.btsPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ticket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bts.impl.TicketImpl#getTicket_id <em>Ticket id</em>}</li>
 *   <li>{@link bts.impl.TicketImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link bts.impl.TicketImpl#getArrival_city <em>Arrival city</em>}</li>
 *   <li>{@link bts.impl.TicketImpl#getDeparture_city <em>Departure city</em>}</li>
 *   <li>{@link bts.impl.TicketImpl#getJourney_date <em>Journey date</em>}</li>
 *   <li>{@link bts.impl.TicketImpl#getBooking_id <em>Booking id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TicketImpl extends MinimalEObjectImpl.Container implements Ticket {
	/**
	 * The default value of the '{@link #getTicket_id() <em>Ticket id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicket_id()
	 * @generated
	 * @ordered
	 */
	protected static final String TICKET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTicket_id() <em>Ticket id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicket_id()
	 * @generated
	 * @ordered
	 */
	protected String ticket_id = TICKET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrival_city() <em>Arrival city</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrival_city()
	 * @generated
	 * @ordered
	 */
	protected static final String ARRIVAL_CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrival_city() <em>Arrival city</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrival_city()
	 * @generated
	 * @ordered
	 */
	protected String arrival_city = ARRIVAL_CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeparture_city() <em>Departure city</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeparture_city()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPARTURE_CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeparture_city() <em>Departure city</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeparture_city()
	 * @generated
	 * @ordered
	 */
	protected String departure_city = DEPARTURE_CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getJourney_date() <em>Journey date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourney_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date JOURNEY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJourney_date() <em>Journey date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourney_date()
	 * @generated
	 * @ordered
	 */
	protected Date journey_date = JOURNEY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBooking_id() <em>Booking id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking_id()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBooking_id() <em>Booking id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking_id()
	 * @generated
	 * @ordered
	 */
	protected String booking_id = BOOKING_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TicketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return btsPackage.Literals.TICKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTicket_id() {
		return ticket_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTicket_id(String newTicket_id) {
		String oldTicket_id = ticket_id;
		ticket_id = newTicket_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.TICKET__TICKET_ID, oldTicket_id, ticket_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.TICKET__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArrival_city() {
		return arrival_city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArrival_city(String newArrival_city) {
		String oldArrival_city = arrival_city;
		arrival_city = newArrival_city;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.TICKET__ARRIVAL_CITY, oldArrival_city, arrival_city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeparture_city() {
		return departure_city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeparture_city(String newDeparture_city) {
		String oldDeparture_city = departure_city;
		departure_city = newDeparture_city;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.TICKET__DEPARTURE_CITY, oldDeparture_city, departure_city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getJourney_date() {
		return journey_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJourney_date(Date newJourney_date) {
		Date oldJourney_date = journey_date;
		journey_date = newJourney_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.TICKET__JOURNEY_DATE, oldJourney_date, journey_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBooking_id() {
		return booking_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBooking_id(String newBooking_id) {
		String oldBooking_id = booking_id;
		booking_id = newBooking_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.TICKET__BOOKING_ID, oldBooking_id, booking_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case btsPackage.TICKET__TICKET_ID:
				return getTicket_id();
			case btsPackage.TICKET__PRICE:
				return getPrice();
			case btsPackage.TICKET__ARRIVAL_CITY:
				return getArrival_city();
			case btsPackage.TICKET__DEPARTURE_CITY:
				return getDeparture_city();
			case btsPackage.TICKET__JOURNEY_DATE:
				return getJourney_date();
			case btsPackage.TICKET__BOOKING_ID:
				return getBooking_id();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case btsPackage.TICKET__TICKET_ID:
				setTicket_id((String)newValue);
				return;
			case btsPackage.TICKET__PRICE:
				setPrice((Double)newValue);
				return;
			case btsPackage.TICKET__ARRIVAL_CITY:
				setArrival_city((String)newValue);
				return;
			case btsPackage.TICKET__DEPARTURE_CITY:
				setDeparture_city((String)newValue);
				return;
			case btsPackage.TICKET__JOURNEY_DATE:
				setJourney_date((Date)newValue);
				return;
			case btsPackage.TICKET__BOOKING_ID:
				setBooking_id((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case btsPackage.TICKET__TICKET_ID:
				setTicket_id(TICKET_ID_EDEFAULT);
				return;
			case btsPackage.TICKET__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case btsPackage.TICKET__ARRIVAL_CITY:
				setArrival_city(ARRIVAL_CITY_EDEFAULT);
				return;
			case btsPackage.TICKET__DEPARTURE_CITY:
				setDeparture_city(DEPARTURE_CITY_EDEFAULT);
				return;
			case btsPackage.TICKET__JOURNEY_DATE:
				setJourney_date(JOURNEY_DATE_EDEFAULT);
				return;
			case btsPackage.TICKET__BOOKING_ID:
				setBooking_id(BOOKING_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case btsPackage.TICKET__TICKET_ID:
				return TICKET_ID_EDEFAULT == null ? ticket_id != null : !TICKET_ID_EDEFAULT.equals(ticket_id);
			case btsPackage.TICKET__PRICE:
				return price != PRICE_EDEFAULT;
			case btsPackage.TICKET__ARRIVAL_CITY:
				return ARRIVAL_CITY_EDEFAULT == null ? arrival_city != null : !ARRIVAL_CITY_EDEFAULT.equals(arrival_city);
			case btsPackage.TICKET__DEPARTURE_CITY:
				return DEPARTURE_CITY_EDEFAULT == null ? departure_city != null : !DEPARTURE_CITY_EDEFAULT.equals(departure_city);
			case btsPackage.TICKET__JOURNEY_DATE:
				return JOURNEY_DATE_EDEFAULT == null ? journey_date != null : !JOURNEY_DATE_EDEFAULT.equals(journey_date);
			case btsPackage.TICKET__BOOKING_ID:
				return BOOKING_ID_EDEFAULT == null ? booking_id != null : !BOOKING_ID_EDEFAULT.equals(booking_id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ticket_id: ");
		result.append(ticket_id);
		result.append(", price: ");
		result.append(price);
		result.append(", arrival_city: ");
		result.append(arrival_city);
		result.append(", departure_city: ");
		result.append(departure_city);
		result.append(", journey_date: ");
		result.append(journey_date);
		result.append(", booking_id: ");
		result.append(booking_id);
		result.append(')');
		return result.toString();
	}

} //TicketImpl
