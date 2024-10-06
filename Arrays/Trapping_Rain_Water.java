package DSA_450.Arrays;

public class Trapping_Rain_Water {
    public static int trap(int[]height){
        int left =0;
        int right = height.length-1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while(left<right){
            if(height[left]<=height[right]){
                leftMax = Math.max(leftMax,height[left]);
                water += Math.max(0,leftMax-height[left]);
                left++;
            }else{
                rightMax = Math.max(rightMax,height[right]);
                water += Math.max(0,rightMax- height[right]);
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int []arr = {3,0,0,2,0,4};
        int res = trap(arr);
        System.out.println("Output :" + res);
    }
}
