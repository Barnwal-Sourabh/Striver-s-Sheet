package LinkedListAndArrays;

public class TrappingRainwater {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int sum = 0;

        while(l<=r){
            if(height[l] <= height[r]){
                if(height[l] >= leftMax){
                    leftMax = height[l];
                }else {
                    sum += leftMax - height[l];
                }
                l++;
            }else {
                if(height[r] >= rightMax){
                    rightMax = height[r];
                }else {
                    sum += rightMax - height[r];
                }
                r--;
            }
        }

        return sum;
    }
}
