package recursion;

public class Program2 {
    public static void main(String[] args) {
   test();
    }
    public  static void test(){
        for(int i=1;; i++){
            System.out.println("This is test method!");
            System.out.println("test method is under Execution!: ");
            test();
        }
    }
}
