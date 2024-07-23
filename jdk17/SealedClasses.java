package jdk17;

public class SealedClasses {
    public static void main(String[] args) {
        Latte latteCoffee = new Latte();
        Beverage something = new Beverage();
        Coffee coffee = new Coffee();
        coffee.take();
        something.take();
        latteCoffee.take();
    }
}
