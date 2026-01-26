/** Write a java program to take a user input
 and print the difference of biggest digit
 and smallest digit of the number.
 Input:
 N=42375;
 Output:
 */

package whilePartThree;

import java.util.Scanner;

public class Program6 {
    public static int getDifference(int n) {
        int big=n%10;
        int small=n%10;
        while (n>0) {
            int rem = n % 10;
            if(rem>big)
                big=rem;
            if(rem<small)
                small=rem;
            n=n/10;
        }
        return big-small;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a input: ");
        int n=sc.nextInt();
        int diff=getDifference(n);
        System.out.println("Diff Digit of"+n+" is: "+diff);

    }
}
