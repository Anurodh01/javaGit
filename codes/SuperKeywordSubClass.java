package codes;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class SuperKeywordSubClass extends SuperKeyword{
    private Integer salary;
    private String designation;
    public SuperKeywordSubClass(String name, Integer age, String designation){
        super(name, age);
        this.designation = designation;
    }
    public void calculateMonthlySalary(){
        if(this.designation.equals("Developer")){
            this.salary = 50000;
        }else if(this.designation.equals("QA")){
            this.salary = 40000;
        }
        System.out.println("Employee: "+ super.name+" with ID: "+ super.id +" with age: "+ super.age+" is a "+ this.designation+" and having salary of "+ this.salary);
    }

    public static boolean isTodayWorkingDay(){
        DayOfWeek today= DayOfWeek.from(LocalDateTime.now());
        System.out.println("Subclass Method God Executed!");
        System.out.println(today);
        return true;
    }
}
