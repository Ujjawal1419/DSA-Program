/*
* Enter a Rows:
7
1                 1
2  2           2  2
3  3  3     3  3  3
4  4  4  4  4  4  4
5  5  5     5  5  5
6  6           6  6
7                 7
* */
package patternAssignment;

import java.util.Scanner;

public class Program201 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        int sStar = 1;
        int eStar = n;
        int mid = n / 2 + 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=sStar ||j>=eStar)
                    System.out.print(i+"  ");
                else
                    System.out.print("   ");
            }
            if(i<mid) {
                sStar++;
                eStar--;
            } else{
                sStar--;
                eStar++;
            }
            System.out.println();
        }
    }
}
