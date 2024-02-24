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

        // same with switch statement
        switch (fruitName) {
            case "appple":
                System.out.println("new nice sweet red fruit");
                break;
            case "mango":
                System.out.println("The king of all fruit");
                break;
            case "kiwi":
                System.out.println("A very healthy fruit");
                break;
            default:
                System.out.println("plese enter valid fruit");
        }

        // Find the weekday name.
        System.out.println("enter then day number");
        int dayNumber = input.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        // Find if weekend or not
        switch (dayNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Do your work its not weekend");
                break;
            case 6:
            case 7:
                System.out.println("Let's enjoy it's weekend");
                break;
        }

        // switch (dayNumber) {
        // case 1 -> "this is good one";
        // case 2 -> "this is good second one";
        // }

        // switch (dayNumber) {
        // case 1, 2, 3, 4, 5 -> System.out.println("Do your work its not weekend");
        // case 6, 7 -> System.out.println("Let's enjoy it's weekend");
        // }

    }

}
