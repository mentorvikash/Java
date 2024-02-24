package ArrayPart;

import java.util.Arrays;
import java.util.Scanner;

public class changeMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        change(arr);
        System.out.println(" new array: " + Arrays.toString(arr));
    };

    static void change(int[] arr) {
        // array are mutable in java
        arr[2] = 152;
    }

}
