package leetcode;

import java.util.HashMap;
import java.util.Map;

public class continuousSubarraySum {

    public static void main(String[] args) {
        int nums[] = {23,2,6,4,7};
        int k = 6;
        System.out.println(checkSubarraySum(nums, k));
    }

    public static boolean checkSubarraySum(int arr[], int k){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            sum %=k;
            if (map.containsKey(sum)) {
                if (i - map.get(sum)> 1) {
                    return true;
                }
            }
            else{
                map.put(sum, i);
            }
        }
        return false;
    }
    
}
