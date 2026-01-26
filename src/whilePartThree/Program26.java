package whilePartThree;

import java.util.Scanner;

public class Program26 {
    public static void FactorialOfEachDigit(int n){
        while(n>0){
            int rem=n%10;
            int fact=1;
            int i=1;
            while(i<=rem){
                fact=fact*i;
                i++;
            }
            System.out.println(rem+"!="+fact);
            n/=10;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Input: ");
        int n =sc.nextInt();
        FactorialOfEachDigit(n);
        System.out.println("====Program Ends====");
    }
}
