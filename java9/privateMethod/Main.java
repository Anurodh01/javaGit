package java9.privateMethod;

public class Main {
    public static void main(String[] args) {
        PrivateTest test  = new PrivateTest();
        int core1 = test.getNumberofCores1();
        System.out.println(core1);
        System.out.println(PrivateMethodsInInterface.getNumberofCores2());
    }
}
