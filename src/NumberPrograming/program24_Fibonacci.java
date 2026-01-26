package NumberPrograming;

import java.util.Scanner;

public class program24_Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        printFibonacci( n) ;
    }
    public static void printFibonacci(int n){
        if(n==0){
            System.out.print(0);
            return;
        }
        else if(n==1){
            System.out.print(0 +" "+1);
            return;
        }
        System.out.print(0+ " "+1 +" ");
        int n1=0;
        int n2=1;
        int n3=0;
        for(int i=1;i<=n-1;i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
