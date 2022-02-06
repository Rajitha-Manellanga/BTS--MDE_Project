/**
 */
package bts.impl;

import bts.Baggage;
import bts.Booking;
import bts.Passenger;
import bts.Payment;
import bts.Seat;
import bts.Ticket;
import bts.booking_status;
import bts.btsPackage;
import bts.btsTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.UnboxedCompositionProperty;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bts.impl.BookingImpl#getBooking_id <em>Booking id</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getPayment_date <em>Payment date</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getJourney_date <em>Journey date</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getTicket <em>Ticket</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getBaggage <em>Baggage</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getMaximumWeight <em>Maximum Weight</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getTotalAvailableBookings <em>Total Available Bookings</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getAllowedBags <em>Allowed Bags</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getSeat <em>Seat</em>}</li>
 *   <li>{@link bts.impl.BookingImpl#getPassenger <em>Passenger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
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
	 * The default value of the '{@link #getPayment_date() <em>Payment date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date PAYMENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPayment_date() <em>Payment date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_date()
	 * @generated
	 * @ordered
	 */
	protected Date payment_date = PAYMENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final booking_status STATUS_EDEFAULT = booking_status.BOOKED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected booking_status status = STATUS_EDEFAULT;

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
	 * The cached value of the '{@link #getTicket() <em>Ticket</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicket()
	 * @generated
	 * @ordered
	 */
	protected Ticket ticket;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected EList<Payment> payment;

	/**
	 * The cached value of the '{@link #getBaggage() <em>Baggage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaggage()
	 * @generated
	 * @ordered
	 */
	protected EList<Baggage> baggage;

	/**
	 * The default value of the '{@link #getMaximumWeight() <em>Maximum Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumWeight() <em>Maximum Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumWeight()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumWeight = MAXIMUM_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalAvailableBookings() <em>Total Available Bookings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAvailableBookings()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_AVAILABLE_BOOKINGS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalAvailableBookings() <em>Total Available Bookings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAvailableBookings()
	 * @generated
	 * @ordered
	 */
	protected int totalAvailableBookings = TOTAL_AVAILABLE_BOOKINGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowedBags() <em>Allowed Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedBags()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ALLOWED_BAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowedBags() <em>Allowed Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedBags()
	 * @generated
	 * @ordered
	 */
	protected Integer allowedBags = ALLOWED_BAGS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeat() <em>Seat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeat()
	 * @generated
	 * @ordered
	 */
	protected Seat seat;

	/**
	 * The cached value of the '{@link #getPassenger() <em>Passenger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassenger()
	 * @generated
	 * @ordered
	 */
	protected Passenger passenger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return btsPackage.Literals.BOOKING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BOOKING__BOOKING_ID, oldBooking_id, booking_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPayment_date() {
		return payment_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayment_date(Date newPayment_date) {
		Date oldPayment_date = payment_date;
		payment_date = newPayment_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BOOKING__PAYMENT_DATE, oldPayment_date, payment_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public booking_status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(booking_status newStatus) {
		booking_status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BOOKING__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BOOKING__JOURNEY_DATE, oldJourney_date, journey_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ticket getTicket() {
		return ticket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTicket(Ticket newTicket, NotificationChain msgs) {
		Ticket oldTicket = ticket;
		ticket = newTicket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, btsPackage.BOOKING__TICKET, oldTicket, newTicket);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTicket(Ticket newTicket) {
		if (newTicket != ticket) {
			NotificationChain msgs = null;
			if (ticket != null)
				msgs = ((InternalEObject)ticket).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - btsPackage.BOOKING__TICKET, null, msgs);
			if (newTicket != null)
				msgs = ((InternalEObject)newTicket).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - btsPackage.BOOKING__TICKET, null, msgs);
			msgs = basicSetTicket(newTicket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BOOKING__TICKET, newTicket, newTicket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Payment> getPayment() {
		if (payment == null) {
			payment = new EObjectContainmentEList<Payment>(Payment.class, this, btsPackage.BOOKING__PAYMENT);
		}
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Baggage> getBaggage() {
		if (baggage == null) {
			baggage = new EObjectContainmentEList<Baggage>(Baggage.class, this, btsPackage.BOOKING__BAGGAGE);
		}
		return baggage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaximumWeight() {
		return maximumWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumWeight(Integer newMaximumWeight) {
		Integer oldMaximumWeight = maximumWeight;
		maximumWeight = newMaximumWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BOOKING__MAXIMUM_WEIGHT, oldMaximumWeight, maximumWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalAvailableBookings() {
		return totalAvailableBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalAvailableBookings(int newTotalAvailableBookings) {
		int oldTotalAvailableBookings = totalAvailableBookings;
		totalAvailableBookings = newTotalAvailableBookings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BOOKING__TOTAL_AVAILABLE_BOOKINGS, oldTotalAvailableBookings, totalAvailableBookings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAllowedBags() {
		return allowedBags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowedBags(Integer newAllowedBags) {
		Integer oldAllowedBags = allowedBags;
		allowedBags = newAllowedBags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BOOKING__ALLOWED_BAGS, oldAllowedBags, allowedBags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Seat getSeat() {
		if (seat != null && seat.eIsProxy()) {
			InternalEObject oldSeat = (InternalEObject)seat;
			seat = (Seat)eResolveProxy(oldSeat);
			if (seat != oldSeat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, btsPackage.BOOKING__SEAT, oldSeat, seat));
			}
		}
		return seat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seat basicGetSeat() {
		return seat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeat(Seat newSeat, NotificationChain msgs) {
		Seat oldSeat = seat;
		seat = newSeat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, btsPackage.BOOKING__SEAT, oldSeat, newSeat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeat(Seat newSeat) {
		if (newSeat != seat) {
			NotificationChain msgs = null;
			if (seat != null)
				msgs = ((InternalEObject)seat).eInverseRemove(this, btsPackage.SEAT__BOOKING2, Seat.class, msgs);
			if (newSeat != null)
				msgs = ((InternalEObject)newSeat).eInverseAdd(this, btsPackage.SEAT__BOOKING2, Seat.class, msgs);
			msgs = basicSetSeat(newSeat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BOOKING__SEAT, newSeat, newSeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Passenger getPassenger() {
		return passenger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassenger(Passenger newPassenger, NotificationChain msgs) {
		Passenger oldPassenger = passenger;
		passenger = newPassenger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, btsPackage.BOOKING__PASSENGER, oldPassenger, newPassenger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassenger(Passenger newPassenger) {
		if (newPassenger != passenger) {
			NotificationChain msgs = null;
			if (passenger != null)
				msgs = ((InternalEObject)passenger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - btsPackage.BOOKING__PASSENGER, null, msgs);
			if (newPassenger != null)
				msgs = ((InternalEObject)newPassenger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - btsPackage.BOOKING__PASSENGER, null, msgs);
			msgs = basicSetPassenger(newPassenger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BOOKING__PASSENGER, newPassenger, newPassenger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean baggageweight(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Booking::baggageweight";
		try {
			/**
			 *
			 * inv baggageweight:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = baggage.weight->select(
			 *           (baggage.Booking = self
			 *           ))
			 *         ->size() <= maximumWeight
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, btsPackage.Literals.BOOKING___BAGGAGEWEIGHT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, btsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Baggage> baggage = this.getBaggage();
					final /*@NonInvalid*/ OrderedSetValue BOXED_baggage = idResolver.createOrderedSetOfAll(btsTables.ORD_CLSSid_Baggage, baggage);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(btsTables.SEQ_DATAid_EIntegerObject);
					Iterator<Object> ITERATOR__1 = BOXED_baggage.iterator();
					/*@NonInvalid*/ SequenceValue collect;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							collect = accumulator;
							break;
						}
						/*@NonInvalid*/ Baggage _1 = (Baggage)ITERATOR__1.next();
						/**
						 * weight
						 */
						final /*@NonInvalid*/ Integer weight = _1.getWeight();
						final /*@NonInvalid*/ IntegerValue BOXED_weight = ValueUtil.integerValueOf(weight);
						//
						accumulator.add(BOXED_weight);
					}
					/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(btsTables.SEQ_DATAid_EIntegerObject);
					Iterator<Object> ITERATOR__1_1 = collect.iterator();
					/*@Thrown*/ SequenceValue select;
					while (true) {
						if (!ITERATOR__1_1.hasNext()) {
							select = accumulator_0;
							break;
						}
						/*@NonInvalid*/ IntegerValue _1_1 = (IntegerValue)ITERATOR__1_1.next();
						/**
						 * baggage.Booking = self
						 */
						/*@Thrown*/ Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(btsTables.SEQ_CLSSid_Booking);
						Iterator<Object> ITERATOR__1_0 = BOXED_baggage.iterator();
						/*@Thrown*/ SequenceValue collect_0;
						while (true) {
							if (!ITERATOR__1_0.hasNext()) {
								collect_0 = accumulator_1;
								break;
							}
							/*@NonInvalid*/ Baggage _1_0 = (Baggage)ITERATOR__1_0.next();
							/**
							 * Booking
							 */
							final /*@NonInvalid*/ UnboxedCompositionProperty IMPPROPid_baggage = new UnboxedCompositionProperty(btsTables.PROPid_baggage);
							final /*@NonInvalid*/ Booking Booking = (Booking)IMPPROPid_baggage.evaluate(executor, btsTables.CLSSid_Booking, _1_0);
							//
							accumulator_1.add(Booking);
						}
						final /*@Thrown*/ boolean eq = collect_0.equals(this);
						//
						if (eq == ValueUtil.TRUE_VALUE) {
							accumulator_0.add(_1_1);
						}
					}
					final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@NonInvalid*/ Integer maximumWeight = this.getMaximumWeight();
					final /*@NonInvalid*/ IntegerValue BOXED_maximumWeight = ValueUtil.integerValueOf(maximumWeight);
					final /*@Thrown*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, BOXED_maximumWeight).booleanValue();
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, btsTables.INT_0).booleanValue();
				symbol_0 = logDiagnostic;
			}
			return symbol_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean bagAllowance(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Booking::bagAllowance";
		try {
			/**
			 *
			 * inv bagAllowance:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = baggage.totalBags->select(
			 *           (baggage.Booking = self
			 *           ))
			 *         ->size() <= allowedBags
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, btsPackage.Literals.BOOKING___BAG_ALLOWANCE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, btsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Baggage> baggage = this.getBaggage();
					final /*@NonInvalid*/ OrderedSetValue BOXED_baggage = idResolver.createOrderedSetOfAll(btsTables.ORD_CLSSid_Baggage, baggage);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(btsTables.SEQ_DATAid_EIntegerObject);
					Iterator<Object> ITERATOR__1 = BOXED_baggage.iterator();
					/*@NonInvalid*/ SequenceValue collect;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							collect = accumulator;
							break;
						}
						/*@NonInvalid*/ Baggage _1 = (Baggage)ITERATOR__1.next();
						/**
						 * totalBags
						 */
						final /*@NonInvalid*/ Integer totalBags = _1.getTotalBags();
						final /*@NonInvalid*/ IntegerValue BOXED_totalBags = ValueUtil.integerValueOf(totalBags);
						//
						accumulator.add(BOXED_totalBags);
					}
					/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(btsTables.SEQ_DATAid_EIntegerObject);
					Iterator<Object> ITERATOR__1_1 = collect.iterator();
					/*@Thrown*/ SequenceValue select;
					while (true) {
						if (!ITERATOR__1_1.hasNext()) {
							select = accumulator_0;
							break;
						}
						/*@NonInvalid*/ IntegerValue _1_1 = (IntegerValue)ITERATOR__1_1.next();
						/**
						 * baggage.Booking = self
						 */
						/*@Thrown*/ Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(btsTables.SEQ_CLSSid_Booking);
						Iterator<Object> ITERATOR__1_0 = BOXED_baggage.iterator();
						/*@Thrown*/ SequenceValue collect_0;
						while (true) {
							if (!ITERATOR__1_0.hasNext()) {
								collect_0 = accumulator_1;
								break;
							}
							/*@NonInvalid*/ Baggage _1_0 = (Baggage)ITERATOR__1_0.next();
							/**
							 * Booking
							 */
							final /*@NonInvalid*/ UnboxedCompositionProperty IMPPROPid_baggage = new UnboxedCompositionProperty(btsTables.PROPid_baggage);
							final /*@NonInvalid*/ Booking Booking = (Booking)IMPPROPid_baggage.evaluate(executor, btsTables.CLSSid_Booking, _1_0);
							//
							accumulator_1.add(Booking);
						}
						final /*@Thrown*/ boolean eq = collect_0.equals(this);
						//
						if (eq == ValueUtil.TRUE_VALUE) {
							accumulator_0.add(_1_1);
						}
					}
					final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@NonInvalid*/ Integer allowedBags = this.getAllowedBags();
					final /*@NonInvalid*/ IntegerValue BOXED_allowedBags = ValueUtil.integerValueOf(allowedBags);
					final /*@Thrown*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, BOXED_allowedBags).booleanValue();
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, btsTables.INT_0).booleanValue();
				symbol_0 = logDiagnostic;
			}
			return symbol_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case btsPackage.BOOKING__SEAT:
				if (seat != null)
					msgs = ((InternalEObject)seat).eInverseRemove(this, btsPackage.SEAT__BOOKING2, Seat.class, msgs);
				return basicSetSeat((Seat)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case btsPackage.BOOKING__TICKET:
				return basicSetTicket(null, msgs);
			case btsPackage.BOOKING__PAYMENT:
				return ((InternalEList<?>)getPayment()).basicRemove(otherEnd, msgs);
			case btsPackage.BOOKING__BAGGAGE:
				return ((InternalEList<?>)getBaggage()).basicRemove(otherEnd, msgs);
			case btsPackage.BOOKING__SEAT:
				return basicSetSeat(null, msgs);
			case btsPackage.BOOKING__PASSENGER:
				return basicSetPassenger(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case btsPackage.BOOKING__BOOKING_ID:
				return getBooking_id();
			case btsPackage.BOOKING__PAYMENT_DATE:
				return getPayment_date();
			case btsPackage.BOOKING__STATUS:
				return getStatus();
			case btsPackage.BOOKING__JOURNEY_DATE:
				return getJourney_date();
			case btsPackage.BOOKING__TICKET:
				return getTicket();
			case btsPackage.BOOKING__PAYMENT:
				return getPayment();
			case btsPackage.BOOKING__BAGGAGE:
				return getBaggage();
			case btsPackage.BOOKING__MAXIMUM_WEIGHT:
				return getMaximumWeight();
			case btsPackage.BOOKING__TOTAL_AVAILABLE_BOOKINGS:
				return getTotalAvailableBookings();
			case btsPackage.BOOKING__ALLOWED_BAGS:
				return getAllowedBags();
			case btsPackage.BOOKING__SEAT:
				if (resolve) return getSeat();
				return basicGetSeat();
			case btsPackage.BOOKING__PASSENGER:
				return getPassenger();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case btsPackage.BOOKING__BOOKING_ID:
				setBooking_id((String)newValue);
				return;
			case btsPackage.BOOKING__PAYMENT_DATE:
				setPayment_date((Date)newValue);
				return;
			case btsPackage.BOOKING__STATUS:
				setStatus((booking_status)newValue);
				return;
			case btsPackage.BOOKING__JOURNEY_DATE:
				setJourney_date((Date)newValue);
				return;
			case btsPackage.BOOKING__TICKET:
				setTicket((Ticket)newValue);
				return;
			case btsPackage.BOOKING__PAYMENT:
				getPayment().clear();
				getPayment().addAll((Collection<? extends Payment>)newValue);
				return;
			case btsPackage.BOOKING__BAGGAGE:
				getBaggage().clear();
				getBaggage().addAll((Collection<? extends Baggage>)newValue);
				return;
			case btsPackage.BOOKING__MAXIMUM_WEIGHT:
				setMaximumWeight((Integer)newValue);
				return;
			case btsPackage.BOOKING__TOTAL_AVAILABLE_BOOKINGS:
				setTotalAvailableBookings((Integer)newValue);
				return;
			case btsPackage.BOOKING__ALLOWED_BAGS:
				setAllowedBags((Integer)newValue);
				return;
			case btsPackage.BOOKING__SEAT:
				setSeat((Seat)newValue);
				return;
			case btsPackage.BOOKING__PASSENGER:
				setPassenger((Passenger)newValue);
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
			case btsPackage.BOOKING__BOOKING_ID:
				setBooking_id(BOOKING_ID_EDEFAULT);
				return;
			case btsPackage.BOOKING__PAYMENT_DATE:
				setPayment_date(PAYMENT_DATE_EDEFAULT);
				return;
			case btsPackage.BOOKING__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case btsPackage.BOOKING__JOURNEY_DATE:
				setJourney_date(JOURNEY_DATE_EDEFAULT);
				return;
			case btsPackage.BOOKING__TICKET:
				setTicket((Ticket)null);
				return;
			case btsPackage.BOOKING__PAYMENT:
				getPayment().clear();
				return;
			case btsPackage.BOOKING__BAGGAGE:
				getBaggage().clear();
				return;
			case btsPackage.BOOKING__MAXIMUM_WEIGHT:
				setMaximumWeight(MAXIMUM_WEIGHT_EDEFAULT);
				return;
			case btsPackage.BOOKING__TOTAL_AVAILABLE_BOOKINGS:
				setTotalAvailableBookings(TOTAL_AVAILABLE_BOOKINGS_EDEFAULT);
				return;
			case btsPackage.BOOKING__ALLOWED_BAGS:
				setAllowedBags(ALLOWED_BAGS_EDEFAULT);
				return;
			case btsPackage.BOOKING__SEAT:
				setSeat((Seat)null);
				return;
			case btsPackage.BOOKING__PASSENGER:
				setPassenger((Passenger)null);
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
			case btsPackage.BOOKING__BOOKING_ID:
				return BOOKING_ID_EDEFAULT == null ? booking_id != null : !BOOKING_ID_EDEFAULT.equals(booking_id);
			case btsPackage.BOOKING__PAYMENT_DATE:
				return PAYMENT_DATE_EDEFAULT == null ? payment_date != null : !PAYMENT_DATE_EDEFAULT.equals(payment_date);
			case btsPackage.BOOKING__STATUS:
				return status != STATUS_EDEFAULT;
			case btsPackage.BOOKING__JOURNEY_DATE:
				return JOURNEY_DATE_EDEFAULT == null ? journey_date != null : !JOURNEY_DATE_EDEFAULT.equals(journey_date);
			case btsPackage.BOOKING__TICKET:
				return ticket != null;
			case btsPackage.BOOKING__PAYMENT:
				return payment != null && !payment.isEmpty();
			case btsPackage.BOOKING__BAGGAGE:
				return baggage != null && !baggage.isEmpty();
			case btsPackage.BOOKING__MAXIMUM_WEIGHT:
				return MAXIMUM_WEIGHT_EDEFAULT == null ? maximumWeight != null : !MAXIMUM_WEIGHT_EDEFAULT.equals(maximumWeight);
			case btsPackage.BOOKING__TOTAL_AVAILABLE_BOOKINGS:
				return totalAvailableBookings != TOTAL_AVAILABLE_BOOKINGS_EDEFAULT;
			case btsPackage.BOOKING__ALLOWED_BAGS:
				return ALLOWED_BAGS_EDEFAULT == null ? allowedBags != null : !ALLOWED_BAGS_EDEFAULT.equals(allowedBags);
			case btsPackage.BOOKING__SEAT:
				return seat != null;
			case btsPackage.BOOKING__PASSENGER:
				return passenger != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case btsPackage.BOOKING___BAGGAGEWEIGHT__DIAGNOSTICCHAIN_MAP:
				return baggageweight((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case btsPackage.BOOKING___BAG_ALLOWANCE__DIAGNOSTICCHAIN_MAP:
				return bagAllowance((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (booking_id: ");
		result.append(booking_id);
		result.append(", payment_date: ");
		result.append(payment_date);
		result.append(", status: ");
		result.append(status);
		result.append(", journey_date: ");
		result.append(journey_date);
		result.append(", maximumWeight: ");
		result.append(maximumWeight);
		result.append(", totalAvailableBookings: ");
		result.append(totalAvailableBookings);
		result.append(", allowedBags: ");
		result.append(allowedBags);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
