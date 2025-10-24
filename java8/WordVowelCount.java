package java8;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WordVowelCount {
    public static void main(String[] args) {
        String s = "i am learning stream api in java";
        Arrays.stream(s.split(" ")).filter(x -> x.matches(".*[aeiou].*")) // check if word has at least 1 vowel
                .forEach(System.out :: println);;


    }
}
