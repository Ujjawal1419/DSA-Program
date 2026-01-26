/* *WAJP to print sum of cubes of all odd
numbers from 1 to 100.
 𝟏*1*1 +𝟑*𝟑*3+𝟓*5*5+⋯…𝒖𝒑𝒕𝒐 𝟏𝟎*/
package whilePartTwo;

import java.util.Scanner;

public class Program9 {
    public static int sumOfCubeOdd(int n){
        int sum=0;
        int i=1;
        while(i<=n){
            if(i%2!=0)
                sum=sum+(i*i*i);
            i++;
        }
        return sum;

    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to the sum: ");
        int n=sc.nextInt();
        int result=sumOfCubeOdd(n);
        System.out.println("Sum of cube of all even number from 1 to "+n+ " is: "+result);
    }
}
