package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class RearrangeNumber {

    public static void main(String[] args) {
        int arr[] = {10,40,20,30};
        Arrays.stream(arr).sorted().forEach(System.out :: println);
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
}
}
