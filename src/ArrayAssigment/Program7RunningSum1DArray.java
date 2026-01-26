package ArrayAssigment;

import java.util.Scanner;

//public class Program7RunningSum1DArray {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the size: ");
//        int n=sc.nextInt();
//        int[] arr= new int[n];
//        System.out.print("Enter the Element: ");
//        for(int i=0;i<arr.length;i++){
//            arr[i] =sc.nextInt();
//        }
//        int[] result=runningSum(arr);
//        System.out.print("Running Array: ");
//        for(int x:result){
//            System.out.print(x+" ");
//        }
//    }
//    public static int[] runningSum(int[] a){
//        for(int i=1;i<a.length;i++){
//            a[i] +=a[i-1];
//        }
//        return a;
//    }
//}


public class Program7RunningSum1DArray{
    public static void main(String[]args){
        int[] arr={1,2,3,4,5};
        int sum=0;
        System.out.print("Running Array is: ");
        for(int x:arr){
            sum=sum+x;
            System.out.print(sum+" ");
        }
    }
}
