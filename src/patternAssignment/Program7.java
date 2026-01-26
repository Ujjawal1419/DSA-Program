/*
* Enter the Rows:
7
*           *
  *       *
    *   *
      *
    *   *
  *       *
*           *
* */
package patternAssignment;

import java.util.Scanner;
class Prpogram7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows: ");
        int n = sc.nextInt();
        printpattern(n);
    }

    public static void printpattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}