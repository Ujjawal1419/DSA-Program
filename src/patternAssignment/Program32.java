/*
* Enter a Rows:
7
A
B	 A
C	 B	 A
D	 C	 B	 A
E	 D	 C	 B	 A
F	 E	 D	 C	 B	 A
G	 F	 E	 D	 C	 B	 A
* */
package patternAssignment;

import java.util.Scanner;

public class Program32 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int star=1;
        for(int i=1;i<=n;i++){
            int num=64+star;
            for(int j=1;j<=star;j++){
                System.out.print((char)(num--) +"\t ");
            }
            star++;
            System.out.println();
        }

    }
}
