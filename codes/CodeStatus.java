package codes;

import java.util.*;

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
//        Employee employee = employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).findFirst().get();
        Map<Employee, String> map = new HashMap<>();
        Employee employee1 = new Employee("Abhishek",10,"M",10000);
        Employee employee2 = new Employee("Abhishek",39,"M",33344);
        map.put(employee1, "Abhishek");
        map.put(employee2, "Anurodh");
        map.entrySet().forEach(System.out::println);
    }
    public static Employee getFemaleEmployee(List<Employee> employees){
        return employees.stream().filter(e-> e.getGender().equals("F")).findFirst().get();
        Employee employeeWithMaxSalary = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).findFirst().get();
        System.out.println(employeeWithMaxSalary);
    }
}
