/**
 * Enter a Rows:
 * 7
 * 1
 * B B
 * 3 3 3
 * D D D D
 * 5 5 5 5 5
 * F F F F F F
 * 7 7 7 7 7 7 7
 * */
package pattern;

import java.util.Scanner;

public class AlphaNumbericTringle1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==1)
                    System.out.print(i+" ");
                else
                    System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }

    }
}
