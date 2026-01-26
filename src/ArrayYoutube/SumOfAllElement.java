/*Sum of all given element*/
package ArrayYoutube;

import java.util.Scanner;

public class SumOfAllElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        int sum=0;
        System.out.print("Enter the element:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.print("Sum of array is: "+sum);
    }
}
