package designpatterns.factory;

import java.util.ArrayList;

public class Lollipop implements Candy{
    @Override
    public ArrayList<Candy> makeCandyAndPackage(int quantity) {
        ArrayList<Candy> hardCandyList = new ArrayList<>();
        for(int i=0;i<quantity;i++){
            hardCandyList.add(new Lollipop());
        }
        System.out.println((quantity/10)+"packet of Lollipop has Made!");
        return hardCandyList;
    }
}
