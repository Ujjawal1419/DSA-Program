/*
* Enter a Rows:
7
1                 1
0  0           0  0
1  1  1     1  1  1
0  0  0  0  0  0  0
1  1  1     1  1  1
0  0           0  0
1                 1
* */
package patternAssignment;

import java.util.Scanner;

public class Program202 {
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
                    System.out.print(i%2+"  ");
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
