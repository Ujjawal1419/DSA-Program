/*
* Enter a Number of Rows:
5
				15
			13	14
		10	11	12
	6	7	8	9
1	2	3	4	5
* */
package patternAssignment;

import java.util.Scanner;

public class Program42 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number of Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {

        int star = 1;   int space = n-1; int num=n*(n+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("\t");
            for(int j=1;j<=star;j++) {
                System.out.print(num++ +"\t");

            }
            star++; space--; num=num-(2*i+1);

            System.out.println();
        }
    }
}
