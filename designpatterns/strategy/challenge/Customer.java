package designpatterns.strategy.challenge;

public class Customer {
    public void pay(int amount, PaymentMethod paymentType){
        paymentType.makePayment(amount);
    }
}
