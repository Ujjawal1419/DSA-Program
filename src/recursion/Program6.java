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
11
10
9
8
7
6
5
4
3
2
1*/
package recursion;

public class Program6 {
    public static void main(String[] args) {
        test(1);
    }
    public static  void test(int n){
        if(n<=10) {
            System.out.println("n is: " + n);
            test(n+1);
        }
        System.out.println(n);
    }
}
