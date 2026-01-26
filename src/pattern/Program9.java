package pattern;

import java.util.Scanner;

public class Program9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((j+1)%2+" ");
            }
            System.out.println();
        }
    }
}


/*
*
* Enter a Number:
5
0 1 0 1 0
0 1 0 1 0
0 1 0 1 0
0 1 0 1 0
0 1 0 1 0 */