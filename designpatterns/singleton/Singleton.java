package designpatterns.singleton;

public class Singleton {
    public static void main(String[] args) {
        DBConnector dbConnector = DBConnector.getInstance();
        System.out.println(dbConnector.hashCode());
        DBConnector dbConnector1= DBConnector.getInstance();
        System.out.println(dbConnector1.hashCode());
    }
}
