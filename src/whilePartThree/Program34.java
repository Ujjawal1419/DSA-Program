/**Q34
 WAJP to take user input and count the number
 of binary bits in that number when it is
 represented in binary form.
 n=20  {binary=10100}
 o/p
 5 */
package whilePartThree;

import java.util.Scanner;

public class Program34 {
    public static int countBinaryDigits(int n){
        int count=0;
        while(n>0){
            count++;
            n/=2;
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int count=countBinaryDigits(n);
        System.out.println(count);
    }
}
