package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        int arr [] = {0,1};
        System.out.println(missingNumber(arr));
    }
     public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i != nums[i])
          return i;
        }
        return nums.length;
    }
}
