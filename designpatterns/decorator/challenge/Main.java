package designpatterns.decorator.challenge;

public class Main {
    public static void main(String[] args) {
        order(new MageritaPizza());
        order(new PepperoniPizza());
        ExtraCheeseTopping cheeseToppingPizza = new ExtraCheeseTopping(new EngListRetreatPizza());
        order(cheeseToppingPizza);
    }
    public static void order(Pizza pizza){
        System.out.println("You have Ordered "+ pizza.getName()+" with toppings added are "+ pizza.getToppings());
    }
}
