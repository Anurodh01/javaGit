package designpatterns.decorator.challenge;

import java.util.ArrayList;

public class PepperoniPizza implements Pizza{
    private ArrayList<String> toppings;
    private String name = "PepperoniPizza";
    public PepperoniPizza(){
        toppings = new ArrayList<>();
        toppings.add("Cheese");
        toppings.add("Tomato");
        toppings.add("Pepperoni");
    }
    @Override
    public ArrayList<String> getToppings() {
        return this.toppings;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
