package recursion;

public class Program3 {
    public static void main(String[] args) {
        test(1);
    }
    public  static void test(int n){
            System.out.println("This is test method!");
            System.out.println("test method is under Execution!: "+n);
            test(n+1);
        }
    }

