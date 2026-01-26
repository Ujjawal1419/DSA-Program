/*WAJP to check whether a number is perfect
numbers or not.*/
package NumberPrograming;

import java.util.Scanner;

public class Program2PerfectNumberOrNot {
    public static  void main(String[]args){
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
   if(checkPerfectNumber(n)){
       System.out.println(n+ " is a perfect number ");
   }
   else{
       System.out.println(n+ " is not a perfect number");
   }
    }
    public static boolean checkPerfectNumber(int num){
     if(num<=1)
         return false;
     int sum=1;
     for(int i=2;i*i<=num;i++){
         if(num%i==0)
             sum=sum+i;
         if(i !=num / i) {
             sum = sum + num / i;
         }
     }
      return sum==num;
    }
}
