/*
* Enter a Row:
5
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1


* */


package patternAssignment;

import java.util.Scanner;

public class Program4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Row: ");
        int n=sc.nextInt();
        PrintPattern(n);
    }
    public static void PrintPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
    }
}
