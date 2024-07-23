package designpatterns.adaptor;

public class TruckPriceCalculator implements PriceCalculator {
    private int age;
    private int mileage;
    private static int averagePrice = 6000;
    public TruckPriceCalculator(Integer age, Integer mileage){
        this.mileage = mileage;
        this.age = age;
    }
    @Override
    public String calculatePrice(){
        int price = Math.max(averagePrice - age * 100 - mileage/100, 0);
        return price + "USD";
    }
}
