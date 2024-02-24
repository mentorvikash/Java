package switchStatement;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter to nubmer");
        int id = input.nextInt();
        String departement = input.next();

        switch (id) {
            case 1:
                System.out.println("Vikash Singh");
                break;
            case 2:
                System.out.println("Rajat Singh");
                break;
            case 3:
                switch (departement) {
                    case "it":
                        System.out.println("Its information technolgy");
                        break;
                    case "seo":
                        System.out.println("its search engine optimization");
                        break;
                    case "md":
                        System.out.println("its maintainance departement");
                        break;
                    default:
                        System.out.println("No departement found");
                        break;
                }
                break;
            default:
                System.out.println("Not a valid Id");
                break;

        }
    }

}
