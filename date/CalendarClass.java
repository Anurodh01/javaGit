package date;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

/**
 * Calendar Class to UnderStand the Utility of this class over Date Class (java.util)
 */
public class CalendarClass {
    public static void main(String[] args) {
        Calendar currentDate = Calendar.getInstance();
        int date = currentDate.get(Calendar.DATE);
        int month = currentDate.get(Calendar.MONTH)+1;
        int year = currentDate.get(Calendar.YEAR);
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(1999,Calendar.NOVEMBER,17);
        calculateAge(birthDate, currentDate);
    }

    /**
     * Calculating the years old with help of ChronoUnit
     * @param startDate
     * @param endDate
     * @author anurodhsingh
     */
    public static void calculateAge(Calendar startDate, Calendar endDate){
        LocalDate start = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate end = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        long years = ChronoUnit.YEARS.between(start, end);
        System.out.printf("I am %d years old",years);
    }
}
