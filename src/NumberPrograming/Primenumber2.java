package NumberPrograming;

import java.util.Scanner;

public class Primenumber2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        printPrime( n);
    }
    public static void printPrime(int n){

        for(int i=2;i*i<=n/2;i++){
            if(n%i==0) {
                System.out.println("It is not a prime ");
                return;
            }
        }
        System.out.println("It is a prime ");
    }
}

