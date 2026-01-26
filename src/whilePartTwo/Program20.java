/** WAJP to accept two numbers from user
 and print power of a to b.
 i/p: 6
 3
 o/p: 6 to power 3 is: 216*/

package whilePartTwo;

import java.util.Scanner;

public class Program20 {
    public static int getPower(int a,int b){
        int pow=1;
        int i=1;
        while(i<=b){
            pow=pow*a;
            i++;
        }
        return pow;

    }

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number which you want to the 1st power: ");
        int a=sc.nextInt();
        System.out.println("Enter the Number which you want to the 2st power: ");
        int b=sc.nextInt();
        int result=getPower(a,b);
        System.out.println(a+" to the Power of "+b+" is: "+ result);
    }
}
