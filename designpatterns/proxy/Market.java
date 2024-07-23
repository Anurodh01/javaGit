package designpatterns.proxy;

public class Market {
    public static void main(String[] args) {
        Inventory inventory = new SuperMarketInventoryProxy();
        Store store = new Store("Kirana Store","Ayodhya", inventory);
        store.printInventory();
    }
}
