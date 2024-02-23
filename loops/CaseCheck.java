package loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userString = input.nextLine();
        char targetLetter = userString.trim().charAt(0);

        if (targetLetter >= 'a' && targetLetter <= 'z') {
            System.out.println("lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }

}
