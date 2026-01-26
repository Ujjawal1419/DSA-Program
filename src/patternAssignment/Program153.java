package patternAssignment;

import java.util.Scanner;

public class Program153 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        if(n%2==0){
            System.out.println("The program is not for even number");
            return;
        }
        int star = 1; int space = n/2; int rowMid=n/2+1; int mid=n/2; int num=2*mid*mid+n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("   ");
            for(int j=1;j<=star;j++) {
                System.out.printf("%-3d",num--);
            }
            if(i<rowMid){
                star+=2;   space--;
            }else{
                star-=2; space++;
            }
            System.out.println();

        }

    }
}
