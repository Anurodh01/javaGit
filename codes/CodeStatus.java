package codes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CodeStatus {
    {
        System.out.println("Value assigned!");
    }
    static{
        System.out.println("Hello from Code status");
    }
    public CodeStatus(){
        System.out.println("CodeStatus constructor run!");
    }
    public static void main(String args[]){
        List<Employee> employees = Arrays.asList(new Employee("Abhishek",23,"F",60000), new Employee("Anurodh",25,"M",50000), new Employee("Chirag",48,"F",80000));
        Employee employee = employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).findFirst().get();
        System.out.println(employee);
    }
    public static Employee getFemaleEmployee(List<Employee> employees){
        return employees.stream().filter(e-> e.getGender().equals("F")).findFirst().get();
    }
}
