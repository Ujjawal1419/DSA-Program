package sortingAlgorithmArray;

public class Program107PeakIndexInMountainArray {
    public static void main(String[] args) {

    }
    class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] < arr[mid + 1]) {
                    // Increasing part
                    start = mid + 1;
                } else {
                    // Decreasing part or peak
                    end = mid;
                }
            }
            return start; // peak index
        }
    }

}
