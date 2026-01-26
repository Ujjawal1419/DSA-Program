package NumberPrograming;


import java.util.Scanner;

public class Program26_Tribonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n =sc.nextInt();
        printTribonacci( n);
    }
    public static  void printTribonacci(int n){
        if(n==0){
            System.out.print(0);
            return;
        }
        else if(n==1){
            System.out.print(0+" "+1);
            return;
        }
        else if(n==2){
            System.out.print(0+" "+1+" "+1);
            return;
        }
        int n1=0,n2=1,n3=1,n4=0;
        System.out.print(n1+" "+n2+" "+n3+" ");
        for(int i=1;i<=n-2;i++){
            n4=n1+n2+n3;
            System.out.print(n4+" ");
            n1=n2;
            n2=n3;
            n3=n4;
        }
    }
}
