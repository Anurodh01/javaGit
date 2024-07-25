package designpatterns.state;

public class Fan {
    private State state = new LowState();
    public void setState(State state){
        this.state = state;
    }
    public void turnOn(){
        this.state.turnOn(this);
    }
    public void turnOff(){
        this.state.turnOff(this);
    }

}
