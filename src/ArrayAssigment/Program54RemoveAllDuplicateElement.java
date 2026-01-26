package ArrayAssigment;

import java.util.Scanner;
import java.util.Arrays;

public class Program54RemoveAllDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = removeDuplicate(arr);

        System.out.println("After removing duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicate(int[] a) {
        int min = a[0], max = a[0];

        for (int x : a) {
            if (x > max)
                max = x;
            else if (x < min)
                min = x;
        }

        int[] freq = new int[max - min + 1];

        for (int x : a)
            freq[x - min]++;

        int size = 0;
        for (int f : freq) {
            if (f > 0)
                size++;
        }

        int[] unique = new int[size];
        int j = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0)
                unique[j++] = i + min;
        }

        return unique;
    }
}
