package designpatterns.adaptor.challenge;

public class WeatherWarningStation {
    public static double MAX_TEMPERATURE = 100;
    public static double MIN_TEMPERATURE = 16;

    public void postWarning(City city){
        if(city.getTemperature() >= MAX_TEMPERATURE || city.getTemperature() <= MIN_TEMPERATURE){
            System.out.println("Warning! Temperature in city:"+ city.getName()+" is: "+ city.getTemperature()+" "+ city
                    .getTemperatureScale());
            city.setHasWeatherWarning(true);
        }
        else{
            System.out.println("Temperature in city: "+ city
                    .getName()+" is O.K!");
        }
    }
}
