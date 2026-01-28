/*Trapping Rain Water*/
package ArrayAssigment;

public class Program81TrappingRainWater {
    public static void main(String[]args){

        int[] height = {4,2,0,3,2,5};
        System.out.println(trap(height));
    }
    public static  int trap(int [] height){
        int start=0, end=height.length-1;
        int leftMax=height[0], rightMax=height[height.length-1];
        int water=0;
        while(start<end){
            if(height[start]<height[end]){
                if(height[start]>leftMax)
                    leftMax=height[start];
                else water=water+leftMax-height[start];
                start++;
            } else{
                if(height[end]>rightMax)
                    rightMax=height[end];
                else
                    water=water+rightMax-height[end];
                end--;
            }
        }
        return water;
    }
}
