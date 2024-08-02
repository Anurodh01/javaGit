package generics;

public class BoxUtils {
    public static <T extends Boxable> int getItemCount(Box<T> box){
        return box.getItems().size();
    }
}
