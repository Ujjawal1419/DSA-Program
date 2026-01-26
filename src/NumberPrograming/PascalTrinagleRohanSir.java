package NumberPrograming;

import java.util.Scanner;

public class PascalTrinagleRohanSir {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int s=n;s>i;s--){ //space
                System.out.println("  ");
            }
            int num=1;
            for(int j=0;i<=i;i++){
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
