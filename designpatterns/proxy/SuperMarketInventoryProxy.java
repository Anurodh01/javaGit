package designpatterns.proxy;

import java.util.ArrayList;
import java.util.Objects;

public class SuperMarketInventoryProxy implements Inventory{
    private Inventory inventory;
    public SuperMarketInventoryProxy(){
    }
    @Override
    public ArrayList<Item> getInventery() {
        if(Objects.isNull(inventory)){
            inventory = new SuperMarketInventory();
        }
        return inventory.getInventery();
    }
}
