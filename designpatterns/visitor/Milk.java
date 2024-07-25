package designpatterns.visitor;

public class Milk implements Grocery{
    private double price= 33;
    private int quantity;
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public double getPrice() {
        return price * quantity;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
