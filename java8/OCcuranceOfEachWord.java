package java8;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OCcuranceOfEachWord {
    public static void main(String[] args) {
        String s = "i am a java developer and python developer";
        Map<String, Long> worldCount = Arrays.stream(s.split(" "))
        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        worldCount.entrySet().stream().sorted((e1, e2) -> (e2.getValue().compareTo(e1.getValue())))
        .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}