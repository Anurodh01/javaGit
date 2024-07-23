package designpatterns.factory;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Chocolate_Dark implements Candy{
    @Override
    public ArrayList<Candy> makeCandyAndPackage(int quantity) {
        ArrayList<Candy> darkChocolateCandyList = new ArrayList<>();
        Stream.generate(Chocolate_Dark::new).limit(quantity).forEach(darkChocolateCandyList::add);
        System.out.println("Package of "+ quantity+ " dark chocolate candies has been Made!");
        return darkChocolateCandyList;
    }
}
