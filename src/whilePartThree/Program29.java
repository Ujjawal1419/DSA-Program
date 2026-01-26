package whilePartThree;

import java.util.Scanner;

public class Program29 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int reverse=getReverse(n);
        System.out.println("reverse is: "+reverse);
    }
    public static int getReverse(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=10* rev+rem;
            n/=10;
        }
        return rev;
    }
}

