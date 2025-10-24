package leetcode;

public class containerWithMostWater {

    public static void main(String[] args) {
        int arr[] = {8,7,2,1};
        System.out.println(maxarea(arr));        
    }

    public static int maxarea(int [] height){
        int finalArea = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            finalArea = Math.max(finalArea, area);

            if (height[left] < height[right]) {
                left++;
            }
            else{
                right--;
            }
        }
        return finalArea;
    }
    
}
