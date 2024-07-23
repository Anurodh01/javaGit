package designpatterns.adaptor.challenge;

public class NorthAmericanCity implements City {
    private String name;
    private boolean hasWeatherWarning;
    private double temperature;
    public NorthAmericanCity(String name, double temperature){
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
        return "Fehreinheit";
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
