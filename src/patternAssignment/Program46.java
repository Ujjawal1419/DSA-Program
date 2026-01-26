/*
* Enter a Number of Rows:
5
				O
			N	M
		L	K	J
	I	H	G	F
E	D	C	B	A
* */
package patternAssignment;

import java.util.Scanner;

public class Program46 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number of Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        int star = 1;
        int space = n-1;
        int num=n*(n+1)/2+64;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("\t");
            for(int j=1;j<=star;j++)
                System.out.print((char)(num--) +"\t") ;
            star++; space--;
            System.out.println();

        }

    }
}
