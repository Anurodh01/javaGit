package date;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class CalculateAge {
    public CalculateAge(){
        System.out.println("origin/master updated");
    }
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1999, Month.AUGUST, 17);
        calculateAge(birthDate, currentDate);
        LocalTime localTime = LocalTime.now();
        LocalTime eodTime = LocalTime.of(8,10);
        calculateItsFridayNight(eodTime, localTime);
    }
    public static void calculateAge(LocalDate startDate, LocalDate endDate){
        //calculate age in years
        long years = ChronoUnit.YEARS.between(startDate, endDate);
        long months = ChronoUnit.MONTHS.between(startDate, endDate);
        long weeks = ChronoUnit.WEEKS.between(startDate, endDate);
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.printf("Years: %d, Months: %d, Weeks: %d, Days: %d\n",years,months,weeks,days);

        //Calculate the Age in years and months and days
        Period age = Period.between(startDate, endDate);
        System.out.println(age.getYears()+" years, "+ age.getMonths()+" months, "+ age.getDays()+" days");
    }
    public  static void calculateItsFridayNight(LocalTime startTime, LocalTime endTime){
        //how much time is remaining in hours
        long hours = ChronoUnit.HOURS.between(startTime, endTime);
        long minutes = ChronoUnit.MINUTES.between(startTime, endTime);
        long seconds = ChronoUnit.SECONDS.between(startTime, endTime);
        System.out.printf("Hours: %d, Minutes: %d, Seconds: %d", hours, minutes, seconds);
    }
}
