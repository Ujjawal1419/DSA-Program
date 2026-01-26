package pattern;

import java.util.Scanner;

public class Program8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
    }
}
/**
 * Enter a Number:
 * 5
 * 1 0 1 0 1
 * 1 0 1 0 1
 * 1 0 1 0 1
 * 1 0 1 0 1
 * 1 0 1 0 1 */