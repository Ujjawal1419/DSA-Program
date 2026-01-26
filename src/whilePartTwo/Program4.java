/**
 * WAJP to print sum of squares of all
 natural numbers from 1 to 100.
 𝟏*1 +𝟐*𝟐+𝟑*3+⋯…𝒖𝒑𝒕𝒐 𝟏𝟎0
 */
package whilePartTwo;

import java.util.Scanner;

public class Program4 {
    public  static int sumOfSquare(int n){
        int sum=0;
        int i=1;
        while (i<=n) {
            sum= sum+(i*i);
            i++;
        }
        return sum;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number up to which you want to the  sum: ");
        int n =sc.nextInt();
        int sum= sumOfSquare(n);
        System.out.println("sum of Square number from 1 " + n +" is: "+sum);


    }
}
