package java8;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindTheSumOfUniqueElement {

    public static void main(String[] args) {
        int [] arr = {10,1,2,3,4,2,1,5,0,10};
        // int sum = Arrays.stream(arr).boxed()
        // .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
        // .entrySet().stream().filter(y -> y.getValue() == 1).mapToInt(e -> e.getKey()).sum();

        int sum = Arrays.stream(arr).distinct().sum();
        System.out.println(sum);
    }
    
}
