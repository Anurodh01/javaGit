package designpatterns.proxy;

import java.util.ArrayList;

public class Store {
    private String storeName;
    private String location;
    private Inventory inventory;
    public Store(String storeName, String location, Inventory inventory){
        this.inventory = inventory;
        this.storeName = storeName;
        this.location = location;
    }
    public void printInventory(){
        inventory.getInventery().forEach(System.out::println);
    }
}
