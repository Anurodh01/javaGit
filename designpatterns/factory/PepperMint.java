package designpatterns.factory;

import java.util.ArrayList;

public class PepperMint implements Candy{
    @Override
    public ArrayList<Candy> makeCandyAndPackage(int quantity) {
        ArrayList<Candy> hardCandyList = new ArrayList<>();
        for(int i=0;i<quantity;i++){
            hardCandyList.add(new PepperMint());
        }
        System.out.println((quantity/10)+" packet of PepperMint has Made!");
        return hardCandyList;
    }
}
