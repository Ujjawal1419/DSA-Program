package ArrayYoutube;

import java.util.Scanner;

public class PRogram12BigAndSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int big=arr[0];
        int small=arr[0];
      for(int s:arr){
          if(s>big)
              big=n;
          else if(s<small)
              small=n;
        }
        System.out.print(big+" ");
        System.out.print(small+" ");
    }
}
