/*     Accending order
* Enter the number:
5
1
2
3
4
5*/
package recursion;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        printNumber(n);
    }
    public static void printNumber(int n){
        if(n==0){
            return;
        }
        printNumber(n-1);
        System.out.println(n);
    }
}
