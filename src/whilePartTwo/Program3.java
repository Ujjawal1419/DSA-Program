/**
 * WAJP to print sum of all Odd numbers
 from 1 to 100.
 1+3+5+7+………upto 100
 */
package whilePartTwo;

import java.util.Scanner;

public class Program3 {
    public static int sumOfOdd(int n){
        int sum=0;
        int i=1;
        while(i<=n){
            if(i%2!=0)
                sum=sum+1;
            i++;
        }
        return sum;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number up to which you want to sum: ");
        int n=sc.nextInt();
        int result=sumOfOdd(n);
        System.out.println("Sum of Odd number from 1 " + n + "is: " +result);
    }
}
