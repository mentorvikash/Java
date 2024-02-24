package ArrayPart;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] intArr = new int[5];

        intArr[0] = 12;
        intArr[1] = 15;
        intArr[2] = 18;
        intArr[3] = 17;
        intArr[4] = 19;

        for (int i = 0; i < intArr.length; i++) {
            System.out.println("element number " + i + ": " + intArr[i]);
        }

        String[] strArr = new String[5];
        strArr[0] = "Vikash";
        strArr[1] = "Rajat";
        strArr[2] = "Vishal";
        strArr[3] = "Shobha";
        strArr[4] = "Vashnavi";

        for (int i = 0; i < strArr.length; i++) {
            System.out.println("element string " + i + ": " + strArr[i]);
        }

        // take input of 5 number form user and save in array
        System.out.println("Enter any five number");

        int[] userInputArray = new int[5];
        for (int i = 0; i < userInputArray.length; i++) {
            userInputArray[i] = input.nextInt();
        }

        // for (int i = 0; i < userInputArray.length; i++) {
        // System.out.println("userInputArray " + i + ": " + userInputArray[i]);
        // }

        // we can print out the array by conveting it into string
        System.out.println(Arrays.toString(userInputArray));

        // how to modify any element in array
        userInputArray[2] = 1245151;

        System.out.println(Arrays.toString(userInputArray));
    }
}
