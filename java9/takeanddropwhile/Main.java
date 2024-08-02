package java9.takeanddropwhile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //We have list of number
        List<Integer> numbers = new ArrayList<>(Arrays.asList(11,12,13,14,51,16,17,81,91));
        //for imperative kind of java codes
//        for(Integer e: numbers){
//            if(e > 50){
//                break;
//            }
//            System.out.println(e);
//        }

        //It's kind of limit we are implementing on numbers list
        //numbers.stream().takeWhile(e-> e<50).forEach(System.out::println);

        //It's kind of skipping elements from numbers list
        numbers.stream().dropWhile(e -> e < 50).forEach(System.out::println);
    }
}
