package whilePartThree;

import java.util.Scanner;

public class Program32 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
         String s= sc.nextLine();
        if(isPalindrame(s))
            System.out.println(s+" is a Palindrame Number!: ");
        else
            System.out.println(s+" is  not a palindrame Number!: ");
    }
    public static boolean isPalindrame(String str){
        String rev="";
        int i=0;
        while(i<str.length()){
            rev=str.charAt(i)+rev;
            i++;
        }
        return str.equalsIgnoreCase(rev);
    }
}
