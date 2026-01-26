package ArrayAssignment1;

import java.util.Scanner;

public class Program12BiggestAndSmallestElementArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.print("Enter the element: ");
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
       int biggest =arr[0];
        int smallest= arr[0];
        for(int i=0;i<arr.length;i++){
           if(arr[i]>biggest){
               biggest=arr[i];
           }
           if(arr[i]<smallest){
               smallest= arr[i];
           }
        }
        System.out.println("biggest element: "+biggest);
        System.out.println("smallest element: "+smallest);
    }

}
