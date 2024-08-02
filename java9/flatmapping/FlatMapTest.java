package java9.flatmapping;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTest {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = Arrays.asList(7,8,9,10);
        Map<Integer,List<Integer>> map = new LinkedHashMap<>();
        mapEvenList(map, list1);
        mapEvenList(map, list2);
        map.entrySet().stream().forEach((d)-> System.out.println(d.getKey()+" "+d.getValue()));

        ///With Java 9 Collectors.flatMapping() it is quite easy to flatmap the values
        Map<Integer, List<Integer>> collect = Stream.of(list1, list2).peek(System.out::println).collect(Collectors.groupingBy(List::size, Collectors.flatMapping(Collection::stream, Collectors.toList())));
        System.out.println(collect);
    }
    public static void mapEvenList(Map<Integer, List<Integer>> map, List<Integer> list){
        map.put(list.size(), list.stream().filter(e-> e%2 == 0).toList());
    }
}
