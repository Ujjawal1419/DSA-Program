package ArrayYoutube;

import java.util.Scanner;

public class OutPutInputArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int[] arr={5,7,8,6,15,9};
//        int n=arr.length;
//        for(int i=0;i<=arr.length;i++){
//            System.out.print(arr[i]+" ");
//       }

        int [] karan=new int[8];  // defult value 00000000
        for(int i=0;i< karan.length;i++){
            karan[i]=sc.nextInt();
        }
        for(int i=0;i<karan.length;i++){
            System.out.print(2*karan[i]+" ");
        }

    }
}
