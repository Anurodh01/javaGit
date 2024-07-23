package date;

import java.time.LocalTime;

public class LocalTimeClass {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        LocalTime birthTime = LocalTime.of(12,10);
        System.out.println(birthTime);
    }
}
