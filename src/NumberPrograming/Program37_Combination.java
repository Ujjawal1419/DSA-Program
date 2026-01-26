package NumberPrograming;

import java.util.Scanner;

public class Program37_Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number: ");
        int a = sc.nextInt();
        System.out.print("Enter r number: ");
        int b = sc.nextInt();
        int comb1 = getCombination(a, b);
        System.out.println("comd1= " + comb1);

    }
    public static int getCombination(int n,int r){
        int comb=1;
        for(int i=0;i<r;i++){
            comb=comb*(n-i)/(i+1);
        }
        return comb;
    }

}


/**
 *
 *        n!
 * �𝑪𝒓 =----------
 *      r! *(n-r)!
 * */