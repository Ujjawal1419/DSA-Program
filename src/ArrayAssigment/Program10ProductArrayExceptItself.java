/* WAJP for below requirements:
Shambhu Kumar QSpiders | JSpiders,
NOIDA
Q:10
Original array:2 5 4 3 6
resultant array:360 144 180 240 120
*/
package ArrayAssigment;

import java.util.Scanner;

public class Program10ProductArrayExceptItself {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int n=sc.nextInt();

        int [] arr= new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array: ");
        for(int x: arr){
            System.out.print(x+" ");
        }
        int product=1;
        for(int i=0;i< arr.length;i++){
            product=product*arr[i];
        }
        System.out.print("\nResultant Array: ");
        for(int i=0;i< arr.length;i++){
            System.out.print(product/arr[i]+" ");
        }
    }
}
