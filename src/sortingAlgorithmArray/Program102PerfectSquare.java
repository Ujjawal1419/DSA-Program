package sortingAlgorithmArray;

public class Program102PerfectSquare {
    public static void main(String[] args) {

    }
    public boolean isPerfectSquare(int x) {
        if(x==1)
            return true;
        int start=1, end=x/2;
        long mid=1l;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid*mid==x)
                return true;
            else if(mid*mid>x)
                end=(int)mid-1;
            else
                start=(int)mid+1;
        }
        return false;

    }
}
