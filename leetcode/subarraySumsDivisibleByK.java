package leetcode;

import java.util.HashMap;
import java.util.Map;

public class subarraySumsDivisibleByK {
    public static void main(String[] args) {
        int arr[] = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(arr, k));

    }
    public static int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int reminder = sum % k;
            if (reminder < 0) 
            reminder += k;

            count += map.getOrDefault(reminder, 0);
            map.put(reminder, map.getOrDefault(reminder, 0)+ 1);
        }
        return count;
    }
}
