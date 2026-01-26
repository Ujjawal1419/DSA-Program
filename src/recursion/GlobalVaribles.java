package recursion;

public class GlobalVaribles {
    static int x=10;
    public static void main(String[] args) {
        int x= 10;
        fun();
        System.out.println(x);
    }
    public static void fun(){
        x=20;
    }
}
