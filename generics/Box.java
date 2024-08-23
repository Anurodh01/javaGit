package generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Boxable>{
    private List<T> items;
    private List<T> data;

    public void setItems(List<T> items) {
        this.items = items;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Box(List<T> items){
        this.items = new ArrayList<>();
    }
    public List<T> getItems() {
        return items;
    }
    public Box(){
        this.items = new ArrayList<>();
    }
    public void addItem(T item){
        this.items.add(item);
    }
    public T getLatestItem(){
        return this.items.get(items.size()-1);
    }

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }
}
