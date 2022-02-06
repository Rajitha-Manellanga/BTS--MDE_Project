/**
 */
package bts.impl;

import bts.Bus;
import bts.City;
import bts.Passenger;
import bts.Seat;
import bts.btsPackage;
import bts.point;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bts.impl.BusImpl#getBus_id <em>Bus id</em>}</li>
 *   <li>{@link bts.impl.BusImpl#getBus_stop <em>Bus stop</em>}</li>
 *   <li>{@link bts.impl.BusImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link bts.impl.BusImpl#getCity <em>City</em>}</li>
 *   <li>{@link bts.impl.BusImpl#getPassenger <em>Passenger</em>}</li>
 *   <li>{@link bts.impl.BusImpl#getSeat <em>Seat</em>}</li>
 *   <li>{@link bts.impl.BusImpl#getBookedseats <em>Bookedseats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusImpl extends MinimalEObjectImpl.Container implements Bus {
	/**
	 * The default value of the '{@link #getBus_id() <em>Bus id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus_id()
	 * @generated
	 * @ordered
	 */
	protected static final String BUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBus_id() <em>Bus id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus_id()
	 * @generated
	 * @ordered
	 */
	protected String bus_id = BUS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBus_stop() <em>Bus stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus_stop()
	 * @generated
	 * @ordered
	 */
	protected static final point BUS_STOP_EDEFAULT = point.DEPARTURE_POINT;

	/**
	 * The cached value of the '{@link #getBus_stop() <em>Bus stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus_stop()
	 * @generated
	 * @ordered
	 */
	protected point bus_stop = BUS_STOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected EList<City> city;

	/**
	 * The cached value of the '{@link #getPassenger() <em>Passenger</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassenger()
	 * @generated
	 * @ordered
	 */
	protected EList<Passenger> passenger;

	/**
	 * The cached value of the '{@link #getSeat() <em>Seat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeat()
	 * @generated
	 * @ordered
	 */
	protected EList<Seat> seat;

	/**
	 * The default value of the '{@link #getBookedseats() <em>Bookedseats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookedseats()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOKEDSEATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBookedseats() <em>Bookedseats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookedseats()
	 * @generated
	 * @ordered
	 */
	protected int bookedseats = BOOKEDSEATS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return btsPackage.Literals.BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBus_id() {
		return bus_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBus_id(String newBus_id) {
		String oldBus_id = bus_id;
		bus_id = newBus_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BUS__BUS_ID, oldBus_id, bus_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public point getBus_stop() {
		return bus_stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BUS__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<City> getCity() {
		if (city == null) {
			city = new EObjectResolvingEList<City>(City.class, this, btsPackage.BUS__CITY);
		}
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Passenger> getPassenger() {
		if (passenger == null) {
			passenger = new EObjectResolvingEList<Passenger>(Passenger.class, this, btsPackage.BUS__PASSENGER);
		}
		return passenger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Seat> getSeat() {
		if (seat == null) {
			seat = new EObjectContainmentEList<Seat>(Seat.class, this, btsPackage.BUS__SEAT);
		}
		return seat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBookedseats() {
		return bookedseats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBookedseats(int newBookedseats) {
		int oldBookedseats = bookedseats;
		bookedseats = newBookedseats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.BUS__BOOKEDSEATS, oldBookedseats, bookedseats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case btsPackage.BUS__SEAT:
				return ((InternalEList<?>)getSeat()).basicRemove(otherEnd, msgs);
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
			case btsPackage.BUS__BUS_ID:
				return getBus_id();
			case btsPackage.BUS__BUS_STOP:
				return getBus_stop();
			case btsPackage.BUS__CAPACITY:
				return getCapacity();
			case btsPackage.BUS__CITY:
				return getCity();
			case btsPackage.BUS__PASSENGER:
				return getPassenger();
			case btsPackage.BUS__SEAT:
				return getSeat();
			case btsPackage.BUS__BOOKEDSEATS:
				return getBookedseats();
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
			case btsPackage.BUS__BUS_ID:
				setBus_id((String)newValue);
				return;
			case btsPackage.BUS__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case btsPackage.BUS__CITY:
				getCity().clear();
				getCity().addAll((Collection<? extends City>)newValue);
				return;
			case btsPackage.BUS__PASSENGER:
				getPassenger().clear();
				getPassenger().addAll((Collection<? extends Passenger>)newValue);
				return;
			case btsPackage.BUS__SEAT:
				getSeat().clear();
				getSeat().addAll((Collection<? extends Seat>)newValue);
				return;
			case btsPackage.BUS__BOOKEDSEATS:
				setBookedseats((Integer)newValue);
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
			case btsPackage.BUS__BUS_ID:
				setBus_id(BUS_ID_EDEFAULT);
				return;
			case btsPackage.BUS__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case btsPackage.BUS__CITY:
				getCity().clear();
				return;
			case btsPackage.BUS__PASSENGER:
				getPassenger().clear();
				return;
			case btsPackage.BUS__SEAT:
				getSeat().clear();
				return;
			case btsPackage.BUS__BOOKEDSEATS:
				setBookedseats(BOOKEDSEATS_EDEFAULT);
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
			case btsPackage.BUS__BUS_ID:
				return BUS_ID_EDEFAULT == null ? bus_id != null : !BUS_ID_EDEFAULT.equals(bus_id);
			case btsPackage.BUS__BUS_STOP:
				return bus_stop != BUS_STOP_EDEFAULT;
			case btsPackage.BUS__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case btsPackage.BUS__CITY:
				return city != null && !city.isEmpty();
			case btsPackage.BUS__PASSENGER:
				return passenger != null && !passenger.isEmpty();
			case btsPackage.BUS__SEAT:
				return seat != null && !seat.isEmpty();
			case btsPackage.BUS__BOOKEDSEATS:
				return bookedseats != BOOKEDSEATS_EDEFAULT;
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
		result.append(" (bus_id: ");
		result.append(bus_id);
		result.append(", bus_stop: ");
		result.append(bus_stop);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(", bookedseats: ");
		result.append(bookedseats);
		result.append(')');
		return result.toString();
	}

} //BusImpl
