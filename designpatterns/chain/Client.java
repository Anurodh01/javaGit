package designpatterns.chain;

public class Client {
    public static void main(String[] args) {
        AuthenticationHandler handler= new BasicAuthentication(new DaoAuthentication(new OauthAuthentication(null)));
        handler.handleRequest("basic");
        handler.handleRequest("dao");
        handler.handleRequest("oauth");
    }
}
