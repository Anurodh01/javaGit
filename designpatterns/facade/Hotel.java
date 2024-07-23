package designpatterns.facade;

import java.time.LocalDate;

public class Hotel {
    public void book(LocalDate startDate, LocalDate endDate){
        System.out.println("Hotel is booked from "+startDate+" to "+endDate);
    }
}
