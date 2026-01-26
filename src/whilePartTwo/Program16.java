/** WAJP to print the sum of below series:
1/1*1+1/2*2+1/3*3+1/4*4+……𝒖𝒑𝒕𝒐 𝟏𝟎�*/
package whilePartTwo;

import java.util.Scanner;

public class Program16 {
    public static double getSumOfSeries(double n){
        double sum=0;
        int i=1;
        while(i<=n){
                sum=sum+(1.0/i*i);
            i++;
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which you want to the sum: ");
        int n=sc.nextInt();
        double result=getSumOfSeries(n);
        System.out.println("sum of series from 1 to "+n+" is: "+result);
    }
}
