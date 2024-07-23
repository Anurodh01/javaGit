package jdk17;

//Here Beverage means Anything drinkable except water
//So We are just sealed the Beverage class for all kind of drinks which comes under this
//and ONly those classes can Extend Beverage class
public sealed class Beverage permits Coffee {
    void take(){
        System.out.println("I will take some Beverage.");
    }
}
