package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindEvenOdd {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        List<Integer> evenNumber = Arrays.stream(arr).boxed().filter(x -> x % 2 == 0).collect(Collectors.toList());
        List<Integer> oddNumber = Arrays.stream(arr).boxed().filter(x -> x%2 != 0).collect(Collectors.toList());
        System.out.println(evenNumber);
        System.out.println(oddNumber);

        List<Integer>list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<List<Integer>> result = list.stream().collect(Collectors.groupingBy(x -> x%2 == 0 , Collectors.toList()))
        .entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());

        System.out.println(result);
    }   
}
