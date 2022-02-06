/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /BTSMetaModel/bts.ecore
 * using:
 *   /BTSMetaModel/bts.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package bts;

// import bts.btsPackage;
// import bts.btsTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.PropertyId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * btsTables provides the dispatch tables for the bts for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class btsTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(btsPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_urn_c_BTSMetaModel = IdManager.getNsURIPackageId("urn:BTSMetaModel", null, btsPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Baggage = btsTables.PACKid_urn_c_BTSMetaModel.getClassId("Baggage", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Booking = btsTables.PACKid_urn_c_BTSMetaModel.getClassId("Booking", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Bus = btsTables.PACKid_urn_c_BTSMetaModel.getClassId("Bus", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_City = btsTables.PACKid_urn_c_BTSMetaModel.getClassId("City", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Passenger = btsTables.PACKid_urn_c_BTSMetaModel.getClassId("Passenger", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Payment = btsTables.PACKid_urn_c_BTSMetaModel.getClassId("Payment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Seat = btsTables.PACKid_urn_c_BTSMetaModel.getClassId("Seat", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Ticket = btsTables.PACKid_urn_c_BTSMetaModel.getClassId("Ticket", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EChar = btsTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EChar", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = btsTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDouble = btsTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = btsTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EIntegerObject = btsTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EIntegerObject", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Payment_method = btsTables.PACKid_urn_c_BTSMetaModel.getEnumerationId("Payment_method");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_booking_status = btsTables.PACKid_urn_c_BTSMetaModel.getEnumerationId("booking_status");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_point = btsTables.PACKid_urn_c_BTSMetaModel.getEnumerationId("point");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Baggage = TypeId.BAG.getSpecializedId(btsTables.CLSSid_Baggage);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Bus = TypeId.BAG.getSpecializedId(btsTables.CLSSid_Bus);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Baggage = TypeId.ORDERED_SET.getSpecializedId(btsTables.CLSSid_Baggage);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Booking = TypeId.ORDERED_SET.getSpecializedId(btsTables.CLSSid_Booking);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_City = TypeId.ORDERED_SET.getSpecializedId(btsTables.CLSSid_City);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Passenger = TypeId.ORDERED_SET.getSpecializedId(btsTables.CLSSid_Passenger);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Payment = TypeId.ORDERED_SET.getSpecializedId(btsTables.CLSSid_Payment);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Seat = TypeId.ORDERED_SET.getSpecializedId(btsTables.CLSSid_Seat);
	public static final /*@NonInvalid*/ PropertyId PROPid_baggage = btsTables.CLSSid_Booking.getPropertyId("baggage");
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Booking = TypeId.SEQUENCE.getSpecializedId(btsTables.CLSSid_Booking);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_DATAid_EIntegerObject = TypeId.SEQUENCE.getSpecializedId(btsTables.DATAid_EIntegerObject);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			btsTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of btsTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Baggage = new EcoreExecutorType(btsPackage.Literals.BAGGAGE, PACKAGE, 0);
		public static final EcoreExecutorType _Booking = new EcoreExecutorType(btsPackage.Literals.BOOKING, PACKAGE, 0);
		public static final EcoreExecutorType _Bus = new EcoreExecutorType(btsPackage.Literals.BUS, PACKAGE, 0);
		public static final EcoreExecutorType _City = new EcoreExecutorType(btsPackage.Literals.CITY, PACKAGE, 0);
		public static final EcoreExecutorType _KIOSK = new EcoreExecutorType(btsPackage.Literals.KIOSK, PACKAGE, 0);
		public static final EcoreExecutorType _Online_payment = new EcoreExecutorType(btsPackage.Literals.ONLINE_PAYMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Passenger = new EcoreExecutorType(btsPackage.Literals.PASSENGER, PACKAGE, 0);
		public static final EcoreExecutorType _Payment = new EcoreExecutorType(btsPackage.Literals.PAYMENT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Payment_method = new EcoreExecutorEnumeration(btsPackage.Literals.PAYMENT_METHOD, PACKAGE, 0);
		public static final EcoreExecutorType _Seat = new EcoreExecutorType(btsPackage.Literals.SEAT, PACKAGE, 0);
		public static final EcoreExecutorType _Ticket = new EcoreExecutorType(btsPackage.Literals.TICKET, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _booking_status = new EcoreExecutorEnumeration(btsPackage.Literals.BOOKING_STATUS, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _point = new EcoreExecutorEnumeration(btsPackage.Literals.POINT, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Baggage,
			_Booking,
			_Bus,
			_City,
			_KIOSK,
			_Online_payment,
			_Passenger,
			_Payment,
			_Payment_method,
			_Seat,
			_Ticket,
			_booking_status,
			_point
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of btsTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Baggage__Baggage = new ExecutorFragment(Types._Baggage, btsTables.Types._Baggage);
		private static final ExecutorFragment _Baggage__OclAny = new ExecutorFragment(Types._Baggage, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Baggage__OclElement = new ExecutorFragment(Types._Baggage, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Booking__Booking = new ExecutorFragment(Types._Booking, btsTables.Types._Booking);
		private static final ExecutorFragment _Booking__OclAny = new ExecutorFragment(Types._Booking, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Booking__OclElement = new ExecutorFragment(Types._Booking, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Bus__Bus = new ExecutorFragment(Types._Bus, btsTables.Types._Bus);
		private static final ExecutorFragment _Bus__OclAny = new ExecutorFragment(Types._Bus, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Bus__OclElement = new ExecutorFragment(Types._Bus, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _City__City = new ExecutorFragment(Types._City, btsTables.Types._City);
		private static final ExecutorFragment _City__OclAny = new ExecutorFragment(Types._City, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _City__OclElement = new ExecutorFragment(Types._City, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _KIOSK__KIOSK = new ExecutorFragment(Types._KIOSK, btsTables.Types._KIOSK);
		private static final ExecutorFragment _KIOSK__OclAny = new ExecutorFragment(Types._KIOSK, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _KIOSK__OclElement = new ExecutorFragment(Types._KIOSK, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Online_payment__OclAny = new ExecutorFragment(Types._Online_payment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Online_payment__OclElement = new ExecutorFragment(Types._Online_payment, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Online_payment__Online_payment = new ExecutorFragment(Types._Online_payment, btsTables.Types._Online_payment);

		private static final ExecutorFragment _Passenger__OclAny = new ExecutorFragment(Types._Passenger, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Passenger__OclElement = new ExecutorFragment(Types._Passenger, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Passenger__Passenger = new ExecutorFragment(Types._Passenger, btsTables.Types._Passenger);

		private static final ExecutorFragment _Payment__KIOSK = new ExecutorFragment(Types._Payment, btsTables.Types._KIOSK);
		private static final ExecutorFragment _Payment__OclAny = new ExecutorFragment(Types._Payment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Payment__OclElement = new ExecutorFragment(Types._Payment, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Payment__Online_payment = new ExecutorFragment(Types._Payment, btsTables.Types._Online_payment);
		private static final ExecutorFragment _Payment__Payment = new ExecutorFragment(Types._Payment, btsTables.Types._Payment);

		private static final ExecutorFragment _Payment_method__OclAny = new ExecutorFragment(Types._Payment_method, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Payment_method__OclElement = new ExecutorFragment(Types._Payment_method, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Payment_method__OclEnumeration = new ExecutorFragment(Types._Payment_method, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Payment_method__OclType = new ExecutorFragment(Types._Payment_method, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Payment_method__Payment_method = new ExecutorFragment(Types._Payment_method, btsTables.Types._Payment_method);

		private static final ExecutorFragment _Seat__OclAny = new ExecutorFragment(Types._Seat, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Seat__OclElement = new ExecutorFragment(Types._Seat, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Seat__Seat = new ExecutorFragment(Types._Seat, btsTables.Types._Seat);

		private static final ExecutorFragment _Ticket__OclAny = new ExecutorFragment(Types._Ticket, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Ticket__OclElement = new ExecutorFragment(Types._Ticket, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Ticket__Ticket = new ExecutorFragment(Types._Ticket, btsTables.Types._Ticket);

		private static final ExecutorFragment _booking_status__OclAny = new ExecutorFragment(Types._booking_status, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _booking_status__OclElement = new ExecutorFragment(Types._booking_status, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _booking_status__OclEnumeration = new ExecutorFragment(Types._booking_status, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _booking_status__OclType = new ExecutorFragment(Types._booking_status, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _booking_status__booking_status = new ExecutorFragment(Types._booking_status, btsTables.Types._booking_status);

		private static final ExecutorFragment _point__OclAny = new ExecutorFragment(Types._point, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _point__OclElement = new ExecutorFragment(Types._point, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _point__OclEnumeration = new ExecutorFragment(Types._point, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _point__OclType = new ExecutorFragment(Types._point, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _point__point = new ExecutorFragment(Types._point, btsTables.Types._point);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of btsTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of btsTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of btsTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Baggage__baggage_id = new EcoreExecutorProperty(btsPackage.Literals.BAGGAGE__BAGGAGE_ID, Types._Baggage, 0);
		public static final ExecutorProperty _Baggage__baggage_tag = new EcoreExecutorProperty(btsPackage.Literals.BAGGAGE__BAGGAGE_TAG, Types._Baggage, 1);
		public static final ExecutorProperty _Baggage__booking = new EcoreExecutorProperty(btsPackage.Literals.BAGGAGE__BOOKING, Types._Baggage, 2);
		public static final ExecutorProperty _Baggage__seat_id = new EcoreExecutorProperty(btsPackage.Literals.BAGGAGE__SEAT_ID, Types._Baggage, 3);
		public static final ExecutorProperty _Baggage__ticket_id = new EcoreExecutorProperty(btsPackage.Literals.BAGGAGE__TICKET_ID, Types._Baggage, 4);
		public static final ExecutorProperty _Baggage__totalBags = new EcoreExecutorProperty(btsPackage.Literals.BAGGAGE__TOTAL_BAGS, Types._Baggage, 5);
		public static final ExecutorProperty _Baggage__weight = new EcoreExecutorProperty(btsPackage.Literals.BAGGAGE__WEIGHT, Types._Baggage, 6);
		public static final ExecutorProperty _Baggage__Booking__baggage = new ExecutorPropertyWithImplementation("Booking", Types._Baggage, 7, new EcoreLibraryOppositeProperty(btsPackage.Literals.BOOKING__BAGGAGE));
		public static final ExecutorProperty _Baggage__Passenger__baggage = new ExecutorPropertyWithImplementation("Passenger", Types._Baggage, 8, new EcoreLibraryOppositeProperty(btsPackage.Literals.PASSENGER__BAGGAGE));

		public static final ExecutorProperty _Booking__allowedBags = new EcoreExecutorProperty(btsPackage.Literals.BOOKING__ALLOWED_BAGS, Types._Booking, 0);
		public static final ExecutorProperty _Booking__baggage = new EcoreExecutorProperty(btsPackage.Literals.BOOKING__BAGGAGE, Types._Booking, 1);
		public static final ExecutorProperty _Booking__booking_id = new EcoreExecutorProperty(btsPackage.Literals.BOOKING__BOOKING_ID, Types._Booking, 2);
		public static final ExecutorProperty _Booking__journey_date = new EcoreExecutorProperty(btsPackage.Literals.BOOKING__JOURNEY_DATE, Types._Booking, 3);
		public static final ExecutorProperty _Booking__maximumWeight = new EcoreExecutorProperty(btsPackage.Literals.BOOKING__MAXIMUM_WEIGHT, Types._Booking, 4);
		public static final ExecutorProperty _Booking__passenger = new EcoreExecutorProperty(btsPackage.Literals.BOOKING__PASSENGER, Types._Booking, 5);
		public static final ExecutorProperty _Booking__payment = new EcoreExecutorProperty(btsPackage.Literals.BOOKING__PAYMENT, Types._Booking, 6);
		public static final ExecutorProperty _Booking__payment_date = new EcoreExecutorProperty(btsPackage.Literals.BOOKING__PAYMENT_DATE, Types._Booking, 7);
		public static final ExecutorProperty _Booking__seat = new EcoreExecutorProperty(btsPackage.Literals.BOOKING__SEAT, Types._Booking, 8);
		public static final ExecutorProperty _Booking__status = new EcoreExecutorProperty(btsPackage.Literals.BOOKING__STATUS, Types._Booking, 9);
		public static final ExecutorProperty _Booking__ticket = new EcoreExecutorProperty(btsPackage.Literals.BOOKING__TICKET, Types._Booking, 10);
		public static final ExecutorProperty _Booking__totalAvailableBookings = new EcoreExecutorProperty(btsPackage.Literals.BOOKING__TOTAL_AVAILABLE_BOOKINGS, Types._Booking, 11);
		public static final ExecutorProperty _Booking__Baggage__booking = new ExecutorPropertyWithImplementation("Baggage", Types._Booking, 12, new EcoreLibraryOppositeProperty(btsPackage.Literals.BAGGAGE__BOOKING));
		public static final ExecutorProperty _Booking__Passenger__booking = new ExecutorPropertyWithImplementation("Passenger", Types._Booking, 13, new EcoreLibraryOppositeProperty(btsPackage.Literals.PASSENGER__BOOKING));

		public static final ExecutorProperty _Bus__bookedseats = new EcoreExecutorProperty(btsPackage.Literals.BUS__BOOKEDSEATS, Types._Bus, 0);
		public static final ExecutorProperty _Bus__bus_id = new EcoreExecutorProperty(btsPackage.Literals.BUS__BUS_ID, Types._Bus, 1);
		public static final ExecutorProperty _Bus__bus_stop = new EcoreExecutorProperty(btsPackage.Literals.BUS__BUS_STOP, Types._Bus, 2);
		public static final ExecutorProperty _Bus__capacity = new EcoreExecutorProperty(btsPackage.Literals.BUS__CAPACITY, Types._Bus, 3);
		public static final ExecutorProperty _Bus__city = new EcoreExecutorProperty(btsPackage.Literals.BUS__CITY, Types._Bus, 4);
		public static final ExecutorProperty _Bus__passenger = new EcoreExecutorProperty(btsPackage.Literals.BUS__PASSENGER, Types._Bus, 5);
		public static final ExecutorProperty _Bus__seat = new EcoreExecutorProperty(btsPackage.Literals.BUS__SEAT, Types._Bus, 6);

		public static final ExecutorProperty _City__bus_stop = new EcoreExecutorProperty(btsPackage.Literals.CITY__BUS_STOP, Types._City, 0);
		public static final ExecutorProperty _City__name = new EcoreExecutorProperty(btsPackage.Literals.CITY__NAME, Types._City, 1);
		public static final ExecutorProperty _City__Bus__city = new ExecutorPropertyWithImplementation("Bus", Types._City, 2, new EcoreLibraryOppositeProperty(btsPackage.Literals.BUS__CITY));

		public static final ExecutorProperty _KIOSK__booking_id = new EcoreExecutorProperty(btsPackage.Literals.KIOSK__BOOKING_ID, Types._KIOSK, 0);

		public static final ExecutorProperty _Online_payment__type = new EcoreExecutorProperty(btsPackage.Literals.ONLINE_PAYMENT__TYPE, Types._Online_payment, 0);

		public static final ExecutorProperty _Passenger__baggage = new EcoreExecutorProperty(btsPackage.Literals.PASSENGER__BAGGAGE, Types._Passenger, 0);
		public static final ExecutorProperty _Passenger__booking = new EcoreExecutorProperty(btsPackage.Literals.PASSENGER__BOOKING, Types._Passenger, 1);
		public static final ExecutorProperty _Passenger__email = new EcoreExecutorProperty(btsPackage.Literals.PASSENGER__EMAIL, Types._Passenger, 2);
		public static final ExecutorProperty _Passenger__fisrt_name = new EcoreExecutorProperty(btsPackage.Literals.PASSENGER__FISRT_NAME, Types._Passenger, 3);
		public static final ExecutorProperty _Passenger__last_name = new EcoreExecutorProperty(btsPackage.Literals.PASSENGER__LAST_NAME, Types._Passenger, 4);
		public static final ExecutorProperty _Passenger__passenger_id = new EcoreExecutorProperty(btsPackage.Literals.PASSENGER__PASSENGER_ID, Types._Passenger, 5);
		public static final ExecutorProperty _Passenger__phone = new EcoreExecutorProperty(btsPackage.Literals.PASSENGER__PHONE, Types._Passenger, 6);
		public static final ExecutorProperty _Passenger__Booking__passenger = new ExecutorPropertyWithImplementation("Booking", Types._Passenger, 7, new EcoreLibraryOppositeProperty(btsPackage.Literals.BOOKING__PASSENGER));
		public static final ExecutorProperty _Passenger__Bus__passenger = new ExecutorPropertyWithImplementation("Bus", Types._Passenger, 8, new EcoreLibraryOppositeProperty(btsPackage.Literals.BUS__PASSENGER));

		public static final ExecutorProperty _Payment__payment_id = new EcoreExecutorProperty(btsPackage.Literals.PAYMENT__PAYMENT_ID, Types._Payment, 0);
		public static final ExecutorProperty _Payment__Booking__payment = new ExecutorPropertyWithImplementation("Booking", Types._Payment, 1, new EcoreLibraryOppositeProperty(btsPackage.Literals.BOOKING__PAYMENT));

		public static final ExecutorProperty _Seat__booking2 = new EcoreExecutorProperty(btsPackage.Literals.SEAT__BOOKING2, Types._Seat, 0);
		public static final ExecutorProperty _Seat__seat_id = new EcoreExecutorProperty(btsPackage.Literals.SEAT__SEAT_ID, Types._Seat, 1);
		public static final ExecutorProperty _Seat__Bus__seat = new ExecutorPropertyWithImplementation("Bus", Types._Seat, 2, new EcoreLibraryOppositeProperty(btsPackage.Literals.BUS__SEAT));

		public static final ExecutorProperty _Ticket__arrival_city = new EcoreExecutorProperty(btsPackage.Literals.TICKET__ARRIVAL_CITY, Types._Ticket, 0);
		public static final ExecutorProperty _Ticket__booking_id = new EcoreExecutorProperty(btsPackage.Literals.TICKET__BOOKING_ID, Types._Ticket, 1);
		public static final ExecutorProperty _Ticket__departure_city = new EcoreExecutorProperty(btsPackage.Literals.TICKET__DEPARTURE_CITY, Types._Ticket, 2);
		public static final ExecutorProperty _Ticket__journey_date = new EcoreExecutorProperty(btsPackage.Literals.TICKET__JOURNEY_DATE, Types._Ticket, 3);
		public static final ExecutorProperty _Ticket__price = new EcoreExecutorProperty(btsPackage.Literals.TICKET__PRICE, Types._Ticket, 4);
		public static final ExecutorProperty _Ticket__ticket_id = new EcoreExecutorProperty(btsPackage.Literals.TICKET__TICKET_ID, Types._Ticket, 5);
		public static final ExecutorProperty _Ticket__Booking__ticket = new ExecutorPropertyWithImplementation("Booking", Types._Ticket, 6, new EcoreLibraryOppositeProperty(btsPackage.Literals.BOOKING__TICKET));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of btsTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Baggage =
			{
				Fragments._Baggage__OclAny /* 0 */,
				Fragments._Baggage__OclElement /* 1 */,
				Fragments._Baggage__Baggage /* 2 */
			};
		private static final int /*@NonNull*/ [] __Baggage = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Booking =
			{
				Fragments._Booking__OclAny /* 0 */,
				Fragments._Booking__OclElement /* 1 */,
				Fragments._Booking__Booking /* 2 */
			};
		private static final int /*@NonNull*/ [] __Booking = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Bus =
			{
				Fragments._Bus__OclAny /* 0 */,
				Fragments._Bus__OclElement /* 1 */,
				Fragments._Bus__Bus /* 2 */
			};
		private static final int /*@NonNull*/ [] __Bus = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _City =
			{
				Fragments._City__OclAny /* 0 */,
				Fragments._City__OclElement /* 1 */,
				Fragments._City__City /* 2 */
			};
		private static final int /*@NonNull*/ [] __City = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _KIOSK =
			{
				Fragments._KIOSK__OclAny /* 0 */,
				Fragments._KIOSK__OclElement /* 1 */,
				Fragments._KIOSK__KIOSK /* 2 */
			};
		private static final int /*@NonNull*/ [] __KIOSK = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Online_payment =
			{
				Fragments._Online_payment__OclAny /* 0 */,
				Fragments._Online_payment__OclElement /* 1 */,
				Fragments._Online_payment__Online_payment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Online_payment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Passenger =
			{
				Fragments._Passenger__OclAny /* 0 */,
				Fragments._Passenger__OclElement /* 1 */,
				Fragments._Passenger__Passenger /* 2 */
			};
		private static final int /*@NonNull*/ [] __Passenger = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Payment =
			{
				Fragments._Payment__OclAny /* 0 */,
				Fragments._Payment__OclElement /* 1 */,
				Fragments._Payment__KIOSK /* 2 */,
				Fragments._Payment__Online_payment /* 2 */,
				Fragments._Payment__Payment /* 3 */
			};
		private static final int /*@NonNull*/ [] __Payment = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Payment_method =
			{
				Fragments._Payment_method__OclAny /* 0 */,
				Fragments._Payment_method__OclElement /* 1 */,
				Fragments._Payment_method__OclType /* 2 */,
				Fragments._Payment_method__OclEnumeration /* 3 */,
				Fragments._Payment_method__Payment_method /* 4 */
			};
		private static final int /*@NonNull*/ [] __Payment_method = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Seat =
			{
				Fragments._Seat__OclAny /* 0 */,
				Fragments._Seat__OclElement /* 1 */,
				Fragments._Seat__Seat /* 2 */
			};
		private static final int /*@NonNull*/ [] __Seat = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Ticket =
			{
				Fragments._Ticket__OclAny /* 0 */,
				Fragments._Ticket__OclElement /* 1 */,
				Fragments._Ticket__Ticket /* 2 */
			};
		private static final int /*@NonNull*/ [] __Ticket = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _booking_status =
			{
				Fragments._booking_status__OclAny /* 0 */,
				Fragments._booking_status__OclElement /* 1 */,
				Fragments._booking_status__OclType /* 2 */,
				Fragments._booking_status__OclEnumeration /* 3 */,
				Fragments._booking_status__booking_status /* 4 */
			};
		private static final int /*@NonNull*/ [] __booking_status = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _point =
			{
				Fragments._point__OclAny /* 0 */,
				Fragments._point__OclElement /* 1 */,
				Fragments._point__OclType /* 2 */,
				Fragments._point__OclEnumeration /* 3 */,
				Fragments._point__point /* 4 */
			};
		private static final int /*@NonNull*/ [] __point = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Baggage.initFragments(_Baggage, __Baggage);
			Types._Booking.initFragments(_Booking, __Booking);
			Types._Bus.initFragments(_Bus, __Bus);
			Types._City.initFragments(_City, __City);
			Types._KIOSK.initFragments(_KIOSK, __KIOSK);
			Types._Online_payment.initFragments(_Online_payment, __Online_payment);
			Types._Passenger.initFragments(_Passenger, __Passenger);
			Types._Payment.initFragments(_Payment, __Payment);
			Types._Payment_method.initFragments(_Payment_method, __Payment_method);
			Types._Seat.initFragments(_Seat, __Seat);
			Types._Ticket.initFragments(_Ticket, __Ticket);
			Types._booking_status.initFragments(_booking_status, __booking_status);
			Types._point.initFragments(_point, __point);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of btsTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Baggage__Baggage = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Baggage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Baggage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Booking__Booking = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Booking__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Booking__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Bus__Bus = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Bus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Bus__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _City__City = {};
		private static final ExecutorOperation /*@NonNull*/ [] _City__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _City__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _KIOSK__KIOSK = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KIOSK__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _KIOSK__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Online_payment__Online_payment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Online_payment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Online_payment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Passenger__Passenger = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Passenger__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Passenger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Payment__Payment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment__KIOSK = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment__Online_payment = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Payment_method__Payment_method = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment_method__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment_method__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment_method__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment_method__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Seat__Seat = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Seat__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Seat__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Ticket__Ticket = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Ticket__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Ticket__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _booking_status__booking_status = {};
		private static final ExecutorOperation /*@NonNull*/ [] _booking_status__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _booking_status__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _booking_status__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _booking_status__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _point__point = {};
		private static final ExecutorOperation /*@NonNull*/ [] _point__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _point__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _point__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _point__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Baggage__Baggage.initOperations(_Baggage__Baggage);
			Fragments._Baggage__OclAny.initOperations(_Baggage__OclAny);
			Fragments._Baggage__OclElement.initOperations(_Baggage__OclElement);

			Fragments._Booking__Booking.initOperations(_Booking__Booking);
			Fragments._Booking__OclAny.initOperations(_Booking__OclAny);
			Fragments._Booking__OclElement.initOperations(_Booking__OclElement);

			Fragments._Bus__Bus.initOperations(_Bus__Bus);
			Fragments._Bus__OclAny.initOperations(_Bus__OclAny);
			Fragments._Bus__OclElement.initOperations(_Bus__OclElement);

			Fragments._City__City.initOperations(_City__City);
			Fragments._City__OclAny.initOperations(_City__OclAny);
			Fragments._City__OclElement.initOperations(_City__OclElement);

			Fragments._KIOSK__KIOSK.initOperations(_KIOSK__KIOSK);
			Fragments._KIOSK__OclAny.initOperations(_KIOSK__OclAny);
			Fragments._KIOSK__OclElement.initOperations(_KIOSK__OclElement);

			Fragments._Online_payment__OclAny.initOperations(_Online_payment__OclAny);
			Fragments._Online_payment__OclElement.initOperations(_Online_payment__OclElement);
			Fragments._Online_payment__Online_payment.initOperations(_Online_payment__Online_payment);

			Fragments._Passenger__OclAny.initOperations(_Passenger__OclAny);
			Fragments._Passenger__OclElement.initOperations(_Passenger__OclElement);
			Fragments._Passenger__Passenger.initOperations(_Passenger__Passenger);

			Fragments._Payment__KIOSK.initOperations(_Payment__KIOSK);
			Fragments._Payment__OclAny.initOperations(_Payment__OclAny);
			Fragments._Payment__OclElement.initOperations(_Payment__OclElement);
			Fragments._Payment__Online_payment.initOperations(_Payment__Online_payment);
			Fragments._Payment__Payment.initOperations(_Payment__Payment);

			Fragments._Payment_method__OclAny.initOperations(_Payment_method__OclAny);
			Fragments._Payment_method__OclElement.initOperations(_Payment_method__OclElement);
			Fragments._Payment_method__OclEnumeration.initOperations(_Payment_method__OclEnumeration);
			Fragments._Payment_method__OclType.initOperations(_Payment_method__OclType);
			Fragments._Payment_method__Payment_method.initOperations(_Payment_method__Payment_method);

			Fragments._Seat__OclAny.initOperations(_Seat__OclAny);
			Fragments._Seat__OclElement.initOperations(_Seat__OclElement);
			Fragments._Seat__Seat.initOperations(_Seat__Seat);

			Fragments._Ticket__OclAny.initOperations(_Ticket__OclAny);
			Fragments._Ticket__OclElement.initOperations(_Ticket__OclElement);
			Fragments._Ticket__Ticket.initOperations(_Ticket__Ticket);

			Fragments._booking_status__OclAny.initOperations(_booking_status__OclAny);
			Fragments._booking_status__OclElement.initOperations(_booking_status__OclElement);
			Fragments._booking_status__OclEnumeration.initOperations(_booking_status__OclEnumeration);
			Fragments._booking_status__OclType.initOperations(_booking_status__OclType);
			Fragments._booking_status__booking_status.initOperations(_booking_status__booking_status);

			Fragments._point__OclAny.initOperations(_point__OclAny);
			Fragments._point__OclElement.initOperations(_point__OclElement);
			Fragments._point__OclEnumeration.initOperations(_point__OclEnumeration);
			Fragments._point__OclType.initOperations(_point__OclType);
			Fragments._point__point.initOperations(_point__point);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of btsTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Baggage = {
			btsTables.Properties._Baggage__baggage_id,
			btsTables.Properties._Baggage__baggage_tag,
			btsTables.Properties._Baggage__booking,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			btsTables.Properties._Baggage__seat_id,
			btsTables.Properties._Baggage__ticket_id,
			btsTables.Properties._Baggage__totalBags,
			btsTables.Properties._Baggage__weight
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Booking = {
			btsTables.Properties._Booking__allowedBags,
			btsTables.Properties._Booking__baggage,
			btsTables.Properties._Booking__booking_id,
			btsTables.Properties._Booking__journey_date,
			btsTables.Properties._Booking__maximumWeight,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			btsTables.Properties._Booking__passenger,
			btsTables.Properties._Booking__payment,
			btsTables.Properties._Booking__payment_date,
			btsTables.Properties._Booking__seat,
			btsTables.Properties._Booking__status,
			btsTables.Properties._Booking__ticket,
			btsTables.Properties._Booking__totalAvailableBookings
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Bus = {
			btsTables.Properties._Bus__bookedseats,
			btsTables.Properties._Bus__bus_id,
			btsTables.Properties._Bus__bus_stop,
			btsTables.Properties._Bus__capacity,
			btsTables.Properties._Bus__city,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			btsTables.Properties._Bus__passenger,
			btsTables.Properties._Bus__seat
		};

		private static final ExecutorProperty /*@NonNull*/ [] _City = {
			btsTables.Properties._City__bus_stop,
			btsTables.Properties._City__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _KIOSK = {
			btsTables.Properties._KIOSK__booking_id,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Online_payment = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			btsTables.Properties._Online_payment__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Passenger = {
			btsTables.Properties._Passenger__baggage,
			btsTables.Properties._Passenger__booking,
			btsTables.Properties._Passenger__email,
			btsTables.Properties._Passenger__fisrt_name,
			btsTables.Properties._Passenger__last_name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			btsTables.Properties._Passenger__passenger_id,
			btsTables.Properties._Passenger__phone
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Payment = {
			btsTables.Properties._KIOSK__booking_id,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			btsTables.Properties._Payment__payment_id,
			btsTables.Properties._Online_payment__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Payment_method = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Seat = {
			btsTables.Properties._Seat__booking2,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			btsTables.Properties._Seat__seat_id
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Ticket = {
			btsTables.Properties._Ticket__arrival_city,
			btsTables.Properties._Ticket__booking_id,
			btsTables.Properties._Ticket__departure_city,
			btsTables.Properties._Ticket__journey_date,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			btsTables.Properties._Ticket__price,
			btsTables.Properties._Ticket__ticket_id
		};

		private static final ExecutorProperty /*@NonNull*/ [] _booking_status = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _point = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Baggage__Baggage.initProperties(_Baggage);
			Fragments._Booking__Booking.initProperties(_Booking);
			Fragments._Bus__Bus.initProperties(_Bus);
			Fragments._City__City.initProperties(_City);
			Fragments._KIOSK__KIOSK.initProperties(_KIOSK);
			Fragments._Online_payment__Online_payment.initProperties(_Online_payment);
			Fragments._Passenger__Passenger.initProperties(_Passenger);
			Fragments._Payment__Payment.initProperties(_Payment);
			Fragments._Payment_method__Payment_method.initProperties(_Payment_method);
			Fragments._Seat__Seat.initProperties(_Seat);
			Fragments._Ticket__Ticket.initProperties(_Ticket);
			Fragments._booking_status__booking_status.initProperties(_booking_status);
			Fragments._point__point.initProperties(_point);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of btsTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _Payment_method__debit_card = new EcoreExecutorEnumerationLiteral(btsPackage.Literals.PAYMENT_METHOD.getEEnumLiteral("debit_card"), Types._Payment_method, 0);
		public static final EcoreExecutorEnumerationLiteral _Payment_method__credit_card = new EcoreExecutorEnumerationLiteral(btsPackage.Literals.PAYMENT_METHOD.getEEnumLiteral("credit_card"), Types._Payment_method, 1);
		public static final EcoreExecutorEnumerationLiteral _Payment_method__bank_transfer = new EcoreExecutorEnumerationLiteral(btsPackage.Literals.PAYMENT_METHOD.getEEnumLiteral("bank_transfer"), Types._Payment_method, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Payment_method = {
			_Payment_method__debit_card,
			_Payment_method__credit_card,
			_Payment_method__bank_transfer
		};

		public static final EcoreExecutorEnumerationLiteral _booking_status__booked = new EcoreExecutorEnumerationLiteral(btsPackage.Literals.BOOKING_STATUS.getEEnumLiteral("booked"), Types._booking_status, 0);
		public static final EcoreExecutorEnumerationLiteral _booking_status__reserved = new EcoreExecutorEnumerationLiteral(btsPackage.Literals.BOOKING_STATUS.getEEnumLiteral("reserved"), Types._booking_status, 1);
		public static final EcoreExecutorEnumerationLiteral _booking_status__cancelled = new EcoreExecutorEnumerationLiteral(btsPackage.Literals.BOOKING_STATUS.getEEnumLiteral("cancelled"), Types._booking_status, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _booking_status = {
			_booking_status__booked,
			_booking_status__reserved,
			_booking_status__cancelled
		};

		public static final EcoreExecutorEnumerationLiteral _point__departure_point = new EcoreExecutorEnumerationLiteral(btsPackage.Literals.POINT.getEEnumLiteral("departure_point"), Types._point, 0);
		public static final EcoreExecutorEnumerationLiteral _point__arrival_point = new EcoreExecutorEnumerationLiteral(btsPackage.Literals.POINT.getEEnumLiteral("arrival_point"), Types._point, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _point = {
			_point__departure_point,
			_point__arrival_point
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Payment_method.initLiterals(_Payment_method);
			Types._booking_status.initLiterals(_booking_status);
			Types._point.initLiterals(_point);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of btsTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new btsTables();
	}

	private btsTables() {
		super(btsPackage.eNS_URI);
	}
}
