/**
 */
package bts.tests;

import bts.KIOSK;
import bts.btsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>KIOSK</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KIOSKTest extends TestCase {

	/**
	 * The fixture for this KIOSK test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KIOSK fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KIOSKTest.class);
	}

	/**
	 * Constructs a new KIOSK test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KIOSKTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this KIOSK test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(KIOSK fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this KIOSK test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KIOSK getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(btsFactory.eINSTANCE.createKIOSK());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //KIOSKTest
