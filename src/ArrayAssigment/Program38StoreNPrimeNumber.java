package ArrayAssigment;

import java.util.Scanner;

public class Program38StoreNPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0; i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }


    public static class Program3StringLength {
        public static void main(String[] args) {
           String[] arr= {"java","is","Advance"};
            for(String s:arr ){
                System.out.println(s+"= "+s.length());
            }
        }
    }
}
