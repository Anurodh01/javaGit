package designpatterns.adaptor.challenge;

public class TemperatureAdapter implements City {
    private City city;
    public TemperatureAdapter(AsianCity city){
        this.city = city;
    }
    @Override
    public String getName() {
        return this.city.getName();
    }

    @Override
    public double getTemperature() {
        double temperatureInFehreinHeit = 1.8 * city.getTemperature() + 32;
        return temperatureInFehreinHeit;
    }

    @Override
    public String getTemperatureScale() {
        return "FehreinHeit";
    }

    @Override
    public boolean getHasWeatherWarning() {
        return this.city.getHasWeatherWarning();
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        this.city.setHasWeatherWarning(hasWeatherWarning);
    }
}
