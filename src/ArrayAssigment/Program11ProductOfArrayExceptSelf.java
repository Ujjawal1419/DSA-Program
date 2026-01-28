package ArrayAssigment;

import java.util.Scanner;


public class Program11ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] result=productExceptSelf(arr);
        for(int x:result){
            System.out.print("Product of Array ExceptSelf: "+x);
        }

    }
    public static int[] productExceptSelf(int[] arr){
        int[] result=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            int product=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    product*=arr[j];
                }
            }
            result[i]=product;
        }
        return result;
    }
}
