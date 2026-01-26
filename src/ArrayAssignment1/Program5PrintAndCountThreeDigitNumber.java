/* 5. print and count all three-digit numbers from array.*/
package ArrayAssignment1;

import java.util.Scanner;

public class Program5PrintAndCountThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter the element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=100 && arr[i]<=999)
                System.out.print(arr[i]+" ");
        }
    }
}
