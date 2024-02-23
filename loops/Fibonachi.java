package loops;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {

        // ========== get fibonachi number at n postion
        Scanner input = new Scanner(System.in);
        // int n = input.nextInt();
        int n = 15;

        // first two number
        int a = 0;
        int b = 1;
        int i = 2;

        while (i <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            i++;
        }

        System.out.println("fibonachi number at " + n + " is: " + b);

        // ========= find how many times a number repetes.
        int testNumber = 1212122;
        int count = 0;

        while (testNumber > 0) {
            int reminder = testNumber % 10;
            // System.out.println(reminder is );
            if (reminder == 2) {
                count++;
            }
            testNumber = testNumber / 10;
        }
        System.out.println("the number 2 repeate times " + count);
    }
}