/***Write a java program to take a user input
 and print the sum of each even digits of
 the number.
 Input:
 N=42765;
 Output:
 12*/
package whilePartThree;

import java.util.Scanner;

public class Program16 {
    public static int getEvenDigitSum(int n) {
        int sum=0;

        while (n>0) {
            int rem=n%10;
            if(rem%2==0)
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a input: ");
        int n=sc.nextInt();
        int sum=getEvenDigitSum(n);
        System.out.println("Sum of"+n+" is: "+sum);

    }
}
