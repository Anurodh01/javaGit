package designpatterns.visitor;

public class DiscountVisitor implements Visitor{
    @Override
    public void visit(Bread bread) {
        bread.setPrice(5);
    }

    @Override
    public void visit(Milk milk) {
        milk.setPrice(30);
    }

    @Override
    public void visit(GroceryList groceryList) {
        System.out.println("Discount has been applied on Your groceryList!. Thanks!");
    }
}
