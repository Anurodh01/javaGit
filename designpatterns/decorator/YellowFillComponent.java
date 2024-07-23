package designpatterns.decorator;

import java.awt.*;

public class YellowFillComponent implements Component{
    private Component decoratedComponent;
    public YellowFillComponent(Component component){
        this.decoratedComponent = component;
    }
    @Override
    public void draw(Graphics graphics) {

    }
}
