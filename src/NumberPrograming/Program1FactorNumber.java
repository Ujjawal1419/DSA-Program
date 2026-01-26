/*WAJP to take user input and print and count
all the factors of the number.
*/
package NumberPrograming;

import java.util.Scanner;

public class Program1FactorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printFactors(n);
    }

    public static void printFactors(int n) {
       int count = 0;
        System.out.println("Factors of " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                count++;
            }
        }
    }
}

