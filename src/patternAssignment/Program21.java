/*
* Enter a Rows:
7
7
6 6
5 5 5
4 4 4 4
3 3 3 3 3
2 2 2 2 2 2
1 1 1 1 1 1 1
* */
package patternAssignment;

import java.util.Scanner;

public class Program21 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int star=1;  int num=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                System.out.print(num+" ");
            }
            star++; num--;
            System.out.println(" ");
        }

    }
}
