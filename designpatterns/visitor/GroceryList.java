package designpatterns.visitor;

import java.util.ArrayList;

public class GroceryList implements Grocery{
    private ArrayList<Grocery> groceries = new ArrayList<>();
    public void addGrocery(Grocery grocery){
        groceries.add(grocery);
    }
    @Override
    public double getPrice(){
        return groceries.stream().mapToDouble(Grocery::getPrice).sum();
    }
    @Override
    public void accept(Visitor visitor) {
        groceries.stream().forEach(grocery -> grocery.accept(visitor));
        visitor.visit(this);
    }
}
