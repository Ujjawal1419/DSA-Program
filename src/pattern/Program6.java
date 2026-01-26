package pattern;

public class Program6 {
    public  static void main(String[]args){
        int n=6;
        for(int i=1;i<=n+1;i++) {

            for(int j=1;j<=n-2;j++){
                System.out.print((i+1)%2+" ");
            }
            System.out.println();
        }
    }
}
