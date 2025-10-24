package Demo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo{
public static void main(String[] args) {
    int arr[] = {23,2,4,6,6};
    int k = 7;
    System.out.println(checkSubarraySum(arr, k));

    
}

public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum+= nums[i];
            sum%=k;
            if (hashmap.containsKey(sum)) {
                if(i - hashmap.get(sum)>1)
               return true;
            }
            else{
                hashmap.put(sum, i);
            }

        }
        return false;
    }
}