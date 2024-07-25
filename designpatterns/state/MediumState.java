package designpatterns.state;

public class MediumState implements State{
    @Override
    public void turnOn(Fan fan) {
        fan.setState(new HighState());
        System.out.println("Fan is running High!");
    }

    @Override
    public void turnOff(Fan fan) {
        fan.setState(new LowState());
        System.out.println("Fan is running low!");
    }
}
