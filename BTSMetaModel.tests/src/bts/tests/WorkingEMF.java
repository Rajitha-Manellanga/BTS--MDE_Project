package bts.tests;

import bts.Booking;
import bts.Bus;
import bts.City;
import bts.Passenger;
import bts.Seat;
import bts.btsFactory;

public class WorkingEMF {
	
	public static void main(String[] args) {
		
		WorkingEMF wEmf = new WorkingEMF();
		wEmf.createModel();
		
	}
	
	public Bus createModel() {
		
		Bus bus = btsFactory.eINSTANCE.createBus();
		bus.setBus_id("BUS1248");
		bus.setCapacity(50);
		
		Passenger passenger = btsFactory.eINSTANCE.createPassenger();
		passenger.setPassenger_id("N0001");
	    passenger.setFisrt_name("John");
	    passenger.setLast_name("Doe");
	    
	    City city = btsFactory.eINSTANCE.createCity();
	    city.setName("ROME");
	    
	    Seat s1 = btsFactory.eINSTANCE.createSeat();
		s1.setSeat_id("A10");
	    
	    Booking booking = btsFactory.eINSTANCE.createBooking();
	    booking.setBooking_id("R0001");
	    booking.setPassenger(passenger);
	    booking.setSeat(s1);
	    
	    s1.setBooking2(booking);
	    
		bus.getSeat().add(s1);
		bus.getPassenger().add(passenger);
		bus.getCity().add(city);
		
		System.out.println(bus.getPassenger());
	    
		return bus;
	}

}
