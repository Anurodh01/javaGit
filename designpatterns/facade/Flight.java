package designpatterns.facade;

import java.time.LocalDate;

public class Flight {
    public void bookDeparture(LocalDate date){
        System.out.println("Flight booked for departure on "+ date);
    }
    public void bookArrival(LocalDate date){
        System.out.println("Flight booked for return on "+date);
    }
}
