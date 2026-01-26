package NumberPrograming;

import java.util.Scanner;

public class Program29printHCF3Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int lcm = getHCF(a, b, c);
        System.out.println("LCM = " + lcm);

    }
    public static int getHCF(int a,int b,int c){
      int small=(a<b&&a<c)?a:(b<c?b:c);
      for(int i=small;; i--){
          if(a%i==0 && b%i==0 &&c%i==0)
              return i;
      }
    }
}
