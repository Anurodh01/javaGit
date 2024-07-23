package designpatterns.bridge;

public class GreenColor implements Color{
    private static final String COLOR = "green";
    @Override
    public String getColor() {
        System.out.println("Green Color Set!");
        return COLOR;
    }
}
