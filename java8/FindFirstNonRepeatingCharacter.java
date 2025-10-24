package java8;

import java.util.Arrays;

public class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String s = "Hello World";
        String s1 = Arrays.stream(s.split("")).filter(x -> s.indexOf(x) == s.lastIndexOf(x))
        .findFirst().get();

        System.out.println(s1);
    }
    
}
