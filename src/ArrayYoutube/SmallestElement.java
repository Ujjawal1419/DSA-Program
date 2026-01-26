package ArrayYoutube;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr={10,12,5,4,8,15,2};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Smallest is: "+min);
    }
}
