package leetcode;

class TrappingRainWater {
    public static void main(String[] args) {
        int arr[] = {4,2,0,3,2,5};
        System.out.println(trap(arr));
    }
    public static int trap(int[] height) {
        int sum = 0; 
        int n = height.length;
        int leftmax[] = new int [height.length];
        int rightmax[] = new int [height.length];
        leftmax[0] = 0;
        rightmax[n - 1] = 0;
        for(int i = 1; i < n; i++){
            leftmax[i] = Math.max(leftmax[i - 1], height[i - 1]);
        }
        for(int i = n - 2; i > 0; i--){
            rightmax[i] = Math.max(rightmax[i + 1], height[i + 1]);
        }

        for(int i = 0; i < n; i ++){
            int trapingwater = Math.min(leftmax[i], rightmax[i]);
            int waterLevel = trapingwater - height[i];
            if (waterLevel > 0) {
                sum+= waterLevel;
            }
        }
        return sum;
    }
}