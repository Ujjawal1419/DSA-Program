package NumberPrograming;

import java.util.Scanner;

public class Program38_PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Row: ");
        int a = sc.nextInt();
       printPascalRow(a);
    }
    public static void printPascalRow(int n){
        int comb=1;
        System.out.print(comb+" ");
        for(int i=0;i<n;i++){
            comb=comb*(n-i)/(i+1);
            System.out.print(comb+" ");
        }
    }
}
