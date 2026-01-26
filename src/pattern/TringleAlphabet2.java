/*
* Enter a Rows:
7
A
B B
C C C
D D D D
E E E E E
F F F F F F
G G G G G G G
* */
package pattern;

import java.util.Scanner;

public class TringleAlphabet2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println(" ");
        }

    }
}
