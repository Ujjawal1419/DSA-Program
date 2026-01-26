package recursion;

import javax.swing.*;

public class Syntax {
    public static void main(String[] args) {
        ujjawal();
    }
    public static void ujjawal(){
        System.out.println("nishu");
        ravi();
    }
    public static void ravi(){
        System.out.println("rahul");
        pintu();
    }
    public static void pintu(){
        System.out.println("raj");
        ujjawal();
    }
}
