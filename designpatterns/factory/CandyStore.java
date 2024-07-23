package designpatterns.factory;

import java.util.ArrayList;

public class CandyStore {
    public static void main(String[] args) {
        CandyFactoryBuilder factoryBuilder = new CandyFactoryBuilder();
        CandyFactory chocolateCandyFactory = factoryBuilder.getFactory("chocolate");
        chocolateCandyFactory.getCandyPackage(16,"white");
        CandyFactory hardCandyFactory = factoryBuilder.getFactory("hardcandy");
        hardCandyFactory.getCandyPackage(34,"peppermint");
        CandyFactory jellyCandyFactory = factoryBuilder.getFactory("jelly");
        jellyCandyFactory.getCandyPackage(90,"pink");
    }
}
