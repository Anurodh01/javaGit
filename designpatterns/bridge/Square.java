package designpatterns.bridge;

public class Square implements Shape{
    private Integer length;
    private Integer width;
    private Color color;
    public Square(Integer length, Integer width, Color color){
        this.color = color;
        this.length = length;
        this.width = width;
    }
    @Override
    public void draw() {
        System.out.println("A "+ this.color.getColor()+" Coloured Square of length "+ length+" and width: "+ width+" has been created!");
    }
}
