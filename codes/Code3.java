package codes;

import java.util.List;
import java.util.Objects;

public class Code3 {
    public static void main(String[] args) {
        List<String> list = List.of("o1","o2","o3","","o4","o5");
        list.stream().takeWhile(t-> !t.isEmpty()).forEach(System.out::println);
        System.out.println("Feature/Branch1 changed");
    }
}
