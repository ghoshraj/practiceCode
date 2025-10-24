package coupang;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Harsha {

    public static void main(String[] args) {
       int []result = {1, 2, 3, 4, 5};
       int []array1 = {3, 4, 6, 7};
       int []array2 = {1, 2, 8};

       IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
       .filter(n -> Harsha.check(result, n))
       .distinct()
       .forEach(System.out::println);
       
    }
    
    public static boolean check(int []arr , int k){
        for(int i = 0 ; i< arr.length; i++){
            if (arr[i] == k) {
             return true;   
            }
        }
        return false;
    }
}
