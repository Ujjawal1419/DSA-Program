package sortingAlgorithmArray;

import static java.util.Arrays.sort;

public class Program83SelectionSortProgram {
    public static void main(String[] args) {
        int[] a={12,10,8,7,12,6,8,12,16,9,6,10,10,12,8};
        System.out.print("Element before sorting: ");
        for (int n:a)
            System.out.print(n+" ");
        sort(a);
        System.out.print("\nElement After sorting: ");
        for(int n:a)
            System.out.print(n+" ");
    }
    public static void selectionSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            int minIndex=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[minIndex])
                    minIndex=j;
            }
            int temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
        }
    }
}
