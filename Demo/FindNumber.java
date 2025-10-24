package Demo;
import java.util.Arrays;

import java.util.stream.IntStream;


public class FindNumber {
     public static void main(String[] args) {
        int[] result = {1, 2, 3, 4, 5};
        int[] array1 = {3, 4, 6, 7};
        int[] array2 = {1, 2,2, 8, 9};
        IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
        .filter(n -> FindNumber.check(result, n) )
        .distinct()
        .forEach(System.out::println);
    }
    public static boolean check (int[] result,int n){
        for(int i=0; i<result.length;i++){
            if(result[i] == n) return true;
        }
        return false;
    }
}
