/*
* Enter a Rows:
9
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

*  */
package patternAssignment;

import java.util.Scanner;

public class Program128 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int star=1; int mid=n/2+1;
        for(int i=1; i<=n;i++){
           for(int j=1;j<=star;j++)
               System.out.print("* ");
           if(i<mid) {
               star++;
           }else{
               star--;
           }
           System.out.println();
        }
    }
}
