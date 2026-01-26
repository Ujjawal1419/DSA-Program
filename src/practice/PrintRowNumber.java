package practice;

import java.util.Scanner;

//public class PrintRowNumber {
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n=sc.nextInt();
//        printPattern(n);
//
//    }
//    public static void  printPattern(int n){
//        for(int i=1;i<=n;i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//
//    }


public class PrintRowNumber{
    public static void main (String[]args){
        int[] arr={1,2,3,4,5};
        int sum= 0;
        for (int x : arr) {
            sum=sum+x;
            System.out.print(sum+" ");
        }

    }
}

