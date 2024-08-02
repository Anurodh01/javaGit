package java9.trywithresource;

public class Resource implements AutoCloseable{
    public Resource(){
        System.out.println("Resource is getting initialized!");
    }
    public void operation(){
        System.out.println("Resource Performed some operations!");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Cleaning Up Resource!");
    }
}
