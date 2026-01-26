package ArrayAssigment;

import java.util.Scanner;

public class Program48CountSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int x:arr){
           printCountSort(arr);
        }
    }
    public static void printCountSort(int[] a){
        int min = a[0], max=a[0];
        for(int x:a){
            if(x>max)
                max=x;
            else if (x<min)
                min=x;
        }
        int[] freq=new int[max-min+1];
        for(int x:a)
            freq[x-min]++;
        int j=0;
        for(int i=0;i<freq.length;i++){
            while (freq[i]-- >0)
              a[j++]=i+min;
        }
    }
}
