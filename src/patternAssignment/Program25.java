/*
* Enter a Rows:
5
15
17 16
20 19 18
24 23 22 21
29 28 27 26 25
* */
package patternAssignment;

import java.util.Scanner;

public class Program25 {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Rows: ");
    int n=sc.nextInt();
    printPattern(n);
}
    public static void printPattern(int n){
        int star=1; int num=n*(n+1)/2;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=star;j++){
                System.out.print(num++ +"\t ");
            }
            star++; num=num-(2*i+1);
            System.out.println();
        }

    }
}
