package java8;

import java.util.Arrays;

public class FindFirstRepeatedCharacter {

    public static void main(String[] args) {
        String s = "java jav";
       String s2 =  Arrays.stream(s.split("")).filter(x -> s.indexOf(x) != s.lastIndexOf(x))
        .findFirst().get();

        System.out.println(s2);
    }
    
}
