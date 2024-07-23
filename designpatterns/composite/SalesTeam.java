package designpatterns.composite;

import java.util.ArrayList;

public class SalesTeam implements Payee{
    public ArrayList<Payee> payees;
    public SalesTeam(){
        payees = new ArrayList<>();
    }
    public void addPayee(Payee payee){
        this.payees.add(payee);
    }
    public void payExpenses(int amount){
        this.payees.forEach(payee -> payee.payExpenses(amount));
    }
}
