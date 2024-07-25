package designpatterns.visitor;

public interface Grocery {
    double getPrice();
    void accept(Visitor visitor);
}
