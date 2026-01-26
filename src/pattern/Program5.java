package pattern;

import java.util.Scanner;

public class Program5 {
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n+1;i++) {

             for(int j=1;j<=n-2;j++){
                System.out.print(i%2+" ");
             }
             System.out.println();
        }
    }
}
/**
 * 8
 * 1 1 1 1 1 1
 * 0 0 0 0 0 0
 * 1 1 1 1 1 1
 * 0 0 0 0 0 0
 * 1 1 1 1 1 1
 * 0 0 0 0 0 0
 * 1 1 1 1 1 1
 * 0 0 0 0 0 0
 * 1 1 1 1 1 1 */