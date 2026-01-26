/*  Access all even elements from array. */
package ArrayAssignment1;

import java.util.Scanner;

public class Program2AllEvenElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();

        int[] arr= new int[n];
        System.out.print("Enter the element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                System.out.println("All even Element is: "+arr[i]);
        }
    }
}
