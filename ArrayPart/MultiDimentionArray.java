package ArrayPart;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionArray {
    public static void main(String[] args) {
        int[] arr1D = new int[3];

        // int[][] arr2d = {
        // { 1, 2, 3 },
        // { 5, 6 },
        // { 7, 8, 9, 8 }
        // };
        // System.out.println(Arrays.toString(arr2d));

        Scanner input = new Scanner(System.in);
        int[][] arrNew2d = new int[3][2];

        System.out.println("provide the value for array of size 3*2 : ");
        for (int i = 0; i < arrNew2d.length; i++) {
            for (int j = 0; j < arrNew2d[i].length; j++) {
                arrNew2d[i][j] = input.nextInt();
            }
        }

        // for (int i = 0; i < arrNew2d.length; i++) {

        // printing the array output
        // for (int j = 0; j < arrNew2d[i].length; j++) {
        // System.out.print(arrNew2d[i][j] + " ");
        // }
        // System.out.println();
        // }

        // printing the array output
        // for (int i = 0; i < arrNew2d.length; i++) {
        // System.out.println(Arrays.toString(arrNew2d[i]));
        // }

        // priting output with short method
        for (int[] a : arrNew2d) {
            System.out.println(Arrays.toString(a));
        }
    }
}
