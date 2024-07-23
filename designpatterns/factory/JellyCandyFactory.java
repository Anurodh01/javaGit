package designpatterns.factory;

public class JellyCandyFactory extends CandyFactory {
    @Override
    public Candy getCandy(String type) {
        return switch (type){
            case "blue" -> new BlueJellyCandy();
            case "pink" -> new PinkJellyCandy();
            default -> new BlueJellyCandy();
        };
    }
}
