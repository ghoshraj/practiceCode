package coupang;

import java.util.Arrays;

public class Hitarth {

    public static void main(String[] args) {
       int shipments[][] = new int[][] { {1, 4}, {2, 5}, {6, 8} };
       int dock_slots = 2;
       int start [] = new int[shipments.length];
       int end [] = new int[shipments.length];
       boolean b = true;

       for(int i = 0; i < shipments.length; i++){
        start[i] = shipments[i][0];
        end[i] = shipments[i][1];
       }

       Arrays.sort(start);
       Arrays.sort(end);
       int min = Arrays.stream(start).min().getAsInt();
       int max = Arrays.stream(end).max().getAsInt();
       for(int i = min; i < max; i++){
        if (isPresent(end, i)) {
            dock_slots++;
        }
        if (isPresent(start, i)) {
            if (dock_slots <= 0) {
                b = false;
            }
            dock_slots--;
        }
       }
       System.out.println(b);
    }

    public static boolean isPresent(int [] arr, int n){
        for(int i = 0; i < arr.length; i++){
            if (n == arr[i]) {
                return true;
            }
        }
        return false;
    }
    
}
