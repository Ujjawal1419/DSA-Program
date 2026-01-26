package patternAssignment;

import java.util.Scanner;

public class Program157 {
    public static void main(String[]rgs){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        if (n % 2 == 0) {
            System.out.println("The program is not for even number");
            return;
        }
        int star = 1;
        int space = n / 2;
        int rowMid = n / 2 + 1;
        int num = n / 2;  // starting number = 3 for n=7

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            // print numbers
            for (int j = 1; j <= star; j++) {
                System.out.print(num + " ");
            }
            System.out.println();

            // update values
            if (i < rowMid) {
                star += 2;
                space--;
                num--;
            } else {
                star -= 2;
                space++;
                num++;
            }
        }
    }
}
