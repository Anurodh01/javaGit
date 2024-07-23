package designpatterns.decorator.challenge;

import java.util.ArrayList;

public class MageritaPizza implements Pizza{
    private ArrayList<String> toppings;
    private String name = "MageritaPizza";
    public MageritaPizza(){
        toppings = new ArrayList<>();
        toppings.add("Onion");
        toppings.add("Cheese");
        toppings.add("Capsicum");
        toppings.add("Maize");
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
