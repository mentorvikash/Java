package ArrayPart;

import java.util.Arrays;
import java.util.Scanner;

public class SwapElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = { 12, 15, 13, 54, 587, 78, 54, 142 };
        System.out.println("enter any two index value be swap less then " + (arr.length - 1));
        int index1 = input.nextInt();
        int index2 = input.nextInt();
        swap(arr, index1, index2);
        System.out.println("new array: " + Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
