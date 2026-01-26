package whilePartThree;

import java.util.Scanner;

public class Program28 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(isStrong(n))
            System.out.println(n+" is a Strong Number!: ");
        else
            System.out.println(n+" is  not a Strong Number!: ");
    }
    public static boolean isStrong(int n){
        int sum=0;     int originalNum=n;
        while(n>0){
            sum=sum+getFactorial(n%10);
            n/=10;
        }
        return originalNum==sum;
    }
    public static int getFactorial(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        return fact;
      }
    }
