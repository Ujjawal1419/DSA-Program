/*
*
* Enter a Row:
5
* * * * *
*       *
*       *
*       *
* * * * *
* */
package patternAssignment;

import java.util.Scanner;

public class Program5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Row: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }

    }
}
