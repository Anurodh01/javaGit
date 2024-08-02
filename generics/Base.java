package generics;
abstract class ABase{
    public ABase(){
        System.out.println("ABAse constructor called!");
    }
    public abstract void test();
}
class ADerievedBase extends ABase{
    public ADerievedBase(){
        System.out.println("Derived Constructor called");
    }

    @Override
    public void test() {
        System.out.println("TEST method implemented");
    }
}
public class Base {
    public static void main(String[] args) {
        ADerievedBase derievedBase = new ADerievedBase();
    }
}
