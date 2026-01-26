/*
* Enter the number:
6
sum upto n numbers: 720*/
// factorial upton number
package recursion;
import java.util.Scanner;

public class Program11 {
    static int  fact=1;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        factorial(n);
        System.out.println("sum upto n numbers: "+fact);
    }
    public static void factorial(int n){
        if(n==0){
            return;
        }
        fact=fact*n;
        factorial(n-1);
    }
}
