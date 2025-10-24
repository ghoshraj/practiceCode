package Demo;
import java.util.Arrays;
import java.util.Comparator;

public class HeighestLength {
    public static void main(String[] args) {
        String sentence = "Java Stream API is powerful powerful powerful and useful";
        String word = Arrays.stream(sentence.split(" ")).max(Comparator.comparing(String::length)).orElse(" ");
        System.out.println(word);
    }
}
