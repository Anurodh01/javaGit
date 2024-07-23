package designpatterns.bridge;

public class Circle implements Shape{
    private Integer radius;
    private Color color;
    public Circle(Integer radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("A "+ this.color.getColor() + " colored Circle has been created!");
    }

    @Override
    public String toString() {
        return "GreenCircle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
