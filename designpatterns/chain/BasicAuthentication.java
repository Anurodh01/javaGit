package designpatterns.chain;

public class BasicAuthentication extends AuthenticationHandler{
    public BasicAuthentication(AuthenticationHandler next){
        super(next);
    }
    @Override
    public void handleRequest(String requestType) {
        if(requestType.equals("basic")){
            System.out.println("Handling Basic authentication request!");
        }else{
            super.handleRequest(requestType);
        }
    }
}
