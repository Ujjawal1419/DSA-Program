package NumberPrograming;

import java.util.Scanner;

public class Program28_printLCM3Number {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
      int a=sc.nextInt();
      System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int lcm = getLCM(a, b, c);
        System.out.println("LCM = " + lcm);

    }
//    public static int getLCM(int a,int b,int c){
//
//        for (int i=1; ;i++){
//            if(i%a==0 &&i%b==0&&i%c==0)
//                return i;
//        }
//    }



//    public static int getLCM(int a,int b,int c){
//            int LCM=1;
//          for (int i=1;i<=a*b*c;i++){
//            if(i%a==0 &&i%b==0&&i%c==0)
//              LCM=i;
//               break;
//          }
//          return LCM;
//     }


    public static int getLCM(int a,int b,int c){
        int  big=(a>b&&a>b)?a:(b>c?b:c);

        for (int i=big;;i+=big){
            if(i%a==0 &&i%b==0&&i%c==0)
                return i;
        }
    }
}
