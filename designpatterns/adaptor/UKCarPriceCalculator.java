package designpatterns.adaptor;

public class UKCarPriceCalculator {
    private String model;
    private int age;
    private static int averageCarPrice = 25000;
    public UKCarPriceCalculator(String model, int age){
        this.model = model;
        this.age = age;
    }
    public int getRetailPrice(){
        return switch (this.model) {
            case "ford" -> 10000;
            case "audi" -> 22000;
            case "bmw" -> 46000;
            case "tesla" -> 112000;
            default -> averageCarPrice;
        };
    }
    public String calculatePrice(){
        return getRetailPrice()+"GKP";
    }
}
