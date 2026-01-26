/** Write a java program to take a user input
 and count the total digit of the number.
 Input:
 N=43705;
 Output:
 */


package whilePartThree;

import java.util.Scanner;

public class Program7 {
    public static int getCount(int n) {
        int count=0;
        int small=n%10;
        while (n>0) {
            count++;
            n=n/10;
        }
        return count;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a input: ");
        int n=sc.nextInt();
        int count=getCount(n);
        System.out.println("Total Digit of"+n+" is: "+count);

    }
}
