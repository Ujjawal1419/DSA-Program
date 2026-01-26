package sortingAlgorithmArray;

import static java.util.Arrays.sort;

public class Program84InsertionSortProgram {
    public static void main(String[] args) {
        int[] a = {8, 3, 5, 2, 9};
        System.out.print("Element before sorting: ");
        for(int n:a)
            System.out.print(n+" ");
        sort(a);
        System.out.print("\nElement After sorting: ");
        for(int n:a)
            System.out.print(n+" ");
    }
    public static void insertionSort(int[] a){
        for(int i=1; i<a.length; i++){
            int pivot=a[i];
            int j=i-1;
            while(j>=0 && a[j]>pivot){
                a[j+1]=a[i];
                j--;
            }
            a[j+1]=pivot;
        }
    }
}
