package designpatterns.factory;

import java.util.ArrayList;
import java.util.stream.Stream;

public class BlueJellyCandy implements Candy{
    @Override
    public ArrayList<Candy> makeCandyAndPackage(int quantity) {
        ArrayList<Candy> blueJellyCandyList = new ArrayList<>();
        Stream.generate(BlueJellyCandy::new).limit(quantity).forEach(blueJellyCandyList::add);
        System.out.println("Blue Candy packet of "+ quantity+" has been made!");
        return blueJellyCandyList;
    }
}
