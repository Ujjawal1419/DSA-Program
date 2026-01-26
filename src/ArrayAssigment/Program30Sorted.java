/*
WAJP to check whether a given array is in
sorted order or not.
i/p: [2, 7, 7, 8, 9]  // sorted means jobhi element hai or asscending aa decending order me hona chahiye
o/p: Array is sorted
*/
package ArrayAssigment;

import java.util.Scanner;

public class Program30Sorted {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n =sc.nextInt();

        int[] arr= new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       boolean b= isSorted(arr);
        if(b){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
    public static boolean isSorted(int[] a){
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1])
                return false;
        }
        return true;
    }
}
