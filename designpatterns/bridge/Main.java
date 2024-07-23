package designpatterns.bridge;

public class Main {
    public static void main(String[] args) {
        GreenColor greenColor = new GreenColor();
        Circle greenCircle = new Circle(10, greenColor);
        greenCircle.draw();
        PinkColor pinkColor = new PinkColor();
        Square pinkSquare = new Square(10,30,pinkColor);
        pinkSquare.draw();
    }
}
