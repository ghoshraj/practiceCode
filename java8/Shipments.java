package java8;

import java.util.Arrays;

public class Shipments {
    public static void main(String[] args) {
        int [][] arr = {{6,7},{2,4},{8,12}};
        int k = 1;
        int [] startTime = new int [arr.length];
        int [] endTime = new int[arr.length];
        boolean b=true;
        Arrays.sort(startTime);
        Arrays.sort(endTime);

        for(int i = 0; i < arr.length; i++){
            startTime[i] = arr[i][0];
            endTime[i] = arr[i][1];
        }

        int min = findmin(startTime);
        int max = findMax(endTime);
        for(int i = min; i < max; i++){
            if (isPresent(endTime, i)) {
                k++;
            }
            if (isPresent(startTime, i)) {
                if(k <=0) b=false;
                k--; 
            }
        }
        
        System.out.println(b);
    }

    public static int findmin(int [] arr){
        int min = Arrays.stream(arr).min().getAsInt();
        return min;
    }

     public static int findMax(int [] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        return max;
    }

    public static boolean isPresent(int[]arr, int n){
        for(int i=0; i<arr.length;i++){
            if(arr[i] == n) return true;
        }
        return false;
    }
    
}
