/**WAJP to print sum of cubes of all even
 numbers from 1 to 100.
 𝟐*2*2+𝟒*4*4*4+𝟔*6*6+⋯…𝒖𝒑𝒕𝒐 𝟏𝟎�
 */
package whilePartTwo;

import java.util.Scanner;

public class Program7 {
    public static int sumOfCubeEven(int n){
        int sum=0;
        int i=1;
        while(i<=n){
            if(i%2==0)
                sum=sum+(i*i*i);
        i++;
        }
        return sum;

    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to the sum: ");
        int n=sc.nextInt();
        int result=sumOfCubeEven(n);
        System.out.println("Sum of cube of all even number from 1 to "+n+ " is: "+result);
    }
}
