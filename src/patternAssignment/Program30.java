/*
* Enter a Rows:
7
A
A	 B
A	 B	 C
A	 B	 C	 D
A	 B	 C	 D	 E
A	 B	 C	 D	 E	 F
A	 B	 C	 D	 E	 F	 G
* */
package patternAssignment;

import java.util.Scanner;

public class Program30 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int star=1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=star;j++){
                System.out.print((char)(64+j) +"\t ");
            }
            star++;
            System.out.println();
        }

    }
}
