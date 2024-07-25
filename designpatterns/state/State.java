package designpatterns.state;

public interface State {
    void turnOn(Fan fan);
    void turnOff(Fan fan);
}
