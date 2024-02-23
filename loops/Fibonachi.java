package loops;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        // get fibonachi number at n postion
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

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
    }
}
