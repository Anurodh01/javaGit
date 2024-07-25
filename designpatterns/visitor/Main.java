package designpatterns.visitor;

public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread();
        bread.setQuantity(2);
        Milk milk = new Milk();
        milk.setQuantity(5);
        GroceryList groceryList = new GroceryList();
        groceryList.addGrocery(milk);
        groceryList.addGrocery(bread);
        System.out.println("Total price: "+ groceryList.getPrice());

        //After discount
        DiscountVisitor discount = new DiscountVisitor();
        groceryList.accept(discount);
        System.out.println("Total Price After discount: "+ groceryList.getPrice());
    }
}
