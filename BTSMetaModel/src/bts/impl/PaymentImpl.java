/**
 */
package bts.impl;

import bts.KIOSK;
import bts.Payment;
import bts.btsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bts.impl.PaymentImpl#getBooking_id <em>Booking id</em>}</li>
 *   <li>{@link bts.impl.PaymentImpl#getPayment_id <em>Payment id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentImpl extends Online_paymentImpl implements Payment {
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
	 * The default value of the '{@link #getPayment_id() <em>Payment id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_id()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPayment_id() <em>Payment id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_id()
	 * @generated
	 * @ordered
	 */
	protected String payment_id = PAYMENT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return btsPackage.Literals.PAYMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.PAYMENT__BOOKING_ID, oldBooking_id, booking_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPayment_id() {
		return payment_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayment_id(String newPayment_id) {
		String oldPayment_id = payment_id;
		payment_id = newPayment_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, btsPackage.PAYMENT__PAYMENT_ID, oldPayment_id, payment_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case btsPackage.PAYMENT__BOOKING_ID:
				return getBooking_id();
			case btsPackage.PAYMENT__PAYMENT_ID:
				return getPayment_id();
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
			case btsPackage.PAYMENT__BOOKING_ID:
				setBooking_id((String)newValue);
				return;
			case btsPackage.PAYMENT__PAYMENT_ID:
				setPayment_id((String)newValue);
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
			case btsPackage.PAYMENT__BOOKING_ID:
				setBooking_id(BOOKING_ID_EDEFAULT);
				return;
			case btsPackage.PAYMENT__PAYMENT_ID:
				setPayment_id(PAYMENT_ID_EDEFAULT);
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
			case btsPackage.PAYMENT__BOOKING_ID:
				return BOOKING_ID_EDEFAULT == null ? booking_id != null : !BOOKING_ID_EDEFAULT.equals(booking_id);
			case btsPackage.PAYMENT__PAYMENT_ID:
				return PAYMENT_ID_EDEFAULT == null ? payment_id != null : !PAYMENT_ID_EDEFAULT.equals(payment_id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == KIOSK.class) {
			switch (derivedFeatureID) {
				case btsPackage.PAYMENT__BOOKING_ID: return btsPackage.KIOSK__BOOKING_ID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == KIOSK.class) {
			switch (baseFeatureID) {
				case btsPackage.KIOSK__BOOKING_ID: return btsPackage.PAYMENT__BOOKING_ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", payment_id: ");
		result.append(payment_id);
		result.append(')');
		return result.toString();
	}

} //PaymentImpl
