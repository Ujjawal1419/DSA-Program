
/*Enter the number Rows:
7
      * @ @ @ @           @ @ @ @ *
    * *       @           @       * *
  * * *       @           @       * * *
* * * *         * * * * * @       * * * *
  * * *         * * * * *         * * *
    * *         * * * * *         * *
      *         * * * * *         *
*/
package patternAssignment;

import java.util.Scanner;

public class Program266 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void  printPattern(int n){
        if(n%2==0){
            System.out.println("Pattern is not Possible!");
            return;
        }
        int mid =n/2+1;
        int sSpace=n/2;
        int eStar=1;
        for(int i=1;i<=n;i++){
            //section-1
            for(int j=1;j<=mid;j++){
                if(j<=sSpace)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            //section-2
            for(int j=1;j<=mid;j++){
                if(i==1 || j==mid &&i<mid)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            //section-3
            for(int j=1;j<=mid+1;j++){
                if(i<mid)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            //section-4
            for(int j=1;j<=mid;j++){
                if(i==1 || j==1 &&i<=mid)
                    System.out.print("@ ");
                else
                    System.out.print("  ");
            }
            //section-5
            for(int j=1;j<=eStar;j++){
                System.out.print("* ");
            }
            if(i<mid){
                sSpace--;  eStar++;
            }
            else{
                sSpace++;    eStar--;
            }
            System.out.println();
        }
    }
}
