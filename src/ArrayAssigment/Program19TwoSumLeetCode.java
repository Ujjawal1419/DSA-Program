package ArrayAssigment;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Program19TwoSumLeetCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();

        int[] arr= new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target=sc.nextInt();

       try {
           int[] result=twoSum(arr,target);
           System.out.print("Indexes: "+result[0]+" , "+result[1]);
       }catch (NoSuchElementException e){
           System.out.println(e.getMessage());
       }



    }
    public static int[] twoSum(int[] a,int target){

        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target)
                    return new int[]{i,j};
            }
        }
//        return new int[]{};
        throw new  NoSuchElementException("Such Elements are not available: ");
    }
}


/*import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int remaining = target - nums[i];

            if (map.containsKey(remaining)) {
                return new int[]{ map.get(remaining), i };
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
*/