package designpatterns.composite;

public class Manager implements Payee{
    private String name;
    public Manager(String name){
        this.name = name;
    }
    public void payExpenses(int amount){
        System.out.println("Manager: "+ this.name+" has been paid with amount: "+ amount);
    }

}
