package designpatterns.factory;

import java.util.ArrayList;

public abstract class CandyFactory {
    public abstract Candy getCandy(String type);
    public ArrayList<Candy> getCandyPackage(int quantity, String type){
        Candy candy = getCandy(type);
        return candy.makeCandyAndPackage(quantity);
    }

}
