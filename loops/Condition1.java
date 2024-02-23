package loops;

public class Condition1 {

    public static void main(String[] args) {

        // if else statement

        int n = 97;

        if (n < 100) {
            System.out.println("you are not elegible for party town");
        } else {
            System.out.println("you are elegible for party town");
        }

        // multiple if else statement - Salary hike

        int salary = 35251;
        int finalSalary = 0;

        if (salary <= 10000) {
            finalSalary = salary + 1000;
        } else if (salary > 10000 && salary <= 50000) {
            finalSalary = salary + 3000;
        } else if (salary > 50000 && salary <= 100000) {
            finalSalary = salary + 5000;
        } else if (salary > 100000) {
            finalSalary = salary + 10000;
        }

        // System.out.println(" your final salary is " + finalSalary);

        // repeat statement - print number 1 to 5

        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);
        // System.out.println(4);

        // for loop for repeate task

        int num = 30;
        int i = 35;

        // for (int i = 1; i <= num; i++) {
        // System.out.println(i);
        // }

        // while loop for same problem

        // while (i <= num) {
        // System.out.println(i);
        // i++;
        // }

        // When to use For and While

        // do while loop

        do {
            System.out.println(i);
            i++;
        } while (i <= num);

        // find the larget of three input given by user

    }
}
