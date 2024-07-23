package designpatterns.facade;

import java.time.LocalDate;

public class BookingFacade {
    public void book(LocalDate startDate, LocalDate endDate){
        Hotel hotel = new Hotel();
        hotel.book(startDate, endDate);
        CarRental carRental = new CarRental();
        carRental.book(startDate, endDate);
        Flight flight = new Flight();
        flight.bookDeparture(startDate);
        flight.bookArrival(endDate);
    }
}
