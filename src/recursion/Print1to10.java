/*
* n is: 1
n is: 2
n is: 3
n is: 4
n is: 5
n is: 6
n is: 7
n is: 8
n is: 9
n is: 10*/
package recursion;

import java.util.Scanner;

public class Print1to10 {
    public static void main(String[] args) {
        test(1);
    }
    public static  void test(int n){
        if(n<=10) {
            System.out.println("n is: " + n);
            test(n+1);
        }
    }
}

