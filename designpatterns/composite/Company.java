package designpatterns.composite;

public class Company {
    public static void main(String[] args) {
        Manager manager = new Manager("Joe");
        payExpensesToPayee(manager,10000);
        SalesPerson person1 = new SalesPerson("John");
        SalesPerson person2= new SalesPerson("Doe");
        payExpensesToPayee(person1,7000);
        payExpensesToPayee(person2,7000);
        SalesTeam salesTeam = new SalesTeam();
        salesTeam.addPayee(manager);
        salesTeam.addPayee(person1);
        salesTeam.addPayee(person2);
        payExpensesToPayee(salesTeam,5000);
    }
    public static void payExpensesToPayee(Payee payee, int amount){
        System.out.println("Expenses has been requested.");
        payee.payExpenses(amount);
        System.out.println("Expenses has been paid!!");
    }

}
