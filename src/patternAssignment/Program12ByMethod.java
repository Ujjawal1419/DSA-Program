
/*
* nter a Row:
5
(1,1) (1,2) (1,3) (1,4) (1,5)
(2,1) (2,2) (2,3) (2,4) (2,5)
(3,1) (3,2) (3,3) (3,4) (3,5)
(4,1) (4,2) (4,3) (4,4) (4,5)
(5,1) (5,2) (5,3) (5,4) (5,5)
* */
package patternAssignment;

import java.util.Scanner;

public class Program12ByMethod {
    public static void printPattern(int n){
             for(int i=1;i<=n;i++) {
                  for (int j = 1; j <= n; j++) {
                    System.out.print("(" + i + "," + j + ") ");
                  }
                System.out.println();

             }
    }
        public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Row: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
