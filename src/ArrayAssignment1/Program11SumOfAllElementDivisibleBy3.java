/* Print sum of all elements divisible by 3.*/
package ArrayAssignment1;

import java.util.Scanner;

public class Program11SumOfAllElementDivisibleBy3 {
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
                sum=sum+arr[i];
                int divide=sum/3;
            System.out.println(divide+" ");
        }
    }
}
