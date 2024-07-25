package designpatterns.observer;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    private String name;
    private String email;
    private int age;
    private int followers;
    private int following;
    public PersonBuilder personBuilder(){
        return new PersonBuilder();
    }
    public static final class PersonBuilder {
        private String name;
        private String email;
        private int age;
        private int followers;
        private int following;

        public static PersonBuilder aPerson() {
            return new PersonBuilder();
        }

        public PersonBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder withFollowers(int followers) {
            this.followers = followers;
            return this;
        }

        public PersonBuilder withFollowing(int following) {
            this.following = following;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.setName(name);
            person.setEmail(email);
            person.setAge(age);
            person.setFollowers(followers);
            person.setFollowing(following);
            return person;
        }
    }
}
