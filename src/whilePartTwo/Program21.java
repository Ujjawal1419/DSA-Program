package whilePartTwo;

import java.util.Scanner;

public class Program21 {
    public static int sumOfFactor(int n){
        int sum=0;
        int i=1;
        while(i<=n/2){
            if(n%i==0)
                sum=sum+i;
         i++;
        }
        return sum;
    }

    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a Number: ");
     int n=sc.nextInt();
     int sum=sumOfFactor(n);
     System.out.println("Sum of Factor"+n+" is: "+sum);
    }
}
