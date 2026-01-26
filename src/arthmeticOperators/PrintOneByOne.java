/**
 * !for a given number int n=5783
 * print each digit of the number oone by one
 * !Output
 * 3
 * 8
 * 7
 * 5
 */
package arthmeticOperators;

//public class PrintOneByOne {
   // public static void main(String[]args){
//         int n=5783;
//         System.out.println((n/1)%10);
//         System.out.println((n/10)%10);
//         System.out.println((n/100)%10);
//         System.out.println((n/1000)%10);
//     }
//}




public class PrintOneByOne {
   public static void main(String[]args){
      int n=5783;
      while(n>0){
        System.out.println(n%10);
        n=n/10;
      }
   }
}