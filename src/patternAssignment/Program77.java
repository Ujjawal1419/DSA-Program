package patternAssignment;

import java.util.Scanner;

public class Program77 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        int star = 1;   int space = n-1;
        for(int i=1;i<=n;i++){
            int num=n;
            for(int j=1;j<=space;j++)
                System.out.print("  ");
            int colMid=star/2+1;
            for(int j=1;j<=star;j++) {
                if(j<colMid)
                    System.out.printf(num-- +" ");
                else
                    System.out.print(num++ +" ");

            }
            star+=2; space--;
            System.out.println();

        }

    }
}
