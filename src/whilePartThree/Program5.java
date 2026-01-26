/** Write a java program to take a user input
 and print the biggest digit of the number.
 Input:
 N=43705;
 Output:
 */

package whilePartThree;

import java.util.Scanner;

public class Program5 {
    public static int getBiggest(int n) {
        int big=n%10;
        while (n>0) {
            int rem = n % 10;
            if(rem>big)
           big=rem;
            n=n/10;
        }
        return big;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a input: ");
        int n=sc.nextInt();
        int digit=getBiggest(n);
        System.out.println("Biggest Digit of"+n+" is: "+digit);

    }
}
