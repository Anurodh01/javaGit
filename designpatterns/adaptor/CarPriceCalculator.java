package designpatterns.adaptor;

import designpatterns.adaptor.PriceCalculator;

public class CarPriceCalculator implements PriceCalculator {
    private int age;
    private String model;
    private static int averageCarPrice = 6000;
    public CarPriceCalculator(String model, Integer age){
        this.model = model;
        this.age = age;
    }
    public int getRetailPrice(){
        return switch (model) {
            case "ford" -> 3000;
            case "audi" -> 5000;
            case "bmw" -> 7000;
            case "tesla" -> 10000;
            default -> averageCarPrice;
        };
    }
    @Override
    public String calculatePrice(){
        return getRetailPrice()+"USD";
    }
}
