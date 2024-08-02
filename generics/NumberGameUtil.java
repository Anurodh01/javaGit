package generics;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumberGameUtil {
    public static <T extends Number & Comparable<T>> List<T> getSortedNumberList(List<T> numbers){
        return numbers.stream().sorted().collect(Collectors.toList());
    }

    public static <T extends Number & Comparable<T>> T getMaximumNumber(List<T> numbers){
        return numbers.stream().max(Comparator.naturalOrder()).get();
    }
}
