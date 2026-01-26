/*
* Enter a Rows:
7
      1
    2   2
  3   3   3
4   4   4   4
  5   5   5
    6   6
      7
      * */
package patternAssignment;

import java.util.Scanner;

public class Program131 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        int star = 1;
        int space = n/2;
        int mid=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("  ");
            for(int j=1;j<=star;j++) {
                System.out.print(i+"   ");
            }
            if(i<mid){
                star++;   space--;
            }else{
                star--; space++;
            }
            System.out.println();
        }
    }
}
