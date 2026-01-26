/*Print sum of all odd elements from array. */
package ArrayAssignment1;

import java.util.Scanner;

public class Program10SumAllOddElementArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter the element: ");
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0)
                sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
