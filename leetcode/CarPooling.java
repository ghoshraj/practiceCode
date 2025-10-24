package leetcode;

public class CarPooling {

    public static void main(String[] args) {
        int arr[][] = {{2,1,5},{3,3,7}};
        int capacity = 4;
        System.out.println(carPooling(arr, capacity));

    }

    public static boolean carPooling(int[][] arr, int k){
        int [] stops = new int[1001];

        for(int []temp : arr){
            int numberOfPassanger = temp[0];
            int from = temp[1];
            int to = temp[2];

            stops[from] += numberOfPassanger;
            stops[to] -= numberOfPassanger;
        }

        int cuurentPassanger = 0;
        for(int i = 0; i < 1001; i++){
            cuurentPassanger+= stops[i];
            if (cuurentPassanger > k) 
            return false;
        }
         return false;
    }
    
}
