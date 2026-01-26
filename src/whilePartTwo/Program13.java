/**WAJP to print the sum of below series:
1/1+1/2+1/3+1/4+....……𝒖𝒑𝒕𝒐 𝟏𝟎�*/
package whilePartTwo;

import java.util.Scanner;

public class Program13 {
    public static double getsumSeries(int n){
        double sum=0;
        int i=1;
        while(i<=n){
            sum=sum+(1.0/i);
            i++;
        }
        return sum;

    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to the sum: ");
        int n=sc.nextInt();
        // double n=sc.nextDouble();
        double result=getsumSeries(n);
        System.out.println("Sum of cube of all even number from 1 to "+n+ " is: "+result);
    }
}
