package java8;

import java.util.Arrays;
import java.util.Comparator;

public class FindNthHeighest {
    public static void main(String[] args) {
        String s = "now i am practice java 8";
        String word = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String :: length)
        .reversed()).skip(1).findFirst().get();
        System.out.println(word);
    }
    
}
