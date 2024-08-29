package codes;

public class Code6 {
    public static void show(){
        System.out.println("show ");
        throw new RuntimeException();
    }
    public static void main(String[] args) {
        try{
            System.out.println("Hi ");
//            show();
        }
        catch(Exception ex){
            System.out.println("Caught");
        } finally {
            System.out.println("Finally");
        }

        System.out.println("last");
        System.out.println("HELLO");
    }
}
