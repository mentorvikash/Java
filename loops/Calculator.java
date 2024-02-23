package loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;

        while (true) {
            System.out.println("choose your operator");
            char operator = input.next().trim().charAt(0);
            System.out.println("please enter two number");
            int a = input.nextInt();
            int b = input.nextInt();

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                if (operator == '+') {
                    result = a + b;
                }
                ;

                if (operator == '-') {
                    result = a - b;
                }
                ;

                if (operator == '*') {
                    result = a * b;
                }

                if (operator == '/') {
                    if (a != 0) {
                        result = a / b;
                    }
                }

                if (operator == '%') {
                    result = a % b;
                }
            } else if (operator == 'x' || operator == 'X') {
                break;
            } else {
                System.out.println("invalid operator!");
            }
            System.out.println("the result is " + result);
        }
    }
}
