package ArrayAssigment;

import java.util.Scanner;

public class Program1SwapTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.print("Enter the first Element: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the second Element: ");
        for(int i=0;i<arr2.length;i++){
            arr2[i] =sc.nextInt();
        }
       for(int i=0;i<arr1.length;i++){
           int temp=arr1[i];
           arr1[i]=arr2[i];
           arr2[i]=temp;
       }
        System.out.println("After swapping: ");
        System.out.print("first Array: ");
        for(int x:arr1){
            System.out.print(x+" ");
        }
        System.out.print("\nSecond Array: ");
          for(int x:arr2){
              System.out.print(x+" ");
          }

    }
}
