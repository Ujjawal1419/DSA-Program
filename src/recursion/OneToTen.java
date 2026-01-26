package recursion;

import java.util.Scanner;

public class OneToTen {
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
         n=sc.nextInt();
        test(1,n);
    }
    public static  void test(int x,int n){
        if(x>n) return;
        System.out.println("x is: " + x);
        test(x+1,n);
        System.out.println("x is: " + x);
    }
}
