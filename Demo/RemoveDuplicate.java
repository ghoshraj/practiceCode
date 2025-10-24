package Demo;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String sentence = "Java Stream API is powerful powerful powerful and useful";
        List<String> uniqueWords = Arrays.stream(sentence.split(" ")).distinct().collect(Collectors.toList());
        System.out.println(uniqueWords);
    }
}