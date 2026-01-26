package patternAssignment;

import java.util.Scanner;

public class Program215 {
    public static void main(String[]rgs){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        for(int i=1;i<n;i++)
            System.out.print(i*(i+1)+" ");
    }
}

