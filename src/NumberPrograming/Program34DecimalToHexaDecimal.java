package NumberPrograming;

import java.util.Scanner;

public class Program34DecimalToHexaDecimal {
  public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number: ");
      int a=sc.nextInt();
     String result= convertDecimalTohexadecimal(a);
      System.out.println("hexadecimal: "+result);
  }


    public static String convertDecimalTohexadecimal(int n){
        String s="0123456789abcdef";
        String hex="";
        while(n>0){
            int rem=n%16;
            hex=s.charAt(rem)+hex;

            n/=16;
        }
        return hex;
    }
}
