package sortingAlgorithmArray;

public class Program92HeapSort {
    public static void main(String[] args) {
        int[] a={10,18,16,12,20,8,15,16};
        System.out.print("Elements Before sorting: ");
        for(int n:a)
            System.out.print(n+" ");
        heapSort(a);   // ✅ CALL

        System.out.print("\nElements After sorting: ");
        for (int n : a)
            System.out.print(n + " ");

    }
    public static void heapSort(int[] a){
        int n=a.length;
        for(int i=n/2-1;i>=0;i--)
            heapify(a,i,n);
        for(int i=n-1;i>=0;i--){
            swap(a,0,i);
            heapify(a,0,i);
        }
    }
    public static void  heapify(int[] a,int i,int n){
        int largest=i,  left=2*i+1,  right=2*i+2;
        if(left<n && a[left]>a[largest])
            largest=left;
        if(right<n && a[right]>a[largest])
            largest=right;
        if(i!=largest){
            swap(a, largest, i);

            heapify(a,largest,n);
        }
    }
    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
