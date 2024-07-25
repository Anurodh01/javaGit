package designpatterns.state;

public class HighState implements State{
    @Override
    public void turnOn(Fan fan) {

    }

    @Override
    public void turnOff(Fan fan) {
        fan.setState(new MediumState());
        System.out.println("Fan is running medium!");
    }
}
