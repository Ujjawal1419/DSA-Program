package ArrayAssigment;

import java.util.Scanner;

public class Program26RotateLeftKPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter the Element: ");
        for(int i=1;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

    }
    public static void rotateLeftKPosition(int[]a, int k){
        k=k%a.length;
        reverse(a,0,a.length-1);
        reverse(a,0,a.length-k-1);
        reverse(a,a.length-k,a.length-1);

    }
    public static void reverse(int[] a,int start,int end){
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++; end--;
        }

    }
}
