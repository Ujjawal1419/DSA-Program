/**Q10
 Write a java program to take a user input
 and count how many 0 digit is in number.
 Input:
 N=430705;
 Output:
 2*/
package whilePartThree;

import java.util.Scanner;

public class Program10 {
    public static int getZero(int n) {
        int count=0;
        int small=n%10;
        while (n>0) {
            int rem=n%10;
            if(rem==0)
            count++;
            n=n/10;
        }
        return count;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a input: ");
        int n=sc.nextInt();
        int count=getZero(n);
        System.out.println("Count zero of"+n+" is: "+count);

    }
}
