package designpatterns.factory;

import java.util.ArrayList;

public class HardCandyFactory extends CandyFactory{
    @Override
    public Candy getCandy(String type) {
        return switch (type){
            case "peppermint" -> new PepperMint();
            case "candycane" -> new CandyCane();
            case "lollipop" -> new Lollipop();
            default -> new Lollipop();
        };
    }

    @Override
    public ArrayList<Candy> getCandyPackage(int quantity, String type) {
        Candy candy = getCandy(type);
        if(quantity%10!=0){
            System.out.println("Hard Candies are only sold in a package of 10!");
            return null;
        }
        int packet = quantity/10;
        return candy.makeCandyAndPackage(quantity);
    }
}
