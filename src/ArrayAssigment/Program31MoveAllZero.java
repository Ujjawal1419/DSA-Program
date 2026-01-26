/*Q:31
WAJP to move all zeroes of an array to the end.
i/p: [7, 0, 2, 6, 0, 4]
o/p: [7, 2, 6, 4, 0, 0*/
package ArrayAssigment;

import java.util.Scanner;

public class Program31MoveAllZero {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int n=sc.nextInt();

        int[] nums=new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        moveZero(nums);
        System.out.print("After moving Zeros: ");
          for(int num:nums){
         System.out.print(num+" ");
}
    }
    public static void moveZero(int[] nums){
        for(int i=0,j=0;i<nums.length;i++){
            if(nums[i]!=0 ){
                if(i!=j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
