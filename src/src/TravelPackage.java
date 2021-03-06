package src;
import java.util.Vector;
import hotel.*;
import tour.DayTour;

import flight.Flight;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TravelPackage {
	
	private int price;
	private int travellers;
	private Flight outbound;
	private Flight inbound;
	private Hotel hotel;
	private ArrayList<DayTour> tours;
	Customer customer;
	
	public TravelPackage() {
            tours = new ArrayList<>();
        }
        
	public int getPrice() {
		return price;
	}

	public int getTravellers() {
            if(travellers <= 0) {
                travellers = 1;
            }
            return travellers;
	}

	public Flight getOutbound() {
		return outbound;
	}

	public Flight getInbound() {
		return inbound;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public ArrayList<DayTour> getDayTours() {
		return tours;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public int calculatePrice() {
            try {
                price = 0;
                long nights = TimeUnit.DAYS.convert(inbound.getArrivalTime().getTime() 
                        - outbound.getDepartureTime().getTime(), TimeUnit.MILLISECONDS);
                if(outbound != null) price += outbound.getPrice()*travellers;
                if(inbound != null)  price += inbound.getPrice()*travellers;
                if(hotel != null)    price += hotel.getPrice()*nights;
                
		for(int i = 0; i < tours.size(); i++) {
                    price += tours.get(i).getPrice()*travellers;
		} 
            } catch (NullPointerException e) {
                System.out.println("Null pointer exception");
            }
		
	    return price;		
	}

	public void setTravellers(int travellers) {
		this.travellers = travellers;
	}

	public void setOutbound(Flight outbound) {
		this.outbound = outbound;
	}

	public void setInbound(Flight inbound) {
		this.inbound = inbound;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public void addDayTour(DayTour tour) {
		if(tour != null) {
			tours.add(tour);
		}
	}
	
	public void removeDayTour(DayTour tour) {
		int index = tours.indexOf(tour);
		if(index != -1) {
			tours.remove(index);
		}
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
