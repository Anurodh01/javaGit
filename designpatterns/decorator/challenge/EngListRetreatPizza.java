package designpatterns.decorator.challenge;

import java.util.ArrayList;

public class EngListRetreatPizza implements Pizza{
    private ArrayList<String> toppings;
    private String name = "EngListRetreatPizza";
    public EngListRetreatPizza(){
        toppings = new ArrayList<>();
        toppings.add("Cheese");
        toppings.add("Olive");
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
