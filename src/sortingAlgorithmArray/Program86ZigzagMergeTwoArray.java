/*Q:86
WAJP to zigzag merge two arrays into a single
array.
i/p:
arr1 = {20, 30, 50}
arr2 = {2, 4, 6, 8, 10}
merged: {20, 2, 30, 4, 50, 6, 8, 10*/
package sortingAlgorithmArray;

import java.util.Arrays;

public class Program86ZigzagMergeTwoArray {
    public static void main(String[] args) {
      int []  arr1={20 ,30,50};
      int[] arr2={2,4,6,8,10};

        int[] result = zigZagMerge(arr1, arr2);
        System.out.print("ZigZag Merge Sort: ");
        System.out.println(Arrays.toString(result));
    }
    public static int[] zigZagMerge(int [] arr1, int[] arr2){
        int[] merged=new int[arr1.length+arr2.length];
        int index1=0,index2=0,index=0;
        while(index1<arr1.length && index2<arr2.length){
            if(index%2==0)
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
