/**
 *  WAJP to print sum of cubes of all natural
 numbers from 1 to 100.
 𝟏*1*1 +𝟐*2*2+𝟑*3*3…𝒖𝒑𝒕𝒐 𝟏𝟎�
 */
package whilePartTwo;

import java.util.Scanner;

public class Program5 {
    public static int sumOfCube(int n){
        int sum=0;
        int i =1;
        while(i<=n){
            sum =sum+(i*i*i);
            i++;
        }
        return  sum;
    }


    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number which you want to number the sum: ");
        int n=sc.nextInt();
        int result = sumOfCube(n);
        System.out.println("sum of cube number from 1 " +n+ "is: "+result);
    }
}
