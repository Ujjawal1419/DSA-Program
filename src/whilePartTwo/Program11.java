/*WAJP to print the sum of below series:
 𝟏∗𝟐*𝟐 +𝟐∗𝟑*3+𝟑∗𝟒*4……𝒖𝒑𝒕𝒐 𝟏𝟎�*/
package whilePartTwo;

import java.util.Scanner;

public class Program11 {
    public static int getsum(int n){
        int sum=0;
        int i=1;
        while(i<=n){
                sum=sum+i*(i+1)*(i+1);
            i++;
        }
        return sum;

    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to the sum: ");
        int n=sc.nextInt();
        int result=getsum(n);
        System.out.println("Sum of cube of all even number from 1 to "+n+ " is: "+result);
    }
}
