/**
 * Enter a Number of Rows:
 * 7
 *             1
 *           0 0
 *         1 1 1
 *       0 0 0 0
 *     1 1 1 1 1
 *   0 0 0 0 0 0
 * 1 1 1 1 1 1 1
 * */
package patternAssignment;

import java.util.Scanner;

public class Program34 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number of Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        int star = 1;
        int space = n-1;
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("  ");
            for(int j=1;j<=star;j++)
                System.out.print(i%2 +" ");
            star++; space--;num++;
            System.out.println();

        }

    }
}
