/**Write a java program to take a user input
 and print the product of each digit of the
 number will be even or Odd.
 Input:
 N=9735;
 Output:
 It will give Odd Produc*/
package whilePartThree;

import java.util.Scanner;

public class Program19 {
    public static String checkProduct(int n) {
        while (n>0) {
            int rem=n%10;
            if(rem%2==0)
             return "product is Even";
            n=n/10;
        }
        return "Product is Odd";
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a input: ");
        int n=sc.nextInt();
        String result=checkProduct(n);
        System.out.println(result);

    }
}
