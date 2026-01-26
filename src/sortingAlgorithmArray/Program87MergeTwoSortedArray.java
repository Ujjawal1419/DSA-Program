/*:87
Merge two sorted array in sorted manner.
i/p:
arr1 = {20, 30, 50, 60}
arr2 = {2, 28, 32, 35, 42}
merged: {2, 20, 28, 30, 32, 35, 42, 50, 60}*/
package sortingAlgorithmArray;

import java.util.Arrays;

public class Program87MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1={20,30,50,60};
        int[] arr2={2,28,32,35,42};

        int[] result = merge(arr1, arr2);
        System.out.print("Merge Two Sorted Array: ");
        System.out.println(Arrays.toString(result));
    }
    public static int[] merge(int [] arr1, int[] arr2){
        int[] merged=new int[arr1.length+arr2.length];
        int index1=0,index2=0,index=0;
        while(index1<arr1.length && index2<arr2.length){
            if(arr1[index1]<arr2[index2])
                merged[index++]=arr1[index1++];
            else
                merged[index++]=arr2[index2++];
        }
        while(index1<arr1.length)
            merged[index++]=arr1[index1++];
        while(index2< arr2.length)
            merged[index++]=arr2[index2++];
        return merged;
    }
}
