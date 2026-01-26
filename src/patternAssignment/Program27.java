/*
* Enter a Rows:
5
A
B	 C
D	 E	 F
G	 H	 I	 J
K	 L	 M	 N	 O
* */
package patternAssignment;

import java.util.Scanner;

public class Program27 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int star=1; int num=65;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=star;j++){
                System.out.print((char)(num++) +"\t ");
            }
            star++;
            System.out.println();
        }

    }
}
