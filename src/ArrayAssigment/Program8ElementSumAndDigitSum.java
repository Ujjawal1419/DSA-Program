/*Difference Between Element Sum and Digit Sum of an Array*/
package ArrayAssigment;

public class Program8ElementSumAndDigitSum {
    public static void main(String[] args) {

        int[] arr = {1,15,6,8};

        int result = differenceOfSum(arr);
        System.out.println("Result is : "+result);
    }
    public static  int differenceOfSum(int[] arr) {

        int elementSum=0;
        int digitSum=0;

        for(int n:arr){
            elementSum=elementSum+n;

            while(n>0){
                digitSum= digitSum+n%10;
                n=n/10;
            }
        }
        return Math.abs(elementSum-digitSum);
    }
}
