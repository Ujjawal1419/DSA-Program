/*find even element of the given array*/
package ArrayYoutube;

import java.util.Scanner;

public class EvenorOdd1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]);
            }
        }
    }
}
