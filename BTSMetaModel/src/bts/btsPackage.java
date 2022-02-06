/**
 */
package bts;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bts.btsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface btsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bts";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:BTSMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BTSMetaModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	btsPackage eINSTANCE = bts.impl.btsPackageImpl.init();

	/**
	 * The meta object id for the '{@link bts.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bts.impl.CityImpl
	 * @see bts.impl.btsPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bus stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__BUS_STOP = 1;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bts.impl.SeatImpl <em>Seat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bts.impl.SeatImpl
	 * @see bts.impl.btsPackageImpl#getSeat()
	 * @generated
	 */
	int SEAT = 1;

	/**
	 * The feature id for the '<em><b>Seat id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__SEAT_ID = 0;

	/**
	 * The feature id for the '<em><b>Booking2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__BOOKING2 = 1;

	/**
	 * The number of structural features of the '<em>Seat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Seat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bts.impl.TicketImpl <em>Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bts.impl.TicketImpl
	 * @see bts.impl.btsPackageImpl#getTicket()
	 * @generated
	 */
	int TICKET = 2;

	/**
	 * The feature id for the '<em><b>Ticket id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET__TICKET_ID = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Arrival city</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET__ARRIVAL_CITY = 2;

	/**
	 * The feature id for the '<em><b>Departure city</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET__DEPARTURE_CITY = 3;

	/**
	 * The feature id for the '<em><b>Journey date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET__JOURNEY_DATE = 4;

	/**
	 * The feature id for the '<em><b>Booking id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET__BOOKING_ID = 5;

	/**
	 * The number of structural features of the '<em>Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bts.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bts.impl.BookingImpl
	 * @see bts.impl.btsPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 3;

	/**
	 * The feature id for the '<em><b>Booking id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_ID = 0;

	/**
	 * The feature id for the '<em><b>Payment date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PAYMENT_DATE = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Journey date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__JOURNEY_DATE = 3;

	/**
	 * The feature id for the '<em><b>Ticket</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__TICKET = 4;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PAYMENT = 5;

	/**
	 * The feature id for the '<em><b>Baggage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BAGGAGE = 6;

	/**
	 * The feature id for the '<em><b>Maximum Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__MAXIMUM_WEIGHT = 7;

	/**
	 * The feature id for the '<em><b>Total Available Bookings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__TOTAL_AVAILABLE_BOOKINGS = 8;

	/**
	 * The feature id for the '<em><b>Allowed Bags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ALLOWED_BAGS = 9;

	/**
	 * The feature id for the '<em><b>Seat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__SEAT = 10;

	/**
	 * The feature id for the '<em><b>Passenger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PASSENGER = 11;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Baggageweight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___BAGGAGEWEIGHT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Bag Allowance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___BAG_ALLOWANCE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link bts.impl.Online_paymentImpl <em>Online payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bts.impl.Online_paymentImpl
	 * @see bts.impl.btsPackageImpl#getOnline_payment()
	 * @generated
	 */
	int ONLINE_PAYMENT = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_PAYMENT__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Online payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_PAYMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Online payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_PAYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bts.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bts.impl.PaymentImpl
	 * @see bts.impl.btsPackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__TYPE = ONLINE_PAYMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Booking id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__BOOKING_ID = ONLINE_PAYMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payment id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_ID = ONLINE_PAYMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = ONLINE_PAYMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = ONLINE_PAYMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bts.impl.BaggageImpl <em>Baggage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bts.impl.BaggageImpl
	 * @see bts.impl.btsPackageImpl#getBaggage()
	 * @generated
	 */
	int BAGGAGE = 5;

	/**
	 * The feature id for the '<em><b>Baggage tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE__BAGGAGE_TAG = 0;

	/**
	 * The feature id for the '<em><b>Baggage id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE__BAGGAGE_ID = 1;

	/**
	 * The feature id for the '<em><b>Ticket id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE__TICKET_ID = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE__WEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Seat id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE__SEAT_ID = 4;

	/**
	 * The feature id for the '<em><b>Total Bags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE__TOTAL_BAGS = 5;

	/**
	 * The feature id for the '<em><b>Booking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE__BOOKING = 6;

	/**
	 * The number of structural features of the '<em>Baggage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Baggage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAGGAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bts.impl.PassengerImpl <em>Passenger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bts.impl.PassengerImpl
	 * @see bts.impl.btsPackageImpl#getPassenger()
	 * @generated
	 */
	int PASSENGER = 6;

	/**
	 * The feature id for the '<em><b>Passenger id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__PASSENGER_ID = 0;

	/**
	 * The feature id for the '<em><b>Fisrt name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__FISRT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__PHONE = 4;

	/**
	 * The feature id for the '<em><b>Booking</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__BOOKING = 5;

	/**
	 * The feature id for the '<em><b>Baggage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__BAGGAGE = 6;

	/**
	 * The number of structural features of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bts.impl.KIOSKImpl <em>KIOSK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bts.impl.KIOSKImpl
	 * @see bts.impl.btsPackageImpl#getKIOSK()
	 * @generated
	 */
	int KIOSK = 7;

	/**
	 * The feature id for the '<em><b>Booking id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK__BOOKING_ID = 0;

	/**
	 * The number of structural features of the '<em>KIOSK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>KIOSK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bts.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bts.impl.BusImpl
	 * @see bts.impl.btsPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 9;

	/**
	 * The feature id for the '<em><b>Bus id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BUS_ID = 0;

	/**
	 * The feature id for the '<em><b>Bus stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BUS_STOP = 1;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CAPACITY = 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CITY = 3;

	/**
	 * The feature id for the '<em><b>Passenger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__PASSENGER = 4;

	/**
	 * The feature id for the '<em><b>Seat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__SEAT = 5;

	/**
	 * The feature id for the '<em><b>Bookedseats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BOOKEDSEATS = 6;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bts.point <em>point</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bts.point
	 * @see bts.impl.btsPackageImpl#getpoint()
	 * @generated
	 */
	int POINT = 10;

	/**
	 * The meta object id for the '{@link bts.Payment_method <em>Payment method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bts.Payment_method
	 * @see bts.impl.btsPackageImpl#getPayment_method()
	 * @generated
	 */
	int PAYMENT_METHOD = 11;

	/**
	 * The meta object id for the '{@link bts.booking_status <em>booking status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bts.booking_status
	 * @see bts.impl.btsPackageImpl#getbooking_status()
	 * @generated
	 */
	int BOOKING_STATUS = 12;


	/**
	 * Returns the meta object for class '{@link bts.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see bts.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the attribute '{@link bts.City#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bts.City#getName()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Name();

	/**
	 * Returns the meta object for the attribute '{@link bts.City#getBus_stop <em>Bus stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus stop</em>'.
	 * @see bts.City#getBus_stop()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Bus_stop();

	/**
	 * Returns the meta object for class '{@link bts.Seat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seat</em>'.
	 * @see bts.Seat
	 * @generated
	 */
	EClass getSeat();

	/**
	 * Returns the meta object for the attribute '{@link bts.Seat#getSeat_id <em>Seat id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat id</em>'.
	 * @see bts.Seat#getSeat_id()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_Seat_id();

	/**
	 * Returns the meta object for the reference '{@link bts.Seat#getBooking2 <em>Booking2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking2</em>'.
	 * @see bts.Seat#getBooking2()
	 * @see #getSeat()
	 * @generated
	 */
	EReference getSeat_Booking2();

	/**
	 * Returns the meta object for class '{@link bts.Ticket <em>Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ticket</em>'.
	 * @see bts.Ticket
	 * @generated
	 */
	EClass getTicket();

	/**
	 * Returns the meta object for the attribute '{@link bts.Ticket#getTicket_id <em>Ticket id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ticket id</em>'.
	 * @see bts.Ticket#getTicket_id()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_Ticket_id();

	/**
	 * Returns the meta object for the attribute '{@link bts.Ticket#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see bts.Ticket#getPrice()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_Price();

	/**
	 * Returns the meta object for the attribute '{@link bts.Ticket#getArrival_city <em>Arrival city</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival city</em>'.
	 * @see bts.Ticket#getArrival_city()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_Arrival_city();

	/**
	 * Returns the meta object for the attribute '{@link bts.Ticket#getDeparture_city <em>Departure city</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departure city</em>'.
	 * @see bts.Ticket#getDeparture_city()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_Departure_city();

	/**
	 * Returns the meta object for the attribute '{@link bts.Ticket#getJourney_date <em>Journey date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey date</em>'.
	 * @see bts.Ticket#getJourney_date()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_Journey_date();

	/**
	 * Returns the meta object for the attribute '{@link bts.Ticket#getBooking_id <em>Booking id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking id</em>'.
	 * @see bts.Ticket#getBooking_id()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_Booking_id();

	/**
	 * Returns the meta object for class '{@link bts.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see bts.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link bts.Booking#getBooking_id <em>Booking id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking id</em>'.
	 * @see bts.Booking#getBooking_id()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Booking_id();

	/**
	 * Returns the meta object for the attribute '{@link bts.Booking#getPayment_date <em>Payment date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment date</em>'.
	 * @see bts.Booking#getPayment_date()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Payment_date();

	/**
	 * Returns the meta object for the attribute '{@link bts.Booking#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see bts.Booking#getStatus()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Status();

	/**
	 * Returns the meta object for the attribute '{@link bts.Booking#getJourney_date <em>Journey date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey date</em>'.
	 * @see bts.Booking#getJourney_date()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Journey_date();

	/**
	 * Returns the meta object for the containment reference '{@link bts.Booking#getTicket <em>Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ticket</em>'.
	 * @see bts.Booking#getTicket()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Ticket();

	/**
	 * Returns the meta object for the containment reference list '{@link bts.Booking#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Payment</em>'.
	 * @see bts.Booking#getPayment()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Payment();

	/**
	 * Returns the meta object for the containment reference list '{@link bts.Booking#getBaggage <em>Baggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Baggage</em>'.
	 * @see bts.Booking#getBaggage()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Baggage();

	/**
	 * Returns the meta object for the attribute '{@link bts.Booking#getMaximumWeight <em>Maximum Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Weight</em>'.
	 * @see bts.Booking#getMaximumWeight()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_MaximumWeight();

	/**
	 * Returns the meta object for the attribute '{@link bts.Booking#getTotalAvailableBookings <em>Total Available Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Available Bookings</em>'.
	 * @see bts.Booking#getTotalAvailableBookings()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_TotalAvailableBookings();

	/**
	 * Returns the meta object for the attribute '{@link bts.Booking#getAllowedBags <em>Allowed Bags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Bags</em>'.
	 * @see bts.Booking#getAllowedBags()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_AllowedBags();

	/**
	 * Returns the meta object for the reference '{@link bts.Booking#getSeat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seat</em>'.
	 * @see bts.Booking#getSeat()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Seat();

	/**
	 * Returns the meta object for the containment reference '{@link bts.Booking#getPassenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passenger</em>'.
	 * @see bts.Booking#getPassenger()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Passenger();

	/**
	 * Returns the meta object for the '{@link bts.Booking#baggageweight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Baggageweight</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Baggageweight</em>' operation.
	 * @see bts.Booking#baggageweight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBooking__Baggageweight__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link bts.Booking#bagAllowance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Bag Allowance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bag Allowance</em>' operation.
	 * @see bts.Booking#bagAllowance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBooking__BagAllowance__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link bts.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see bts.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link bts.Payment#getPayment_id <em>Payment id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment id</em>'.
	 * @see bts.Payment#getPayment_id()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Payment_id();

	/**
	 * Returns the meta object for class '{@link bts.Baggage <em>Baggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baggage</em>'.
	 * @see bts.Baggage
	 * @generated
	 */
	EClass getBaggage();

	/**
	 * Returns the meta object for the attribute '{@link bts.Baggage#getBaggage_tag <em>Baggage tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baggage tag</em>'.
	 * @see bts.Baggage#getBaggage_tag()
	 * @see #getBaggage()
	 * @generated
	 */
	EAttribute getBaggage_Baggage_tag();

	/**
	 * Returns the meta object for the attribute '{@link bts.Baggage#getBaggage_id <em>Baggage id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baggage id</em>'.
	 * @see bts.Baggage#getBaggage_id()
	 * @see #getBaggage()
	 * @generated
	 */
	EAttribute getBaggage_Baggage_id();

	/**
	 * Returns the meta object for the attribute '{@link bts.Baggage#getTicket_id <em>Ticket id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ticket id</em>'.
	 * @see bts.Baggage#getTicket_id()
	 * @see #getBaggage()
	 * @generated
	 */
	EAttribute getBaggage_Ticket_id();

	/**
	 * Returns the meta object for the attribute '{@link bts.Baggage#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see bts.Baggage#getWeight()
	 * @see #getBaggage()
	 * @generated
	 */
	EAttribute getBaggage_Weight();

	/**
	 * Returns the meta object for the attribute '{@link bts.Baggage#getSeat_id <em>Seat id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat id</em>'.
	 * @see bts.Baggage#getSeat_id()
	 * @see #getBaggage()
	 * @generated
	 */
	EAttribute getBaggage_Seat_id();

	/**
	 * Returns the meta object for the attribute '{@link bts.Baggage#getTotalBags <em>Total Bags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Bags</em>'.
	 * @see bts.Baggage#getTotalBags()
	 * @see #getBaggage()
	 * @generated
	 */
	EAttribute getBaggage_TotalBags();

	/**
	 * Returns the meta object for the reference '{@link bts.Baggage#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking</em>'.
	 * @see bts.Baggage#getBooking()
	 * @see #getBaggage()
	 * @generated
	 */
	EReference getBaggage_Booking();

	/**
	 * Returns the meta object for class '{@link bts.Passenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger</em>'.
	 * @see bts.Passenger
	 * @generated
	 */
	EClass getPassenger();

	/**
	 * Returns the meta object for the attribute '{@link bts.Passenger#getPassenger_id <em>Passenger id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger id</em>'.
	 * @see bts.Passenger#getPassenger_id()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Passenger_id();

	/**
	 * Returns the meta object for the attribute '{@link bts.Passenger#getFisrt_name <em>Fisrt name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fisrt name</em>'.
	 * @see bts.Passenger#getFisrt_name()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Fisrt_name();

	/**
	 * Returns the meta object for the attribute '{@link bts.Passenger#getLast_name <em>Last name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last name</em>'.
	 * @see bts.Passenger#getLast_name()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Last_name();

	/**
	 * Returns the meta object for the attribute '{@link bts.Passenger#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see bts.Passenger#getEmail()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Email();

	/**
	 * Returns the meta object for the attribute '{@link bts.Passenger#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see bts.Passenger#getPhone()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Phone();

	/**
	 * Returns the meta object for the containment reference list '{@link bts.Passenger#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Booking</em>'.
	 * @see bts.Passenger#getBooking()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_Booking();

	/**
	 * Returns the meta object for the containment reference list '{@link bts.Passenger#getBaggage <em>Baggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Baggage</em>'.
	 * @see bts.Passenger#getBaggage()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_Baggage();

	/**
	 * Returns the meta object for class '{@link bts.KIOSK <em>KIOSK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KIOSK</em>'.
	 * @see bts.KIOSK
	 * @generated
	 */
	EClass getKIOSK();

	/**
	 * Returns the meta object for the attribute '{@link bts.KIOSK#getBooking_id <em>Booking id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking id</em>'.
	 * @see bts.KIOSK#getBooking_id()
	 * @see #getKIOSK()
	 * @generated
	 */
	EAttribute getKIOSK_Booking_id();

	/**
	 * Returns the meta object for class '{@link bts.Online_payment <em>Online payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Online payment</em>'.
	 * @see bts.Online_payment
	 * @generated
	 */
	EClass getOnline_payment();

	/**
	 * Returns the meta object for the attribute '{@link bts.Online_payment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bts.Online_payment#getType()
	 * @see #getOnline_payment()
	 * @generated
	 */
	EAttribute getOnline_payment_Type();

	/**
	 * Returns the meta object for class '{@link bts.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see bts.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the attribute '{@link bts.Bus#getBus_id <em>Bus id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus id</em>'.
	 * @see bts.Bus#getBus_id()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_Bus_id();

	/**
	 * Returns the meta object for the attribute '{@link bts.Bus#getBus_stop <em>Bus stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus stop</em>'.
	 * @see bts.Bus#getBus_stop()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_Bus_stop();

	/**
	 * Returns the meta object for the attribute '{@link bts.Bus#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see bts.Bus#getCapacity()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_Capacity();

	/**
	 * Returns the meta object for the reference list '{@link bts.Bus#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>City</em>'.
	 * @see bts.Bus#getCity()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_City();

	/**
	 * Returns the meta object for the reference list '{@link bts.Bus#getPassenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passenger</em>'.
	 * @see bts.Bus#getPassenger()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Passenger();

	/**
	 * Returns the meta object for the containment reference list '{@link bts.Bus#getSeat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seat</em>'.
	 * @see bts.Bus#getSeat()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Seat();

	/**
	 * Returns the meta object for the attribute '{@link bts.Bus#getBookedseats <em>Bookedseats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bookedseats</em>'.
	 * @see bts.Bus#getBookedseats()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_Bookedseats();

	/**
	 * Returns the meta object for enum '{@link bts.point <em>point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>point</em>'.
	 * @see bts.point
	 * @generated
	 */
	EEnum getpoint();

	/**
	 * Returns the meta object for enum '{@link bts.Payment_method <em>Payment method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment method</em>'.
	 * @see bts.Payment_method
	 * @generated
	 */
	EEnum getPayment_method();

	/**
	 * Returns the meta object for enum '{@link bts.booking_status <em>booking status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>booking status</em>'.
	 * @see bts.booking_status
	 * @generated
	 */
	EEnum getbooking_status();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	btsFactory getbtsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bts.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bts.impl.CityImpl
		 * @see bts.impl.btsPackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__NAME = eINSTANCE.getCity_Name();

		/**
		 * The meta object literal for the '<em><b>Bus stop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__BUS_STOP = eINSTANCE.getCity_Bus_stop();

		/**
		 * The meta object literal for the '{@link bts.impl.SeatImpl <em>Seat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bts.impl.SeatImpl
		 * @see bts.impl.btsPackageImpl#getSeat()
		 * @generated
		 */
		EClass SEAT = eINSTANCE.getSeat();

		/**
		 * The meta object literal for the '<em><b>Seat id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__SEAT_ID = eINSTANCE.getSeat_Seat_id();

		/**
		 * The meta object literal for the '<em><b>Booking2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEAT__BOOKING2 = eINSTANCE.getSeat_Booking2();

		/**
		 * The meta object literal for the '{@link bts.impl.TicketImpl <em>Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bts.impl.TicketImpl
		 * @see bts.impl.btsPackageImpl#getTicket()
		 * @generated
		 */
		EClass TICKET = eINSTANCE.getTicket();

		/**
		 * The meta object literal for the '<em><b>Ticket id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKET__TICKET_ID = eINSTANCE.getTicket_Ticket_id();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKET__PRICE = eINSTANCE.getTicket_Price();

		/**
		 * The meta object literal for the '<em><b>Arrival city</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKET__ARRIVAL_CITY = eINSTANCE.getTicket_Arrival_city();

		/**
		 * The meta object literal for the '<em><b>Departure city</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKET__DEPARTURE_CITY = eINSTANCE.getTicket_Departure_city();

		/**
		 * The meta object literal for the '<em><b>Journey date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKET__JOURNEY_DATE = eINSTANCE.getTicket_Journey_date();

		/**
		 * The meta object literal for the '<em><b>Booking id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKET__BOOKING_ID = eINSTANCE.getTicket_Booking_id();

		/**
		 * The meta object literal for the '{@link bts.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bts.impl.BookingImpl
		 * @see bts.impl.btsPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Booking id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_ID = eINSTANCE.getBooking_Booking_id();

		/**
		 * The meta object literal for the '<em><b>Payment date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__PAYMENT_DATE = eINSTANCE.getBooking_Payment_date();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__STATUS = eINSTANCE.getBooking_Status();

		/**
		 * The meta object literal for the '<em><b>Journey date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__JOURNEY_DATE = eINSTANCE.getBooking_Journey_date();

		/**
		 * The meta object literal for the '<em><b>Ticket</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__TICKET = eINSTANCE.getBooking_Ticket();

		/**
		 * The meta object literal for the '<em><b>Payment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__PAYMENT = eINSTANCE.getBooking_Payment();

		/**
		 * The meta object literal for the '<em><b>Baggage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__BAGGAGE = eINSTANCE.getBooking_Baggage();

		/**
		 * The meta object literal for the '<em><b>Maximum Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__MAXIMUM_WEIGHT = eINSTANCE.getBooking_MaximumWeight();

		/**
		 * The meta object literal for the '<em><b>Total Available Bookings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__TOTAL_AVAILABLE_BOOKINGS = eINSTANCE.getBooking_TotalAvailableBookings();

		/**
		 * The meta object literal for the '<em><b>Allowed Bags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__ALLOWED_BAGS = eINSTANCE.getBooking_AllowedBags();

		/**
		 * The meta object literal for the '<em><b>Seat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__SEAT = eINSTANCE.getBooking_Seat();

		/**
		 * The meta object literal for the '<em><b>Passenger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__PASSENGER = eINSTANCE.getBooking_Passenger();

		/**
		 * The meta object literal for the '<em><b>Baggageweight</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___BAGGAGEWEIGHT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBooking__Baggageweight__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Bag Allowance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___BAG_ALLOWANCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBooking__BagAllowance__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link bts.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bts.impl.PaymentImpl
		 * @see bts.impl.btsPackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Payment id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_ID = eINSTANCE.getPayment_Payment_id();

		/**
		 * The meta object literal for the '{@link bts.impl.BaggageImpl <em>Baggage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bts.impl.BaggageImpl
		 * @see bts.impl.btsPackageImpl#getBaggage()
		 * @generated
		 */
		EClass BAGGAGE = eINSTANCE.getBaggage();

		/**
		 * The meta object literal for the '<em><b>Baggage tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAGGAGE__BAGGAGE_TAG = eINSTANCE.getBaggage_Baggage_tag();

		/**
		 * The meta object literal for the '<em><b>Baggage id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAGGAGE__BAGGAGE_ID = eINSTANCE.getBaggage_Baggage_id();

		/**
		 * The meta object literal for the '<em><b>Ticket id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAGGAGE__TICKET_ID = eINSTANCE.getBaggage_Ticket_id();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAGGAGE__WEIGHT = eINSTANCE.getBaggage_Weight();

		/**
		 * The meta object literal for the '<em><b>Seat id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAGGAGE__SEAT_ID = eINSTANCE.getBaggage_Seat_id();

		/**
		 * The meta object literal for the '<em><b>Total Bags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAGGAGE__TOTAL_BAGS = eINSTANCE.getBaggage_TotalBags();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAGGAGE__BOOKING = eINSTANCE.getBaggage_Booking();

		/**
		 * The meta object literal for the '{@link bts.impl.PassengerImpl <em>Passenger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bts.impl.PassengerImpl
		 * @see bts.impl.btsPackageImpl#getPassenger()
		 * @generated
		 */
		EClass PASSENGER = eINSTANCE.getPassenger();

		/**
		 * The meta object literal for the '<em><b>Passenger id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__PASSENGER_ID = eINSTANCE.getPassenger_Passenger_id();

		/**
		 * The meta object literal for the '<em><b>Fisrt name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__FISRT_NAME = eINSTANCE.getPassenger_Fisrt_name();

		/**
		 * The meta object literal for the '<em><b>Last name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__LAST_NAME = eINSTANCE.getPassenger_Last_name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__EMAIL = eINSTANCE.getPassenger_Email();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__PHONE = eINSTANCE.getPassenger_Phone();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER__BOOKING = eINSTANCE.getPassenger_Booking();

		/**
		 * The meta object literal for the '<em><b>Baggage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER__BAGGAGE = eINSTANCE.getPassenger_Baggage();

		/**
		 * The meta object literal for the '{@link bts.impl.KIOSKImpl <em>KIOSK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bts.impl.KIOSKImpl
		 * @see bts.impl.btsPackageImpl#getKIOSK()
		 * @generated
		 */
		EClass KIOSK = eINSTANCE.getKIOSK();

		/**
		 * The meta object literal for the '<em><b>Booking id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KIOSK__BOOKING_ID = eINSTANCE.getKIOSK_Booking_id();

		/**
		 * The meta object literal for the '{@link bts.impl.Online_paymentImpl <em>Online payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bts.impl.Online_paymentImpl
		 * @see bts.impl.btsPackageImpl#getOnline_payment()
		 * @generated
		 */
		EClass ONLINE_PAYMENT = eINSTANCE.getOnline_payment();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_PAYMENT__TYPE = eINSTANCE.getOnline_payment_Type();

		/**
		 * The meta object literal for the '{@link bts.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bts.impl.BusImpl
		 * @see bts.impl.btsPackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '<em><b>Bus id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__BUS_ID = eINSTANCE.getBus_Bus_id();

		/**
		 * The meta object literal for the '<em><b>Bus stop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__BUS_STOP = eINSTANCE.getBus_Bus_stop();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__CAPACITY = eINSTANCE.getBus_Capacity();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__CITY = eINSTANCE.getBus_City();

		/**
		 * The meta object literal for the '<em><b>Passenger</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__PASSENGER = eINSTANCE.getBus_Passenger();

		/**
		 * The meta object literal for the '<em><b>Seat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__SEAT = eINSTANCE.getBus_Seat();

		/**
		 * The meta object literal for the '<em><b>Bookedseats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__BOOKEDSEATS = eINSTANCE.getBus_Bookedseats();

		/**
		 * The meta object literal for the '{@link bts.point <em>point</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bts.point
		 * @see bts.impl.btsPackageImpl#getpoint()
		 * @generated
		 */
		EEnum POINT = eINSTANCE.getpoint();

		/**
		 * The meta object literal for the '{@link bts.Payment_method <em>Payment method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bts.Payment_method
		 * @see bts.impl.btsPackageImpl#getPayment_method()
		 * @generated
		 */
		EEnum PAYMENT_METHOD = eINSTANCE.getPayment_method();

		/**
		 * The meta object literal for the '{@link bts.booking_status <em>booking status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bts.booking_status
		 * @see bts.impl.btsPackageImpl#getbooking_status()
		 * @generated
		 */
		EEnum BOOKING_STATUS = eINSTANCE.getbooking_status();

	}

} //btsPackage
