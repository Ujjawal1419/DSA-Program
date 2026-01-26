/** Write a java program to take a user input
 and print each even digits of the number
 one by one.
 Input:
 N=43705;
 Output:
 0
 4*/

package whilePartThree;

import java.util.Scanner;

public class Program2 {
    public static void printEvenDigits(int n) {
        while (n > 0) {
            if (n % 2 == 0) {
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
        System.out.println("Each Even Digit");
        printEvenDigits(n);
    }
}
