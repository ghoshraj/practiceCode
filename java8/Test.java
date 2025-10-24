package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,5,7,4,6,8);
        nums.stream().filter(n -> IntStream.rangeClosed(2, (int)Math.sqrt(n))
        .allMatch(i->n%i==0))
        .forEach(System.out::println);

    }
}
