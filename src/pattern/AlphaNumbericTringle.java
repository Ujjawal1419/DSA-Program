/**
 * Enter a Rows:
 * 7
 * 1
 * A B
 * 1 2 3
 * A B C D
 * 1 2 3 4 5
 * A B C D E F
 * 1 2 3 4 5 6 7
 * */
package pattern;

import java.util.Scanner;

public class AlphaNumbericTringle {
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
                System.out.print(j+" ");
                else
                    System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }

    }
}
