package Project_1NUmberOperation;
import java.util.Scanner;
public class NumberOperation {

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);

            System.out.println("Press 1 for  factorial calculation");
            System.out.println("press 2 for power calculation ");
            System.out.println("press 3 to Generate multiplication table up to n number");
            System.out.println("press 4 for factor calculation");
            System.out.println("press 5 to Generate fibonacici series");
            System.out.println("press 6 to check prime number");
            System.out.println("press 7 to reverse a number");
            System.out.println("press 8 to check palindrome number");
            System.out.println("press 9 to check automorfic");
            int n=sc.nextInt();

            switch(n)
            {
                case 1:
                    System.out.println("Enter a number for which you want the factorial");
                    int a=sc.nextInt();
                    int fact=1;
                    for (int i=1; i<=a; i++)
                    {
                        fact =i*fact;
                    }
                    System.out.println(" the factorial of " + a + " is "+fact);
                    break;

                case 2:
                {
                    System.out.println("Enter the num upto 5");
                    int num = sc.nextInt();
                    System.out.println("Enter the power upto 5");
                    int pow = sc.nextInt();
                    if(pow==1){
                        int res =num*1;
                        System.out.println("power calculation =" + res);
                    }
                      if(pow==2) {
                        int res =num*num;
                        System.out.println("power calculation =" + res);
                      }
                       if(pow==3) {
                        int res =num*num*num;
                        System.out.println("power calculation =" + res);
                       }
                        if(pow==4) {
                        int res =num*num*num*num;
                        System.out.println("power calculation =" + res);
                        }
                    if(pow==5) {
                        int res =num*num*num*num*num;
                        System.out.println("power calculation = " + res);
                    }
                }
                break;
                case 3:
                {
                    System.out.println("Enter a number for which you want the table");
                    int  num=sc.nextInt();
                    for(int i=1; i<=10; i++) {
                        System.out.println(num +"*"+i+"="+num*i);
                    }
                }
                break;
                case 4:
                {
                    System.out.println("Enter a number for which you want the factors");
                    int num=sc.nextInt();
                    System.out.print("factors of"+num+ "=");
                    for(int i=1; i<=num; i++) {
                        //int i=1;
                        if(num%i==0) {
                            System.out.print(i + ",");
                        }
                    }
                }
                break;
                case 5:
                {
                    System.out.println("Enter a number for which you want the Fibonacci Series ");
                    int num=sc.nextInt();
                    int first=0, second=1;
                    System.out.print("Fibonacci Series upto  num" +num+ "term: ");
                    for(int i=0; i<num; i++) {
                        System.out.print(first+" ");
                        int third = first+second;
                        first=second;
                        second=third;

                    }
                }
                break;
                case 6:
                {
                    System.out.println("Enter a number for check prime number");
                    System.out.println("enter number");
                    int num = sc.nextInt();
                    boolean prime=true;
                    for (int i=2; i<num; i++) {
                        if(num%i==0) {
                            prime=false;
                            break;
                        }
                    }
                    if(prime==true) {
                        System.out.println("prime number");
                    }
                    else {
                        System.out.println("not prime number");
                    }
                }
                break;
                case 7:
                {
                    System.out.println("Enter a number for which you want the revers number");
                    int num=sc.nextInt();

                    int ani = num;
                    int reversed = 0;

                    while (num != 0) {
                        int digit = num % 10;
                        reversed = reversed * 10 + digit;
                        num /= 10;
                    }

                    System.out.println("Reversed Number: " + reversed);
                }
                break;
                case 8:
                {
                    System.out.println("Enter a number for which you want the palendrom");
                    int num=sc.nextInt();

                    int ani = num;
                    int reversed = 0;

                    while (num != 0) {
                        int digit = num % 10;
                        reversed = reversed * 10 + digit;
                        num /= 10;

                    }

                    if (ani == reversed)
                        System.out.println("Palindrome = Yes");
                    else
                        System.out.println("Palindrome = No");
                }case 9:{
                int sqr = n * n;
                while (n != 0) {
                    if (n % 10 != sqr % 10) {
                        System.out.println(n+"n is not automorfic");
                    }
                    n /= 10;
                    sqr /= 10;

                }


            }


            }


        }
    }