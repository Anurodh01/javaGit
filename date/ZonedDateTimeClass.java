package date;

import java.time.*;

/**
 * @author anurodhsingh
 */
public class ZonedDateTimeClass {
    public static void main(String[] args) {

        ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.systemDefault());
        System.out.println(zonedDateTime);

        //offsetDateTime
        OffsetDateTime currentDateTime = OffsetDateTime.now();
        System.out.println(currentDateTime);

        //OffSetDateTime
        OffsetDateTime currentDateTimeInUTC = OffsetDateTime.now(ZoneOffset.UTC);
        System.out.println(currentDateTimeInUTC);

        OffsetDateTime localOffsetTime = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(5));
        System.out.println(localOffsetTime);
    }
}
