package codes;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class SuperKeyword {
    public SuperKeyword(String name, Integer age){
        this.id = UUID.randomUUID().toString().substring(0,6);
        this.name = name;
        this.age = age;
    }
    protected String id;
    protected String name;
    protected Integer age;
    public static boolean isTodayWorkingDay(){
        DayOfWeek today = DayOfWeek.from(LocalDateTime.now());
//        List<DayOfWeek> dayOfWeeks = Arrays.stream(DayOfWeek.values()).filter(dayOfWeek -> !(dayOfWeek.equals(DayOfWeek.SUNDAY) || dayOfWeek.equals(DayOfWeek.SATURDAY))).toList();
        return !(today.equals(DayOfWeek.SUNDAY) || today.equals(DayOfWeek.SATURDAY));
    }
}
