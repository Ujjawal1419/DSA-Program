/*
* WAJP find missing element from a given array
which has a missing element in a range of n.
N=7
i/p: [7, 4,3, 0, 5, 1, 6]
o/p: 2
*
* messing element ka mtlab hota hai ki kitna bhi element liya gya hai usmse usme se ek missing hoga jaise ki [1 0 5 4 3 6 7] 7 range ka hai usme se 2 missing hai
*/
package ArrayAssigment;

import java.util.Scanner;

public class Program27MissingElement {
    public static void main(String[] args) {
        System.out.print("Enter the size: ");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr=new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int missing=missingNumber(arr);
        System.out.println("Missing Element is: "+missing);

    }
    public static int missingNumber(int[] nums){
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        int n=nums.length;
        return n*(n+1)/2-sum;

    }
}
