package designpatterns.decorator.challenge;

import java.util.ArrayList;

public class ExtraCheeseTopping implements Pizza{
    private Pizza pizza;
    public ExtraCheeseTopping(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public ArrayList<String> getToppings() {
        ArrayList<String> toppings = this.pizza.getToppings();
        toppings.add("Extra Cheese Burst");
        return toppings;
    }

    @Override
    public String getName() {
        return pizza.getName()+"With Extra Cheese!";
    }
}
