package designpatterns.state;

public class LowState implements State{
    @Override
    public void turnOn(Fan fan) {
        fan.setState(new MediumState());
        System.out.println("Fan is running medium!");
    }

    @Override
    public void turnOff(Fan fan) {
    }
}
