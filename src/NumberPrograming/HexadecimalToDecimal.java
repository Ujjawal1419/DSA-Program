package NumberPrograming;

import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        String t=sc.next();
        String o= convertHexadecimalTodecimal(t);
        System.out.println("decinaml value: "+o);
    }


    public static String convertHexadecimalTodecimal(String s) {
        int dec = 0;    int val;
        int mul = 1;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c>='0' && c<='9')
                val=c-'0';
            else if(c>='A' && c<='F')
                val=c-'A'+10;
            else if(c>='a' && c<='f')
                val= c-'a'+10;
             else
                 return "Invalid Hexadecimal Number";
             dec=dec+val*mul;
        }
        return dec +"";
    }
}
