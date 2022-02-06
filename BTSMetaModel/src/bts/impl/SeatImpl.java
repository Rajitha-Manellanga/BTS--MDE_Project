/**
 */
package bts.impl;

import bts.Booking;
import bts.Seat;
import bts.btsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bts.impl.SeatImpl#getSeat_id <em>Seat id</em>}</li>
 *   <li>{@link bts.impl.SeatImpl#getBooking2 <em>Booking2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeatImpl extends MinimalEObjectImpl.Container implements Seat {
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
	 * The cached value of the '{@link #getBooking2() <em>Booking2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking2()
	 * @generated
	 * @ordered
	 */
	protected Booking booking2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return btsPackage.Literals.SEAT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.SEAT__SEAT_ID, oldSeat_id, seat_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Booking getBooking2() {
		if (booking2 != null && booking2.eIsProxy()) {
			InternalEObject oldBooking2 = (InternalEObject)booking2;
			booking2 = (Booking)eResolveProxy(oldBooking2);
			if (booking2 != oldBooking2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, btsPackage.SEAT__BOOKING2, oldBooking2, booking2));
			}
		}
		return booking2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking basicGetBooking2() {
		return booking2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooking2(Booking newBooking2, NotificationChain msgs) {
		Booking oldBooking2 = booking2;
		booking2 = newBooking2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, btsPackage.SEAT__BOOKING2, oldBooking2, newBooking2);
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
	public void setBooking2(Booking newBooking2) {
		if (newBooking2 != booking2) {
			NotificationChain msgs = null;
			if (booking2 != null)
				msgs = ((InternalEObject)booking2).eInverseRemove(this, btsPackage.BOOKING__SEAT, Booking.class, msgs);
			if (newBooking2 != null)
				msgs = ((InternalEObject)newBooking2).eInverseAdd(this, btsPackage.BOOKING__SEAT, Booking.class, msgs);
			msgs = basicSetBooking2(newBooking2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.SEAT__BOOKING2, newBooking2, newBooking2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case btsPackage.SEAT__BOOKING2:
				if (booking2 != null)
					msgs = ((InternalEObject)booking2).eInverseRemove(this, btsPackage.BOOKING__SEAT, Booking.class, msgs);
				return basicSetBooking2((Booking)otherEnd, msgs);
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
			case btsPackage.SEAT__BOOKING2:
				return basicSetBooking2(null, msgs);
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
			case btsPackage.SEAT__SEAT_ID:
				return getSeat_id();
			case btsPackage.SEAT__BOOKING2:
				if (resolve) return getBooking2();
				return basicGetBooking2();
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
			case btsPackage.SEAT__SEAT_ID:
				setSeat_id((String)newValue);
				return;
			case btsPackage.SEAT__BOOKING2:
				setBooking2((Booking)newValue);
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
			case btsPackage.SEAT__SEAT_ID:
				setSeat_id(SEAT_ID_EDEFAULT);
				return;
			case btsPackage.SEAT__BOOKING2:
				setBooking2((Booking)null);
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
			case btsPackage.SEAT__SEAT_ID:
				return SEAT_ID_EDEFAULT == null ? seat_id != null : !SEAT_ID_EDEFAULT.equals(seat_id);
			case btsPackage.SEAT__BOOKING2:
				return booking2 != null;
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
		result.append(" (seat_id: ");
		result.append(seat_id);
		result.append(')');
		return result.toString();
	}

} //SeatImpl
