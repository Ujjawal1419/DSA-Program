/** Design a method which will accept a
 number and will return true if all the
 digits of the number is in decreasing
 order.
 Input:
 N=7652;
 Output*/

package whilePartThree;

import java.util.Scanner;

public class Program22 {
    public static boolean isIncreasingDigit(int n) {
        int prev = n % 10;
        n = n / 10;
        while (n > 0) {
            int next = n % 10;
            if (next == prev) {
                return false;
            }
            prev = next;
            n = n / 10;
        }
        return true;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a input: ");
        int  n=sc.nextInt();
        if(isIncreasingDigit(n)) {
            System.out.println("Digit is a Increasing Digits: ");
        }
        else
            System.out.println("Digit is Not a Increasing Digit: ");

    }
}
