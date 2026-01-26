/**
 *
 WAJP to print sum of all natural
 numbers from 1 to 100.
 1+2+3+4+………+10
 */
package whilePartTwo;

import java.util.Scanner;

public class program1 {
    public static int sumOfNatural(int n){
        int sum=0;
        int i=1;
        while(i<=n){
            sum=sum+i;
         i++;
        }
        return sum;
    }

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number which you want to the  sum: ");
        int n=sc.nextInt();
        int result=sumOfNatural(n);
        System.out.println("Sum of Natural number from 1 to " +n+ " is: "+result);
    }
}
