package pattern;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Program4 {
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {

            for(int j=1;j<=n;j++){
              System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}





/**
 * Enter a Number:
 * 5
 * 1 1 1 1 1   // agar sara element same ho Row me to samjh lena ki uska connection (i) se hai
 * 2 2 2 2 2
 * 3 3 3 3 3
 * 4 4 4 4 4
 * 5 5 5 5 5 */