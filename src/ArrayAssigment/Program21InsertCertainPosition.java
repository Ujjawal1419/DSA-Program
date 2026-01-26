package ArrayAssigment;

import java.util.Scanner;

public class Program21InsertCertainPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the first Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.print("Enter the index to insert: ");
        int index = sc.nextInt();
        System.out.print("Enter the value to insert: ");
        int val = sc.nextInt();
        arr=insert (arr,index,val);

        System.out.println("Array insert element:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
    public static int[] insert(int[] a,int index, int val){

        if(index>a.length)
            return a;
        int[] b=new int[a.length+1];
        b[index]=val;
        for(int i=0;i<b.length;i++){
            if(i<index)
                b[i]=a[i];
            else if(i>index)
                b[i]=a[i-1];
        }
        return b;
    }
}
