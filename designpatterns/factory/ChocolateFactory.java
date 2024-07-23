package designpatterns.factory;

public class ChocolateFactory extends CandyFactory {
    @Override
    public Candy getCandy(String type) {
        return switch (type) {
            case "dark" -> new Chocolate_Dark();
            case "white" -> new Chocolate_White();
            case "milk" -> new Chocolate_Milk();
            default -> new Chocolate_Milk();
        };
    }
}
