package leetcode;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindCommonElement {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int result[] = {3, 4, 6, 7};

        Set<Integer> integers = new LinkedHashSet<>();
        for(int tmp : arr){
            integers.add(tmp);
        }

        Set<Integer> rSet = new LinkedHashSet<>();
        for(int num : result){
            if (!integers.contains(num)) {
                rSet.add(num);
            }
        }
        System.out.println(rSet.toString());
    }
    
}
