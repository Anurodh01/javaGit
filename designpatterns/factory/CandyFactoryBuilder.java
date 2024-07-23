package designpatterns.factory;

public class CandyFactoryBuilder {
    public CandyFactory getFactory(String type){
        return switch (type){
            case "chocolate" -> new ChocolateFactory();
            case "hardcandy" -> new HardCandyFactory();
            case "jelly" -> new JellyCandyFactory();
            default -> new ChocolateFactory();
        };
    }
}
