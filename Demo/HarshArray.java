package Demo;
import java.util.ArrayList;

public class HarshArray {

    public static void main(String[] args) {
        int arr[] = {-1};
        int lower = -1;
        int higher = -1;
        // Expected output --> [2,2][4,49][51,74][76,99]

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i] + 1;
            int y;

            if (i == arr.length - 1) {
                y = higher;  
                if (x <= y) {
                    list.add(x);
                    list.add(y);
                }
            } else {
                y = arr[i + 1] - 1;
                if (x <= y) {
                    list.add(x);
                    list.add(y);
                }
            }
        }

        System.out.println(list);
    }
}
