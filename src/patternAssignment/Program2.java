/**
 * Ques 2
 * Enter a Number:
 * 5
 * 1 1 1 1 1
 * 0 0 0 0 0
 * 1 1 1 1 1
 * 0 0 0 0 0
 * 1 1 1 1 1
 * */
package patternAssignment;

import java.util.Scanner;

public class

Program2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i%2+" ");
            }
            System.out.println();
        }
    }
}
