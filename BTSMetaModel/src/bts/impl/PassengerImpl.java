/**
 */
package bts.impl;

import bts.Baggage;
import bts.Booking;
import bts.Passenger;
import bts.btsPackage;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passenger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bts.impl.PassengerImpl#getPassenger_id <em>Passenger id</em>}</li>
 *   <li>{@link bts.impl.PassengerImpl#getFisrt_name <em>Fisrt name</em>}</li>
 *   <li>{@link bts.impl.PassengerImpl#getLast_name <em>Last name</em>}</li>
 *   <li>{@link bts.impl.PassengerImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link bts.impl.PassengerImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link bts.impl.PassengerImpl#getBooking <em>Booking</em>}</li>
 *   <li>{@link bts.impl.PassengerImpl#getBaggage <em>Baggage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassengerImpl extends MinimalEObjectImpl.Container implements Passenger {
	/**
	 * The default value of the '{@link #getPassenger_id() <em>Passenger id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassenger_id()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSENGER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassenger_id() <em>Passenger id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassenger_id()
	 * @generated
	 * @ordered
	 */
	protected String passenger_id = PASSENGER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFisrt_name() <em>Fisrt name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFisrt_name()
	 * @generated
	 * @ordered
	 */
	protected static final String FISRT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFisrt_name() <em>Fisrt name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFisrt_name()
	 * @generated
	 * @ordered
	 */
	protected String fisrt_name = FISRT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLast_name() <em>Last name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_name()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLast_name() <em>Last name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_name()
	 * @generated
	 * @ordered
	 */
	protected String last_name = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected BigInteger phone = PHONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBooking() <em>Booking</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> booking;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return btsPackage.Literals.PASSENGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassenger_id() {
		return passenger_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassenger_id(String newPassenger_id) {
		String oldPassenger_id = passenger_id;
		passenger_id = newPassenger_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.PASSENGER__PASSENGER_ID, oldPassenger_id, passenger_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFisrt_name() {
		return fisrt_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFisrt_name(String newFisrt_name) {
		String oldFisrt_name = fisrt_name;
		fisrt_name = newFisrt_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.PASSENGER__FISRT_NAME, oldFisrt_name, fisrt_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLast_name() {
		return last_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLast_name(String newLast_name) {
		String oldLast_name = last_name;
		last_name = newLast_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.PASSENGER__LAST_NAME, oldLast_name, last_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.PASSENGER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhone(BigInteger newPhone) {
		BigInteger oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.PASSENGER__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Booking> getBooking() {
		if (booking == null) {
			booking = new EObjectContainmentEList<Booking>(Booking.class, this, btsPackage.PASSENGER__BOOKING);
		}
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Baggage> getBaggage() {
		if (baggage == null) {
			baggage = new EObjectContainmentEList<Baggage>(Baggage.class, this, btsPackage.PASSENGER__BAGGAGE);
		}
		return baggage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case btsPackage.PASSENGER__BOOKING:
				return ((InternalEList<?>)getBooking()).basicRemove(otherEnd, msgs);
			case btsPackage.PASSENGER__BAGGAGE:
				return ((InternalEList<?>)getBaggage()).basicRemove(otherEnd, msgs);
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
			case btsPackage.PASSENGER__PASSENGER_ID:
				return getPassenger_id();
			case btsPackage.PASSENGER__FISRT_NAME:
				return getFisrt_name();
			case btsPackage.PASSENGER__LAST_NAME:
				return getLast_name();
			case btsPackage.PASSENGER__EMAIL:
				return getEmail();
			case btsPackage.PASSENGER__PHONE:
				return getPhone();
			case btsPackage.PASSENGER__BOOKING:
				return getBooking();
			case btsPackage.PASSENGER__BAGGAGE:
				return getBaggage();
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
			case btsPackage.PASSENGER__PASSENGER_ID:
				setPassenger_id((String)newValue);
				return;
			case btsPackage.PASSENGER__FISRT_NAME:
				setFisrt_name((String)newValue);
				return;
			case btsPackage.PASSENGER__LAST_NAME:
				setLast_name((String)newValue);
				return;
			case btsPackage.PASSENGER__EMAIL:
				setEmail((String)newValue);
				return;
			case btsPackage.PASSENGER__PHONE:
				setPhone((BigInteger)newValue);
				return;
			case btsPackage.PASSENGER__BOOKING:
				getBooking().clear();
				getBooking().addAll((Collection<? extends Booking>)newValue);
				return;
			case btsPackage.PASSENGER__BAGGAGE:
				getBaggage().clear();
				getBaggage().addAll((Collection<? extends Baggage>)newValue);
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
			case btsPackage.PASSENGER__PASSENGER_ID:
				setPassenger_id(PASSENGER_ID_EDEFAULT);
				return;
			case btsPackage.PASSENGER__FISRT_NAME:
				setFisrt_name(FISRT_NAME_EDEFAULT);
				return;
			case btsPackage.PASSENGER__LAST_NAME:
				setLast_name(LAST_NAME_EDEFAULT);
				return;
			case btsPackage.PASSENGER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case btsPackage.PASSENGER__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
			case btsPackage.PASSENGER__BOOKING:
				getBooking().clear();
				return;
			case btsPackage.PASSENGER__BAGGAGE:
				getBaggage().clear();
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
			case btsPackage.PASSENGER__PASSENGER_ID:
				return PASSENGER_ID_EDEFAULT == null ? passenger_id != null : !PASSENGER_ID_EDEFAULT.equals(passenger_id);
			case btsPackage.PASSENGER__FISRT_NAME:
				return FISRT_NAME_EDEFAULT == null ? fisrt_name != null : !FISRT_NAME_EDEFAULT.equals(fisrt_name);
			case btsPackage.PASSENGER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? last_name != null : !LAST_NAME_EDEFAULT.equals(last_name);
			case btsPackage.PASSENGER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case btsPackage.PASSENGER__PHONE:
				return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
			case btsPackage.PASSENGER__BOOKING:
				return booking != null && !booking.isEmpty();
			case btsPackage.PASSENGER__BAGGAGE:
				return baggage != null && !baggage.isEmpty();
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
		result.append(" (passenger_id: ");
		result.append(passenger_id);
		result.append(", fisrt_name: ");
		result.append(fisrt_name);
		result.append(", last_name: ");
		result.append(last_name);
		result.append(", email: ");
		result.append(email);
		result.append(", phone: ");
		result.append(phone);
		result.append(')');
		return result.toString();
	}

} //PassengerImpl
