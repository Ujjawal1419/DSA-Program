/**Demonstrate call by value and call by reference.*/
package ArrayAssigment;

import java.util.Scanner;

public class Program2EvenElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int n = sc.nextInt();

        int[]  arr= new int[n];
        System.out.print("Enter the element: ");
        for(int i=0;i< arr.length;i++){
            arr[i] =sc.nextInt();
        }
        System.out.print(" All Even element: ");
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0)
                System.out.print(arr[i]+" ");
        }
    }
}
