package java9.ifpresentelse;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IfPresentElseMethod {
    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1,10).boxed().toList();
        Optional<Integer> firstData = list.stream().filter(e -> e > 5).findFirst();
        System.out.println(firstData);
        Optional<Integer> secondData = list.stream().filter(e -> e > 50).findFirst();
        System.out.println(secondData);
        secondData.ifPresent(System.out::println);
        secondData.ifPresentOrElse(System.out::println, ()-> System.out.println("No Value is Present!"));
    }
}
