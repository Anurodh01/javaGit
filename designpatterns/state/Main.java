package designpatterns.state;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnOn();
        fan.turnOn();
        fan.turnOff();
        fan.turnOff();
        fan.turnOn();
        fan.turnOff();
    }
}
