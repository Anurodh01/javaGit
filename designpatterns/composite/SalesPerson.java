package designpatterns.composite;

public class SalesPerson implements Payee{
    private String name;
    public SalesPerson(String name){
        this.name = name;
    }
    @Override
    public void payExpenses(int amount){
        System.out.println("SalesPerson: "+ this.name+" has been paid amount: "+amount);
    }
}
