/*
* WAJP to check if an array is strictly increasing.
i/p: [2, 3, 7, 8, 9]
o/p: Array is strictly increasing
*
* strictly increasing ka matlab hota hai ki har ek element next element se bada hona chaiye or same bhi nhi hona nhi chahiye .
* */
package ArrayAssigment;

import java.util.Scanner;

public class Program29StricklyIncreasing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean b= isIncreasing(arr);
        if(b){
            System.out.println("Array element is strictly  increasing");
        }else{
            System.out.println("Array element is not strictly increasing");
        }

    }
    public static boolean isIncreasing(int[] a){
        for(int i=1;i<a.length;i++){
            if(a[i]<=a[i-1])
                return false;
        }
        return true;

    }
}
