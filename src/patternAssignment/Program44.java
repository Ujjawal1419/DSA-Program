/*
* Enter a Number of Rows:
5
        A
      A B
    A B C
  A B C D
A B C D E
* */

package patternAssignment;

import java.util.Scanner;

public class Program44 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number of Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        int star = 1;
        int space = n-1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("  ");
            for(int j=1;j<=star;j++)
                System.out.print((char)(64+j)+" ");
            star++; space--;
            System.out.println();

        }

    }
}
