/***/
package whilePartThree;

import java.util.Scanner;

public class Program23 {
    public static boolean hasAlternatingBits(int n) {
        int prev = n %2;
        n = n / 2;
        while (n > 0) {
            int next = n % 2;
            if (next == prev) {
                return false;
            }
            prev = next;
            n = n / 2;
        }
        return true;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a input: ");
        int  n=sc.nextInt();
        if(hasAlternatingBits(n)) {
            System.out.println("Digit is a BIts Digits: ");
        }
        else
            System.out.println("Digit is Not a Bits Digit: ");

    }
}
