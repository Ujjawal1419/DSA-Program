/*WAJP to check array is a palindromic array or not. Return true or false accordingly.
Original array:10 20 30 40 30 20 10
Output: true
Original array:10 20 30 40 30 50 107

Output: false*/
package ArrayAssigment;

import java.util.Scanner;

public class Program18PalindromicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if (isPalindromic(arr)) {
            System.out.println("Array is Palindromic");
        } else {
            System.out.println("Array is NOT Palindromic");
        }
    }
    public static boolean isPalindromic(int[] a){
        int start=0;
        int end=a.length-1;
        while (start<end){
            if(a[start]!=a[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
}
