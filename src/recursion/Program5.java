/*
* n is: 1
n is: 2
n is: 3
n is: 4
n is: 5
n is: 6
n is: 7
n is: 8
n is: 9
n is: 10
else Block n is :11
Outside if else n is: 11
Outside if else n is: 10
Outside if else n is: 9
Outside if else n is: 8
Outside if else n is: 7
Outside if else n is: 6
Outside if else n is: 5
Outside if else n is: 4
Outside if else n is: 3
Outside if else n is: 2
Outside if else n is: 1*/
package recursion;

public class Program5 {
    public static void main(String[] args) {
        test(1);
    }
    public static  void test(int n){
        if(n<=10) {
            System.out.println("n is: " + n);
            test(n+1);
        }else{
            System.out.println("else Block n is :"+n);
        }
        System.out.println("Outside if else n is: "+n);
    }
}
