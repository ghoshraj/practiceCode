package java8;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfEachCharacter {

    public static void main(String[] args) {
        String s = "java";
        Map<String, Long> map = Arrays.stream(s.split(""))
        .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(map);
    }
    
}
