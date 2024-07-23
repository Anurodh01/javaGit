package designpatterns.proxy;

import java.util.ArrayList;

public class SuperMarketInventory implements Inventory{
    private ArrayList<Item> products;
    public SuperMarketInventory(){
        products = new ArrayList<>();
        System.out.println("SuperMarketInventory got Initialized!");
        products.add(new Item("A",10,1));
        products.add(new Item("B",20,2));
        products.add(new Item("C",30,3));
        products.add(new Item("D",40,4));
        products.add(new Item("E",50,5));
        products.add(new Item("F",60,6));
        products.add(new Item("G",70,7));
        products.add(new Item("H",80,8));
        products.add(new Item("I",90,9));
    }
    @Override
    public ArrayList<Item> getInventery() {
        return products;
    }
}
