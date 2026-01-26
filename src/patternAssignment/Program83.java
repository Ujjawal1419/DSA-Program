/*
* Enter a Rows:
5
            0
         1  0  2
      3  4  0  5  6
   7  8  9  0  10 11 12
13 14 15 16 0  17 18 19 20
* */
package patternAssignment;
import java.util.Scanner;
public class Program83 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {

        int star = 1;   int space = n-1;  int num=1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=space;j++)
                System.out.print("   ");
            int colMid=star/2+1;
            for(int j=1;j<=star;j++) {
                if(j==colMid)
                    System.out.printf("%-3d",0);
                else
                    System.out.printf("%-3d",num++);
            }
            star+=2; space--;
            System.out.println();
        }
    }
}
