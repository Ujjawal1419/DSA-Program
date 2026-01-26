/*Q:44
WAJP to print Second biggest element of the
array.
int[] a
= {80, 80, 43, 50, 38, 63, 58, 80};
o/p
63*/
package ArrayAssigment;

import java.util.Scanner;

public class Program44BiggestSecondElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the Element: ");
        //  arr{80,80,43,50,63,58,80 }
        for (int i=0;i< arr.length;i++){
             arr[i] =sc.nextInt();
        }

        int result = printSecondBiggest(arr);
        System.out.println("Second biggest element is: " + result);
    }
    public static int printSecondBiggest(int[] a) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int x : a) {
            if (x > max) {
                secondMax = max;
                max = x;
            } else if (x > secondMax && x != max) {
                secondMax = x;
            }
        }
    return secondMax;
    }
}
