/*For the given array of Strings, print the largest string.*/
package ArrayAssigment;

public class Program4LargestString {
    public static void main(String[]args){
        String[] arr={"java","Programming","is","fun"};
        String largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>largest.length()){
                largest=arr[i];
            }
        }
        System.out.println("largest String: "+largest);
    }
}
