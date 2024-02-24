package switchStatement;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the fruit name");
        String fruitName = input.next();
        if (fruitName.equals("mango")) {
            System.out.println("A yello fruit: king of fruits");
        } else if (fruitName.equals("apple")) {
            System.out.println("A sweet round red fruit");
        } else if (fruitName.equals("graphs")) {
            System.out.println("Smeets like green small balls, but sweet like suger");
        } else {
            System.out.println("Invalid fruit name!");
        }
    }
}
