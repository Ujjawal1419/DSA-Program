/*WAJP to remove an element from the certain position of the array.

Q:20
Original array:10 20 30 40 50 60 70
Updated array: 10 20 40 50 60 70
*/
package ArrayAssigment;

import java.util.Scanner;

public class Program20RemoveCertainPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the first Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.print("Enter the index to remove: ");
        int index = sc.nextInt();
         arr=remove(arr,index);

        System.out.println("Array after removing element:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
    public static int[] remove(int[] a,int index){

        if(index>=a.length)
            return a;
        int[] b=new int[a.length-1];
        for(int i=0;i<b.length;i++){
            if(i<index)
                b[i]=a[i];
            else
                b[i]=a[i+1];
        }
        return b;
    }
}
