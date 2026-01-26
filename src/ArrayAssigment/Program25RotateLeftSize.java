package ArrayAssigment;

import java.util.Scanner;

public class Program25RotateLeftSize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
       int n=sc.nextInt();
       int[] arr= new int[n];
        System.out.print("Enter the Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        rotateLeft(arr);
        System.out.print("Rotate Left side: ");
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
    public static void rotateLeft(int[] a){
      int temp= a[0];
      for(int i=1;i<a.length;i++){
          a[i-1]=a[i];
      }
      a[a.length-1]=temp;
    }
}
