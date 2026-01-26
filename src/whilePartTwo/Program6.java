/**
 * WAJP to print sum of squares of all even
 numbers from 1 to 100.
 𝟐*𝟐 +𝟒*4+𝟔*6+⋯…𝒖𝒑𝒕𝒐 𝟏𝟎�
 */
package whilePartTwo;

import java.util.Scanner;

public class Program6 {
    public static int sumOfSquareEven(int n){
        int sum=0;
        int i=1;
        while(i<=n){
            if(i%2==0)
                sum=sum+(i*i);
          i++;
        }
        return sum;

    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which you want the sum: ");
        int n=sc.nextInt();
        int result=sumOfSquareEven(n);
        System.out.println("Sum of Even number from 1 to "+n+" is: "+result);
    }
}
