package designpatterns.strategy.challenge;

public interface PaymentMethod {
    void makePayment(int amount);
    PaymentMethod payThroughBank = (int amount) -> System.out.println(amount + " has been paid through bank!");
    PaymentMethod payThroughUPI = (int amount) -> System.out.println(amount + " has been paid through UPI!");
    PaymentMethod payThroughCreditCard = (int amount) -> System.out.println( amount + " has been paid through Credit card!");

}
