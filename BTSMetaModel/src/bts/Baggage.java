/**
 */
package bts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Baggage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bts.Baggage#getBaggage_tag <em>Baggage tag</em>}</li>
 *   <li>{@link bts.Baggage#getBaggage_id <em>Baggage id</em>}</li>
 *   <li>{@link bts.Baggage#getTicket_id <em>Ticket id</em>}</li>
 *   <li>{@link bts.Baggage#getWeight <em>Weight</em>}</li>
 *   <li>{@link bts.Baggage#getSeat_id <em>Seat id</em>}</li>
 *   <li>{@link bts.Baggage#getTotalBags <em>Total Bags</em>}</li>
 *   <li>{@link bts.Baggage#getBooking <em>Booking</em>}</li>
 * </ul>
 *
 * @see bts.btsPackage#getBaggage()
 * @model
 * @generated
 */
public interface Baggage extends EObject {
	/**
	 * Returns the value of the '<em><b>Baggage tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baggage tag</em>' attribute.
	 * @see #setBaggage_tag(String)
	 * @see bts.btsPackage#getBaggage_Baggage_tag()
	 * @model
	 * @generated
	 */
	String getBaggage_tag();

	/**
	 * Sets the value of the '{@link bts.Baggage#getBaggage_tag <em>Baggage tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baggage tag</em>' attribute.
	 * @see #getBaggage_tag()
	 * @generated
	 */
	void setBaggage_tag(String value);

	/**
	 * Returns the value of the '<em><b>Baggage id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baggage id</em>' attribute.
	 * @see #setBaggage_id(String)
	 * @see bts.btsPackage#getBaggage_Baggage_id()
	 * @model
	 * @generated
	 */
	String getBaggage_id();

	/**
	 * Sets the value of the '{@link bts.Baggage#getBaggage_id <em>Baggage id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baggage id</em>' attribute.
	 * @see #getBaggage_id()
	 * @generated
	 */
	void setBaggage_id(String value);

	/**
	 * Returns the value of the '<em><b>Ticket id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ticket id</em>' attribute.
	 * @see #setTicket_id(char)
	 * @see bts.btsPackage#getBaggage_Ticket_id()
	 * @model
	 * @generated
	 */
	char getTicket_id();

	/**
	 * Sets the value of the '{@link bts.Baggage#getTicket_id <em>Ticket id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ticket id</em>' attribute.
	 * @see #getTicket_id()
	 * @generated
	 */
	void setTicket_id(char value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(Integer)
	 * @see bts.btsPackage#getBaggage_Weight()
	 * @model required="true"
	 * @generated
	 */
	Integer getWeight();

	/**
	 * Sets the value of the '{@link bts.Baggage#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(Integer value);

	/**
	 * Returns the value of the '<em><b>Seat id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat id</em>' attribute.
	 * @see #setSeat_id(String)
	 * @see bts.btsPackage#getBaggage_Seat_id()
	 * @model
	 * @generated
	 */
	String getSeat_id();

	/**
	 * Sets the value of the '{@link bts.Baggage#getSeat_id <em>Seat id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat id</em>' attribute.
	 * @see #getSeat_id()
	 * @generated
	 */
	void setSeat_id(String value);

	/**
	 * Returns the value of the '<em><b>Total Bags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Bags</em>' attribute.
	 * @see #setTotalBags(Integer)
	 * @see bts.btsPackage#getBaggage_TotalBags()
	 * @model required="true"
	 * @generated
	 */
	Integer getTotalBags();

	/**
	 * Sets the value of the '{@link bts.Baggage#getTotalBags <em>Total Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Bags</em>' attribute.
	 * @see #getTotalBags()
	 * @generated
	 */
	void setTotalBags(Integer value);

	/**
	 * Returns the value of the '<em><b>Booking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking</em>' reference.
	 * @see #setBooking(Booking)
	 * @see bts.btsPackage#getBaggage_Booking()
	 * @model
	 * @generated
	 */
	Booking getBooking();

	/**
	 * Sets the value of the '{@link bts.Baggage#getBooking <em>Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking</em>' reference.
	 * @see #getBooking()
	 * @generated
	 */
	void setBooking(Booking value);

} // Baggage
