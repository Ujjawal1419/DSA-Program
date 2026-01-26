/*
* Enter a Number of Rows:
7
						1
					2	3
				4	5	6
			7	8	9	10
		11	12	13	14	15
	16	17	18	19	20	21
22	23	24	25	26	27	28
* */
package patternAssignment;

import java.util.Scanner;

public class Program37 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number of Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        int star = 1;
        int space = n-1;
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("\t");
            for(int j=1;j<=star;j++)
                System.out.print(num++ +"\t") ;
            star++; space--;
            System.out.println();

        }

    }
}
