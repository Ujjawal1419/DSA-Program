package ArrayAssigment;

public class Program32Shift0Left {
    public static void main(String[] args) {

    }
    public static void shiftLeft(int[] a){
        int count0=0;
        for(int x:a){
            if(x==0)
                count0++;
        }
        for(int i=0;i<a.length;i++){
            if(i<count0)
                a[i]=0;
            else
                a[i]=1;
        }
    }
}
