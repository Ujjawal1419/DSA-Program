/*WAJP to reverse each element of the array.
Original array:10 20 30 40 50 60 70
Reversed array:70 60 50 40 30 20 10
 */
package ArrayAssigment;

import java.util.Scanner;

public class Program16ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();


        int[] arr=new int[n];
        System.out.print("Enter the element: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        System.out.print("Reversed array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }



//    public static void reverse(int [] a,int start,int end){
//       if(start<0 ||start>=a.length ||end<0 ||end>=a.length){
//           System.out.println("Index is not correct");
//           return;
//       }
//        while(start<end){
//            int temp=a[start];
//            a[start]=a[end];
//            a[end]=temp;
//            start++;
//            end--;
//        }
//    }

}
