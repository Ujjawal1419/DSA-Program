package sortingAlgorithmArray;

import java.util.Scanner;

public class Program82BubbleSortProgram {
    public static void main(String[] args) {
        int[] a = {5, 3, 8, 2, 1};
        System.out.print("Bubble Sorting before Array: ");
        for(int n:a)
            System.out.print(n+" ");
        bubbleSort(a);
        System.out.print("\nBubble Sorting After Array: ");
        for(int n:a)
            System.out.print(n+" ");
    }
    public static void bubbleSort(int[] a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            boolean flag=true;
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=false;
                }
            }
            if(flag)
                return;
        }
    }

    public static class Program98BinarySearch {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Size: ");

        }
        public static int binarySearch(int[] a,int key){
            int start=0, end=a.length-1;
             while(start<=end){
                 int mid=start+(end-start)/2;
                 if(a[mid]==key)
                     return mid;
                 else if (a[mid]>key)
                     end= mid-1;
                 else
                     start=mid+1;

             }
             return start;

        }
    }
}
