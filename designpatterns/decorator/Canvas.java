package designpatterns.decorator;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    Component circle1 = new Circle(15,15);
    Component circle2 = new Circle(85,15);
    Component circle3 = new Circle(155,15);

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.add(new Canvas());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        circle1.draw(g);
        circle2 = new RedBorderComponent(circle2);
        circle2 = new YellowFillComponent(circle2);
        circle2.draw(g);
        circle3.draw(g);
    }
}
