package practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int result= getfactorial(n);
        System.out.print("Result is: "+result);
    }
    public static int getfactorial(int n){
        int  fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}

