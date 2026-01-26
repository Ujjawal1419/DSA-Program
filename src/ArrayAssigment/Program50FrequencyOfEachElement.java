/*
* Q:50
WAJP to print the frequency of each element of
the array when elements provided are in any
range.
* int[] arr= {8 , 12 ,6 ,8 ,6,12,9,8,8}*/
package ArrayAssigment;

import java.util.Scanner;

public class Program50FrequencyOfEachElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the Elements: ");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        printFrequencyRange(arr);

    }
    public static void printFrequencyRange(int[] a){
         int n=a.length-1;
         for(int i=0;i<=n;i++){
             int count=1;
             for(int j=i+1;j<=n;j++){
                 if(a[i]==a[j]){
                     count++;
                     a[i]=a[n];
                     n--;    j--;
                 }
             }
             System.out.println(a[i]+" is: " +count + "times" );

         }

    }
}
