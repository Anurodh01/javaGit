package designpatterns.chain;

public class OauthAuthentication extends AuthenticationHandler{
    public OauthAuthentication(AuthenticationHandler next) {
        super(next);
    }

    @Override
    void handleRequest(String requestType) {
        if(requestType.equals("oauth")){
            System.out.println("Oauth type of request is Handled!");
        }else{
            super.handleRequest(requestType);
        }
    }
}
