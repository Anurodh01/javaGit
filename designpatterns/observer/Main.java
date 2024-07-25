package designpatterns.observer;

public class Main {
    public static void main(String[] args) {
        Connection john = new Connection(new Person.PersonBuilder().withAge(20).withName("John").withEmail("john@gmail.com").withFollowers(12).withFollowing(30).build());
        Connection doe = new Connection(new Person.PersonBuilder().withAge(40).withName("Doe").withFollowers(122).withFollowing(34).build());
        SocialMediaFeed feed = new SocialMediaFeed();
        john.addPropertyChangeListener(feed);
        doe.addPropertyChangeListener(feed);
        john.setStatus("I am going to Market!");
        doe.setStatus("Movies and Fun time!");
        feed.printStatuses();
    }
}
