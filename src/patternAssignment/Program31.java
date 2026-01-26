/*
* Enter a Rows:
   5
E
D	 D
C	 C	 C
B	 B	 B	 B
A	 A	 A	 A	 A
* */
package patternAssignment;

import java.util.Scanner;

public class Program31 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int star=1;  int num =64+n;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=star;j++){
                System.out.print((char)(num) +"\t ");
            }
            star++; num--;
            System.out.println();
        }

    }
}
