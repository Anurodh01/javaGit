package designpatterns.singleton;

public class DBConnector {
    private static DBConnector databaseManager;
    private static boolean isInitialized = false;
    private DBConnector(){}

    public static DBConnector getInstance() {
        if(!isInitialized){
            databaseManager = new DBConnector();
            isInitialized = true;
        }
        return databaseManager;
    }
}
