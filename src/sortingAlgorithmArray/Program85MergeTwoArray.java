/*Q:85
WAJP to merge two arrays into a single array.
i/p:
arr1 = {1, 3, 5}
arr2 = {2, 4, 6, 8, 10}
merged: {1, 3, 5, 2, 4, 6, 8, 10*/
package sortingAlgorithmArray;

import static sortingAlgorithmArray.Program87MergeTwoSortedArray.merge;

public class Program85MergeTwoArray {
    public static  void main(String[] args){
        int[] arr1={1,3,5};
        int[] arr2={2,4,6,8,10};
        int[] merged=merge(arr1,arr2);
        System.out.print("Merge Two Array: ");
        for(int x:merged){
            System.out.print(" "+x);
        }
    }
    public static int[] marge(int[] arr1,int[] arr2){
        int[] merged=new int[arr1.length+arr2.length];
        int i=0;
        for(int x:arr1)
            merged[i++]=x;
        for(int x:arr2)
            merged[i++]=x;
        return merged;
    }
}
