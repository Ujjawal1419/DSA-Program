/**
 * WAJP to print sum of all even numbers
 from 1 to 100.
 2+4+6+8+………upto 100
 */

package whilePartTwo;

import java.util.Scanner;

public class program2 {
    public static int sumOfEven(int n){
        int sum=0;
        int i=1;
        while(i<=n){
            if(i%2==0)
                sum=sum+1;
            i++;
        }
        return sum;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number up to which you want to sum: ");
        int n=sc.nextInt();
        int result=sumOfEven(n);
        System.out.println("Sum of Even number from 1 " + n + " is: " +result);
    }
}
