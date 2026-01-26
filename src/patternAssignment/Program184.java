/*
* Enter a Rows:
7
1 2 3 4 5 6 7
  1 2 3 4 5
    1 2 3
      1
    1 2 3
  1 2 3 4 5
1 2 3 4 5 6 7
* */
package patternAssignment;

import java.util.Scanner;

public class Program184 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        int star = n;
        int space = 0;
        int mid=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("  ");
            for(int j=1;j<=star;j++) {
                System.out.print(j+" ");
            }
            if(i<mid){
                star-=2;   space++;
            }else{
                star+=2; space--;
            }
            System.out.println();
        }
    }
}
