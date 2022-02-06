/**
 */
package bts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bts.Bus#getBus_id <em>Bus id</em>}</li>
 *   <li>{@link bts.Bus#getBus_stop <em>Bus stop</em>}</li>
 *   <li>{@link bts.Bus#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link bts.Bus#getCity <em>City</em>}</li>
 *   <li>{@link bts.Bus#getPassenger <em>Passenger</em>}</li>
 *   <li>{@link bts.Bus#getSeat <em>Seat</em>}</li>
 *   <li>{@link bts.Bus#getBookedseats <em>Bookedseats</em>}</li>
 * </ul>
 *
 * @see bts.btsPackage#getBus()
 * @model
 * @generated
 */
public interface Bus extends EObject {
	/**
	 * Returns the value of the '<em><b>Bus id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus id</em>' attribute.
	 * @see #setBus_id(String)
	 * @see bts.btsPackage#getBus_Bus_id()
	 * @model
	 * @generated
	 */
	String getBus_id();

	/**
	 * Sets the value of the '{@link bts.Bus#getBus_id <em>Bus id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus id</em>' attribute.
	 * @see #getBus_id()
	 * @generated
	 */
	void setBus_id(String value);

	/**
	 * Returns the value of the '<em><b>Bus stop</b></em>' attribute.
	 * The literals are from the enumeration {@link bts.point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus stop</em>' attribute.
	 * @see bts.point
	 * @see bts.btsPackage#getBus_Bus_stop()
	 * @model changeable="false"
	 * @generated
	 */
	point getBus_stop();

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see bts.btsPackage#getBus_Capacity()
	 * @model required="true"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link bts.Bus#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' reference list.
	 * The list contents are of type {@link bts.City}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' reference list.
	 * @see bts.btsPackage#getBus_City()
	 * @model
	 * @generated
	 */
	EList<City> getCity();

	/**
	 * Returns the value of the '<em><b>Passenger</b></em>' reference list.
	 * The list contents are of type {@link bts.Passenger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger</em>' reference list.
	 * @see bts.btsPackage#getBus_Passenger()
	 * @model
	 * @generated
	 */
	EList<Passenger> getPassenger();

	/**
	 * Returns the value of the '<em><b>Seat</b></em>' containment reference list.
	 * The list contents are of type {@link bts.Seat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat</em>' containment reference list.
	 * @see bts.btsPackage#getBus_Seat()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Seat> getSeat();

	/**
	 * Returns the value of the '<em><b>Bookedseats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookedseats</em>' attribute.
	 * @see #setBookedseats(int)
	 * @see bts.btsPackage#getBus_Bookedseats()
	 * @model required="true"
	 * @generated
	 */
	int getBookedseats();

	/**
	 * Sets the value of the '{@link bts.Bus#getBookedseats <em>Bookedseats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bookedseats</em>' attribute.
	 * @see #getBookedseats()
	 * @generated
	 */
	void setBookedseats(int value);

} // Bus
