package ArrayPart;

import java.util.ArrayList;
import java.util.Scanner;

public class MutiArrayList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrlist = new ArrayList<>(10);

        // Initilize list
        for (int row = 0; row < 3; row++) {
            arrlist.add(new ArrayList<>());
        }

        // Add element to list
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                arrlist.get(row).add(input.nextInt());
            }
        }
        System.out.println(arrlist);
    }

}
