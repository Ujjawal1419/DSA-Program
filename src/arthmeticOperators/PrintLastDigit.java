/**
 * Find the Last Digit of a number without using % operator
 * int 12345
 */

package arthmeticOperators;

public class PrintLastDigit {
    public static void main(String[]args){
        int n= 12345;
        n=(n-(n/10)*10);
        System.out.println("n:"+n);
    }

}
//public class printLastDigit {
//     public static void main(String[]args){
//         int n= 12345;
//         n=n/10;
//         n=(n-(n/10)*10);
//         System.out.println("n:"+n);
//     }
// }