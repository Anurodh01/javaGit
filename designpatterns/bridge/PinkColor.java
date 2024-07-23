package designpatterns.bridge;

public class PinkColor implements Color{
    private static final String COLOR = "pink";
    @Override
    public String getColor() {
        System.out.println("Pink color is set!");
        return COLOR;
    }
}
