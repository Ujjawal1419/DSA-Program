/**Q12
 Write a java program to take a user input
 and count the even digits of the number.
 Input:
 N=42765;
 Output:
 3*/
package whilePartThree;

import java.util.Scanner;

public class Program12 {
    public static int getEven(int n) {
        int count=0;
        int small=n%10;
        while (n>0) {
            int rem=n%10;
            if(rem%2==0)
                count++;
            n=n/10;
        }
        return count;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a input: ");
        int n=sc.nextInt();
        int count=getEven(n);
        System.out.println("Count zero of"+n+" is: "+count);

    }
}
