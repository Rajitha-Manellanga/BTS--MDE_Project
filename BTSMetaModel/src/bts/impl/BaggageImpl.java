/**
 */
package bts.impl;

import bts.Baggage;
import bts.Booking;
import bts.btsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Baggage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bts.impl.BaggageImpl#getBaggage_tag <em>Baggage tag</em>}</li>
 *   <li>{@link bts.impl.BaggageImpl#getBaggage_id <em>Baggage id</em>}</li>
 *   <li>{@link bts.impl.BaggageImpl#getTicket_id <em>Ticket id</em>}</li>
 *   <li>{@link bts.impl.BaggageImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link bts.impl.BaggageImpl#getSeat_id <em>Seat id</em>}</li>
 *   <li>{@link bts.impl.BaggageImpl#getTotalBags <em>Total Bags</em>}</li>
 *   <li>{@link bts.impl.BaggageImpl#getBooking <em>Booking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaggageImpl extends MinimalEObjectImpl.Container implements Baggage {
	/**
	 * The default value of the '{@link #getBaggage_tag() <em>Baggage tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaggage_tag()
	 * @generated
	 * @ordered
	 */
	protected static final String BAGGAGE_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaggage_tag() <em>Baggage tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaggage_tag()
	 * @generated
	 * @ordered
	 */
	protected String baggage_tag = BAGGAGE_TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaggage_id() <em>Baggage id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaggage_id()
	 * @generated
	 * @ordered
	 */
	protected static final String BAGGAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaggage_id() <em>Baggage id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaggage_id()
	 * @generated
	 * @ordered
	 */
	protected String baggage_id = BAGGAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTicket_id() <em>Ticket id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicket_id()
	 * @generated
	 * @ordered
	 */
	protected static final char TICKET_ID_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getTicket_id() <em>Ticket id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicket_id()
	 * @generated
	 * @ordered
	 */
	protected char ticket_id = TICKET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected Integer weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeat_id() <em>Seat id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeat_id()
	 * @generated
	 * @ordered
	 */
	protected static final String SEAT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeat_id() <em>Seat id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeat_id()
	 * @generated
	 * @ordered
	 */
	protected String seat_id = SEAT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalBags() <em>Total Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBags()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOTAL_BAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalBags() <em>Total Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBags()
	 * @generated
	 * @ordered
	 */
	protected Integer totalBags = TOTAL_BAGS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBooking() <em>Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking()
	 * @generated
	 * @ordered
	 */
	protected Booking booking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaggageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return btsPackage.Literals.BAGGAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBaggage_tag() {
		return baggage_tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaggage_tag(String newBaggage_tag) {
		String oldBaggage_tag = baggage_tag;
		baggage_tag = newBaggage_tag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BAGGAGE__BAGGAGE_TAG, oldBaggage_tag, baggage_tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBaggage_id() {
		return baggage_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaggage_id(String newBaggage_id) {
		String oldBaggage_id = baggage_id;
		baggage_id = newBaggage_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BAGGAGE__BAGGAGE_ID, oldBaggage_id, baggage_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public char getTicket_id() {
		return ticket_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTicket_id(char newTicket_id) {
		char oldTicket_id = ticket_id;
		ticket_id = newTicket_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BAGGAGE__TICKET_ID, oldTicket_id, ticket_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(Integer newWeight) {
		Integer oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BAGGAGE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeat_id() {
		return seat_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeat_id(String newSeat_id) {
		String oldSeat_id = seat_id;
		seat_id = newSeat_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BAGGAGE__SEAT_ID, oldSeat_id, seat_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTotalBags() {
		return totalBags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalBags(Integer newTotalBags) {
		Integer oldTotalBags = totalBags;
		totalBags = newTotalBags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BAGGAGE__TOTAL_BAGS, oldTotalBags, totalBags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Booking getBooking() {
		if (booking != null && booking.eIsProxy()) {
			InternalEObject oldBooking = (InternalEObject)booking;
			booking = (Booking)eResolveProxy(oldBooking);
			if (booking != oldBooking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, btsPackage.BAGGAGE__BOOKING, oldBooking, booking));
			}
		}
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking basicGetBooking() {
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBooking(Booking newBooking) {
		Booking oldBooking = booking;
		booking = newBooking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BAGGAGE__BOOKING, oldBooking, booking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case btsPackage.BAGGAGE__BAGGAGE_TAG:
				return getBaggage_tag();
			case btsPackage.BAGGAGE__BAGGAGE_ID:
				return getBaggage_id();
			case btsPackage.BAGGAGE__TICKET_ID:
				return getTicket_id();
			case btsPackage.BAGGAGE__WEIGHT:
				return getWeight();
			case btsPackage.BAGGAGE__SEAT_ID:
				return getSeat_id();
			case btsPackage.BAGGAGE__TOTAL_BAGS:
				return getTotalBags();
			case btsPackage.BAGGAGE__BOOKING:
				if (resolve) return getBooking();
				return basicGetBooking();
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
			case btsPackage.BAGGAGE__BAGGAGE_TAG:
				setBaggage_tag((String)newValue);
				return;
			case btsPackage.BAGGAGE__BAGGAGE_ID:
				setBaggage_id((String)newValue);
				return;
			case btsPackage.BAGGAGE__TICKET_ID:
				setTicket_id((Character)newValue);
				return;
			case btsPackage.BAGGAGE__WEIGHT:
				setWeight((Integer)newValue);
				return;
			case btsPackage.BAGGAGE__SEAT_ID:
				setSeat_id((String)newValue);
				return;
			case btsPackage.BAGGAGE__TOTAL_BAGS:
				setTotalBags((Integer)newValue);
				return;
			case btsPackage.BAGGAGE__BOOKING:
				setBooking((Booking)newValue);
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
			case btsPackage.BAGGAGE__BAGGAGE_TAG:
				setBaggage_tag(BAGGAGE_TAG_EDEFAULT);
				return;
			case btsPackage.BAGGAGE__BAGGAGE_ID:
				setBaggage_id(BAGGAGE_ID_EDEFAULT);
				return;
			case btsPackage.BAGGAGE__TICKET_ID:
				setTicket_id(TICKET_ID_EDEFAULT);
				return;
			case btsPackage.BAGGAGE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case btsPackage.BAGGAGE__SEAT_ID:
				setSeat_id(SEAT_ID_EDEFAULT);
				return;
			case btsPackage.BAGGAGE__TOTAL_BAGS:
				setTotalBags(TOTAL_BAGS_EDEFAULT);
				return;
			case btsPackage.BAGGAGE__BOOKING:
				setBooking((Booking)null);
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
			case btsPackage.BAGGAGE__BAGGAGE_TAG:
				return BAGGAGE_TAG_EDEFAULT == null ? baggage_tag != null : !BAGGAGE_TAG_EDEFAULT.equals(baggage_tag);
			case btsPackage.BAGGAGE__BAGGAGE_ID:
				return BAGGAGE_ID_EDEFAULT == null ? baggage_id != null : !BAGGAGE_ID_EDEFAULT.equals(baggage_id);
			case btsPackage.BAGGAGE__TICKET_ID:
				return ticket_id != TICKET_ID_EDEFAULT;
			case btsPackage.BAGGAGE__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
			case btsPackage.BAGGAGE__SEAT_ID:
				return SEAT_ID_EDEFAULT == null ? seat_id != null : !SEAT_ID_EDEFAULT.equals(seat_id);
			case btsPackage.BAGGAGE__TOTAL_BAGS:
				return TOTAL_BAGS_EDEFAULT == null ? totalBags != null : !TOTAL_BAGS_EDEFAULT.equals(totalBags);
			case btsPackage.BAGGAGE__BOOKING:
				return booking != null;
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
		result.append(" (baggage_tag: ");
		result.append(baggage_tag);
		result.append(", baggage_id: ");
		result.append(baggage_id);
		result.append(", ticket_id: ");
		result.append(ticket_id);
		result.append(", weight: ");
		result.append(weight);
		result.append(", seat_id: ");
		result.append(seat_id);
		result.append(", totalBags: ");
		result.append(totalBags);
		result.append(')');
		return result.toString();
	}

} //BaggageImpl
