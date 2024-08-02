package java9.iteratemethod;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        for(int i=0;i<5;i++){
////            System.out.print(i+" ");
////        }
////        //functional
////        IntStream.range(0,5).forEach(System.out::println);
////
////        for(int i=0;i<=5;i++){
////            System.out.println(i+" ");
////        }
////        //functional
////        IntStream.rangeClosed(0,5).forEach(System.out::println);
////
////        for(int i=0;i<=5;i+=2){
////            System.out.println(i);
////        }

        //functional
        IntStream.iterate(0,i-> i<=5,i-> i+2).forEach(System.out::println);
    }
}
