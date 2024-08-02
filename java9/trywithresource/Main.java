package java9.trywithresource;

public class Main {
    public static void use9(Resource resource) throws Exception {
        try(resource) {
            resource.operation();
        }
    }
    public static void main(String[] args) throws Exception {
//        try(Resource resource = new Resource()){
//            resource.operation();    //this try-with-resource option was fine but as we can see that it is tightly coupled as we need to create the object inside the try block
//        }

        //IN java-9 we have another option
        use9(new Resource());
    }
}
