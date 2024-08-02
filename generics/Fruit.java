package generics;

public class Fruit implements Boxable{
    private String name;
    private String countryOrigin;
    private double price;
    public Fruit(String name, String countryOrigin, double price){
        this.countryOrigin = countryOrigin;
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", countryOrigin='" + countryOrigin + '\'' +
                ", price=" + price +
                '}';
    }
}
