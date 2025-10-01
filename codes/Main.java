package codes;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        SuperKeywordSubClass superKeywordSubClass = new SuperKeywordSubClass("Anurodh Singh",23,"Developer");
        superKeywordSubClass.calculateMonthlySalary();
        System.out.println(SuperKeyword.isTodayWorkingDay());
        System.out.println("Name of Employee is: "+ superKeywordSubClass.name);
        boolean todayWorkingDay = SuperKeywordSubClass.isTodayWorkingDay();
        System.out.println(todayWorkingDay);
    }
}
