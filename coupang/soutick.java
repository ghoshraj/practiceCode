package coupang;

public class soutick {
    public static void main(String[] args) {
    int arr[] = {1, 4, 20, 3, 10, 5} ;
    int target = 33;
    boolean a = false;
    for(int i = 0; i < arr.length; i++){
        int sum = arr[i];
        for(int j = i + 1; j < arr.length; j++){
            sum+= arr[j];
            if (sum == target) {
             a = true;  
             break; 
            }
        }
    }
    System.out.println(a);

   } 
}
