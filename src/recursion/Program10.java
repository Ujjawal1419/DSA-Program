/*
* Enter the number:
5
sum upto n numbers: 15

//sum upto n number*/
package recursion;

import java.util.Scanner;

public class Program10 {
    static int  sum=0;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        add(n);
        System.out.println("sum upto n numbers: "+sum);
    }
    public static void add(int n){
        if(n==0){
            return;
        }
        sum=sum+n;
        add(n-1);
    }
}
