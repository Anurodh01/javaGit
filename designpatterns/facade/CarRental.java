package designpatterns.facade;

import java.time.LocalDate;

public class CarRental {
    public void book(LocalDate startDate, LocalDate endDate){
        System.out.println("SUV car is booked from "+ startDate+" to "+ endDate);
    }
}
