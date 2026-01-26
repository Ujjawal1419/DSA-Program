/**
 * Enter a Rows:
 * 5
 * A
 * A B
 * A B C
 * A B C D
 * A B C D E
 * */
package pattern;

import java.util.Scanner;

public class TringleAlphabet {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println(" ");
        }

    }
}
