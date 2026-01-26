package whilePartThree;

import java.util.Scanner;

public class ProgramTwentySix {
    public static int getFactorial(int n){
        int fact=1;
        int i=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        return fact;
    }
    public static void printFactorialEachDigit(int n){
        while(n>0){
            int rem=n%10;
            System.out.println(rem+"!="+getFactorial(rem));
            n/=10;
        }
    }
public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a input: ");
      int n=sc.nextInt();
    printFactorialEachDigit(n);
  }
}
