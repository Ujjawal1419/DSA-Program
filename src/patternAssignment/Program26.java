/*
* Enter a Rows:
5
15
14	 13
12	 11	 10
9	 8	 7	 6
5	 4	 3	 2	 1
* */
package patternAssignment;

import java.util.Scanner;

public class Program26 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int star=1; int num=n*(n+1)/2;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=star;j++){
                System.out.print(num-- +"\t ");
            }
            star++;
            System.out.println();
        }

    }
}



/*  NOTES REMEBER THAT
1) 1+3+5+7+upto n number
odd number sum
sum=n*n
2) 2+4+6+ upto n number
  Even  number
  Even=n(n+1)
3) 1+2+3+... up to n natural number of sum
 sum=n(n+1)/2
 4) 1  3  5  7  old number sequence
 formula = 2*i-1
 5) 2  4  6  8 Even number sequence
 Formula = 2*i */