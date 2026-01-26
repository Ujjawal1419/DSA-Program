package NumberPrograming;

import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(isStrong(n))
            System.out.println(n+" is a Strong number");
        else
            System.out.println(n+" is not a Strong number");
    }
    public static boolean isStrong(int n) {
    int num=n;     int  sum=0;
    while(n>0){
        sum=sum+getfactorial(n%10);
        n/=10;
    }
    return sum==num;
    }
    public static int getfactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}