package designpatterns.factory;

import java.util.ArrayList;
public interface Candy {
    ArrayList<Candy> makeCandyAndPackage(int quantity);
}
