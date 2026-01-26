/**Write a java program to take a user input
and print each odd digits of the number
one by one.
 Input:
 N=43705;
 Output:
 5
 7
 3
 */

package whilePartThree;

import java.util.Scanner;

public class Program3 {

        public static void printOddDigits(int n) {
            while (n > 0) {

                if (n % 2 != 0) {
                    int rem = n % 10;
                    System.out.println(rem);
                }
                n=n/10;
            }
        }

        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a input: ");
            int n=sc.nextInt();
            printOddDigits(n);
        }
}


