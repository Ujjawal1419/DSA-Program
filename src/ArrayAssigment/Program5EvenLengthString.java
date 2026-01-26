package ArrayAssigment;

public class Program5EvenLengthString {
    public static void main(String[] args) {
        String[] arr={"java","is","programming","fun","code"};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()%2==0) {
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("count: "+count);
    }
}
