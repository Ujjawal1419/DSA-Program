/**Write a java program to take a user input and print
 each digit of the number from left to right.
 Input:
 N=43705;
 Output:
 4
 3
 7
 0
 5
 */


package whilePartThree;

import java.util.Scanner;

//public class Program8 {
//    public static void printLeftToRight(int n) {
//        while (n > 0) {
//            int rem = n % 10;
//            System.out.println(rem);
//            n /= 10;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Input: ");
//        int n = sc.nextInt();
//        printLeftToRight(n);
//
//    }
//}


public class Program8 {
    public static void  printDigitFromLeftToRight(int n) {
        int count = (n + "").length();
        while (count > 0) {
            int digit = (n / (int) Math.pow(10, count - 1)) % 10;
            System.out.println(digit);
            count--;
        }
    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Input: ");
            int n = sc.nextInt();
            printDigitFromLeftToRight(n);
    }
}


