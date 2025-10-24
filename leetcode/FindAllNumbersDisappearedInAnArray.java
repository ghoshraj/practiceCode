package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int arr [] = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

      public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> integer = new HashSet<>();
        List<Integer> integers = new ArrayList();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            integer.add(nums[i]);
        }
        for(int i = 1; i <= nums.length; i++){
            if (!integer.contains(i)) {
                integers.add(i);
            }
        }
        return integers;
    }
}
