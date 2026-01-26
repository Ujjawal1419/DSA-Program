package NumberPrograming;

import java.util.Scanner;

public class PrimenumberBestandFinal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        if(isPrime(n))
        System.out.println("Is a Prime number: "+n);
        else
        System.out.println("Is not a Prime number: "+n);
    }
    public static boolean isPrime(int n){
        if(n<2)
            return false;
        else if (n==2||n==3)
            return true;
        else if (n%2==0)
            return false;
        for(int i=3;i*i<=n;i+=5){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
