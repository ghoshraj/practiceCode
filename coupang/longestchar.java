package coupang;

import java.util.HashMap;
import java.util.Map;

public class longestchar {

    public static void main(String[] args) {
       int arr []= {23,2,6,4,7};
       int k = 13;
       System.out.println(checkSubarraySum(arr, k));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer,Integer> hashmap = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum+= nums[i];

            sum%=k;
            if (hashmap.containsKey(sum)) {
               return true;
            }
            else{
                hashmap.put(sum, i);
            }

        }

        // for(int i = 0; i < nums.length; i++){
        //     int sum = nums[i];
        //     for(int j = i + 1; j < nums.length; j++){
        //         sum += nums[j];
        //         if(sum % k == 0)
        //         return true;
        //     }
        // }
         return false;
    }
    
}
