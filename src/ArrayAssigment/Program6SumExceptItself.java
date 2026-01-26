
/**
 * WAJP for below requirements:
 * Sum except itself:
 * Original array:
 * resultant array:
 * 2 5 4 3 6
 * 18 15 16 17 14
 */
package ArrayAssigment;

import java.util.Scanner;

public class Program6SumExceptItself {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
          int sum=0;
          for(int x:arr) {
              sum = sum + x;
          }
            System.out.print("Result Array: ");
        for (int j : arr) {
            System.out.print(sum - j + " ");
        }
        }
    }

