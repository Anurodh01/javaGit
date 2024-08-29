package codes;

public class Code4 {
    private int i;
    public Code4(int i){
        this.i = i;
    }
    public static void main(String []args){
        Code4 c1= new Code4(3);
        Code4 c2= new Code4(3);
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
    }
}
