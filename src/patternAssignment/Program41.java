/*
* Enter a Number of Rows:
5
				1
			3	2
		6	5	4
	10	9	8	7
15	14	13	12	11
* */
package patternAssignment;

import java.util.Scanner;

public class Program41 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number of Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {

        int star = 1;   int space = n-1;  int num=1;
            for(int i=1;i<=n;i++){
              for(int j=1;j<=space;j++)
                System.out.print("\t");
              for(int j=1;j<=star;j++) {
                   System.out.print(num-- +"\t");
                 }
                    star++; space--;
                    num=num+(2*i+1);
                     System.out.println();
            }
    }
}


