package codes;

import java.util.EnumMap;

class Super{
    private int a;
    void getData(){
        System.out.println("I am from getData method!");
    }
    public Super(){
        System.out.println("Constructor called!");
    }
    void onlySuper(){
        System.out.println("Only Super method called!");
    }
}
abstract class A extends Super{
    void getData(){
        System.out.println("From getDAta from abstract class!");
    }
}
class Barathean extends A{

}
public class Code2 {
    public static void main(String[] args) {
        Barathean sp = new Barathean();
        sp.onlySuper();
    }
}
