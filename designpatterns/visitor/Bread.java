package designpatterns.visitor;

public class Bread implements Grocery{
    private double price = 10;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price * quantity;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
