package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMismatch {

    public static void main(String[] args) {
        int arr [] = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
     public static int[] findErrorNums(int[] nums) {
        Set<Integer> integer = new HashSet<>();
        int duplicate = 0;
        int missing = 0;
        for(int i = 0; i < nums.length; i++){
            integer.add(nums[i]);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!integer.contains(i)){
                duplicate = nums[i - 1];
                missing = i;
            }
        }
        return new int[] {duplicate, missing};
    }
}
