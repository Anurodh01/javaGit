package generics;

public class Book implements Boxable{
    private String name;
    private String authorName;
    private double price;
    public Book(String name, String authorName, double price) {
        this.name = name;
        this.authorName = authorName;
        this.price = price;
    }
    public Book(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                '}';
    }
}
