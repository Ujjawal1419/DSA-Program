/*    descending order
* Enter the number:
5
5
4
3
2
1*/
package recursion;

import java.util.Scanner;

public class Program9 {
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
        System.out.println(n);
        printNumber(n-1);
    }
}
