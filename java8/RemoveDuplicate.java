package java8;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "abbacdeffd";
        s.chars().distinct().mapToObj(x -> (char)x).forEach(System.out :: println);
    }
    
}
