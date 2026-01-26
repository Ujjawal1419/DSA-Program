/*
* Enter a Rows:
7
      16
    15   14
  13   12   11
10   9   8   7
  6   5   4
    3   2
      1
      * */
package patternAssignment;

import java.util.Scanner;

public class Program136 {
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
        int num=mid*mid;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("  ");
            for(int j=1;j<=star;j++) {
                System.out.print(num-- +"   ");
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
