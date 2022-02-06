/**
 */
package bts;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passenger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bts.Passenger#getPassenger_id <em>Passenger id</em>}</li>
 *   <li>{@link bts.Passenger#getFisrt_name <em>Fisrt name</em>}</li>
 *   <li>{@link bts.Passenger#getLast_name <em>Last name</em>}</li>
 *   <li>{@link bts.Passenger#getEmail <em>Email</em>}</li>
 *   <li>{@link bts.Passenger#getPhone <em>Phone</em>}</li>
 *   <li>{@link bts.Passenger#getBooking <em>Booking</em>}</li>
 *   <li>{@link bts.Passenger#getBaggage <em>Baggage</em>}</li>
 * </ul>
 *
 * @see bts.btsPackage#getPassenger()
 * @model
 * @generated
 */
public interface Passenger extends EObject {
	/**
	 * Returns the value of the '<em><b>Passenger id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger id</em>' attribute.
	 * @see #setPassenger_id(String)
	 * @see bts.btsPackage#getPassenger_Passenger_id()
	 * @model
	 * @generated
	 */
	String getPassenger_id();

	/**
	 * Sets the value of the '{@link bts.Passenger#getPassenger_id <em>Passenger id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger id</em>' attribute.
	 * @see #getPassenger_id()
	 * @generated
	 */
	void setPassenger_id(String value);

	/**
	 * Returns the value of the '<em><b>Fisrt name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fisrt name</em>' attribute.
	 * @see #setFisrt_name(String)
	 * @see bts.btsPackage#getPassenger_Fisrt_name()
	 * @model
	 * @generated
	 */
	String getFisrt_name();

	/**
	 * Sets the value of the '{@link bts.Passenger#getFisrt_name <em>Fisrt name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fisrt name</em>' attribute.
	 * @see #getFisrt_name()
	 * @generated
	 */
	void setFisrt_name(String value);

	/**
	 * Returns the value of the '<em><b>Last name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last name</em>' attribute.
	 * @see #setLast_name(String)
	 * @see bts.btsPackage#getPassenger_Last_name()
	 * @model
	 * @generated
	 */
	String getLast_name();

	/**
	 * Sets the value of the '{@link bts.Passenger#getLast_name <em>Last name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last name</em>' attribute.
	 * @see #getLast_name()
	 * @generated
	 */
	void setLast_name(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see bts.btsPackage#getPassenger_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link bts.Passenger#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' attribute.
	 * @see #setPhone(BigInteger)
	 * @see bts.btsPackage#getPassenger_Phone()
	 * @model
	 * @generated
	 */
	BigInteger getPhone();

	/**
	 * Sets the value of the '{@link bts.Passenger#getPhone <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' attribute.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Booking</b></em>' containment reference list.
	 * The list contents are of type {@link bts.Booking}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking</em>' containment reference list.
	 * @see bts.btsPackage#getPassenger_Booking()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Booking> getBooking();

	/**
	 * Returns the value of the '<em><b>Baggage</b></em>' containment reference list.
	 * The list contents are of type {@link bts.Baggage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baggage</em>' containment reference list.
	 * @see bts.btsPackage#getPassenger_Baggage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Baggage> getBaggage();

} // Passenger
