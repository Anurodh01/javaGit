package designpatterns.factory;

import java.util.ArrayList;
import java.util.stream.Stream;

public class PinkJellyCandy implements Candy{
    @Override
    public ArrayList<Candy> makeCandyAndPackage(int quantity) {
        ArrayList<Candy> pinkJellyCandyList = new ArrayList<>();
        Stream.generate(PinkJellyCandy::new).limit(quantity).forEach(pinkJellyCandyList::add);
        System.out.println("Pink Candy packet of "+ quantity+" has been made!");
        return pinkJellyCandyList;
    }
}
