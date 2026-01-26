/**
 * !for a given number int n=5783;
 a) print the last digit of a number
 b) print last two digit of a number
 c) Remove the last digit of a number
 d) Remove thw last two digit of a number
 */

package arthmeticOperators;

public class OperatorBasedPrograming1 {
    public static void main(String[]args){
        int n=5783;
        // print the last digit
        System.out.println("Last Digit:"+(n%10));

        //print last two digit
        System.out.println("Last two Digit:"+(n%100));
        //Remove last digit
        System.out.println("Remove last digit:"+(n/10));
        // Remove last two digit
        System.out.println("Remove last two digit:"+(n/100));

    }

}
