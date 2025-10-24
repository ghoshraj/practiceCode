package leetcode;

import java.util.Arrays;

public class Missing {

    public static void main(String[] args) {
        int arr[] = {15,20,25,30,35,45,50};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int arr[]){
        Arrays.sort(arr);
        int first = arr[0];
        for(int i = 1 ; i< arr.length; i++){
            if (first + 5 != arr[i]) {
                return first + 5;
            }
            first = arr[i];
        }
        return - 1;
    }
    
}
