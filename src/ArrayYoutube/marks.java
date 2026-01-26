package ArrayYoutube;

import java.util.Scanner;

public class marks {
//    public static void main(String[]args){
////        Scanner sc=new Scanner(System.in);
////        System.out.println("enter the number: ");
////        int n =sc.nextInt();
//
////        int [] marks=new int [4];
////        marks[0] =95;
////        marks[1]=85;
////        marks[2] =98;
////        marks[3]=75;
//
//        int marks[]={95,68,84,35};
//
//        for(int i=0;i<4;i++) {
//            System.out.println(marks[i]);
//        }
//    }





public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n =sc.nextInt();
        int numbers[] =new int[n];
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
    for(int i=0;i<numbers.length;i++) {
        if(numbers[i]==n) {
            System.out.println("n found at index: "+i);
        }
    }
}
}
