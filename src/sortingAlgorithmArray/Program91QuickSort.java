package sortingAlgorithmArray;

public class Program91QuickSort {
    public static void main(String[] args) {
        int[] a={10,18,16,12,20,8,15,16};
        System.out.print("Elements Before sorting: ");
        for(int n:a)
            System.out.print(n+" ");
        quickSort(a,0,a.length-1);   // ✅ CALL

        System.out.print("\nElements After sorting: ");
        for (int n : a)
            System.out.print(n + " ");

    }
    public static void quickSort(int[] a, int low,int high){
        if(low<high){
            int pi=partition(a,low,high);
            quickSort(a,low,pi-1);
            quickSort(a,pi+1,high);
        }
    }
    public static int partition(int[] a,int low,int high){
        int pivot=a [high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(a[j]<=pivot){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,high);
        return i+1;
    }
    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
