package NumberPrograming;

import java.util.Scanner;

public class Progran36_permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number: ");
        int a = sc.nextInt();
        System.out.print("Enter r number: ");
        int b = sc.nextInt();
        int perm = getPermutation(a, b);
        System.out.println("perm= " + perm);

    }
    public static int getPermutation(int n,int r){
        if(n<=0 || r>n){
            System.out.println("no arrangement is possible: ");
            return 0;
        }
        int perm=1;
        for(int i=1;i<r;i++){

            perm=perm*(n-i);
        }
        return perm;
    }
}




/*  formula
*    n             n!
*     p=     .................
*       r        (n-r)!
* */
