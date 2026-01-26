package whilePartThree;

import java.util.Scanner;

public class Program24 {
    public static int addDigits(int n){
        while(n>9){
            int sum=0;
            while(n>0){
                sum=sum+n%10;
                n/=10;
            }
            n=sum;
        }
        return n;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a input: ");
        int n = sc.nextInt();
        int sum=addDigits(n);
        System.out.println("Add Digit is: "+sum);
    }
}
