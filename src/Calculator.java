import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int num1;
        int num2;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("PLEASE ENTER YOUR FIRST NUMBER:");
        num1 = input.nextInt();

        System.out.println("PLEASE ENTER YOUR FIRST NUMBER:");
        num2 = input.nextInt();

        System.out.println("PLEASE ENTER YOUR OPERATOR (+, -, *, /):");
        operation = input.next();

        if (operation.equals("+")) {
            System.out.println("YOUR ANSWER IS " + (num1 + num2));
        } else if (operation.equals("-")) {
            System.out.println("YOUR ANSWER IS " + (num1 - num2));
        } else if (operation.equals("*")) {
            System.out.println("YOUR ANSWER IS " + (num1 * num2));
        } else if (operation.equals("/")) {
            if (num2 != 0) {
                System.out.println("YOUR ANSWER IS" + (num1 / num2));
            } else {
                System.out.println("ERROR: DIVISION BY ZERO");
            }
        } else {
            System.out.println("INVALID OPERATION.");
        }

        input.close();
    }
}
