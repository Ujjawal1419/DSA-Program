/*Concatenation of Array*/
package ArrayAssigment;

public class Program9ConcatenationOfArray {
        public static void main(String[] args) {

            int[] arr = {1, 2, 3};

            int[] result = getConcatenation(arr);

            for (int x : result) {
                System.out.print(x + " ");
            }
        }

        public static int[] getConcatenation(int[] nums) {

            int[] a = new int[2 * nums.length];

            for (int i = 0; i < nums.length; i++) {
                a[i] = nums[i];
                a[nums.length + i] = nums[i];
            }
            return a;
        }
}


