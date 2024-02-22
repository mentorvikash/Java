package premitive;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        // conveting one data type to other (automatic)
        // float a = 12.12514f;
        // float b = 15;
        // double sum = a + b;
        // System.out.println("sum " + sum);

        Scanner input = new Scanner(System.in);

        // int num1 = (int) (input.nextFloat());
        // int num2 = input.nextInt();
        // int result = num1 + num2;
        // System.out.println(result);
        // manula type casing

        // automatic type promation 256
        // int e = 260;
        // byte f = (byte) (e); // 258 % 256
        // System.out.println(f);

        // byte aa = 12;
        // byte ab = 100;
        // byte ac = 12;
        // int result = ab * ac + aa;
        // System.out.println(result);

        // rules
        byte a = 12;
        int b = 132;
        long e = 125451515151L;
        float c = 12.54f;
        double d = 12.564645145;

        // byte + long + float => float
        double result = a * b + c * d + e;
        System.out.println(result);

    }
}
