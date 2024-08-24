package date;
import java.util.Date;

/**
 * date class(java.util package) ---> Deprecated
 */
public class DateClass {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Date birthDate = new Date();
        birthDate.setDate(17);
        birthDate.setMonth(9-1);
        birthDate.setYear(1999-1900);
        calculateAge(birthDate, currentDate);
        System.out.println("origin/master");
    }

    /**
     * Calculating the age on basis of birthdate
     * @param startDate
     * @param endDate
     */
    public static void calculateAge(Date startDate, Date endDate){
        long timeDifference = endDate.getTime() - startDate.getTime();

        //total years
        long totalMilliSecondsInAYear = 365 * 24 * 60 * 60 * 1000L;
        long year = timeDifference/totalMilliSecondsInAYear;
        long remainingTimeDifference = timeDifference % totalMilliSecondsInAYear;

        //total month
        long totalMilliSecondsInAMonth = 30 * 24 * 60 * 60 * 1000L;
        long month = remainingTimeDifference / totalMilliSecondsInAMonth;
        remainingTimeDifference %= totalMilliSecondsInAMonth;

        //total days
        long totalMilliSecondsInADay = 24 * 60 * 60 * 1000L;
        long day = remainingTimeDifference / totalMilliSecondsInADay;
        remainingTimeDifference %= totalMilliSecondsInADay;

        System.out.println("I am "+ year+ " years "+ month +" month "+day+" Day old." );
    }
}
