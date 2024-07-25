package designpatterns.chain;

public class DaoAuthentication extends AuthenticationHandler{
    public DaoAuthentication(AuthenticationHandler next) {
        super(next);
    }

    @Override
    void handleRequest(String requestType) {
        if(requestType.equals("dao")){
            System.out.println("Handling Dao Authentication request!");
        }else{
            super.handleRequest(requestType);
        }
    }
}
