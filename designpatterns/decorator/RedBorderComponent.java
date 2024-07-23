package designpatterns.decorator;

import java.awt.*;

public class RedBorderComponent implements Component{
    private Component decoratedComponent;
    public RedBorderComponent(Component component){
        this.decoratedComponent = component;
    }
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);
        decoratedComponent.draw(graphics);
        graphics.setColor(Color.BLACK);
    }
}
