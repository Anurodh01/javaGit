package designpatterns.chain;

public abstract class AuthenticationHandler {
    public AuthenticationHandler next;
    public AuthenticationHandler(AuthenticationHandler next){
        this.next= next;
    }
    void handleRequest(String requestType){
        if(next!=null){
            next.handleRequest(requestType);
        }else{
            System.out.println("No Handler found for "+ requestType);
        }
    }
}
