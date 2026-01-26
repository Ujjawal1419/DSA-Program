package sortingAlgorithmArray;

import java.util.Arrays;

public class Program89MergeSort {
    public static void main(String[] args) {

        int[] arr = {8, 3, 6, 2, 7, 4, 1, 5};
        System.out.print("Element before Sorting: ");
        for(int n:arr)
            System.out.print(n+" ");
            divide(arr,0, arr.length-1);
        System.out.print("\nelement after Sorting: ");
        for(int n:arr)
            System.out.print(n+" ");
    }
    public static void divide(int[] a,int startIndex,int endIndex){
        if(startIndex<endIndex){
            int mid=startIndex+(endIndex-startIndex)/2;
            divide(a,startIndex,mid);
            divide(a,mid+1,endIndex);
            merge(a,startIndex,mid,endIndex);
        }

    }
    public static void merge(int[] a,int startIndex, int mid, int endIndex){
        int[] merged= new int[endIndex-startIndex+1];
        int index1=startIndex, index2=mid+1,index=0;
        while(index1<=mid && index2<=endIndex){
            if(a[index1]<a[index2])
                merged[index++]=a[index1++];
            else
                merged[index++]=a[index2++];
        }
        while(index1<=mid)
            merged[index++]=a[index1++];
        while (index2<=endIndex)
            merged[index++]=a[index2++];
        for(int i=startIndex,j=0;j<merged.length-1;i++,j++)
            a[i]=merged[j];

    }
}
