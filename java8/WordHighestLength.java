package java8;
import java.util.Arrays;

public class WordHighestLength {
    public static void main(String[] args) {
        String s = "I Love You";
        String [] arr = s.split(" ");
        String longestWord = Arrays.stream(arr).max((a , b) -> Integer.compare(a.length(), b.length()))
        .orElse(" ");
        System.out.println(longestWord);
    }
    
}
