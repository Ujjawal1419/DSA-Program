/*Container With Most Water*/
package ArrayAssigment;

public class Program80ContainerWithMostWater {
    public static void main(String[] args) {

        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));

    }
    public  static int maxArea(int[] a){
        int start=0;
        int end=a.length-1;
        int maxArea=0;
         while(start<end){
             int area;
             if(a[start]<a[end])
                 area=(end-start)*a[start++];
             else
                 area=(end-start)*a[end--];
             if(area>maxArea)
                 maxArea=area;
         }
         return maxArea;
    }
}
