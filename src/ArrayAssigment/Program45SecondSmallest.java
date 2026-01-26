/*Q:45
WAJP to print SecondSmallest element of the
array.
int[] a
= {80, 80, 43, 50, 38, 63, 58, 80};
o/p
38
43
*/
package ArrayAssigment;

import java.util.Scanner;
public class Program45SecondSmallest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result = printSecondSmallest(arr);
        System.out.println("Second Smallest Element: " + result);
    }
    public static int printSecondSmallest(int[] a){
        long min=Long.MAX_VALUE;
        long secondMin= Long.MAX_VALUE;
        for(int x:a){
            if(x<min){
                secondMin=min;
                min=x;
            } else if (x<secondMin && x!=min) {
                secondMin=x;
            }
        }if(secondMin!=Long.MAX_VALUE)
            return (int)secondMin;
        else
            return (int)min;
    }
}
