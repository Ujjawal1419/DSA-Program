/*3. count all even elements from array. */
package ArrayAssignment1;

import java.util.Scanner;

public class Program3CountAllEvenArray {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n =sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
               count++;
        }
        System.out.println("total count is: "+count);
    }
}
