package designpatterns.facade;

import java.time.LocalDate;

public class VacationClient {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024,7,26);
        LocalDate endDate = LocalDate.of(2024,7,30);
        BookingFacade facade = new BookingFacade();
        facade.book(startDate, endDate);
    }
}
