package codes;
abstract class Apple{
    protected boolean isRiped;
    public Apple(){
        System.out.println("Constructor Apple called!");
    }
    public void setIsRiped(boolean isRiped){
        this.isRiped = isRiped;
    }
}
class RedApple extends Apple{
    public RedApple(){
        super();
    }
    public boolean getStatusOfApple(){
        return super.isRiped;
    }
}
public class Code4 {
    public static void main(String []args){
        RedApple redApple = new RedApple();
        redApple.setIsRiped(true);
        System.out.println(redApple.getStatusOfApple());
        System.out.println("CODE$ changed by feature/my-branch")
    }
}
