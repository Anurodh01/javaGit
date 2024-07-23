package designpatterns.adaptor.challenge;

public class AsianCity implements City {
    private String name;
    private boolean hasWeatherWarning;
    private double temperature;
    public AsianCity(String name, double temperature){
        this.name = name;
        this.temperature = temperature;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getTemperature() {
        return this.temperature;
    }

    @Override
    public String getTemperatureScale() {
        return "Celsius";
    }

    @Override
    public boolean getHasWeatherWarning() {
        return this.hasWeatherWarning;
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        this.hasWeatherWarning = hasWeatherWarning;
    }
}
