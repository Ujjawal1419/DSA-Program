/** Q15
 Write a java program to take a user input
 and print the sum of each digit of the
 number.
 Input:
 N=4207065;
 Output:
 24*/
package whilePartThree;

import java.util.Scanner;

public class Program15 {
    public static int getDigitSum(int n) {
        int sum=0;

        while (n>0) {
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a input: ");
        int n=sc.nextInt();
        int sum=getDigitSum(n);
        System.out.println("Sum of"+n+" is: "+sum);

    }
}
