/*
*
Enter a Number of Rows:
5
				A
			C	B
		F	E	D
	J	I	H	G
O	N	M	L	K
* */
package patternAssignment;

import java.util.Scanner;

public class Program49 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number of Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {

        int star = 1;   int space = n-1;  int num=64+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("\t");
            for(int j=1;j<=star;j++) {
                System.out.print((char)(num--) +"\t");
            }

            star++; space--;
            num=num+(2*i+1);
            System.out.println();
        }
    }
}
