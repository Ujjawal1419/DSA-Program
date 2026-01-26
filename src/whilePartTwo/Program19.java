/** WAJP to accept a input from user and
 print factorial of that number.
 i/p: 6
 o/p: 6!= 72*/

package whilePartTwo;

import java.util.Scanner;

public class Program19 {
    public static int getFactorial(int n){
        int fact=1;
        int i=1;
        while(i<=n){
            fact=fact*i;
         i++;
        }
        return fact;

    }

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number which you want to the fact: ");
        int n=sc.nextInt();
        int result=getFactorial(n);
        System.out.println("Factorial of "+n+" is:"+ result);
    }
}
