/*
* Enter the number of disk:
5
move disk From A to C
move disk From A to B
move disk From C to B
move disk From A to C
move disk From B to A
move disk From B to C
move disk From A to C
move disk From A to B
move disk From C to B
move disk From C to A
move disk From B to A
move disk From C to B
move disk From A to C
move disk From A to B
move disk From C to B
move disk From A to C
move disk From B to A
move disk From B to C
move disk From A to C
move disk From B to A
move disk From C to B
move disk From C to A
move disk From B to A
move disk From B to C
move disk From A to C
move disk From A to B
move disk From C to B
move disk From A to C
move disk From B to A
move disk From B to C
move disk From A to C*/
package recursionAssignment;

import java.util.Scanner;

public class Program21 {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Disk: ");
        int n=sc.nextInt();
        toh(n,'A','B','C');
        System.out.println("Total Steps are: "+count);
    }
    public static void toh(int n,char source,char aux,char destination){
        count++;
        if(n==1){
            System.out.println("Move Disk From "+source +" to "+destination);
            return;
        }
        toh(n-1,source, destination,aux);
        System.out.println("move disk From "+source +" to "+destination);
        toh(n-1,aux,source,destination);
    }
}
