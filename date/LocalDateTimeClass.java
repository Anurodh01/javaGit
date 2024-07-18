package date;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeClass {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //creating a localDateTime
        LocalDateTime ldt1= LocalDateTime.of(2023,Month.AUGUST,20,10,20);
        System.out.println(ldt1);
    }
}
