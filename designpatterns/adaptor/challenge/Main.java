package designpatterns.adaptor.challenge;

public class Main {
    public static void main(String[] args) {
        WeatherWarningStation station = new WeatherWarningStation();
        AsianCity asianCity = new AsianCity("Japan",40);
        TemperatureAdapter adapter = new TemperatureAdapter(asianCity);
        station.postWarning(adapter);
        NorthAmericanCity americanCity = new NorthAmericanCity("Chicago",16);
        station.postWarning(americanCity);
        NorthAmericanCity americanCity1 = new NorthAmericanCity("Pheonix",104);
        station.postWarning(americanCity1);
        NorthAmericanCity americanCity2 = new NorthAmericanCity("PortLand",40);
        station.postWarning(americanCity2);
    }
}
