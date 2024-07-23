package designpatterns.adaptor;

public class Main {
    public static void main(String[] args) {
        CarPriceCalculator carPriceCalculator = new CarPriceCalculator("bmw",20);
        printVehiclePrice(carPriceCalculator);
        TruckPriceCalculator truckPriceCalculator = new TruckPriceCalculator(10,20);
        printVehiclePrice(truckPriceCalculator);
        UKCarPriceCalculator ukCarPriceCalculator = new UKCarPriceCalculator("tesla",10);
        Adaptor adaptor = new Adaptor(ukCarPriceCalculator);
        printVehiclePrice(adaptor);
    }
    public static void printVehiclePrice(PriceCalculator calculator){
        System.out.println("Price of Vehicle is: "+ calculator.calculatePrice());
    }
}
