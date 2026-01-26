/*  Access all even index elements from array.  */
package ArrayAssignment1;

import java.util.Scanner;

public class Program1AllEvenIndex {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the Size: ");
//        int n=sc.nextInt();
//
//        int[] arr=new int[n];
//        System.out.print("Enter the element: ");
//        for(int i=0; i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int i=0;i<arr.length;i++){
//            if(i%2==0)
//                System.out.print(arr[i]);
//        }
//    }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the size: ");
    int n = sc.nextInt();

    int[] arr= new int[n];
    System.out.print("Enter the Element: ");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        if(i%2==0)
            System.out.println("All Even element is: "+arr[i]+" ");
    }
}

}
