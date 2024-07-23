package designpatterns.adaptor;

public class Adaptor implements PriceCalculator{
    private UKCarPriceCalculator ukCarPriceCalculator;
    public Adaptor(UKCarPriceCalculator ukCarPriceCalculator){
        this.ukCarPriceCalculator= ukCarPriceCalculator;
    }
    @Override
    public String calculatePrice() {
        return this.ukCarPriceCalculator.calculatePrice();
    }
}
