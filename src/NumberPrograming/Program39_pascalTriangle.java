//package NumberPrograming;
//
//import java.util.Scanner;

//public class Program39_pascalTriangle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of Row: ");
//        int row= sc.nextInt();
//        pascalTriangle(row);
//    }
//    public static void pascalTriangle(int n){
//        int space=n;
//        for(int i=0;i<=n;i++)
//            for(int j =0; j<space; j++) {
//                System.out.print("   ");
//
//                printPascalRow(i);
//            space--;
//    }
//    public static void printPascalRow(int n){
//        int comb=1;
//        System.out.print(comb+"     ");
//        for(int i=0;i<n;i++){
//            comb=comb*(n-i)/(i+1);
//            System.out.printf("%6d",comb);
//        }
//        System.out.println();
//    }
//}
