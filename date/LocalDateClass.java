package date;

import java.time.LocalDate;
import java.time.Month;

/**
 * LocalDate class(java.time) Used to have the date only parts
 */
public class LocalDateClass {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        LocalDate birthDate = LocalDate.of(1999, Month.AUGUST,17);
        System.out.println(birthDate);

        //check if currentDate is after birthdAte
        boolean isCurrentDateIsAfterBirthDate = currentDate.isAfter(birthDate);
        System.out.println("isCurrentDateIsAfterBirthDate: "+ isCurrentDateIsAfterBirthDate);

        //check if currentDate is before birthdate
        boolean isCurrentDateIsBeforeBirthDate = currentDate.isBefore(birthDate);
        System.out.println("isCurrentDateIsBeforeDate: "+isCurrentDateIsBeforeBirthDate);
        //check if currentDate is equals to birthDate
        System.out.println("isCurrentDateIsEqualToBirthDate: "+ currentDate.isEqual(birthDate));

        //Add years
        System.out.println("Adding 10 years: "+ currentDate.plusYears(10));

        //add months
        System.out.println("Adding 2 months: "+ currentDate.plusMonths(2));

        //add weeks
        System.out.println("Adding 2 weeks: "+ currentDate.plusWeeks(2));

        //add days
        System.out.println("Adding 4 days: "+ currentDate.plusDays(4));

        //minus years
        System.out.println("Minus 10 days: "+ currentDate.minusDays(10));
    }
}
