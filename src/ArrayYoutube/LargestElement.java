package ArrayYoutube;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr={10,15,8,7,18,5};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
              max=arr[i];
            }
        }
        System.out.println("Largest is: "+max);
    }
}