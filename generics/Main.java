package generics;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Box<Book> books = new Box<>();
//        books.addItem(new Book("Harry Potter","J Rolling",120));
//        books.addItem(new Book("Hibernate","James Gostling",323));
//        System.out.println("Items in Box: "+ BoxUtils.getItemCount(books));
//        System.out.println(books);
//
//        Box<Fruit> fruits = new Box<>();
//        fruits.addItem(new Fruit("Mango","india",120));
//        fruits.addItem(new Fruit("Banana","Brazil",222));
//        System.out.println("Items count in Box: "+ BoxUtils.getItemCount(fruits));
//        System.out.println(fruits);

       /// Box<Juice> juiceBox = new Box<>(); as it is not bounded in type Boxable

//        NumberGame<Double> game1 = new NumberGame<>();
//        game1.addNumber(120.33);
//        game1.addNumber(443.242);
//        game1.addNumber(932.523);
//        game1.addNumber(23.23);
//        game1.addNumber(883.312);
//        System.out.println(NumberGameUtil.getSortedNumberList(game1.getNumbers()));

        var list = Collections.emptyList();
        System.out.println(list);
    }
}
