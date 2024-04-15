package LC_April2024;

//  Trapping Rain Water -> https://leetcode.com/problems/trapping-rain-water/
//  TOPICS -> Array, Two Pointers, Dynamic Programming, Stack, Monotonic Stack.

public class Ap12 {
    public static void main(String[] args) {
        System.out.println(trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }
    public static int trap(int[] height){
        int size=height.length;
        int[] leftMax = new int[size];
        int[] rightMax = new int[size];

        int leftWall = 0, rightWall = 0;

        for (int i = 0; i < size; i++) {
            int j=size-i-1;
            leftWall = Math.max(leftWall, height[i]);
            rightWall = Math.max(rightWall, height[j]);

            leftMax[i] = leftWall;
            rightMax[j] = rightWall;
        }

        int sum=0;

        for (int i = 0; i < size; i++) {
            int water = Math.min(leftMax[i], rightMax[i]);
            sum += Math.max(0, water - height[i]);
        }
        return sum;
    }
}
