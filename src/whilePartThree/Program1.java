/**1

 Write a java program to take a user input and print each
 digits of the number one by one from right to left.
 Input:
 N=43705;
 Output:
 5
 0
 7
 3
 4*/

package whilePartThree;

import java.util.Scanner;

public class Program1 {
    public static void printRightToLeft(int n) {
        while (n > 0) {
            int rem = n % 10;
            System.out.println(rem);
            n= n/ 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Input: ");
        int n = sc.nextInt();
        printRightToLeft(n);

    }
}