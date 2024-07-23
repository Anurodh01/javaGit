package designpatterns.factory;

import java.util.ArrayList;

public class CandyCane implements Candy{
    @Override
    public ArrayList<Candy> makeCandyAndPackage(int quantity) {
        ArrayList<Candy> hardCandyList = new ArrayList<>();
        for(int i=0;i<quantity;i++){
            hardCandyList.add(new CandyCane());
        }
        System.out.println((quantity/10)+" packet of CandyCane has Made!");
        return hardCandyList;
    }
}
