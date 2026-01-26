package whilePartThree;

import java.util.Scanner;

public class Program30 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(isPalindrame(n))
            System.out.println(n+" is a Palindrame Number!: ");
        else
            System.out.println(n+" is  not a palindrame Number!: ");
    }
    public static boolean isPalindrame(int n){
        int rev=0;     int originalNum=n;
        while(n>0){
            int rem=n%10;
            rev=10*rev+rem;
            n/=10;
        }
        return rev==originalNum;
    }
}
