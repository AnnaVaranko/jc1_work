package Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pleas enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Pleas enter operation: ");
        String operation = scanner.next();

        System.out.print("Pleas enter first number: ");
        int secondNumber = scanner.nextInt();

        Calculator calc = new Calculator();
        final double result =
                calc.calculate(firstNumber,secondNumber, operation.charAt(0));
        System.out.println("Result of " + firstNumber + " " + operation+ " " + secondNumber
                + " is " + result);
    }
}
