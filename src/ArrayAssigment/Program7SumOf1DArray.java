package ArrayAssigment;

import java.util.Scanner;

public class Program7SumOf1DArray {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size:  ");
        int n=sc.nextInt();

        int[]  arr=new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        int[] result=runningSum(arr);
        System.out.print("Running sumArray: ");
        for(int num:result){
            System.out.print(num+" ");
        }
    }
    public static int[] runningSum(int[] a){
        for(int i=1;i<a.length;i++){
            a[i] +=a[i-1];
        }
          return a;
    }
}
