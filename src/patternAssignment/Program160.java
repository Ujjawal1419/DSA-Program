package patternAssignment;

import java.util.Scanner;

public class Program160 {
    public static void main(String[]rgs){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        if (n % 2 == 0) {
            System.out.println("Pattern is NOT Possible for Even number: ");
            return;
        }
        int star = 1;
        int space = n / 2;
        int rowMid = n / 2 + 1;
        int num ;

        for (int i = 1; i <= n; i++) {
            if(i<=rowMid)
                num=i-1;
            else
                num=n-i;
            // print spaces
            for (int j = 1; j <= space; j++)
                System.out.print("   ");
                int colMid=star/2+1;

            // print numbers
            for (int j = 1; j <= star; j++) {
                if(j<colMid)
                System.out.printf("%-3d",num--);
                else
                System.out.printf("%-3d",num++);
            }
            System.out.println();

            // update values
            if (i < rowMid) {
                star += 2;  space--;

            } else {
                star -= 2;
                space++;

            }
        }
    }
}
