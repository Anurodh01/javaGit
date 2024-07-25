package designpatterns.strategy.challenge;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.pay(100, PaymentMethod.payThroughUPI);
        customer.pay(200, PaymentMethod.payThroughCreditCard);
        customer.pay(400, PaymentMethod.payThroughBank);
    }
}
