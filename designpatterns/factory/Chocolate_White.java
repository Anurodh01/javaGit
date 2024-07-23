package designpatterns.factory;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Chocolate_White implements Candy{
    @Override
    public ArrayList<Candy> makeCandyAndPackage(int quantity) {
        ArrayList<Candy> whiteChocolateList = new ArrayList<>();
        Stream.generate(Chocolate_White::new).limit(quantity).forEach(whiteChocolateList::add);
        System.out.println("Package of "+quantity+" White chocolate has been Made!");
        return whiteChocolateList;
    }
}
