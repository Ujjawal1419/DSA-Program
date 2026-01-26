package sortingAlgorithmArray;

public class Program106PeakElement {
    public static void main(String[] args) {
       int[] arr={10,15,25,43,70,15,23,36};
    Program106PeakElement obj=new Program106PeakElement();
    int peakIndex= obj.findPeakElement(arr);

        System.out.println("peak index: "+peakIndex);
        System.out.println("peak element: "+arr[peakIndex]);
    }
    public int findPeakElement(int[] nums){
        int start=1;
        int end=nums.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }
}
