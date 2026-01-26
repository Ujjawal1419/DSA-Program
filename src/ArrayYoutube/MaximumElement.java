package ArrayYoutube;

import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        //int max=arr[0];
        int max=Integer.MIN_VALUE;
        System.out.print("Enter the element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.print("Maximum element of Array: "+max);

    }
}
