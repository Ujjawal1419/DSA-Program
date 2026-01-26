/*print the element of the array*/
package ArrayYoutube;

import java.util.Scanner;

public class ProductOfAllElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();

        int[] arr= new int[n];
        int prod=1;
        System.out.print("Enter the element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            prod*=arr[i];
        }
        System.out.print("Product of array is: "+prod);
    }
}
