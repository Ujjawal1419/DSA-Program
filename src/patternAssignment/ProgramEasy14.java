/**Enter a Rows:
        7
        * * * * * * *
        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
 * */
package patternAssignment;

import java.util.Scanner;

public class ProgramEasy14 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
