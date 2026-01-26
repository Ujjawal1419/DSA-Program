/** Q11
 Write a java program to take a user input
 and count how many 3 has appeared in
 the number
 Input:
 N=4373533;
 Output:
 4*/
package whilePartThree;

import java.util.Scanner;

public class Program11 {
    public static int getThree(int n) {
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
        int count=getThree(n);
        System.out.println("Count zero of"+n+" is: "+count);

    }
}
