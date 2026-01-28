package ArrayAssigment;

public class Program12MaxConsecutiveOnce {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1};

        System.out.println("Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        int result = findMaxConsecutiveOnes(arr);

        System.out.println("\nMax Consecutive Ones: " + result);
    }
    public  static int findMaxConsecutiveOnes(int[] nums) {
        int tempCount=0; int finalCount=0;
        for(int n:nums){
            if(n==1)
                tempCount++;
            else{
                if(tempCount>finalCount)
                    finalCount=tempCount;
                tempCount=0;
            }
        }
        if(tempCount>finalCount)
            finalCount=tempCount;
        return finalCount;
    }
}
