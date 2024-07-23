package designpatterns.factory;

import java.util.ArrayList;

public class Chocolate_Milk implements Candy{
    @Override
    public ArrayList<Candy> makeCandyAndPackage(int quantity) {
        ArrayList<Candy> chocolateCandyList = new ArrayList<>();
        for(int i=0;i<quantity;i++){
            chocolateCandyList.add(new Chocolate_Milk());
        }
        System.out.println("A package of "+quantity+"milk Chocolate Candies has been Made!");
        return chocolateCandyList;
    }
}
